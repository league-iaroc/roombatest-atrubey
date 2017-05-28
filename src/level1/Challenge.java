package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * Without touching the wall reach the endZone use sleep an driveDirect
	 */
	public void initialize() {
		// write code here!

		driveDirect(300, 300);
		sleep(3000);
		driveDirect(0, 100);
		sleep(3500);
		driveDirect(400, 400);
		sleep(9000);
		driveDirect(0, 100);
		sleep(3750);
		driveDirect(300, 300);
	}

	public void loop() {

	}
}
