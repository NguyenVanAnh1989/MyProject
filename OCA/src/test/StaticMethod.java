package test;

public class StaticMethod {
	
	static void getStaticMethods() {
		System.out.println("my name is static method");
		StringBuilder strBuider = new StringBuilder("Nguyen Van");
//		passByValue(strBuider);
		System.out.println(strBuider.toString());
	}
	
	static void callMethodStatic() {
		passByPrimitive(10);
		passByPrimitive(20L);
		varArgs(new String[] {"2","3"});
		varArgs("5","4","3","2","1");
		varArgs(new Integer[] {1,2,3,4});
	}
	
	static void getNewStaticMethods() {
		System.out.println("my name is new static method");
	}
	
	static void passByValue (StringBuilder str) {
		str.append("Anh");
	}
	
	static void passByValue(String str) {
		
	}
	
	static void passByPrimitive(int number) {
		System.out.println("Integer " + number);
	}
	
	static void passByPrimitive(int number, int integer) {
		System.out.println("Integer " + number);
	}
	
	static void passByPrimitive(long number) {	
		System.out.println("Long " + number);
	}

	static void varArgs (String... strings) {
		System.out.println("call me " + strings[0]);
	}
	
	static void varArgs (Integer[] integer) {
		System.out.println("call me " + integer[0]);
	}
}
