public class Mouse {
	static int MAX_LENGTH = 5;//CLASS VARIABLE AVAILABLE UNTIL END OF PROGRAM
	int length; //INSTANCE VARIABLE TIED TO THE INSTANCE OF THE OBJECT

	public void grow(int inches) {//INCHES IS A LOCAL VARIABLE AND WILL GO AT THE END OF THE BLOCK
		if (length < MAX_LENGTH) {
			int newSize = length + inches;
			length = newSize;
		}
	}
}