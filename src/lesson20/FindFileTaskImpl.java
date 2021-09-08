package lesson20;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFileTaskImpl  extends  AbstractTask implements FindFilesTask {

    private String directory;
    private String searchString;
    private PrintStream out;  // любой поток вывода



    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {

       if(directory==null){
           throw new NullPointerException("directory == null");
       }
       File dir = new File(directory);
       if(!dir.exists() || !dir.isDirectory()){
           throw new FileNotFoundException("IS NOT DIRECTORY");
       }

        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        if(searchString==null){
            throw new IllegalArgumentException("searchString ==null");
        }

        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {

        if(directory==null){
            throw new NullPointerException("EXECUTE IN FIND FILE directory == null");
        }

        File dir = new File(directory);
        if(!dir.exists() || !dir.isDirectory()){
            throw new TaskExecutionFailedException("NOT DIR IN FIND FILE");
        }
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().contains(searchString)){
                return true;
                }
                return false;
            }
        });

        for(File f : files){
            out.println(f.getAbsolutePath());
        }


    }


}
