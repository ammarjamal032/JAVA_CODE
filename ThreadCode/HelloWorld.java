package ThreadCode;

class A extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Thread 1");
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) {

		}
	}

}

public class HelloWorld {
	public static void main(String[] args) throws InterruptedException {
		A t = new A();
		t.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
}
