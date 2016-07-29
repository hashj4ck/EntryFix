package com.game.zombielab.werkzeuge.startupwerkzeug;

import javax.swing.JFrame;

public class StartupWerkzeugUI {

	// Titel des Frames:
	private static final String TITEL = "Ehemaligen Verwaltung";

	// Der Hauptframe, der verschiedene Subwerkzeuge hält
	private JFrame _frame;

	/**
	 * 
	 * Constructor of "StartupWerkzeugUI.java"
	 *
	 * Wird aufgerufen, wenn ein neues StartupWerkzeugUI erzeugt wird in der
	 * StartupWerkzeug-Klasse. Kann verschiedene Subwerkzeuge als formale
	 * Parameter übergeben bekommen.
	 * 
	 * TODO: [29.07.2016 / 21:36:12, Christian] Finish the Constructor of
	 * "StartupWerkzeugUI.java"
	 */
	public StartupWerkzeugUI() {

	}

	/**
	 * Zeigt das Fenster an
	 */
	void zeigeFenster() {
		// _frame.setSize(525, 335); Musst du anpassen je nach Fenstergröße!
		_frame.setVisible(true);
	}

	/**
	 * Schließt das Fenster.
	 */
	void schliesseFenster() {
		_frame.setVisible(false);
		_frame.dispose();
	}
