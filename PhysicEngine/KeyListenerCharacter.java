package PhysicEngine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerCharacter implements KeyListener {

	public static boolean Up = false;
	public static boolean Down = false;
	public static boolean Left = false;
	public static boolean Right = false;
	
	public void keyPressed(KeyEvent arg0) {
		//touche z q s d
		if (arg0.getKeyCode() == 90)
			Up = true;
		if (arg0.getKeyCode() == 81)
			Left = true;
		if (arg0.getKeyCode() == 83)
			Down = true;
		if (arg0.getKeyCode() == 68)
			Right = true;
	}

	public void keyReleased(KeyEvent arg0) {
		if (arg0.getKeyCode() == 90)
			Up = false;
		if (arg0.getKeyCode() == 81)
			Left = false;
		if (arg0.getKeyCode() == 83)
			Down = false;
		if (arg0.getKeyCode() == 68)
			Right = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {}

}
