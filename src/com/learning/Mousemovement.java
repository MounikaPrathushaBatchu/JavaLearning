package com.learning;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class Mousemovement {

	public static void main(String[] args) {
		try {
			Robot robot = new Robot();
			Timer timer = new Timer();

			TimerTask moveMouseTask = new TimerTask() {
				boolean toggle = true;

				@Override
				public void run() {
					try {
						Point location = MouseInfo.getPointerInfo().getLocation();
						int x = location.x;
						int y = location.y;

						if (toggle) {
							robot.mouseMove(x + 3, y);
						} else {
							robot.mouseMove(x - 3, y);
						}
						toggle = !toggle;

						System.out.println("hello - Mouse moved at: " + LocalTime.now());

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};

			timer.scheduleAtFixedRate(moveMouseTask, 0, 5000);

			Timer stopTimer = new Timer();
			stopTimer.schedule(new TimerTask() {
				@Override
				public void run() {
					timer.cancel();
					System.out.println("Stopped after 20 minutes at: " + LocalTime.now());
					System.exit(0);
				}
			}, 20 * 60 * 1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
