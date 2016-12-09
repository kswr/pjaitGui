package zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A extends Thread{
	private int interval = 200;
	private File productFile = new File("Towary.txt");
	private Container container;

	A (Container container) {
		this.container = container;
	}
	
	public void run() {
		try {
			int counter = 0; 
			Scanner productScanner = new Scanner(productFile);

			while (productScanner.hasNextLine()) {
				String line = productScanner.nextLine();
				if (counter%interval == 0) {
					System.out.println("Utworzono "+counter+" obiektów");
				}
				synchronized (this.container) {
					this.container.addRecord(line);
				}
				counter++;
			}
			synchronized (this.container) {
				this.container.setEnd();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
