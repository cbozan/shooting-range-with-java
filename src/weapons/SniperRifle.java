package weapons;

import shootingrange.Weapon;

public class SniperRifle extends Weapon{

	
	public SniperRifle(long upc, String caliber, String action, int capacity, float barrelLength) {
		this(upc, caliber, action, capacity, barrelLength, "Weapon");
	}
	
	
	public SniperRifle(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		super(upc, caliber, action, capacity, barrelLength, name, "sniper_rifle_26px.png", "no-image.png", "no-image.png");
	}
	
}
