package ThreadCode;

class newThread implements Runnable{
	String name;
	Thread thread;
	newThread(String name){
		this.name=name;
		thread = new Thread(this,name);
		System.out.println( "A New thread: " + thread+ "is created\n" ); 
		thread.start();
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(name+ " : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException  e) {
			  System.out.println(name + " thread Interrupted");  
		}
		System.out.println(name + " thread exiting.");  
		
	}
}
public class Main {
	public static void main(String[] args) {
		new newThread("1st");  
        new newThread("2nd");  
        new newThread("3rd");  
        try {  
            Thread.sleep(8000);  
        } catch (InterruptedException excetion) {  
            System.out.println("Inturruption occurs in Main Thread");  
        }  
        System.out.println("We are exiting from Main Thread");  
	}
}
