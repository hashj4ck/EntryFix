package com.ems.entryfix.werkzeuge.startupwerkzeug;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Subwerkzeug2UI {

	private JPanel _panel;
	private JTextField _textfeld;

	/**
	 * 
	 * Constructor of "Subwerkzeug1.java"
	 *
	 * {Description}
	 * 
	 * TODO: [29.07.2016 / 22:47:16, Christian] Finish the Constructor of
	 * "Subwerkzeug1.java"
	 */
	public Subwerkzeug2UI() {

		_panel = erstellePanel();

	}

	/**
	 * 
	 * {Description of "erstellePanel"}
	 *
	 * TODO: [29.07.2016 / 22:53:22, Christian] Finish the method
	 * "erstellePanel" in "Subwerkzeug1UI.java"
	 * 
	 * @return
	 */
	private JPanel erstellePanel() {

		JPanel panel = new JPanel();
		_textfeld = new JTextField();

		panel.add(_textfeld);
		return panel;

	}

	/**
	 * Zeigt das Fenster an
	 */
	void zeigeFenster() {
		_panel.setVisible(true);
	}

	/**
	 * Schließt das Fenster.
	 */
	void schliesseFenster() {
		_panel.setVisible(false);
	}

	/**
	 * GETTER-Methode zu "_panel". Ermöglicht es Clienten, den Wert der
	 * Exemplarvariablen "_panel" zu erhalten.
	 *
	 * @return the _panel
	 */
	JPanel get_panel() {
		return _panel;
	}

	/**
	 * GETTER-Methode zu "_neuerButton". Ermöglicht es Clienten, den Wert der
	 * Exemplarvariablen "_neuerButton" zu erhalten.
	 *
	 * @return the _neuerButton
	 */
	JTextField get_Textfield() {
		return _textfeld;
	}

}
