package task03;

public class KeywordFilter implements TaskFilter {
    private final String keyword;

    public KeywordFilter(String keyword) {
        this.keyword = keyword.toLowerCase();
    }

    @Override
    public boolean apply(Task task) {
        return task.title().toLowerCase().contains(keyword);
    }
}
