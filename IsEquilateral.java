class IsEquilateral {

	public static void main(String[] args) {

		/* CASE: Incorrect amount of inputs supplied. */
		if(args.length != 3) {
			System.out.println("Please specify all three sidelengths of the triangle you wish to verify, order does not matter.");
			System.exit(1);
		}

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		if(checkEquilateral(a, b, c) == true) {
			System.out.println("The values you supplied construct an equilateral triangle.");
		} else {
			System.out.println("The values you supplied do not construct an equilateral triangle.");
		}

	}

	public static boolean checkEquilateral(double a, double b, double c) {

		double sideA = a;
		double sideB = b;
		double sideC = c;

		if(sideA == sideB && sideB == sideC && sideA != 0) {
			return true;
		}

		return false;
	}

}