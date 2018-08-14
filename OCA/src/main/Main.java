package main;

import test.ChapOne;
import test.ChapTwo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChapOne chapOne = new ChapOne();
//		chapOne = null;
//		chapOne.declareAndInitializingVariable();
		ChapTwo chapTwo = new ChapTwo(ChapTwo.DayTest.DAYFIVE);
		chapTwo.declareSomeOperator();
//		System.out.println("" + "data will call");
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
		case 0:
			System.out.println("Sunday");
		case 6:
			System.out.println("Saturday");
		case 8:
			System.out.println("Saturday 1");
		case 9:
			System.out.println("Saturday 2");
		case 10:
			System.out.println("Saturday 3");
		case 11:
			System.out.println("Saturday 4");
		case 5:
			System.out.println("Saturday 5");
			
		}

	}

}
