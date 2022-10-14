package AccessModifierSub;
import AccessModifier.Main;

public class MainFile extends Main {
public static void main(String[] args) {
		
		Main m= new Main();//main Class
		MainFile mn = new MainFile();//Subclass
		//m.m1();
		mn.m1(0);
		m.m2();
		//m.m3();
	}
}
