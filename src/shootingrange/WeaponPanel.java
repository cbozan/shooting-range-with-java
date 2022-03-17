package shootingrange;


import java.awt.Color;
import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicButtonListener;

import weapons.AssaultRifle;
import weapons.Gun;
import weapons.SniperRifle;
import weapons.Submachine;



public class WeaponPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3997489790514701978L;
	
	/**
	 * width of the panel
	 */
	public static final int PANEL_WIDTH = 50;
	
	/**
	 * height of the panel
	 */
	public static final int PANEL_HEIGHT = 600;
	
	
	ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	JPanel topPanel, bottomPanel;
	
	public WeaponPanel() {
		
		setLayout(null);
		setBackground(new Color(0, 0, 0, 100));
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 200, 50, 200);
		bottomPanel.setBackground(this.getBackground());
		this.add(bottomPanel);
		
		
		
		weapons.add(new Gun(823482834534L, "9MM", "SEMI AUTO", 17, 4.49f, "GLOCK"));
		weapons.add(new Submachine(234283472830L, "28MM", "BLOWBACK", 50, 10.4f, "FN P90"));
		weapons.add(new AssaultRifle(423916531032L, "39MM", "GAS-OPERATED", 30, 16.3f, "AK 47"));
		weapons.add(new SniperRifle(793134924742L, "51MM", "BOLT-ACTION", 10, 26.0f, "PRICKSKY"));
		
		JButton btn_1 = new JButton();
		btn_1.removeMouseListener(btn_1.getMouseListeners()[0]);
		btn_1.setActionCommand("GLOCK");
		btn_1.setLayout(null);
		btn_1.setFocusable(false);
		btn_1.setBorderPainted(false);
		btn_1.setContentAreaFilled(false);
		btn_1.setIcon(new ImageIcon("src\\icons\\gun_30px.png"));
		buttons.add(btn_1);
		
		JButton btn_2 = new JButton();
		btn_2.removeMouseListener(btn_2.getMouseListeners()[0]);
		btn_2.setActionCommand("FN P90");
		btn_2.setLayout(null);
		btn_2.setFocusable(false);
		btn_2.setBorderPainted(false);
		btn_2.setContentAreaFilled(false);
		btn_2.setIcon(new ImageIcon("src\\icons\\submachine_gun_26px.png"));
		btn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_2.setIcon(new ImageIcon("src\\icons\\target_26px_1.png"));
				
				WeaponPanel.this.revalidate();
				WeaponPanel.this.repaint();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn_2.setIcon(new ImageIcon("src\\icons\\submachine_gun_26px.png"));
			
				revalidate();
				repaint();
			}
		});
		
		buttons.add(btn_2);
		
		JButton btn_3 = new JButton();
		btn_3.removeMouseListener(btn_3.getMouseListeners()[0]);
		btn_3.setActionCommand("AK 47");
		btn_3.setLayout(null);
		btn_3.setFocusable(false);
		btn_3.setBorderPainted(false);
		btn_3.setContentAreaFilled(false);
		btn_3.setIcon(new ImageIcon("src\\icons\\submachine_gun_26px.png"));
		buttons.add(btn_3);
		
		JButton btn_4 = new JButton();
		btn_4.removeMouseListener(btn_4.getMouseListeners()[0]);
		btn_4.setActionCommand("PRICKSKY");
		btn_4.setLayout(null);
		btn_4.setFocusable(false);
		btn_4.setBorderPainted(false);
		btn_4.setContentAreaFilled(false);
		btn_4.setIcon(new ImageIcon("src\\icons\\submachine_gun_26px.png"));
		buttons.add(btn_4);
		
		addButton();
	}
	
	
	public void addButton() {
		
		for(int i = 0; i < buttons.size(); i++) {
			
			bottomPanel.add(buttons.get(i));
			
		}
		
	}
	
}
