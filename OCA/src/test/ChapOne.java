package test;

public class ChapOne {
	boolean boolType;
	byte byteType;
	short shortType;
	int intType;
	long longType;
	float floatValue;
	double doubleType;
	char charType;

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
	}

}
