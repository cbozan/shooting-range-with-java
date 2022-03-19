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
	public static final int PANEL_WIDTH = 50;
	
	/**
	 * height of the panel
	 */
	public static final int PANEL_HEIGHT = 600;
	
	
	ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	ArrayList<MyButton> buttons = new ArrayList<MyButton>();
	
	JPanel leftPanel;
	MyButton gun_button, submachine_button, assaultRifle_button, sniperRifle_button, machineGun_button;
	Window superWindow;
	
	public WeaponPanel(Window superWindow) {
		
		setLayout(null);
		setBackground(new Color(0, 0, 0, 100));
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		
		this.superWindow = superWindow;
		
		leftPanel = new JPanel();
		leftPanel.setBounds(0, 180, 50, 210);
		leftPanel.setBackground(this.getBackground());
		this.add(leftPanel);
		
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
		System.out.println("entered");
		superWindow.repaint();
	}


	@Override
	public void mouseExited(MouseEvent e) {
		((MyButton)e.getSource()).setIcon(((MyButton)e.getSource()).getWeapon().getIcon());
		System.out.println("exited");
		superWindow.repaint();
	}
	
}
