package shootingrange;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	private final ImageIcon shootingIcon;
	private final ImageIcon shootingActionIcon;

	public Weapon(long upc, String caliber, String action, int capacity, float barrelLength, String name, 
			String iconPath, String shootingIconPath, String shootingActionIconPath) {
		UPC = upc;
		CALIBER = caliber;
		ACTION = action;
		CAPACITY = capacity;
		BARREL_LENGTH = barrelLength;
		weaponName = name;
		icon = new ImageIcon("src\\icons\\" + iconPath);
		
		iconTarget = new ImageIcon(iconTargetPath);
		
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src\\icons\\" + shootingIconPath));
		    
		} catch (IOException e) {
		}

		
		this.shootingIcon = new ImageIcon(img.getScaledInstance(300, 200, Image.SCALE_DEFAULT));
		
		try {
			img = ImageIO.read(new File("src\\icons\\" + shootingActionIconPath));
		} catch (IOException e) {
		}
		
		this.shootingActionIcon = new ImageIcon(img.getScaledInstance(300, 200, Image.SCALE_DEFAULT));

	}
	
	

	public ImageIcon getShootingIcon() {
		return shootingIcon;
	}



	public ImageIcon getShootingActionIcon() {
		return shootingActionIcon;
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

	public long getUpc() {
		return UPC;
	}

	public String getCaliber() {
		return CALIBER;
	}

	public String getAction() {
		return ACTION;
	}

	public int getCapacity() {
		return CAPACITY;
	}

	public float getBarrelLength() {
		return BARREL_LENGTH;
	}

	public String getName() {
		return weaponName;
	}

}
