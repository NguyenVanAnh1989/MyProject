package test;

public class MethodsDeclare {

	
	public MethodsDeclare() {
		
	}
	//Access modified (not require)
	 	   //Optional Specifiers (not require)
	 			  //Return type (require)
					   //Method name (require)
							 		// Parameter list (require but can empty parentheses)
	public static void methodDeclare() {
		
	}
	
	private void defaultMethod() {
		System.out.println("Call success");
	}
	
	public static class ChildMethodDeclare {
		public static void getDefaultMethodTest() {
			new MethodsDeclare().defaultMethod();
		}
		
	}
	
}
