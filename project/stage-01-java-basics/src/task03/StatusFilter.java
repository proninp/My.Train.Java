package task03;

public class StatusFilter implements TaskFilter {
    private final TaskStatus taskStatus;
    
    public StatusFilter(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean apply(Task task) {
        return task.status() == taskStatus;
    }
}
