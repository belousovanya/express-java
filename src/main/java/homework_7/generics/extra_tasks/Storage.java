package homework_7.generics.extra_tasks;

/*
Обобщённый класс
Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.
 */
public class Storage<T> {
    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
