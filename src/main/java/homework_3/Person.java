package homework_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String someFirstName, String someLastName, String someSsn) {
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void printInfo() {
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }
}
