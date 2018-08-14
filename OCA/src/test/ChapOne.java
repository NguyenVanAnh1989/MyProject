package test;

public class ChapOne {
	String referencesType; // default null 
	boolean boolType; // default false
	byte byteType; // default 0
	short shortType; // default 0
	int intType; // default 0
	long longType; // default 0
	float floatValue; // default 0.0
	double doubleType; // default 0.0
	char charType; // default '\u0000' NULL
	int checkUnderScore;

	protected void finalize() {
		System.out.println("eligble");
	}
	
	public void defaultInitializationOfVariable() {
		// local variable must be initialized before use
		int localIntType;
		// int total = localIntType + 10; // localIntType need declare
		
	}
	
	public void identifiersNames() {
		// three rules remember
		// name must begin with a letter or symbol $ or _.
		// subsequent characters may also be numbers
		// cannot use name same java reserved word
	}
	
	public void primitivesDeclare() {
		// java have 8 primitives type
		boolType = true; // false
		byteType = 127; // auto convert to int
		shortType = 32000; // auto convert to int
		intType = 1000000000;
		longType = 3200000000L; // auto convert to int if have not L,l after number
		floatValue = 32000.234f; // floating point need declare f,F after number declare
		doubleType = 10000.1234; // double value
		charType = 'a'; // character type
		checkUnderScore = 2_3_4_5_6; // You can put underscore any where except begin,end, left-right decimaPoint
	}

	public void referenceTypes() {
		Object firstObject = new Object();
		Object asignToOtherObject = firstObject; // first way value assigned to reference other
		Object usingNewKeyWord = new Object(); // second way value assign by new Object
	}

	public void differencesBeetwenPrimitivesReference() {
		referencesType = null; // reference can assign to null
		// intType = null; cannot assign primitives to null
		referencesType.length(); //
		// intType.length(); primitive don't have call method
		// remember that all primitive start with lowercase
	}

	public void declareAndInitializingVariable() {
		String nameVariable = "my name is variable"; // this call is declare and initialize variable one variable
		// ... this call declare and initialize multiple variable
		String nameVariableOne = "One", nameVariableTwo = "Two", nameVariableThree, nameVarialeFour; 
		boolean b1, b2; 
		String s1 = "1", s2;
//		double d1, double d2; //declare not legal
		int i1; int i2; 
		int i3; 
//		i4; // DOES NOT CCOMPLIER
	}
	
	

}
