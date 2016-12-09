package zad3;

import java.util.LinkedList;
import java.util.ListIterator;

public class B extends Thread{
	private int interval = 100;
	private Container container;
	private int sum = 0;
	private int counter = 0;

	B (Container container) {
		this.container = container;
	}

	public void run() {
		boolean isEnd = false;
		String line, weightString;
		int weight;

		while (!isEnd) {
			synchronized (this.container) {
				isEnd = this.container.isEnd();

				if (isEnd || this.container.isEmpty()) continue;

				line = this.container.getRecord();
			}
				
			weightString = line.split("\\s+")[1];
			weight = Integer.parseInt(weightString);
	
			this.sum += weight;
			
			if (counter == this.interval) {
				System.out.println(this.sum);
				counter = 0;
			} else {
				counter++;
			}
		}
	}
}
