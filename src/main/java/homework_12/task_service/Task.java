package homework_12.task_service;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T> {
    private T id;
    private Status status;
    private Priority priority;
    private LocalDate date;

    public Task(T id, Status status, Priority priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Task<?> task = (Task<?>) object;
        return Objects.equals(id, task.id) && status == task.status && priority == task.priority && Objects.equals(date, task.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, priority, date);
    }
}
