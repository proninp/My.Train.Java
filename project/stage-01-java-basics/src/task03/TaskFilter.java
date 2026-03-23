package task03;

@FunctionalInterface
public interface TaskFilter {
    boolean apply(Task task);
}
