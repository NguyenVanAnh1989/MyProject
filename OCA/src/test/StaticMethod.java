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
	
	static void passByPrimitive(long number) {	
		System.out.println("Long " + number);
	}
	
}
