package lesson17;


import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File startDir = new File("/home/ruslan/Desktop/JavaTest/test.txt");
        if(!startDir.exists()){ // проверить наличие
            //startDir.mkdir();
            try{
                startDir.createNewFile(); //создание файла с именем в пути
            }catch (IOException ex){
                ex.printStackTrace();
            }

        }
    }
}
