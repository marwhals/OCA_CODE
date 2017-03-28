
public class OperatorPrecedence {

static String newLine = System.getProperty("line.separator"); //This will retrieve the line separator

/*
This is a list of the operator precedence Highest to lowest
Post-Unary operators - expression++/--
Pre-Unary operators - ++/--expression
Other unary operators - +,-,!
Multiplication/Division/Modulus - *,/,%
Addition/Subtractions
shift operators
Relational operators
Equal to, not equal to
Logical operators
Short-circuit logical operators &&, ||
Ternary operators
Assignment operators
*/

	public static void main(String[] args) {
	//Below are some examples of arithmetic operators

	/*Numeric promotion rules
		If one is an integral type and one is a floating-point type one of the results will automatically be promoted to the floating point type.
		If two value have different data types, Java will automatically promoted the integral type to the floating point type.
		Smaller data types are promoted to an int any time they are used with a binary arithmetica operator even if they are ints.
		After promotion the resulting type is the same data type as the promoted data types.
	*/
	int some_int = 123;
	float some_float = 1242.123f; //floating point literals are assumed to be doubles unless appended with an f
	double some_double = 3214.1421;
	byte byte_one = 123;
	short short_one = 312;

	int zebra = some_int + some_int; 
	float goose = some_float + some_int; 
	double hare = some_double + some_int + some_float;
	int lemur = byte_one + short_one;
	short badger = (short)(byte_one + byte_one);

	//the use of compound operators can save the hassle of casting as well
	int another_int = 3;
	long another_long = 43;

	another_int *= another_long; //This will compile and is now a long

	int x = 10, y = 20, z = 10;

	System.out.println(x < y);
	System.out.println(x <= y);
	System.out.println(x >= z);
	System.out.println(x > z);

	if( x != null & x.getValue() < 5) {
		//Throws exception if x was null
	}

	if( x != null && x.getValue() < 5) {
		//This is an example of the short circuit operator
		//analogs exist for | as well
	}

	}

}