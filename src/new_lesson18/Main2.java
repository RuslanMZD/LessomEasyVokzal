package new_lesson18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main2 {
    public static void main(String[] args)  {
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serialize.bin"));
            out.writeObject(new Point(3,4));
            out.flush();
            out.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }



    }
}
