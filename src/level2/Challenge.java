package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {

		driveDirect(300, 300);
		sleep(5000);
		driveDirect(0, 286);
		sleep(1000);
		driveDirect(400, 400);
		sleep(6000);
		driveDirect(285, 0);
		sleep(1000);
		driveDirect(300, 300);
	}

	public void loop() {

	}
}
