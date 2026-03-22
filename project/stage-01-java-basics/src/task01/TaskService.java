package task01;

import java.util.List;
import java.util.Optional;

public class TaskService {

    public Optional<Task> findInProgress(List<Task> tasks) {
        return tasks
                .stream()
                .filter(t -> t.status() == TaskStatus.IN_PROGRESS)
                .findFirst();
    }
}
