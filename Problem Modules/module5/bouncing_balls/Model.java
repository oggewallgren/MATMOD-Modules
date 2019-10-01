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
		balls[1] = new Ball(2 * width / 4, height * 0.4, -0.6, 0.6, 0.3);
	}

	void step(double deltaT) {
		ballCollision();
		borderCollision(deltaT);
	}

	void ballCollision() {
		for (int i = 0; i < balls.length - 1; i++) {
			for (int j = i + 1; j < balls.length; j++) {

				Ball b1 = balls[i];
				Ball b2 = balls[j];

				double dx = b1.x - b2.x;
				double dy = b1.y - b2.y;
				double delta = b1.radius + b2.radius;

				if (dx * dx + dy * dy < delta * delta) {
					double rotAngle = Math.atan(dy / dx);
					double I = b1.weight * b1.vx + b2.weight * b2.vx;
					double R = b2.vx - b1.vx;

					b1.rotateBall(-rotAngle);
					b2.rotateBall(-rotAngle);

					b2.vx = ((I - b2.weight * R) / (b1.weight + b2.weight));
					b1.vx = R + b1.vx;

					b1.rotateBall(rotAngle);
					b2.rotateBall(rotAngle);

				}
			}
		}
	}

	void borderCollision(double deltaT) {
		for (Ball b : balls) {
			// detect collision with the border
			if (b.x < b.radius || b.x > areaWidth - b.radius) {
				b.vx *= -1; // change direction of ball
			}

			if (b.y < b.radius) {
				if (b.vy < 0) {
					b.vy = -b.vy;
				} else {
					b.vy = b.vy;
				}
			} else if (b.y > areaHeight - b.radius) {
				if (b.vy < 0) {
					b.vy = b.vy;
				} else {
					b.vy = -b.vy;
				}
			} else {
				b.vy = b.vy - 5.8 * deltaT;
			}

			// compute new position according to the speed of the ball
			b.x += deltaT * b.vx;
			b.y += deltaT * b.vy;
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
		double x, y, vx, vy, radius, weight, speed, angle;
		// , angle;

		Ball(double x, double y, double vx, double vy, double r) {
			this.x = x;
			this.y = y;
			this.vx = vx;
			this.vy = vy;
			this.radius = r;
			this.weight = this.radius * 2;
		}

		void rotateBall(double rangle) {
			rectToPolar();
			angle += rangle;
			polarToRect();
		}

		void rectToPolar() {
			speed = Math.sqrt(vx * vx + vy * vy);
			angle = Math.atan(vy / vx);
			if (vx < 0) {
				angle += Math.PI;
			}
		}

		void polarToRect() {
			vx = Math.cos(angle) * speed;
			vy = Math.sin(angle) * speed;

		}

	}
}
