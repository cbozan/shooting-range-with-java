package shootingrange;

import javax.swing.JButton;

public class MyButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1844972436069000097L;
	
	
	public MyButton(Weapon weapon) {
		super(weapon.getIcon());
		
	}
}
