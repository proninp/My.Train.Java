# Task 01 - Optional & Stream API basics

## Задача
Найти первую задачу со статусом `IN_PROGRESS` из списка задач.

## Что изучалось

- `record` - неизменяемый объект-данных, геттеры через `field()`
- `enum` с константами в `UPPER_SNAKE_CASE`
- `Optional<T>` - безопасная альтернатива `null`
- Stream API: `.stream()` → `.filter()` → `.findFirst()`
- `==` для сравнения enum вместо `.equals()`

## Отличия от C#

| C# | Java |
|----|------|
| `record.Title` | `record.title()` |
| `FirstOrDefault(x => ...)` | `.filter(x -> ...).findFirst()` |
| `x => x.Status` | `x -> x.status()` |
| `.equals()` для enum | `==` для enum |

## Ключевой вывод
Stream ленивый - конвейер не запускается до терминальной операции (`findFirst`, `toList`, `count` и др.)