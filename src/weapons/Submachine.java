package weapons;

import shootingrange.Weapon;

public class Submachine extends Weapon{

	public Submachine(long upc, String caliber, String action, int capacity, float barrelLength) {
		this(upc, caliber, action, capacity, barrelLength, "Weapon");
	}

	public Submachine(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		super(upc, caliber, action, capacity, barrelLength, name, "submachine_gun_26px.png", "FNP90.png", "no-image.png");
	}

	
	
	
}