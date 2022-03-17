package shootingrange;

import javax.swing.ImageIcon;

public class Weapon {
	
	private final long UPC;
	private final String CALIBER;
	private final String ACTION;
	private final int CAPACITY;
	private final float BARREL_LENGTH;
	private String weaponName;
	
	
	public Weapon(long upc, String caliber, String action, int capacity, float barrelLength) {
		this(upc, caliber, action, capacity, barrelLength, "Weapon");
	}
	
	
	public Weapon(long upc, String caliber, String action, int capacity, float barrelLength, String name) {
		UPC = upc;
		CALIBER = caliber;
		ACTION = action;
		CAPACITY = capacity;
		BARREL_LENGTH = barrelLength;
		weaponName = name;
	}
	
	
	public ImageIcon getIcon() {
		return new ImageIcon("src\\icons\\no-image.png");
	}


	public long getUPC() {
		return UPC;
	}

	public String getCALIBER() {
		return CALIBER;
	}

	public String getACTION() {
		return ACTION;
	}

	public int getCAPACITY() {
		return CAPACITY;
	}

	public float getBARREL_LENGTH() {
		return BARREL_LENGTH;
	}
	
	public String getName() {
		return weaponName;
	}
	
}
