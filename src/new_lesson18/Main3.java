package new_lesson18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main3 {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialize.bin"));
            Point point = (Point) in.readObject();
            System.out.println(point);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
