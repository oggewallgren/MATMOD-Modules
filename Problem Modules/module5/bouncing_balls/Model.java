package bouncing_balls;

/**
 * The physics model.
 * 
 * This class is where you should implement your bouncing balls model.
 * 
 * The code has intentionally been kept as simple as possible, but if you wish, you can improve the design.
 * 
 * @author Simon Robillard
 *
 */
class Model {

	double areaWidth, areaHeight;
	
	Ball [] balls;

	Model(double width, double height) {
		areaWidth = width;
		areaHeight = height;
		
		// Initialize the model with a few balls
		balls = new Ball[2];
		balls[0] = new Ball(width / 3, height * 0.9, 1.2, 1.6, 0.2, 0.5);
		balls[1] = new Ball(2 * width / 3, height * 0.7, -0.6, 0.6, 0.3, 0.5);
	}

	void step(double deltaT) {
		// TODO this method implements one step of simulation with a step deltaT
		for (int i = 0; i < balls.length - 1; i++) {
			for (int j = i + 1; j < balls.length; j++) {
				
				Ball b1 = balls[i];
				Ball b2 = balls[j];

				double dx = b1.x - b2.x;
				double dy = b1.y - b2.y;
				double delta = b1.radius + b2.radius;

				if (dx*dx+dy*dy < delta*delta) {
					b1.vy *= -1;
					b1.vx *= -1;
					b2.vy *= -1;
					b2.vx *= -1;
				}
			}
		}
		
		
		
		
		
		for (Ball b : balls) {
			// detect collision with the border
			if (b.x < b.radius || b.x > areaWidth - b.radius) {
				b.vx *= -1; // change direction of ball
			}
			if (b.y < b.radius || b.y > areaHeight - b.radius) {
				b.vy *= -1;
			}
			
			// compute new position according to the speed of the ball
			b.x += deltaT * b.vx ;
			b.y += deltaT * b.vy;
		}
	}
	
	/**
	 * Simple inner class describing balls.
	 */
	class Ball {

		/**
		 * Position, speed, and radius of the ball. You may wish to add other attributes.
		 */
		double x, y, vx, vy, radius, weight;
		//, angle;

		Ball(double x, double y, double vx, double vy, double r, double weight) {
			this.x = x;
			this.y = y;
			this.vx = vx;
			this.vy = vy;
			this.radius = r;
			this.weight = radius * 2;
		}

		void rotateBall(double angle){
			//TODO
		}

		void rectToPolar() {

		}

		void polarToRect() {

		}

		
		
	}
}
