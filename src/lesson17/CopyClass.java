package lesson17;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;


public class CopyClass implements CopyUtills{
    @Override
    public void copy(String from, String to) throws IOException {
        File sourceDir = new File(from);
        File destDir = new File(to);
//________________1__________________________

        long start =  System.currentTimeMillis();
        Files.copy(sourceDir.toPath(),destDir.toPath());
        long end =  System.currentTimeMillis();
        System.out.println(end-start + " 1ый");

//        ________________2__________________________
//        long start =  System.currentTimeMillis();
//        InputStream is = new FileInputStream(sourceDir);
//        OutputStream os = new FileOutputStream(destDir);
//        byte[] buffer = new byte[4096];
//        int length;
//
//        while ((length = is.read(buffer)) > 0) {
//            os.write(buffer, 0, length);
//        }





//_______________________так не использовать
//        while (is.available()>0){
//            int data = is.read();
//            os.write(data);
//        }
//_______________________________________

//        is.close();
//        os.close();
//
//        long end =  System.currentTimeMillis();
//        System.out.println(end-start + " 2ой");





        //____________________3_______________________
//        long start =  System.currentTimeMillis();
//        FileChannel sourceChannel = new FileInputStream(sourceDir).getChannel();;
//        FileChannel destChannel = new FileOutputStream(destDir).getChannel();
//        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
//        sourceChannel.close();
//        destChannel.close();
//        long end =  System.currentTimeMillis();
//        System.out.println(end-start + " 3ий");

        //___________________4__________________________



    }


    }

