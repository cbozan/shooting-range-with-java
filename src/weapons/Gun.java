package weapons;

import javax.swing.ImageIcon;

import shootingrange.Weapon;

public class Gun extends Weapon{
	
	public Gun(long upc, String caliber, String action, int capacity, float barrelLength) {
		super(upc, caliber, action, capacity, barrelLength);
		
	}

	public Gun(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		super(upc, caliber, action, capacity, barrelLength, name);
	}
	
	
	
	
}
