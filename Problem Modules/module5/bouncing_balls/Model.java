package bouncing_balls;

/**
 * The physics model.
 * 
 * This class is where you should implement your bouncing balls model.
 * 
 * The code has intentionally been kept as simple as possible, but if you wish,
 * you can improve the design.
 * 
 * @author Simon Robillard
 *
 */
class Model {
	final double gravity = 9.8;

	double areaWidth, areaHeight;

	Ball[] balls;

	Model(double width, double height) {
		areaWidth = width;
		areaHeight = height;

		// Initialize the model with a few balls
		balls = new Ball[2];
		balls[0] = new Ball(width / 3, height * 0.9, 1.2, 1.2, 0.2);
		balls[1] = new Ball(3 * width / 4, height * 0.4, -0.6, 0.6, 0.3);
	}

	void step(double deltaT) {
		ballCollision();
		borderCollision(deltaT);
		
		
	}

	/**
	 * Handles collision between balls
	 */
	void ballCollision() {
		for (int i = 0; i < balls.length - 1; i++) {
			for (int j = i + 1; j < balls.length; j++) {

				Ball b1 = balls[i];
				Ball b2 = balls[j];

				double dx = b1.x - b2.x;
				double dy = b1.y - b2.y;
				double sumRadius = b1.radius + b2.radius;

				if (dx * dx + dy * dy <= sumRadius * sumRadius) {
					double angleDiff = Math.atan(dy / dx);

					b1.rotateBall(-angleDiff);
					b2.rotateBall(-angleDiff);

					double I = b1.mass * b1.vx + b2.mass * b2.vx;
					double R = -(b2.vx - b1.vx);

					b1.vx = (I - b2.mass * R) / (b1.mass + b2.mass);
					b2.vx = (R + b1.vx);

					b1.rotateBall(angleDiff);
					b2.rotateBall(angleDiff);
				}
			}
		}
	}

	/**
	 * handles collision between ball and border. Here we also handle gravity.
	 */
	void borderCollision(double deltaT) {
		for (Ball b : balls) {
			// detect collision with the border
			if (b.x < b.radius || b.x > areaWidth - b.radius) {
				b.vx *= -1;
			}

			if (b.y < b.radius) {
				// checks direction of ball when hitting a border
				if (b.vy < 0) {
					b.vy = -b.vy;
				} else {
					b.vy = b.vy;
				}
			} else if (b.y > areaHeight - b.radius) {
				// checks direction of ball when hitting a border
				if (b.vy < 0) {
					b.vy = b.vy;
				} else {
					b.vy = -b.vy;
				}
			}

			b.x += deltaT * b.vx;
			b.y += deltaT * (b.vy + (b.vy - gravity * deltaT)) / 2; // uses the avarage speed before and after gravity
																	// to avoid getting stuck to the wall
			b.vy = b.vy - gravity * deltaT;
		}
	}

	/**
	 * Simple inner class describing balls.
	 */
	class Ball {

		/**
		 * Position, speed, and radius of the ball. You may wish to add other
		 * attributes.
		 */
		double x, y, vx, vy, radius, mass, speed, angle;

		Ball(double x, double y, double vx, double vy, double r) {
			this.x = x;
			this.y = y;
			this.vx = vx;
			this.vy = vy;
			this.radius = r;
			// we wanted a way to relate size to mass.
			this.mass = this.radius * 2;
		}

		// changes direction of the balls based on relative angle upon impact.
		void rotateBall(double angleDiff) {
			rectToPolar();
			angle += angleDiff;
			polarToRect();
		}

		// converts from rectangular to polar coordinates
		void rectToPolar() {
			speed = Math.sqrt(vx * vx + vy * vy);
			angle = Math.atan(vy / vx);
			if (vx < 0) {
				angle += Math.PI;
			}
		}

		// converts from polar to rectangular coordinates
		void polarToRect() {
			vx = Math.cos(angle) * speed;
			vy = Math.sin(angle) * speed;

		}

	}
}
