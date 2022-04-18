package earth.gravity;

class GravityCalculator {
	public static void main(String[] arguments) {
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;// formaula
																													// calculation
		System.out.println("The object's position after " + fallingTime + " seconds is" + String.format("%.2f", finalPosition) + " m.");

	}
}
//output of unmodified program:The objects position after10.0Second is0.0m.
