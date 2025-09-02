package homework_3;

public class Main {
    public static void main(String[] args) {

        Company employee1 = new Company(1, "Anna");
        Company employee2 = new Company(2, "Maria");


        employee1.printEmployeeInfo();
        employee2.printEmployeeInfo();

        Company.printCompanyName();

        Company.companyName = "Meta";

        Company.printCompanyName();

        employee1.printEmployeeInfo();
        employee2.printEmployeeInfo();

//        employee1.employeeID = 5;
        // не могу менять final поля


        System.out.println(MathConstants.calculateCircleArea(2));
        System.out.println(MathConstants.calculateCircleArea(3));


        System.out.println(MathConstants.calculateCircumference(2));
        System.out.println(MathConstants.calculateCircumference(3));


        University student1 = new University(1, "Коля");
        University student2 = new University(2, "Петя");
        University student3 = new University(3, "Вася");

        University.changeUniversityName("PSU");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings gs1 = new GameSettings("Sims 2");
        GameSettings gs2 = new GameSettings("Sims 4");

        GameSettings.setMaxPlayers(2);
        gs1.addPlayer();
        gs1.addPlayer();
        gs1.addPlayer();

        gs2.addPlayer();
        gs2.addPlayer();

        gs1.printGameStatus();
        gs2.printGameStatus();

        Person petya = new Person("Петя", "Иванов", "123-45-6789");
        Person kolya = new Person("Коля", "Петров", "123-45-6788");

        petya.printInfo();
        kolya.printInfo();

        kolya.setFirstName("Николай");

        petya.printInfo();
        kolya.printInfo();

    }
}
