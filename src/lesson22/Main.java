package lesson22;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       CopyWithGuava cwg = new CopyWithGuava();

       cwg.copy("test1.jpg","testGuawa.jpg");

    }
}
