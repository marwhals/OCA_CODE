public class Lion extends Animal {
	private void roar() {
		//System.out.println("some text" + age)//NO COMPILE
		System.out.println("some text" + getAge());//COMPILES
	}
}