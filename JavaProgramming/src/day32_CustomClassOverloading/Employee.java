package day32_CustomClassOverloading;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name,gender);
        this.jobTitle = jobTitle;

    }
}
