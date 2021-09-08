package lesson20;

import java.util.LinkedList;

public class TaskStorageIMPL implements TasksStorage {
    private LinkedList<Task> tasks  = new LinkedList<>();



    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if(task==null){
            throw new NullPointerException("task==null");
        }
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        if(tasks.size()==0){
            return null;
        }
        return tasks.removeFirst();
    }

    @Override
    public  synchronized  int count() {
        return tasks.size();
    }
}
