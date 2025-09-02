package homework_3;

public class University {

    static String universityName = "MSU";
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName) {
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Имя студента: " + studentName + ", ID: " + studentID + ", университет: " + universityName);
    }

}
