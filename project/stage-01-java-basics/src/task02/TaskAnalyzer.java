package task02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskAnalyzer {
    public List<String> getTitlesUppercase(List<Task> tasks) {
        return tasks
                .stream()
                .map(t -> t.title().toUpperCase())
                .toList();
    }

    public Map<TaskStatus, Long> countByStatus(List<Task> tasks) {
        return tasks
                .stream()
                .collect(Collectors.groupingBy(Task::status, Collectors.counting()));
    }
    
    public boolean areAllDone(List<Task> tasks) {
        return tasks
                .stream()
                .allMatch(task -> task.status() == TaskStatus.DONE);
    }
}
