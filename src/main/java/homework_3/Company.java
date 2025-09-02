package homework_3;

public class Company {
    static String companyName = "Apple";
    final int employeeID;
    String employeeName;

    Company(int someEmployeeID, String someEmployeeName) {
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    void printEmployeeInfo() {
        System.out.println("ID: " + employeeID + ", name: " + employeeName + ", company: " + companyName);
    }

}
