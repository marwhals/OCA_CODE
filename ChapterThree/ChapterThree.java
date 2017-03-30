public class ChapterThree {

static String newLine = System.getProperty("line.separator"); //This will retrieve the line separator

	public static void main(String[] args) {
	
	//both create a new string below
	String name = "barry";
	//String name = new String("barry");
	
	int x = 23;
	String name2 = "stu";

	String concat = x + name2; //x gets cast to a string
	/* RULES FOR CONCATENATION
	If both operands are numeric, + means numeric addition
	If either operand is a String, + means concatenation
	The expression is evaluated left to right
	*/

	String string = "   cab bage   ";
	System.out.println(string.length()); // 7
	System.out.println(string.charAt(3)); //
	System.out.println(string.indexOf("z")); //
	System.out.println(string.substring(3,5));
	System.out.println(string.trim());

	System.out.println(string.substring(3));

	StringBuilder alpha = new StringBuilder();
	for(char current = 'a'; current <= 'z'; current++)
		alpha.append(current);
	System.out.println(alpha);

	//Creating string builders
	StringBuilder sb1 = new StringBuilder();
	StringBuilder sb2 = new StringBuilder("animal");
	StringBuilder sb3 = new StringBuilder(10);

	System.out.println(sb2.substring(1,4)); //this returns a string not string builder
	System.out.println(sb3.append("asd"));
	System.out.println(sb3);
	System.out.println("asd" + 1);

	//int[] numbers1 = new int[3];
	//int[] numbers2 = new int[3] {32, 55, 12};

	}

}