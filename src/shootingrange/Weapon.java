package shootingrange;

import javax.swing.ImageIcon;

public class Weapon {

	private final long UPC;
	private final String CALIBER;
	private final String ACTION;
	private final int CAPACITY;
	private final float BARREL_LENGTH;
	private String weaponName;
	private final ImageIcon icon, iconTarget;
	private final String iconTargetPath =  "src\\icons\\target_26px_1.png";

	public Weapon(long upc, String caliber, String action, int capacity, float barrelLength, String name, String iconPath) {
		UPC = upc;
		CALIBER = caliber;
		ACTION = action;
		CAPACITY = capacity;
		BARREL_LENGTH = barrelLength;
		weaponName = name;
		icon = new ImageIcon("src\\icons\\" + iconPath);
		iconTarget = new ImageIcon(iconTargetPath);
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public ImageIcon getIcon() {
		return icon;
	}
	
	public ImageIcon getIconTarget() {
		return iconTarget;
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
