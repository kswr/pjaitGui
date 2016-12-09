package zad1;

public class LetterThread extends Thread{
	private String name;

	public LetterThread(String name) {
		this.name = name;
		this.setName("Thread " + name);
	}
	
	public void run() {		
		while (this.isAlive()) {
			System.out.print(this.name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
