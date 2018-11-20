/*
This is the simplest class you can have below
*/

/*public class Animal {
	String name;
}*/

//Although java doesn't require a class to be public.

public class Animal {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}
}

class Animal2 {
	pirvate String; //It is okay to do this with as well
}