package test;

import static test.StaticMethod.getStaticMethods;
import static test.StaticMethod.callMethodStatic;

public class MethodsDeclare extends FatherClass{
	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four;
	static {
		two = 1;
		four = 2;
	}
	
	public MethodsDeclare() {
		getStaticMethods();
		callMethodStatic();
	}
	
	//Access modified (not require)
	 	   //Optional Specifiers (not require)
	 			  //Return type (require)
					   //Method name (require)
							 		// Parameter list (require but can empty parentheses)
	public static void methodDeclare() {

	}
	
	void defaultMethod() {
		System.out.println("Call success");
		
	}
	
}

//class ChildMethodDeclare extends MethodsDeclare{
//	public static void getDefaultMethodTest() {
//		new MethodsDeclare().defaultMethod();
//	}
//}
