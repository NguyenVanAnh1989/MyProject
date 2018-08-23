package test;

public class ChapTwo {

	DayTest enumTest;
	
	protected void finalize() {
		System.out.println("call me");
	}

	// Some operator
	public ChapTwo(DayTest enumTest) {
		this.enumTest = enumTest;
	}

	public void declareSomeOperator() {
		int addition = 0 + 0;
		int subtraction = 0 - 0;
		int multiplication = 0 * 0;
		int division = 0 / 1;
		int modulus = 0 % 1;
		int unary = 0;
		int orderOperator = (10 + 10 - 10) * 10 / 10 % --unary + unary++;
		// System.out.println(orderOperator);
		// System.out.println(10 % );
		long logType = 3000000000l;
		float ftype = 232131244;
		// System.out.printf("%f",logType + ftype); // this will auto convert to float
		// -> convert double
		int positive = +10;
		int negative = -10;
		int cast = (int) 100L;
		long m = 100;
		int n = 100;
		n += 100; // use this way for convert numeric operator
		boolean logicBitWishAnd = true & false; // & => (true & true => true)(true & false => false)(false & true =>
												// false)(false & false => false) // same &&
		boolean logicBitWishOr = true | false; // & => (true & true => true)(true & false => false)(false & true =>
												// false)(false & false => false) // same ||
		boolean logicBitWishXor = true ^ false; // & => (true & true => false)(true & false => true)(false & true =>
												// true)(false & false => true
	}

	public void statementCheck(boolean check) {
		if (check) {

		} else if (check) {

		} else {

		}
	}

	public void optionLabelLoop() {
		OUTSIDE_LABEL: for (int i = 0; i < 10; i++) {
			INSIDE_LABEL: for (int j = 0; j < 10; j++) {
				System.out.println(j * i);
				if (j == 5) {
					continue OUTSIDE_LABEL;
				}
				if (i == 8 && j == 8) {
					continue INSIDE_LABEL;
				}
			}
		}
		System.out.println("Nguyen Van Anh");
	}

	public static enum DayTest {
		DAYONE, DAYTWO, DAYTHREE, DAYFOUR, DAYFIVE, DAYSIX, DAYSEVEN
	}

}
