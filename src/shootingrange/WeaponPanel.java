package shootingrange;


import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import weapons.Gun;



public class WeaponPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3997489790514701978L;
	
	/**
	 * width of the panel
	 */
	public static final int PANEL_WIDTH = 150;
	
	/**
	 * height of the panel
	 */
	public static final int PANEL_HEIGHT = 600;
	
	
	ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	JPanel topPanel, bottomPanel;
	JScrollPane jsp;
	
	public WeaponPanel() {
		
		setLayout(null);
		setBackground(new Color(0, 0, 0, 100));
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 100, 150, 400);
		bottomPanel.setBackground(this.getBackground());
		this.add(bottomPanel);
		
		
		
		weapons.add(new Gun(1234L, "caliber", "Auto", 2, 1.2f));
		
		
	}
	
}
