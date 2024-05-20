package billing;

import java.awt.*;
import javax.swing.*;

public class splash {
	public static void main(String args[]) {
		fframe f1 = new fframe();
		f1.setVisible(true);
		int i;
		int x = 1;
		for (i = 2; i <= 600; i += 40, x++) {
			f1.setLocation(800 - ((i + x) / 2), 500 - (i / 2));
			f1.setSize((i + x), i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}

	}

	public static class fframe extends JFrame implements Runnable {
		Thread t1;

		fframe() {
			super("Electricity Billing System");
			setLayout(new FlowLayout());
			ImageIcon i2 = Icon.get("splash.jpg", 720, 550);

			JLabel l1 = new JLabel(i2);
			add(l1);
			t1 = new Thread(this);
			t1.start();
		}

		public void run() {
			try {
				Thread.sleep(2000);
				this.setVisible(false);
				new login().setVisible(true);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
