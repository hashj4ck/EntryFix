package com.ems.entryfix.werkzeuge.startupwerkzeug;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class StartupWerkzeugUI {

	// Titel des Frames:
	private static final String TITEL = "ZombieLab - Whoop!";

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
	 * 
	 * @wbp.parser.entryPoint
	 */
	public StartupWerkzeugUI() {

		_frame = new JFrame();
		_frame.setTitle(TITEL);
		_frame.getContentPane().setLayout(new BorderLayout(0, 0));
	}

	/**
	 * Zeigt das Fenster an
	 */
	void zeigeFenster() {
		_frame.setSize(525, 335);
		_frame.setVisible(true);
	}

	/**
	 * Schließt das Fenster.
	 */
	void schliesseFenster() {
		_frame.setVisible(false);
		_frame.dispose();
	}

}
