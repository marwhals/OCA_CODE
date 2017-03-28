package 

public class ControlFlowChptTwo {

	static String newLine = System.getProperty("line.separator"); //This will retrieve the line separator

	public static void main(String[] args) {
		int num = 123;
		boolean x = false;
		System.out.println(x);
		x = !x; 
		System.out.println("The value of " + x + "after negation");
		System.out.println("Watch the float become promoted to a double");
		System.out.println( 5 == 5.00 );//This should return true since the 5.00 will be promoted to a double


		//Zero and one are not considered as boolean values
		if(x == false) {
			//Branch evaluates to true (the condition that is)
		} else if (x == true) {
			//Branch the else if conditions evaluates to true
		} else {
			//Branch else. This code is actually unreachable
		}

		/*An alternative to the boolean is the ternary operator
		  the for is
		  booleanExpression ? expression : expression_2
		*/

		int other_y = 10;
		 
		final int other_x;

		if(other_y > 5) {
		 	other_x = 2 * other_y;
		} else {
		 	other_x = 3 * other_y;
		}
		System.out.println(other_x);

		 //is equivalent to
		int y_two = 10;
		int x_two = (y_two > 5) ? (2 * y_two) : (3 * y_two);
		System.out.println(x_two);

		//it is not neccessary for the expressions in the ternary operator to have the same type
		//int animal = (y < 91) ? 9 : "Horse"; //DOES NOT COMPILE
		System.out.println((y_two < 91) ? 9 : "Horse");
		System.out.println((y_two > 91) ? 9 : "Horse");
		//In a ternary operator both branches may not be evaluated
		/*
			The data types supported by switch statements are 
			int, byte, short, char, int, String and enums and their associated wrapper classes
			WITH THE EXCEPTION OF BOOLEARN AND LONG
			They must be compile time constant values. Final variables must be initialised with a literal value
		*/
		num = 2;
		switch(num) {
		/*
			There is no requirement for the case and default statement to be in any particular order.
			There must be a break statement or the flow of control will fall through.
			They terminate the case and return the control to the outer statement.
		*/
			case 1:
				//branch
				System.out.println("Case one");
				break;
			case 2:
				//branch
				System.out.println("Case two");//Break statment missing
			case 3:
				//branch
				System.out.println("Case three");//Break statment missing
				break;
			default:
				System.out.println("Default case");
				break;
		}

		//loops etc
		int an_integer = 0;
		while(an_integer > 10) {
			x++;
			continue; //This returns control to the evaluating condition
		}

	}

	//int roomInBelly = 5;
	
	//eatCheese(4);

	//public void eatCheese(int bitesOfCheese) {
	//	while (bitesOfCheese > 0 && roomInBelly > 0) {
	//		bitesOfCheese--;
	//	roomInBelly--;
	//	}
	//	System.out.println(bitesOfCheese+" some number");
	//}

}