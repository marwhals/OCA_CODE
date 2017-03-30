import java.util.Random; //Import tells us where to find Random package. Without this line; when random is used it will not compile.
import java.util.*;      //Imports all classes in java.util. * is wildcard that matches all classes in a package. There is also static imports.
import java.util.Date;   //Date and SQL are redundant since the whole of "util" is imported.
// This library does not exist on my machine "import java.util.sql.*;""	 //Explicit class names take precedence over any wildcards.

/* IMPORTS WHICH FAIL
import java.util.*;
import java.sql.*; // DOES NOT COMPILE
--The above will result in "The type Data is ambiguous" since "Date" is in both.

import java.util.Date;
import java.sql.Date;
--The import java.sql.Date collides with another import statement

To get around this use the fully qualified class name.
i.e java.util.sql.Date

*/

/*
REDUNDANCY with class imports. 
java.lang is automatically imported

Java automatically looks for classes in the same PACKAGE SO NO NEED FOR IMPORTS IN THIS CASE

*/

//comment until end of the line
/*
This is
a multi line comment
woop
*/

/** Javadoc multi line comment
this will be picked up by the javadoc tool
**/

/* public classes must match the file name
i.e a public class in this source file must be named chapter_one.java
*/

public class Basics {
/*Rules on identifiers
	Name begin with [A-Za-z] or $ _
	Subsequent chars can be numbers
	No reserved words eg: public, String etc.
*/
static String newLine = System.getProperty("line.separator"); //This will retrieve the line separator
//The above is an example of a class variable

	public static void main(String[] args) {
		/*
			Java classes begins execution with this main method.
			It just declares an entry point in the code.
			"public" is an access modifier.
			"static" binds a method to its class name so it can just be called by its class name i.e "chapter_one".
			java does not need to instantiate an object of this class in1 order to call its main method.
			if a main method is not present in the class the process will throw an error and terminate
			even if it is present the process will throw an error an terminate
			"void" is the return type and signals what data type is to be returned (if any)
		*/

		//The variables below have the default access modifier. They are all local variables
		boolean meh = true, nah = false;
		//int num, String value; //This line does not compile because they are different types they must share the same type.
		byte bite = 123; //8 bit integer value
		short shorts = 123; //16 bit integer value
		int integers = 1234; //32 bit integer value
		long longs = 3124; //64 bit integer value 
		float floats = 423.43f; //32 bit floating point value
		double doubles = 1241.321; // 64 bit floating value
		char character = 'a';



		System.out.print("This is the first print statement for chapter one of my source files for the OCA exam" + newLine);
		System.out.print(args[0] + newLine); //If you want spaces in an argument place it in quotes

		//Here we will declare a object named 'r' of Random type
		Random r = new Random();//HERE WE ARE CALLING THE CONSTRUCTOR OF RANDOM
		//Notice how the name of the construnctor matches the name of the class and that there is NO return type; note even void
		//Its purpose is to initialise fields
		//An alternative way is to is to do so directly on the lines which they are declared
		
		System.out.println(r.nextInt(10) + newLine); // Print a random number between 0 to 9. Java begins counting at 0

	}

}