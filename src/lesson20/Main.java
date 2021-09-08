package lesson20;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        FindFileTaskImpl task1 = new FindFileTaskImpl();
        try {
            task1.setDirectory("/home/ruslan/Desktop/JavaTest");

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        task1.setFileNameSearchString("test");
        task1.setPrintStream(System.out);

        FindFileTaskImpl task2 = new FindFileTaskImpl();
        try {
            task2.setDirectory("/home/ruslan/Desktop/JavaTest");

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        task2.setFileNameSearchString(".txt");
        task2.setPrintStream(System.out);


        FindFileTaskImpl task3 = new FindFileTaskImpl();
        try {
            task3.setDirectory("/home/ruslan/Desktop/JavaTest");

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        task3.setFileNameSearchString(".png");
        task3.setPrintStream(System.out);


        TasksStorage storage = new TaskStorageIMPL();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);

        TaskExecutor executor1 = new TaskExcuterIMPL();
        TaskExecutor executor2 = new TaskExcuterIMPL();

        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor1.start();
        executor2.start();








    }


}
