package new_lesson18;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        File file = new File("/home/ruslan/Desktop/LessonEasyVokzal");

        File[] arrFile = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }
                if(pathname.getName().endsWith(".jpg")){
                    return true;
                }
                return false;
            }
        });

        for(File file1 : arrFile){
            System.out.println(file1.getName());
        }

    }
}
