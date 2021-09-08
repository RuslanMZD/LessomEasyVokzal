package lesson20;

public class CopyFileTaskImpl extends AbstractTask implements CopyFileTask {
    private FileCopyUtils copyUtils;
    private String src;
    private String dst;


    public CopyFileTaskImpl(String src,String dst){
        this.src = src;
        this.dst = dst;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(src,dst);
        }catch (FileCopyFailedException ex){
            throw new TaskExecutionFailedException(ex.getMessage());

        }

    }
}
