package lesson19_Multipath;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 900; i < 1000; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
