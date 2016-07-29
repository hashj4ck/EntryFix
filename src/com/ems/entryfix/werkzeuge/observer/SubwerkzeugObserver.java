package com.ems.entryfix.werkzeuge.observer;

/**
 * Interface für Kontextwerkzeuge, die Subwerkzeuge beobachten möchten.
 * 
 * Werkzeuge, die dieses Interface implementieren, können sich an einem
 * Subwerkzeug, das von {@link ObservableSubwerkzeug} erbt, als Beobachter
 * registrieren. Sie werden dann vom Subwerkzeug bei Änderungen benachrichtigt,
 * zum Beispiel bei der Auswahl eines Materials in einer Liste durch den
 * Benutzer.
 * 
 * Damit ein Kontextwerkzeug mehrere Subwerkzeuge beobachten und auf deren
 * Nachrichten unterschiedlich reagieren kann, bietet es sich an, dieses
 * Interface in inneren Klassen (inner classes) zu implementieren.
 * 
 * @author Christian Bargmann
 * @version 1.0
 */
public interface SubwerkzeugObserver
{
    /**
     * Reagiert auf eine Änderung in dem beobachteten Subwerkzeug.
     */
    void reagiereAufAenderung();
}
