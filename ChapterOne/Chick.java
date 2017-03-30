public class Chick {
	private String name = "Fluffy";//
	{ System.out.println("setting field");}

	public Chick() {
		name = "tiny";
		System.out.println("constucotor has been called");
	}

	public static void main(String[] args) {
		Chick chick = new Chick();
		System.out.println(chick.name);
	}
	//The following is not a constructor public void Chick() {}

	/* setting field
	   setting constructor
	   Tiny
	   These are the orders of the print out. Fields and instance initiatlisation and then the constructor
	*/

}