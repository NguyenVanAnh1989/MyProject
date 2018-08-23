package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import test.ChapOne;
import test.ChapTwo;
import test.MethodsDeclare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChapOne chapOne = new ChapOne();
//		chapOne = null;
//		chapOne.declareAndInitializingVariable();
		ChapTwo chapTwo = new ChapTwo(ChapTwo.DayTest.DAYFIVE);
		chapTwo = new ChapTwo(ChapTwo.DayTest.DAYFOUR);
//		System.out.println("" + "data will call");
		ArrayList<Object> list1 = new ArrayList<Object>();
//		ArrayList list2 = new ArrayList(10);
//		ArrayList list3 = new ArrayList(list2);
//		LocalDate localDate = LocalDate.of(1970, 01, 40);
//		LocalTime localtime = LocalTime.now();
		Period period = Period.ofDays(1);
//		LocalDateTime localDateTime = LocalDateTime.of(2018, Month.APRIL, 40);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd'T'hh:mm:ss n");
		MethodsDeclare.ChildMethodDeclare.getDefaultMethodTest();

	}

}
