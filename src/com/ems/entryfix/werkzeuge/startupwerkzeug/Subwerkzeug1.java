package com.ems.entryfix.werkzeuge.startupwerkzeug;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Subwerkzeug1 {

	private Subwerkzeug1UI _ui;

	// Services, die das Werkzeug benutzt folgen hier:
	Subwerkzeug

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
	public Subwerkzeug1() {

		_ui = new Subwerkzeug1UI();
		registriereUIAktionen();

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

		_ui.get_neuerButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Gedrückt");

			}
		});

	}

	/**
	 * Gibt das Panel dieses Subwerkzeugs zurück. Das Panel sollte von einem
	 * Kontextwerkzeug eingebettet werden.
	 * 
	 * @ensure result != null
	 */
	public JPanel getUIPanel() {
		return _ui.get_panel();
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
