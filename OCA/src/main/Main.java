package main;

import test.ChapOne;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChapOne chapOne = new ChapOne();
		chapOne = null;
//		System.gc();
		ChapOne chapTwo = new ChapOne();
		chapTwo = null;
//		System.gc();
		ChapOne chapThree = new ChapOne();
		chapThree = null;
//		System.gc();
		ChapOne chapFour = new ChapOne();
		chapFour = null;
		System.gc();
//		chapone.declareAndInitializingVariable();
		System.out.println("" + "data will call");

	}

}
