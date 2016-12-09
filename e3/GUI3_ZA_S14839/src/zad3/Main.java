/**
 *
 *  @author Zniszczyński Adrian S14839
 *
 */

package zad3;

public class Main {
	private static void zadanie1() {
		Container container = new Container();
		A reader = new A(container);
		B writer = new B(container);
		
		reader.start();
		writer.start();
		
	      try {
	          reader.join();
	          writer.join();
	
	       } catch( Exception e) {
	          System.out.println("Interrupted");
	       }
		
	}
	public static void main(String[] args) {
		zadanie1();
	}
}
