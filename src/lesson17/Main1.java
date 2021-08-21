package lesson17;

import java.io.File;
import java.io.FileFilter;

public class Main1 {
    public static void main(String[] args) {
        File startDir = new File("/home/ruslan/Desktop/JavaTest");
        File[] filesFromDir = startDir.listFiles(new FileFilter() { // сортировка какие файлы ложить
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }
                if(pathname.getName().endsWith("jpg")){  // берем по имени файла и проверям что jpg
                    return true;
                }
                return false;
            }
        }); // вытянуля все папкм и файлы
        for(File f : filesFromDir){
            System.out.println(f.getAbsolutePath());
        }
    }
}
