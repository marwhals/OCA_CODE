/*
 * This is the code snippet for "ImportExample"
*/
import java.lang.System;//This is a redundant import
import java.lang.*;//This is a redundant import as well
import java.util.Random; // import tells us where to find Random
import java.util.* //This will import Random amongst other things it is also a redundant import

public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random(); 
		System.out.println(r.nextInt(10)); // print a number between 0 and 9
	}
}
