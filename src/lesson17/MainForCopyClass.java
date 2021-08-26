package lesson17;

import java.io.IOException;

public class MainForCopyClass {
    public static void main(String[] args)  {
        CopyClass copyClass = new CopyClass();
       //_______l________
//               String pathFrom = "test.jpg";
//        String pathTo = "forTest\\test.jpg";
//_______m________
//        String pathFrom = "one.mp4";
//        String pathTo = "forTest\\one.mp4";

        //_______h________

        String pathFrom = "h.mpg";
        String pathTo = "forTest\\h.mpg";
        try {
            copyClass.copy(pathFrom,pathTo);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
