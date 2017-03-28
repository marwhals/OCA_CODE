

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

		/*
			The data types supported by switch statements are 
			int, byte, short, char, int, String and enums and their associated wrapper classes
			WITH THE EXCEPTION OF BOOLEARN AND LONG
		*/

		switch(num) {
		/*
			There is no requirement for the case and default statement to be in any particular order.
			There must be a break statement or the flow of control will fall through.

		*/
			case 1:
				//branch
				System.out.println("Case one");
				break;
			case 2:
				//branch
				System.out.println("Case two");
				break;
			case 3:
				//branch
				break;
			default:
				System.out.println("Default case");
				break;
		}


	}

}