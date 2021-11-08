package lesson22;

import com.google.common.io.Files;
import lesson17.CopyUtills;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava  implements CopyUtills {
    public static void main(String[] args) {

    }

    @Override
    public void copy(String from, String to) throws IOException {
        File srcFile = new File(from);
        File dstFile = new File(to);
        Files.copy(srcFile,dstFile);
    }
}
