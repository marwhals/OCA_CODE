package pond.swan;

import pond.duck.MotherDuck; // import another package

public class BadCygnet {
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		duck.quack(); // does not compile
		System.out.println(duck.noise); //does not compile
	}
}
