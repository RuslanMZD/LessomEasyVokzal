package lesson20;

public class TaskExcuterIMPL extends Thread implements TaskExecutor{
    private TasksStorage storage;


    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        if(storage==null){
            throw new NullPointerException("storage == null");
        }

        this.storage= storage;
    }

    @Override
    public TasksStorage getStorage() {
        return this.storage;
    }

    @Override
    public void run() {
        while (true){
            Task task = storage.get();
            if(task != null){
                System.out.println(Thread.currentThread().getName() + " Пробую выполнить задачу " + task);
                try {
                    task.execute();
                    System.out.println(Thread.currentThread().getName() + " Выполнил задачу" + task);
                } catch (TaskExecutionFailedException e) {

                    System.out.println("Ne poluchilos vypolnit zadachu");
                    if(task.getTryCount()<5){
                        task.incTryCount();
                        storage.add(task);
                        System.out.println("Vozvrashayu obratno zadachu");
                    }else {
                        System.out.println("REmove zadachu");
                    }
                }

            }else{
                System.out.println(Thread.currentThread().getName() + " Заканчивает работу , нет задач");
                break;
            }
        }

    }
}
