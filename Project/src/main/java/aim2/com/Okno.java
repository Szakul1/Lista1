package aim2.com;

import javax.swing.*;
/**
 * Klasa zawierajaca okno
 * @author lukia
 * @param panel panel z kropkami 
 */
public class Okno extends JFrame {
	private static final long serialVersionUID = 1L;
	private transient final Panel panel;
	/**
	 * tworzy okno
	 */
	public Okno() {
		super();
		panel=new Panel();
		add(panel);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	
}
