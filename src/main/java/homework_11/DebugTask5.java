package homework_11;

public class DebugTask5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        updateAge(person);
        System.out.println("Updated age: " + person.getAge());
    }

    public static void updateAge(Person person) {
        person.setAge(person.getAge() + 1); // здесь создавался новый объект типа Person и присваивался локальной
        // переменной person, поэтому исходный объект из main не изменялся
    }
}
