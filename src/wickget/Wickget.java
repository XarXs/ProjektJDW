package wickget;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class Wickget extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Wickget() {
		setUndecorated(true);
		setSize(200,200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
		Shape shape = new Ellipse2D.Float(0,0,200,200);
		this.setShape(shape);
	}
	
	public static void main(String[] args) {
		new Wickget();
	}
}
