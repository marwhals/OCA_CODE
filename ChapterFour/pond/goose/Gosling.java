package pond.goose;

import pond.shore.Bird;

public class Gosling extends Bird { //extends means create a subclass
	public void swim() {
		floatInWater(); //calling a protected member
		System.out.println(text); //calling protected member
	}
}
