public class Egg {
	public Egg() {
		number = 5;
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}

	public int notValid() {
		int y = 10;
		int x;
		//int reply = x + y;// Does not compile
		return reply;
	}

	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;	
		} else {
			//onlyOneBranch = 3; uncomment me for this code to compile
			answer = 2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch);
	}

	public void eatIfHungry(boolean hungry) {
		if (hungry) {
			int bitesOfCheese = 1;
		} //bites of cheese goes out of scope here
	}
	//System.out.println(bitesOfCheese); //Does not compile

	private int number = 3;
	number = 4;
	//Output is five
}