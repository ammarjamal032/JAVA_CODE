package AccessModifier;

public class Main {
	private void  m1() {
		System.out.println("Private method called");
	}
	protected void m1(int a) {
		System.out.println("Protected method called");
	}
	public void m2() {
		System.out.println("Public Method called.");
	}
	void m3() {//default
		System.out.println("Default method called");
	}
public static void main(String[] args) {
		
		Main m= new Main();
		m.m1();
		m.m1(0);
		m.m2();
		m.m3();
	}
}
