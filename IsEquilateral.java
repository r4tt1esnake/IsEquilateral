class IsEquilateral {

	public static void main(String[] args) {

		double a, b, c;

		/* CASE: Incorrect amount of inputs supplied. */
		if(args.length != 3) {
			throw new IllegalArgumentException("Please specify all three sidelengths of the triangle you wish to verify, order does not matter.");
		}

		try {
			a = Double.parseDouble(args[0]);
		} catch(NumberFormatException e) {
			throw new IllegalArgumentException("You have supplied a value that is not a number at element 0.");
		}

		try {
			b = Double.parseDouble(args[1]);
		} catch(NumberFormatException e) {
			throw new IllegalArgumentException("You have supplied a value that is not a number at element 1.");
		}

		try {
			c = Double.parseDouble(args[2]);
		} catch(NumberFormatException e) {
			throw new IllegalArgumentException("You have supplied a value that is not a number at element 2.");
		}

		if(a < 0 || b < 0 || c < 0) {
			throw new IllegalArgumentException("The values you have supplied do not construct a triangle according to Euclidean geometry.");
		}

		if(checkEquilateral(a, b, c)) {
			System.out.println("The values you supplied construct an equilateral triangle.");
		} else {

			if(!(a + b > c) || !(a + c > b) || !(c + b > a)) {
				throw new IllegalArgumentException("The values you have supplied do not construct a triangle.");
			}

			System.out.println("The values you supplied do not construct an equilateral triangle.");

		}

	}

	public static boolean checkEquilateral(double a, double b, double c) {

		double sideA = a;
		double sideB = b;
		double sideC = c;

		if((sideA == sideB) && (sideB == sideC) && (sideA != 0)) {
			return true;
		}

		return false;
	}

}