package task03;

import java.util.List;

public class TaskSearcher {
    public List<Task> search(List<Task> tasks, TaskFilter filter) {
        return tasks
                .stream()
                .filter(filter::apply)
                .toList();
    }
}
