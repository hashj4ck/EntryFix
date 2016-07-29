package com.game.zombielab.werkzeuge.startupwerkzeug;

/**
 * 
 * {Description of "StartupWerkzeug.java"}
 * <p>
 * Diese Werkzeugklasse dient zum starten des Spiels. Dient zum Verwalten der
 * Benutzereingaben von StartupWerkzeugUI
 *
 * @author Christian
 * @author Vinh
 * @version 29.07.2016
 *
 * @since 29.07.2016 , 21:18:53
 *
 */
public class StartupWerkzeug {

	private StartupWerkzeugUI _ui;

	// Subwerkzeuge, ("Widgets") die eingebunden werden können folgen hier:

	// Services, die das Werkzeug benutzt folgen hier:

	// Materialien, die das Werkzeug benutzt folgen hier:

	// Fachwerte, die das Werkzeug benutzt folgen hier:

	/**
	 * 
	 * Constructor of "StartupWerkzeug.java"
	 *
	 * Wird aufgerufen beim Erzeugen eines neuen StartupWerkzeuges
	 * 
	 * TODO: [29.07.2016 / 21:31:30, Christian] Finish the Constructor of
	 * "StartupWerkzeug.java"
	 */
	public StartupWerkzeug() {

		_ui = new StartupWerkzeugUI();

		// Services initialisieren

		// Subwerkzeuge erstellen

		// Listener für Subwerkzeuge erstellen
		erzeugeListenerFuerSubwerkzeuge();

		// UI erstellen (mit eingebetteten UIs der direkten Subwerkzeuge)

		// UI Aktionen registrieren
		registriereUIAktionen();

		// Fenster anzeigen
		_ui.zeigeFenster();

	}

	/**
	 * 
	 * Erzeugt Listener für die eingebetteten Widgets in dem StartupWerkzeug
	 * Hier wird festgelegt, wie die UI sich verhält, wenn Änderungen in den
	 * Subwerkzeugen gemacht wurden.
	 *
	 * TODO: [29.07.2016 / 21:31:53, Christian] Finish the method
	 * "erzeugeListenerFuerSubwerkzeuge" in "StartupWerkzeug.java"
	 */
	private void erzeugeListenerFuerSubwerkzeuge() {

	}

	/**
	 * 
	 * Registriert die einzelnen Listener für Elemente der UI. Hier werden nur
	 * UI-Elemente des eigenen Werkzeuges deklariert. Die UI-Elemente in den
	 * Subklassen werden NICHT hier, sondern in deren Klassen festgelegt.
	 *
	 * TODO: [29.07.2016 / 21:32:47, Christian] Finish the method
	 * "registriereUIAktionen" in "StartupWerkzeug.java"
	 */
	private void registriereUIAktionen() {

	}

	/**
	 * 
	 * Zeigt das Fenster dem Benutzer an.
	 *
	 */
	public void zeigeFenster() {
		_ui.zeigeFenster();
	}

	/**
	 * 
	 * Schließt das Fenster.
	 */
	public void schliesseFenster() {
		_ui.schliesseFenster();
	}

}
