package Tasks_Adam;

public class Student {

public String name;
public char gender;
public double dateOfBirth;
public int age;
public int StudentId;
public char grade;

    public Student(String name, char gender, double dateOfBirth, int age, int studentId, char grade) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        StudentId = studentId;
        this.grade = grade;


    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", StudentId=" + StudentId +
                ", grade=" + grade +
                '}';
    }
}
