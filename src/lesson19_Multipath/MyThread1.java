package lesson19_Multipath;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 100; i <120 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
