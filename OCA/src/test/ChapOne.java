package test;

public class ChapOne {
	String referencesType;
	boolean boolType;
	byte byteType;
	short shortType;
	int intType;
	long longType;
	float floatValue;
	double doubleType;
	char charType;
	int checkUnderScore;
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
		checkUnderScore= 2_3_4_5_6; // You can put underscore any where except begin,end, left-right decimaPoint
	}
	
	public void referenceTypes() {
		Object firstObject = new Object();
		Object asignToOtherObject = firstObject; //first way value assigned to reference other
		Object usingNewKeyWord = new Object(); // second way value assign by new Object
	}

	public void differencesBeetwenPrimitivesReference() {
		referencesType = null; // reference can assign to null
		// intType = null;  cannot assign primitives to null
		referencesType.length(); //
		// intType.length(); primitive don't have call method
		// remember that all primitive start with lowercase
	}
	
	public void declareAndInitializingVariable() {
		
		
	}
	
}
