package shootingrange;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1844972436069000097L;
	
	private Weapon weapon;
	
	public MyButton(Weapon weapon) {
		removeMouseListener(getMouseListeners()[0]);
		setLayout(null);
		setFocusable(false);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setIcon(weapon.getIcon());
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
		setIcon(weapon.getIcon());
	}
	
	
	
}
