package shootingrange;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2269397341188774213L;
	
	/**
	 * width of the window
	 */
	public static final int WINDOW_WIDTH = 800;
	
	/**
	 * height of the window
	 */
	public static final int WINDOW_HEIGHT = 600;
	
	/**
	 * X-axis starting point of window content
	 */
	public static int WINDOW_X_ORIGIN;
	
	/**
	 * Y-axis starting point of window content
	 */
	public static int WINDOW_Y_ORIGIN;
	
	/**
	 * X-axis end point of window content
	 */
	public static int WINDOW_X_END;
	
	/**
	 * Y-axis end point of window content
	 */
	public static int WINDOW_Y_END;
	
	/**
	 * window edge
	 */
	public static Insets INSETS;
	
	WeaponPanel weaponPanel;
	
	public Window() {
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		INSETS = this.getInsets();
		
		setSize(WINDOW_WIDTH + INSETS.left + INSETS.right, WINDOW_HEIGHT + INSETS.top + INSETS.bottom);
		setLocationRelativeTo(null);
		
		GUI();
		
	}
	
	
	private void GUI() {
		
		WeaponPanel wpanel = new WeaponPanel(this);
		this.add(wpanel);
		
	
	}

	
}
