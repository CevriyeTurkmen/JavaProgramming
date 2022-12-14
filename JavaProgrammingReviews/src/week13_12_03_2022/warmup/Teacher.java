package week13_12_03_2022.warmup;

import java.time.LocalDate;

public class Teacher {

    public String name, lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public long id;

    public Teacher(String name, String lastName, char gender, LocalDate dateOfBirth, long id) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        int currentYear=LocalDate.now().getYear();
        int birthdate=dateOfBirth.getYear();
        this.age=currentYear=birthdate;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

