package de.blau.android;

import java.util.HashMap;

import android.support.annotation.Nullable;
import android.util.Log;
import de.blau.android.filter.Filter;
import de.blau.android.filter.IndoorFilter;
import de.blau.android.osm.OsmElement;
import de.blau.android.osm.Tags;
import de.blau.android.presets.Preset;

/**
 * Enums for modes.
 */
public enum Mode {

	/**
	 * edit geometries in "easyedit" mode
	 */
	MODE_EASYEDIT("EASY", true, true, true, null, R.drawable.unlocked_white, null),
	/**
	 * tag edit only mode
	 */
	MODE_TAG_EDIT("TAG", true, true, false, null, R.drawable.unlocked_tag_white, null),
	/**
	 * Background alignment mode
	 */
	MODE_ALIGN_BACKGROUND("EASY",false,false,false, MODE_EASYEDIT, R.drawable.unlocked_white, new ModeConfig() {
		@Override
		public void setup(Main main, Logic logic) {
			if (main.getBackgroundAlignmentActionModeCallback() == null) {
				Log.d("Logic","weird state of edit mode, resetting");
				logic.setMode(main, Mode.MODE_EASYEDIT);
			}
		}

		@Override
		public void teardown(Main main, Logic logic) {
		}

		@Override
		public HashMap<String, String> getExtraTags(Logic logic, OsmElement e) {
			return null;
		}

		@Override
		public Preset getPreset(Logic logic, OsmElement e) {
			return null;
		}
	}),
	/**
	 * Indoor mode
	 */
	MODE_INDOOR("INDOOR",true,true,true, null, R.drawable.unlocked_indoor_white, new ModeConfig() {

		@Override
		public void setup(final Main main, final Logic logic) {
			Filter.Update updater = new Filter.Update() {
				@Override
				public void execute() {
					logic.invalidateMap();
					main.scheduleAutoLock();
				} };
			Filter filter = logic.getFilter();
			if (filter!=null) {
				if (!(filter instanceof IndoorFilter)) {
					filter.saveState();
					filter.hideControls();
					filter.removeControls();
					IndoorFilter indoor = new IndoorFilter();
					indoor.saveFilter(filter);
					logic.setFilter(indoor);
					indoor.addControls(main.getMapLayout(), updater);
				}
			} else { // no filter yet
				logic.setFilter(new IndoorFilter());
				logic.getFilter().addControls(main.getMapLayout(), updater);
			}
			logic.getFilter().showControls();
			logic.deselectAll();
			
		}

		@Override
		public void teardown(final Main main, final Logic logic) {
			Filter.Update updater = new Filter.Update() {
				@Override
				public void execute() {
					logic.invalidateMap();
					main.scheduleAutoLock();
				} };
			
			// indoor mode is a special case of a filter
			// needs to be removed here and previous filter, if any, restored
			Filter filter = logic.getFilter();
			if (filter!=null) { 
				if (filter instanceof IndoorFilter) {
					filter.saveState();
					filter.hideControls();
					filter.removeControls();
					filter = filter.getSavedFilter();
					logic.setFilter(filter);
					if (filter!=null) {
						filter.addControls(main.getMapLayout(), updater);
						filter.showControls();
					}
				}
			} 	
		}

		@Override
		public HashMap<String, String> getExtraTags(Logic logic, OsmElement e) {
			HashMap<String,String> result = new HashMap<String,String>();
			// we only want to apply a level tag automatically to newly created objects if they don't already have the tag and not when the filter is inverted
			Filter filter = logic.getFilter();
			if (filter != null && filter instanceof IndoorFilter && !((IndoorFilter)filter).isInverted() && e.getState() == OsmElement.STATE_CREATED && !e.hasTagKey(Tags.KEY_LEVEL)) { 
				result.put(Tags.KEY_LEVEL, Integer.toString(((IndoorFilter)filter).getLevel()));
			}
			return result;
		}

		@Override
		public Preset getPreset(Logic logic, OsmElement e) {
			// TODO Auto-generated method stub
			return null;
		}
	});
	
	final private String tag;
	final private boolean selectable;
	final private boolean editable;
	final private boolean geomEditable;
	final private Mode subModeOf;
	private boolean enabled = true;
	private int iconResourceId = -1;
	final private ModeConfig config;
	
	Mode(String tag, boolean selectable, boolean editable, boolean geomEditable, Mode subModeOf, int iconResourceId, ModeConfig config) {
		this.tag = tag;
		this.selectable = selectable;
		this.editable = editable;
		this.geomEditable = geomEditable;
		this.subModeOf = subModeOf;
		this.iconResourceId = iconResourceId;
		this.config = config;
	}
	
	boolean elementsSelectable() {
		return selectable;
	}
	
	boolean elementsEditable() {
		return editable;
	}
	
	boolean elementsGeomEditiable() {
		return geomEditable;
	}
	
	void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	boolean isEnabled() {
		return enabled;
	}
	
	int iconResourceId() {
		return iconResourceId;
	}
	
	Mode isSubModeOf() {
		return subModeOf;
	}
	
	String tag() {
		return tag;
	}
	
	void setup(Main main, Logic logic) {
		if (config != null) {
			config.setup(main, logic);
		}
	}
	
	void teardown(Main main, Logic logic) {
		if (config != null) {
			config.teardown(main, logic);
		}
	}
	
	/**
	 * Return the Mode for a given tag
	 * @param tag
	 * @return the corresponding Mode
	 */
	static Mode modeForTag(String tag) {
		for (Mode mode:Mode.values()) {
			if (mode.tag().equals(tag)) {
				return mode;
			}
		}
		return null; // can't happen
	}

	/**
	 * Get any special tags for this mode, not very elegant
	 * @param logic the current Logic instance
	 * @param e the selected element
	 * @return map containing the additional tags or null
	 */
	@Nullable
	public HashMap<String, String> getExtraTags(Logic logic, OsmElement e) {
		if (config != null) {
			return config.getExtraTags(logic, e);
		}
		return null;
	}		
}
