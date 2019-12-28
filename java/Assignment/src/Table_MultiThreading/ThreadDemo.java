package Table_MultiThreading;

public class ThreadDemo {
public static void main(String[] args) {
	Table5 t = new Table5();
	Table10 t1 = new Table10();
	t.start();
	t1.start();
}
}
