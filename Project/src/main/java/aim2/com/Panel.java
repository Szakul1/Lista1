package aim2.com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JPanel;

/**
 * Klasa z panelem z kropkami
 * 
 * @author lukia
 *
 */

public class Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private transient int xpixel, ypixel;
	private transient static final int size = 50;

	/**
	 * tworzenie panelu
	 */
	public Panel() {
		super();
		addMouseListener(new MyMouse());
		setBackground(Color.white);
		repaint();
	}

	private void doDrowing(final Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.red);
		xpixel = losuj(getSize().width - size);
		ypixel = losuj(getSize().height - size);
		g2.fillOval(xpixel, ypixel, size, size);
	}
	@Override
	protected void paintComponent(final Graphics g) {
		super.paintComponent(g);
		doDrowing(g);
	}
	/**
	 * 
	 * @author lukia
	 * klasa odbiera sygnaly myszy
	 */
	private class MyMouse extends MouseAdapter {
		/**
		 * konstruktor
		 */
		public MyMouse() {
			super();
		}
		@Override
		/**
		 * Wychwytuje klikniecia myszy
		 */
		public void mousePressed(final MouseEvent event) {
			if (Math.sqrt(Math.pow(event.getX() - xpixel - size / 2, 2) + Math.pow(event.getY() - ypixel - size / 2, 2)) <= size/ 2)
				repaint();
		}
	}

	private int losuj(final int range) {
		final Random generator = new Random();
		return generator.nextInt(range);
	}
}
