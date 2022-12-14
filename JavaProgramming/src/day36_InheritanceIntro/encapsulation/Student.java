package day36_InheritanceIntro.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender,grade;
    private String schoolname;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolname() {
        return schoolname;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age<5||age>90){
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender=='M'||gender=='F')){
            return;
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if (!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            return;
        }
        this.grade = grade;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname= schoolname;
    }

    public void study(){

    System.out.println(name+" is studying");

    }

    public Student(String name, int age, char gender, char grade, String schoolname) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolname(schoolname);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", school " + schoolname +
                '}';
    }
}
