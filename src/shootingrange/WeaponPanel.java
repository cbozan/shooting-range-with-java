package shootingrange;


import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicButtonListener;

import weapons.AssaultRifle;
import weapons.Gun;
import weapons.MachineGun;
import weapons.SniperRifle;
import weapons.Submachine;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class WeaponPanel extends JPanel implements MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3997489790514701978L;
	
	/**
	 * width of the panel
	 */
	public static final int PANEL_WIDTH = 800;
	
	/**
	 * height of the panel
	 */
	public static final int PANEL_HEIGHT = 600;
	
	ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	ArrayList<MyButton> buttons = new ArrayList<MyButton>();
	
	JLabel backgroundImage_label;
	JPanel leftPanel;
	Features rightPanel;
	MyButton gun_button, submachine_button, assaultRifle_button, sniperRifle_button, machineGun_button;
	Window superWindow;
	
	
	public WeaponPanel(Window superWindow) {
		
		setLayout(null);
		this.setBackground(Color.red);
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		
		
		backgroundImage_label = new JLabel(new ImageIcon("src\\icons\\800x600.jpg"));
		backgroundImage_label.setBounds(0, 0, PANEL_WIDTH, PANEL_HEIGHT);
		this.add(backgroundImage_label);
		
		this.superWindow = superWindow;
		
		leftPanel = new JPanel();
		leftPanel.setBounds(0, 180, 50, 210);
		leftPanel.setBackground(new Color(0, 0, 0, 150));
		backgroundImage_label.add(leftPanel);
		
		rightPanel = new Features();
		backgroundImage_label.add(rightPanel);
		
		
		weapons.add(new Gun(823482834534L, "9MM", "SEMI AUTO", 17, 4.49f, "GLOCK"));
		weapons.add(new Submachine(234283472830L, "28MM", "BLOWBACK", 50, 10.4f, "FN P90"));
		weapons.add(new AssaultRifle(423916531032L, "39MM", "GAS-OPERATED", 30, 16.3f, "AK 47"));
		weapons.add(new SniperRifle(793134924742L, "51MM", "BOLT-ACTION", 10, 26.0f, "PRICKSKY"));
		weapons.add(new MachineGun(923482374821L, "7.8MM", "CRANK HANDLE", 200, 26.5f, "GATLING GUN"));
		
		gun_button = new MyButton(weapons.get(0));
		gun_button.addMouseListener(this);
		buttons.add(gun_button);
		
		submachine_button = new MyButton(weapons.get(1));
		submachine_button.addMouseListener(this);
		buttons.add(submachine_button);
		
		assaultRifle_button = new MyButton(weapons.get(2));
		assaultRifle_button.addMouseListener(this);
		buttons.add(assaultRifle_button);
		
		sniperRifle_button = new MyButton(weapons.get(3));
		sniperRifle_button.addMouseListener(this);
		buttons.add(sniperRifle_button);
		
		machineGun_button = new MyButton(weapons.get(4));
		machineGun_button.addMouseListener(this);
		buttons.add(machineGun_button);
		
		
		System.out.println(gun_button.getPreferredSize());
		System.out.println(sniperRifle_button.getPreferredSize());
		addButton();
	}
	
	
	public void addButton() {
		
		for(int i = 0; i < buttons.size(); i++) {
			
			buttons.get(i).setActionCommand(buttons.get(i).getWeapon().getName());
			leftPanel.add(buttons.get(i));
			
		}
		
	}




	@Override
	public void mouseClicked(MouseEvent e) {

		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		((MyButton)e.getSource()).setIcon(((MyButton)e.getSource()).getWeapon().getIconTarget());
		rightPanel.addWeapon(((MyButton)e.getSource()).getWeapon());
		rightPanel.setVisible(true);
		superWindow.repaint();
	}


	@Override
	public void mouseExited(MouseEvent e) {
		((MyButton)e.getSource()).setIcon(((MyButton)e.getSource()).getWeapon().getIcon());
		rightPanel.setVisible(false);
		superWindow.repaint();
	}
	
	
	private class Features extends JPanel{
		
		
		private static final long serialVersionUID = 1L;
		
		JLabel head_label;
		JLabel upc_label, caliber_label, action_label, capacity_label, barrelLength_label, name_label;
		JLabel upcText_label, caliberText_label, actionText_label, capacityText_label, barrelLengthText_label, nameText_label;
		
		public Features() {
			
			setLayout(null);
			setBounds(545, 0, 255, 600);
			setBackground(new Color(0, 0, 0, 175));
			setVisible(false);
			
			head_label = new JLabel("FEATURES");
			head_label.setBounds(0, 60, 255, 40);
			head_label.setOpaque(true);
			head_label.setBackground(Color.BLACK);
			head_label.setForeground(new Color(49, 88, 143));
			head_label.setHorizontalAlignment(JLabel.CENTER);
			
			name_label = new JLabel("NAME");
			name_label.setBounds(20, 170, 120, 40);
			name_label.setForeground(Color.WHITE);
			
			upc_label = new JLabel("UPC");
			upc_label.setBounds(20, 200, 120, 40);
			upc_label.setForeground(Color.WHITE);
			
			caliber_label = new JLabel("CALIBER");
			caliber_label.setBounds(20, 230, 120, 40);
			caliber_label.setForeground(Color.WHITE);
			
			action_label = new JLabel("ACTION");
			action_label.setBounds(20, 260, 120, 40);
			action_label.setForeground(Color.WHITE);
			
			capacity_label = new JLabel("CAPACITY");
			capacity_label.setBounds(20, 290, 120, 40);
			capacity_label.setForeground(Color.WHITE);
			
			barrelLength_label = new JLabel("BARREL LENGTH");
			barrelLength_label.setBounds(20, 320, 100, 40);
			barrelLength_label.setForeground(Color.WHITE);
			
			nameText_label = new JLabel();
			nameText_label.setBounds(140, 170, 100, 40);
			nameText_label.setForeground(Color.GREEN);
			
			upcText_label = new JLabel();
			upcText_label.setBounds(140, 200, 100, 40);
			upcText_label.setForeground(Color.GREEN);
			
			caliberText_label = new JLabel();
			caliberText_label.setBounds(140, 230, 100, 40);
			caliberText_label.setForeground(Color.GREEN);
			
			actionText_label = new JLabel();
			actionText_label.setBounds(140, 260, 100, 40);
			actionText_label.setForeground(Color.GREEN);
			
			capacityText_label = new JLabel();
			capacityText_label.setBounds(140, 290, 100, 40);
			capacityText_label.setForeground(Color.GREEN);
			
			barrelLengthText_label = new JLabel();
			barrelLengthText_label.setBounds(140, 320, 100, 40);
			barrelLengthText_label.setForeground(Color.GREEN);
			
			this.add(head_label);
			
			this.add(name_label);
			this.add(nameText_label);
			
			this.add(upc_label);
			this.add(upcText_label);
			
			this.add(caliber_label);
			this.add(caliberText_label);
			
			this.add(action_label);
			this.add(actionText_label);
			
			this.add(capacity_label);
			this.add(capacityText_label);
			
			this.add(barrelLength_label);
			this.add(barrelLengthText_label);
			
		
		}
		
		
		public void addWeapon(Weapon weapon) {
			
			upcText_label.setText(""+weapon.getUpc());
			caliberText_label.setText(weapon.getCaliber());
			actionText_label.setText(weapon.getAction());
			capacityText_label.setText(""+weapon.getCapacity());
			barrelLengthText_label.setText(""+weapon.getBarrelLength());
			nameText_label.setText(weapon.getName());
			
			//repaint();
		}
		
	}
	
}
