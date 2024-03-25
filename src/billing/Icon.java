package billing;

import java.awt.Image;

import javax.swing.ImageIcon;

public final class Icon {
	public static ImageIcon get(String file, int width, int height) {
		return new ImageIcon(new ImageIcon(ClassLoader.getSystemResource("images/" + file)).getImage()
				.getScaledInstance(width, height, Image.SCALE_DEFAULT));
	}

}
