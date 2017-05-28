package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(300, 300);
		sleep(4000);
		driveDirect(0, 286);
		sleep(1000);
		driveDirect(300, 300);
		sleep(4000);
		driveDirect(285, 0);
		sleep(1000);
		driveDirect(300, 300);
		sleep(4000);
		driveDirect(0, 286);
		sleep(1000);
		driveDirect(300, 300);
		sleep(4000);
		driveDirect(285, 0);
		sleep(1000);
		driveDirect(300, 300);

	}

	public void loop() {

	}
}
