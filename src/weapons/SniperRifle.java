package weapons;

import shootingrange.Weapon;

public class SniperRifle extends Weapon{

	public SniperRifle(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		super(upc, caliber, action, capacity, barrelLength, name);
	}

	public SniperRifle(long upc, String caliber, String action, int capacity, float barrelLength) {
		super(upc, caliber, action, capacity, barrelLength);
	}

	
	
	
}
