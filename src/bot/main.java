package bot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class main {

	public static void main(String[] args) {

		try {
			Robot robot = new Robot();

			String string = "testing line overflow";
			String stringCaps = string.toUpperCase();
			long num = 0;

			char[] chars = string.toCharArray();
			char[] charsCaps = stringCaps.toCharArray();
			Thread.sleep(5000);
			for (int i = 0; i < 500; i++) {
				num++;
				String n = Long.toString(num);
				char[] nc = n.toCharArray();
				robot.keyPress(KeyEvent.VK_ENTER);
				for (int j = 0; j < charsCaps.length; j++) {
					robot.keyPress(charsCaps[j]);
					robot.keyRelease(charsCaps[j]);
				}
				for (int j = 0; j < nc.length; j++) {
					robot.keyPress(nc[j]);
					robot.keyRelease(nc[j]);
				}
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
