package homework_8.funcinterfaces;

/*
1. Создайте свой функциональный интерфейс
Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
 */
@FunctionalInterface
public interface MathOperation {
    double operate(double a, double b);
}
