package homeworks.homework_12.grade_service;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private List<StudentGrade<T>> studentGradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> studentGrade) {
        if (studentGrade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка невалидна");
        }
        studentGradeList.add(studentGrade);
    }

    public synchronized double averageGrade(String subject) {
        return studentGradeList.stream()
                .filter(grade -> subject.equals(grade.getSubject()))
                .mapToDouble(grade -> grade.getGrade().doubleValue())
                .average()
                .orElse(0.0);
    }
}