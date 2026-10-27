package homeworks.homework_12.grade_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
    /**
     * Добавление положительной оценки — оценка сохранилась, среднее равно ей.
     * Добавление нуля — исключение не возникает.
     * Добавление отрицательной оценки — выбрасывается InvalidGradeException.
     * Расчёт среднего — для оценок 4.5 и 5.0 возвращается 4.75.
     * Отрицательная дробная оценка — для -0.5 выбрасывается InvalidGradeException
     */

    private GradeService<Integer> integerService;
    private GradeService<Double> doubleService;

    @BeforeEach
    public void setupTest() {
        integerService = new GradeService<>();
        doubleService = new GradeService<>();
    }

    @Test
    public void userCanAddGradeToCollection() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Анна", "Математика", 5);

        integerService.addGrade(studentGrade);

        double expectedAverage = 5.0;
        double actualAverage = integerService.averageGrade("Математика");

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void userCanAddGrade0ToCollection() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Анна", "Математика", 0);

        assertDoesNotThrow(() -> integerService.addGrade(studentGrade));
    }

    @Test
    public void userCanNotAddNegativeGradeToCollection() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Анна", "Математика", -5);

        assertThrows(InvalidGradeException.class,
                () -> integerService.addGrade(studentGrade));
    }

    @Test
    public void userCanCalculateGradeAverage() {
        StudentGrade<Double> studentGrade1 = new StudentGrade<>("Анна", "Математика", 5.0);
        StudentGrade<Double> studentGrade2 = new StudentGrade<>("Анна", "Математика", 4.5);
        StudentGrade<Double> studentGrade3 = new StudentGrade<>("Анна", "Химия", 5.0);

        doubleService.addGrade(studentGrade1);
        doubleService.addGrade(studentGrade2);
        doubleService.addGrade(studentGrade3);

        double expectedAverage = 4.75;
        double actualAverage = doubleService.averageGrade("Математика");

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void userCanNotAddFractionalNegativeNumber() {
        StudentGrade<Double> studentGrade = new StudentGrade<>("Анна", "Химия", -0.5);

        assertThrows(InvalidGradeException.class,
                () -> doubleService.addGrade(studentGrade));
    }

    @Test
    public void userCanSureThatConcurrentGradeAreNotLost() throws InterruptedException, ExecutionException {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Анна", "Математика", 5);

        integerService.addGrade(studentGrade);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try {
            List<Callable<Void>> tasks = new ArrayList<>();
            StudentGrade<Integer> studentGrade1 = new StudentGrade<>("Анна", "Математика", 1);

            for (int i = 0; i < 100; i++) {
                tasks.add(() -> {
                    integerService.addGrade(studentGrade1);
                    return null;
                });
            }

            List<Future<Void>> futureList = executorService.invokeAll(tasks);

            for (Future<Void> result : futureList) {
                result.get();
            }

            double expectedAverage = 105.0 / 101;
            double actualAverage = integerService.averageGrade("Математика");

            assertEquals(expectedAverage, actualAverage, 0.000001);

        } finally {
            executorService.shutdown();
        }
    }
}