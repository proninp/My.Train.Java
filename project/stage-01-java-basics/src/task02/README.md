# Task 02 — Stream API: трансформация и агрегация

## Задача
Реализовать анализ списка задач: трансформация, группировка, проверка условия.

## Что изучалось

- `map()` — преобразование каждого элемента
- `collect()` — сборка результата в коллекцию
- `Collectors.groupingBy()` — группировка элементов
- `Collectors.counting()` — подсчёт в группе
- `allMatch()` — проверка условия для всех элементов
- Method reference `Class::method` как замена лямбде `x -> x.method()`

## Отличия от C#

| C# | Java |
|----|------|
| `Select(x => ...)` | `.map(x -> ...)` |
| `GroupBy(x => x.Status)` | `Collectors.groupingBy(Task::status)` |
| `All(x => ...)` | `.allMatch(x -> ...)` |
| `x => x.Status` | `Task::status` (method reference) |