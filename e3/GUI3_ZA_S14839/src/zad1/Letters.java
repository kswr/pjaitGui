package zad1;

import java.util.LinkedList;

public class Letters {
	private LinkedList<LetterThread> threads = new LinkedList();

	Letters (String string) {
		for (int i = 0; i<string.length(); i++) {
			String name = string.charAt(i) + "";
			LetterThread thread = new LetterThread(name);
			this.threads.add(thread);
		}
	}
	
	public LinkedList<LetterThread> getThreads() {
		return this.threads;
	}
	
	public void startAllThreads() {
		for (Thread t : this.threads) {
			t.start();
		}
	}
	
	
	public void stopAllThreads() {
    	for (LetterThread t: this.threads) {
		    try {
	    		t.interrupt();
	    		t.join();
		     } catch( Exception e) {
		        System.out.println("Cannot interrupt and join");
		     }
    	 }
	}
}
