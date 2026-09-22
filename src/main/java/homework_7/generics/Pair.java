package homework_7.generics;

/*
3. Задача на дженерик с двумя типами данных
Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
Класс должен позволять получать и устанавливать каждый из этих объектов.
 */
public class Pair<T, U> {
    private T first;
    private U second;

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }
}
