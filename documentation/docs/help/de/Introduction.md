# Einführung in Vespucci

Vespucci ist ein Editor für OpenStreetMap, der die meisten Funktionen unterstützt, die in ähnlichen Programme auf normalen Rechnern vorhanden sind. Es ist erfolgreich auf Googles Android 2.3 bis 7.0 und verschiedene auf AOSP basierende Varianten getestet worden. Wichtig: während die Leistung von Handys und Tablets ihre stationären Konkurrenten auf vielen Gebieten eingeholt hat, muss, vor allem bei älteren Geräten, auch nicht vergessen gehen, dass sie eher wenig Hauptspeicher zur Verfügung haben und auch deutlich langsamer  bei bestimmten Operationen sein können. Deshalb sollte man beim Bearbeiten dies im Auge behalten und zum Beispiel die bearbeiteten Gebiete eher kleiner wählen.   

## Erstmaliger Gebrauch

Beim erstmaligen Starten zeigt Vespucci das "Herunterladen einer anderen Position"/"Bereich laden" Formular. Falls Koordinaten angezeigt werden und sofort heruntergeladen werden sollen, kann die entsprechende Option gewählt und der Radius um den Punkt herum gesetzt werden. Auf langsamen Geräten sollte nur ein kleiner Bereich ausgewählt werden. 

Alternativ kann mit dem "Zur Karte" direkt zur Karte gewechselt werden, auf das Gebiet das bearbeitet werden soll gezoomt werden und dann Daten für das Gebiet geladen werden (siehe unten "Mit Vespucci OSM Daten bearbeiten").


## Mit Vespucci OSM Daten bearbeiten

Abhängig der Bildschirmgrösse und Alter des Gerätes können die Bearbeitungsfunktionen über Icons in der obersten Menüzeile, via ein Menü oben rechts, von der unteren Menüzeile (falls vorhanden) oder mittels der Menütaste zugänglich sein.

<a id="download"></a>

### OSM Daten herunterladen

Wähle entweder das Übertragungs-Icon ![Transfer](../images/menu_transfer.png) oder den "Transfer" Menüeintrag. Dies wird sieben Optionen zur Auswahl anzeigen:

* **Aktuelle Ansicht herunterladen** - den aktuell sichtbaren Bildschirmbereich herunterladen und allfällig vorhandene Daten ersetzen *(benötigt Netzzugang)*
* **Diese Ansicht zu dn Daten dazu laden** - den aktuell sichtbaren Bildschirmbereich auf dem Schirm herunterladen und mit vorhandene Daten  zusammenführen *(benötigt Netzzugang)*
* **Herunterladen einer anderen Position** - zeigt ein Formular an, dass es erlaubt nach einem Ort zu suchen, Koordinaten einzugeben. oder direkt um die aktuelle Position einen Bereich herunterzuladen  *(benötigt Netzzugang)*
* **Daten zum OSM-Server hochladen** - lädt die Änderungen zum OSM-Server hoch *(Konto benötigt)*  *(benötigt Netzzugang)*
* **Automatischer Download** - lädt automatisch einen Bereich um die aktuelle Position herunter  *(benötigt Netzzugang)* *(benötigt GPS)*
* **Datei..** - Speichern und Laden von OSM Daten zu Dateien auf dem Gerä.
* **Notizen/Fehler...** - herunterlanden (automatisch und manuell) von OSM Notizen und "Fehlern" von QA Werkzeugen (aktuell OSMOSE) *(benötigt Netzzugang)*

Der einfachste Weg um Daten auf dem Gerät zu öffnen ist mit Gesten den Bildschirm auf das gewünschte Gebiet zu zentrieren und dann "Aktuelle Ansicht herunterladen" im Menü anzuwählen. Mit Gesten, den "- | +" Knöpfen oder den Laut-/Leisetasten kann gezoomt werden. Vespucci sollte dann das Gebiet herunterladen. Um Daten herunterzuladen muss man nicht angemeldet sein.

### Bearbeiten

<a id="lock"></a>

#### Sperren, entsperren, "nur Eigenschaften bearbeiten"  und Innenraum Modus 

Um versehentliche Änderungen zu verhindern startet Vespucci im "gesperrten" Modus, einen Modus der nur das Zoomen und Verschieben der Karte erlaubt. Tippe auf das ![Schloss](../images/locked.png) Icon um den Schirm zu entsperren.  

Ein langer Druck auf das Schloss schaltet in einen Modus um in dem nur die Eigenschaften der Elemente geändert werden kann, aber keine neuen Objekte erstellt oder die Geometrien geändert werden können. Dieser Modus wird mit einem weissen Schloss mit kleinem "T" angezeigt. 

Ein weiterer langer Druck schaltet in den [Innenraum-Modus](#indoor), ein weiter schaltet wieder in den normalen Editiermodus. 

#### Einfacher Klick, Doppelklick und langer Klick

In der Standardeinstellung wird um auswählbare Punkte und Wege ein oranger Bereich angezeigt, der angibt in welchen Bereich man um den Bildschirm tippen kann um ein Objekt anzuwählen. Die drei Möglichkeiten sind:

* Einfacher Klick: wählt das Objekt aus. 
    * Ein freistehender Punkt oder Weg wird sofort ausgewählt. 
    * Ist die Auswahl nicht eindeutig erscheint ein Auswahlmenü, dass dann die genaue Auswahl des Objektes erlaubt.
    * Ausgewählte Objekte werden mit einem gelben Rang hervorgehoben. 
    * Für mehr Informationen siehe [Knoten ausgewählt](../en/Node%20selected.md) , [Weg ausgewählt](../en/Way%20selected.md) und  [Relation ausgewählt](../en/Relation%20selected.md) 
* Doppelklick: startet die [Mehfachauswahl](../en/Multiselect.md)
* Langer Klick: zeigt ein Positionskreuz um neue Punkte zu erstellen, siehe unten und [Neue Objekte erstellen](../en/Creating%20new%20objects.md)

In Gebieten in denen die OSM Daten sehr dicht sind ist es sinnvoll vor dem Bearbeiten weit hineinzuzoomen.

Vespucci hat eine gute Unterstützung von "Undo" und "Redo" deshalb kann man angst frei auf seinem Gerät experimentieren, bitte aber keine reinen Testdaten auf den OSM Server speichern.

#### Auswählen / Abwählen (einfacher Klick und "Auswahlmenu"

Tippe auf ein Objekt um es anzuwählen und hervorzuheben. Ist ein Objekt ausgewählt kann es durch Tippen an einer leeren Stelle abgewählt werden. Um ein Objekt abzuwählen tippe einfach in ein leeren Bereich. Um ein anderes Element anzuwählen tippe einfach darauf, es ist nicht nötig zuerst das aktuell angewählte abzuwählen. Ein "Doppeltipp" startet den [Mehrfachauswahl Modus](../en/Multiselect.md).

Hinweis: falls Vespucci nicht eindeutig feststellen kann welches Objekt ausgewählt werden soll (zum Beispiel ein Punkt auf einem Weg oder andere sich überlappende Objekte), wird ein Auswahlmenü angezeigt. Wähle den Eintrag für das Objekt aus und das entsprechende Objekt wird ausgewählt. 

Ausgewählte Objekte werden durch einen dünnen, gelben Rand hervorgehoben. Nach der Auswahl erscheint eine Meldung mit einer kurzen Beschreibung des Objekts, dass die Auswahl bestätigt.

Sobald die Auswahl stattgefunden hat, werden, entweder als Schalftfläche oder als Menüeintrag, die verfügbaren Operationen für das ausgewählte Objekt angezeigt: für mehr Informationen siehe [Knoten ausgewählt](../en/Node%20selected.md), [Weg ausgewählt](../en/Way%20selected.md) und [Relation ausgewählt](../en/Relation%20selected.md).

#### Ausgewählte Objekte: Eigenschaften bearbeiten

Ein zweites mal Anwählen öffnet den "Eigenschaftseditor" für das Element und die Eigenschaften des Objektes können bearbeitet werden.

Hinweis: für sich überlappende Objekte, z.B. ein Punkt auf einem Weg, erscheint das Auswahlmenü ein weiteres mal. Wählt man das schon ausgewählte Objekt nochmals wird der Eigenschaftseditor gestartet, wählt man ein anderes Objekt so wird dieses ausgewählt.

#### Ausgewählte Objekte: Einen Knoten oder Weg verschieben

Ist ein Objekt ausgewählt kann es verschoben werden. Hinweis: Objekte können erst verschoben werden nachdem sie ausgewählt wurden. Durch ziehen in der Nähe (d.h. in der Toleranzzone) kann es dann verschoben werden. In den Einstellungen kann für Punkte einen grösseren Bereich einschalten und anzeigen lassen mit dem der Punkt leichter verschoben werden kann als mit der Standardeinstellung. 

#### Einen neuen Knoten oder Weg erstellen (langer Klick)

Mit einem langen Klick wird die Position gewählt wo der Weg beginnt oder ein Punkt erstellt werden soll.  Ein Positionskreuzsymbol markiert die Stelle. 
* Soll ein neuer Knoten erstellt werden muss der nicht mit einem anderen Objekt verbunden ist, muss die Position ausserhalb der "Toleranzzone" liegen.
* Soll ein bestehender Weg verlängert werden, sollte die Position innerhalb der "Toleranzzone" des Wegs oder eines Knotens auf dem Weg liegen.

Sobald das Positionskreuz erscheint, gibt es die folgenden Möglichkeiten:

* Nochmaliges Berühren an der gleichen Stelle.
    * Ist das Positionskreuz nicht in der Nähe eines Punktes, erstellt das Berühren einen neuen Punkt. Falls die Position in der Nähe eines Weges (aber nicht in der Nähe eines Punktes) ist wird der neue Punkt als Teil des Weges erstellt.
    * Ist das Positionskreuz in der Nähe eines Punktes, so wird kein neuer Punkt erstellt, sondern nur der Eigenschaftseditor gestartet.
* Nochmaliges Berühren an einer anderen Stelle. Erstellt einen Punkt wie oben beschrieben und einen Wegabschnitt zu der neuen Position.

Um den Weg zu verlängern tippe an den Stellen wo du weitere Wegpunkte haben willst. Um den Weg fertigzustellen, tippe nochmals auf den letzten Punkt. Falls der Endpunkt auf einem anderen Weg oder Punkt liegt wird er automatisch in diesen integriert. 

Um den Vorgang abzuschliessen kann auch ein entsprechender Menü-Eintrag ausgewählt werden, siehe [Neue Objekte erstellen](../en/Creating%20new%20objects.md) für weitere Informationen.

#### Flächen erstellen

Aktuell hat OpenStreetMap keinen eigenen Objekttyp für Flächen im Gegensatz zu anderen Geo-Datensysteme. Der Online-Editor "iD" versucht dem Benutzer eine solche Abstraktion anzubieten, dies funktioniert mal gut, mal schlecht. Vespucci versucht das in der vorliegenden Version nicht, deshalb hier einige Information dazu wie in OSM Flächen abgebildet werden:

* _geschlossene Wege (*Polygone")_: die einfachste und häufigste Flächenvariante sind Wege bei denen Anfang- und Endpunkt derselbe Knoten ist, und die einen geschlossenen "Ring" bilden, z.B. sind die meisten Gebäude von diesem Typ. Solche Flächen sind mit Vespucci einfach zu erstellen, um den Ring fertigzustellen muss einfach der letzte Knoten auf den ersten zu liegen kommen. Hinweis: die Interpretation von geschlossenen Wegen als Fläche hängt von ihren Tags ab, ist ein geschlossener Weg als Kreisel getaggt, so wird es als Fläche interpretiert, ist der Weg als Kreisel getaggt, nicht. In gewissen Fällen in denen beide Interpretationen möglich wären, kann man dies durch ein "area" Tag klären.
* _Multi-Polygone_: es gibt Flächen die aus mehreren Teilen, Löcher und Ringe bestehen, diese können nicht mit nur einem Weg abgebildet werden. OSM verwendet ein spezieller Typ Relation (das OSM Objekt, dass Beziehungen zwischen mehreren Objekte abbilden kann) um das Problem zu lösen, ein Multi-Polygon. Ein Multi-Polygon kann mehrere äussere ("outer") und innere ("inner") Ringe besitzen. Jeder Ring kann entweder ein geschlossener Weg sein wie oben beschrieben, oder mehrere Wege mit gemeinsamen Endpunkte. Während grosse Multi-Polygone mit jedem Werkzeug schwer zu bearbeiten sind, können kleine einfach mit Vespucci erstellt werden 
* _Küstenlinien_:  für sehr grosse Flächen, Kontinente und Inseln, versagt auch das Multi-Polygon Modell. Für Küstenlinien (natural=coastline) verwenden wir richtungsabhängige Bedeutung, mit der Landfläche auf der linken Seite und das Wasser auf der rechten. Ein Nebeneffekt ist das die Richtung von solchen Wegen nicht geändert werden sollte. Mehr Information dazu findet man auf dem [OSM wiki](http://wiki.openstreetmap.org/wiki/Tag:natural%3Dcoastline).

#### Die Geometrie eines Weges verbessern

Zoomt man genügend nah an ein ausgewähltes Wegsegment wird ein kleines "x" sichtbar. Zieht man daran wird ein Knoten im Weg erstellt. Hinweis: um das versehentliche Erstellen solcher Punkte zu verhindern ist der empfindliche Bereich um das "x" ziemlich klein.

#### Kopieren, Ausschneiden & Einfügen

Ausgewählte Knoten und Wege können kopiert oder ausgeschnitten werden, und dann ein- oder mehrmals wieder eingefügt werden. Ausschneiden erhält sowohl die OSM Id wie auch die Version. Ein langer Druck markiert die Position an der eingefügt werden soll, um die Aktion auszulösen danach "Einfügen" aus dem Menü auswählen.

#### Effizient Adressen eintragen

Vespucci hat eine "Adresseigenschaften hinzufügen" Funktion, die versucht Adresserfassung schneller und effizienter zu machen. Die Funktion kann ausgewählt werden

* nach einem langen Druck: Vespucci erstellt dann einen Knoten an der markierten Stelle, versucht eine wahrscheinliche Hausnummer vorherzusagen  und schlägt weitere aktuell verwendete Adresswerte vor.  Falls der Punkt auf einem Gebäudeumriss liegt wird automatisch ein Eingang erstellt. Der Eigenschaftseditor wird dann gestartet um allfällige Korrekturen und andere Änderungen zu ermöglichen. 
*  in den "Knoten/Weg ausgewählt" Modi:: Vespucci fügt Eigenschaften wie oben beschrieben hinzu und startet den Eigenschaftseditor.
* im Eigenschaftseditor.

Die Hausnummernvorhersage benötigt typischerweise mindestens die Eingabe von je 2 Hausnummern auf jede Seite der Strasse, je mehr Nummern in den Daten vorhanden sind desto besser funktioniert die Vorhersage. 

Es ist sinnvoll dies mit [Auto-download](#download) zu verwenden.  

#### Abbiegebeschränkungen eintragen

Vespucci erlaubt es schnell Abbiegebeschränkungen hinzuzufügen. Falls dazu Wege aufgetrennt werden müssen, geschieht dies automatisch und gegebenenfalls wird der Benutzer aufgefordert die Elemente neu auszuwählen. 

* wähle ein Weg mit  Strassen ("highway") Eigenschaft aus (Abbiegebeschränkungen können nur mit solchen Wegen erstellt werden, für andere Wege kann dies mit der allgemeineren "Relation erstellen" Funktion gemacht werden)
* wähle "Abbiegebeschränkung hinzufügen" im Menü
* wähle den "via" Knoten oder Weg aus (nur die möglichen "via" Elemente werden den Toleranzbereich angezeigt haben) 
* wähle den Zielweg ("to") aus (es ist auch möglich den ursprünglichen "from" Weg auszuwählen. Vespucci nimmt dann an, dass eine "no_u_turn" Beschränkung erstellt werden soll)
* setzte den Typ der Abbiegebeschränkung

### Vespucci im "gesperrten" Modus

Während dem Vespucci "gesperrt" ist sind alle Funktionen verfügbar die nicht die Geometrie oder Eigenschaften von Objekten verändern. Des weiteren kann nach einem langen Druck auf dem Schirm die Eigenschaften von Objekten in der Nähe angezeigt werden.

### Die Bearbeitungen abspeichern

*(benötigt Netzwerkzugang)

Wähle den gleichen Icon oder Menüeintrag wie für das Herunterladen und wähle jetzt "Daten zum OSM-Server hochladen".

Vespucci unterstützt sowohl OAuth Autorisierung (Standardeinstellung) wie auch Benutzername und Passwort. Wo möglich sollte OAuth verwendet werden um die Übertragung von Passworten zu vermeiden.  

Neue Vespucci Installationen haben OAuth voreingestellt. Beim ersten Versuch Daten auf den OSM Server zu speichern wird eine Seite der OSM Website geladen (über eine verschlüsselte Verbindung). Nach der erfolgreichen Authentisierung mit Username und Passwort muss den Zugriff mit OAuth zugelassen werden. Falls dieser Vorgang vor dem ersten Hochladen ausgelöst werden soll, gibt es einen entsprechende Auswahlmöglichkeit im "Werkzeuge" Menü.

Sollen die Änderungen gespeichert werden und es ist kein Internetzugang verfügbar, können sie in einer JOSM kompatible .osm Datei gespeichert werden und später entweder mit Vespucci oder mit JOSM hochgeladen werden. 

#### Konfliktbehebung beim Upload

Vespucci hat einen einfachen Konfliktbehebungsmechanismus eingebaut. Sind grössere Probleme mit den Änderungen zu erwarten, empfehlen wir sie in ein .osc Datei zu speichern ("Transfer" Menü, "Datei...,"  "Änderungen exportieren") und die Konflikte dann mit JOSM zu beheben. Für Details siehe den [conflict resolution](../en/Conflict%20resolution.md) Hilfetext.  

## GPS verwenden

Vespucci kann auch einen GPX Track erstellen und auf dem Schirm anzeigen. Weiter kann auch die aktuelle GPS-Position ("GPS-Position anzeigen" im Menü) angezeigt werden und/oder der Bildschirm darauf zentriert und nachgeführt werden ("GPS-Position folgen").   

Falls letzteres eingeschaltet ist, wird es beim Verschieben des Schirms oder beim Editieren abgeschaltet und der blaue "GPS-Pfeil" ändert sich vom Umriss auf einen ausgefüllten Pfeil. Um wieder in den Nachführmodus zu gelangen genügt die "GPS-Schalftfläche", oder die Option im Menü wieder auszuwählen.

## Notizen und Fehler

Vespucci unterstützt das Herunterladen, Kommentieren und Schliessen von OSM Notizen (vormals OSM Bugs) und die entsprechende Funktionalität für "Fehler" die vom [OSMOSE Qualitätssicherungswerkzeug](http://osmose.openstreetmap.fr/en/map/) gemeldet werden. Beide müssen entweder explizit heruntergeladen werden oder die Notizen und Fehler in der Nähe können automatisch geladen werden. Geänderte oder geschlossene Notizen und Fehler können entweder sofort hochgeladen werden oder gespeichert und alle zusammen später hochgeladen werden.

Auf der Karte werden die Notizen und Fehler werden mit einem kleinen Käfer Icon  ![Bug](../images/bug_open.png) angezeigt, grüne sind behoben, blaue sind neu erstellt oder geändert, und Gelb zeigt an, dass die Notiz respektive der Fehler noch unverändert aktiv ist. 

In der Anzeige von OSMOSE Fehler wird jeweils für die betroffenen Objekte ein blau hervorgehobener Link angezeigt, wählt man den Link an, wird das Objekt ausgewählt, der Bildschirm darauf zentriert und, falls nötig, das entsprechende Gebiet heruntergeladen. 

### Anzeigefilter

Zusätzlich zum Freischalten der Notiz- und Fehleranzeige kann eine grobe Auswahl der angezeigten Objekte eingestellt werden. In den "Erweiterten Einstellungen" kann folgendes ausgewählt werden:   

<item>Notes</item>
<item>Osmose Fehler</item>
<item>Osmose Warnung</item>
<item>Osmose nebensächliche Warnung</item>

<a id="indoor"></a>

## Innenraum-Modus

In Innenräumen Daten zu erfassen ist anspruchsvoll auf Grund der grossen Anzahl Objekte und Überlappungen. Vespucci hat einen speziellen Innenraum Modus der es erlaubt alle Objekte die nicht auf der gleichen Etage sind auszufiltern und der bei neu erstellen Objekte automatisch die richtige Etage in den Objekteigenschaften einträgt. 

In den Modus kann durch einen langen Druck auf das Schlosssymbol gewechselt werden, siehe auch [Sperren, entsperren, "nur Eigenschaften bearbeiten" und Innenraum Modus](#lock).

## Filter

### Eigenschaft basierende Filter

Der Filter kann vom Hauptmenü eingeschaltet werden, durch Tippen auf die Filter-Schaltfläche kann es dann bearbeitet werden.. Mehr Informationen kann unter [Tag-Filter](../en/Tag%20filter.md) gefunden werden.

### Vorlagen basierende Filter

Eine Alternative zu obigen, Objekte werden entweder durch einzelne, oder Gruppen von Vorlagen gefiltert. Nach einem Tipp auf die Filter-Schaltfläche Mehr Information kann unter [Vorlagenfilter](../en/Preset%20filter.md) gefunden werden.

## Vespucci individuell anpassen

### Häufig geänderte Einstellungen

* Kartenhintergrund
* Karten Overlay. Dies kann Probleme mit älteren Geräten und solchen mit wenig Hauptspeicher verursachen. Standardwert: kein Overlay.
* Fehler und Notizen anzeigen. Offene Notizen und Fehler werden mit einem gelben Käfer angezeigt, geschlossene in grün. Standardwert: eingeschaltet.
* Foto Layer. Zeigt verortete Fotos die auf dem Gerät gefunden werden als Kamera Icon an, falls Richtungsinformationen vorhanden sind wird die Kamera entsprechend gedreht. Standardwert: ausgeschaltet.
* Icons für Knoten mit Eigenschaften. Standardwert: eingeschaltet.
* Bildschirm nicht abschalten. Standardwert: ausgeschaltet.
* Grosser Bereich um Punkte zu bewegen. Auf Geräten mit Touchscreen ist das Verschieben von Knoten schwierig da die Finger die Sicht auf den Knoten versperren. Eingeschaltet zeigt diese Option einen grossen Bereich um ausgewählte Knoten herum der für das Verschieben verwendet werden kann. Den normale kleine Bereich wird weiterhin für die Objektauswahl und andere Funktionen verwendet. Standardwert: ausgeschaltet.

Erweiterte Einstellungen

* Immer Kontext Menü benutzen. Eingeschaltet wird bei jedem Auswahlprozess das Kontext Menü angezeigt, ausgeschaltet nur dann wenn keine eindeutige Auswahl bestimmt werden kann. Standardwert: aus (früher: ein).
* Helles Thema verwenden. Auf aktuellen Geräten standardmässig eingeschaltet. Kann auch auf älteren Geräten eingeschaltet werden ist aber eventuell nicht vollständig konsistent.
* Zeige Statistiken. Zeigt einige Werte für die Fehlerbehebung an, nicht wirklich nützlich. Standardwert: ausgeschaltet (früher: eingeschaltet).  

## Fehler melden

Falls Vespucci abstürzt oder einen inkonsistenten Zustand entdeckt wird, erscheint eine Aufforderung eine Fehlermeldung ein zuschicken. Bitte komme der Aufforderung nach, aber nur einmal per spezifischen Ereignis.  Falls du mehr Input geben willst oder einen Verbesserungsvorschlag hast, erstelle bitte hier: [Vespucci Issue Tracker](https://github.com/MarcusWolschon/osmeditor4android/issues) einen neuen Eintrag. Falls du zu Vespucci eine Diskussion beginnen willst, kannst du dies entweder auf der [Vespucci google group](https://groups.google.com/forum/#!forum/osmeditor4android) oder dem [OpenStreetMap Android Forum](http://forum.openstreetmap.org/viewforum.php?id=56) machen.


