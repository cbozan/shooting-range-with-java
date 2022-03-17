package weapons;

import shootingrange.Weapon;

public class AssaultRifle extends Weapon{

	public AssaultRifle(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		super(upc, caliber, action, capacity, barrelLength, name);
	}

	public AssaultRifle(long upc, String caliber, String action, int capacity, float barrelLength) {
		super(upc, caliber, action, capacity, barrelLength);
	}
	
	
	
}
