package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * complete the MAZE Hint: use bump sensors
	 */

	public void initialize() {

	}

	public void loop() {
		driveDirect(300, 300);

		if (isBumpedRight()) {
			driveDirect(0, 100);
			sleep(2000);
			driveDirect(300, 300);
			sleep(1000);
			driveDirect(100, 0);
			sleep(2000);
			driveDirect(300, 300);
		}
	}
}
