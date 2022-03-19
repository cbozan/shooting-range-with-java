package weapons;

import shootingrange.Weapon;

public class MachineGun extends Weapon {

	public MachineGun(long upc, String caliber, String action, int capacity, float barrelLength) {
		this(upc, caliber, action, capacity, barrelLength, "Weapon");
	}
	
	public MachineGun(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		super(upc, caliber, action, capacity, barrelLength, name, "gatling_gun_26px.png");
	}

}
