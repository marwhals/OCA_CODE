public class Stringing {
   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
      System.out.println("Hello, World");
      System.out.println(1+2);
      
      String cake = "Fluffy";
      String cake2 = new String("Fluffy");//This is different reference to the above one

	  System.out.println("a" + "b");
      System.out.println("a" + "b" + 3);
      System.out.println(1 + 2 + "c");

      String string = "animals";
      System.out.println(string.length()); // 7
      System.out.println(string.charAt(0)); //a
      System.out.println(string.charAt(6)); //s
      System.out.println(string.charAt(7)); // throws an exception
      System.out.println(string.indexOf('a')); // 0
      System.out.println(string.indexOf("al")); // 4
      System.out.println(string.indexOf('a', 4)); // 4
      System.out.println(string.indexOf("al", 5)); // -1


   }
}