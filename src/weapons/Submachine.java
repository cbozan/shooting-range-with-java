package weapons;

import shootingrange.Weapon;

public class Submachine extends Weapon{

	public Submachine(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		super(upc, caliber, action, capacity, barrelLength, name);
	}

	public Submachine(long upc, String caliber, String action, int capacity, float barrelLength) {
		super(upc, caliber, action, capacity, barrelLength);
	}

	
	
	
}