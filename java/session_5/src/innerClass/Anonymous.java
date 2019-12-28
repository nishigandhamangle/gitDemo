package innerClass;

import javax.swing.JFrame;

public class Anonymous extends JFrame {

public static void main(String[] args) {
	printable p=new printable() {
	
	public void get()
	{
		System.out.println("anonymous Inner class");
	}
};
p.get();
System.out.println(p.getClass());
}
}
