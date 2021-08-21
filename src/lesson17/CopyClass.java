package lesson17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyClass implements CopyUtills{
    @Override
    public void copy(String from, String to) throws IOException {
        File sourceDir = new File(from); //this directory already exists
        File destDir = new File(to); //this is a new directory

        Files.copy(sourceDir.toPath(),destDir.toPath());

    }
}
