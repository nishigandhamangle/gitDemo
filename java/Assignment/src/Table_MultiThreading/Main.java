package Table_MultiThreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final Thread mulof2 = new Thread(){
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    int n = 2;
                    int result = n * i;
                    System.out.print(result + " ");
                }
            }
        };
        Thread mulof3 = new Thread(){
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    int n = 3;
                    int result = n * i;
                    System.out.print(result + " ");
                }
            }
        };
        mulof2.start();
        mulof3.start();

    }

}
