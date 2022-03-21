package weapons;

import javax.swing.ImageIcon;

import shootingrange.Weapon;

public class Gun extends Weapon{
	
	
	public Gun(long upc, String caliber, String action, int capacity, float barrelLength) {
		this(upc, caliber, action, capacity, barrelLength, "Weapon");
	}

	public Gun(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		super(upc, caliber, action, capacity, barrelLength, name, "gun_26px.png", "glock.png", "no-image.png");
	}
	
}
