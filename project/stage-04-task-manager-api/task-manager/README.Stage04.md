# Stage 04 — Spring Boot: Task Manager API

## Стек
- Spring Boot 4.x
- Spring Data JPA
- H2 (in-memory БД)
- Lombok

## Что изучалось

### Domain Layer
- `@Entity` — JPA-сущность
- `@Id` + `@GeneratedValue(IDENTITY)` — автогенерация PK
- `@Enumerated(EnumType.STRING)` — enum как строка в БД
- `@PrePersist` — хук перед сохранением
- Lombok: `@Getter @Setter` на классе + `AccessLevel.NONE` на полях

### Repository Layer
- `JpaRepository<T, ID>` — CRUD из коробки
- Query Methods — Spring генерирует SQL по имени метода