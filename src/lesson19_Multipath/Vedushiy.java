package lesson19_Multipath;

public class Vedushiy {
    public static void main(String[] args) {
        System.out.println("Nachinaen koncert! " + Thread.currentThread().getName());

        Slavik slavik = new Slavik();
        Gazmanov gazmanov = new Gazmanov();
        gazmanov.setDaemon(true);


        slavik.start();
        gazmanov.start();

        while (slavik.isAlive()){ // ожидает завершения работы потоков

        }

        System.out.println("Koncert Okonchen");
    }
}
