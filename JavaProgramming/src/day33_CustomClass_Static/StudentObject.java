package day33_CustomClass_Static;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Cevriye");
        Student student2=new Student("Gamze",'F');
        Student student3=new Student("Seyit",'M',39);


Student[] students={student1,student2,student3};
        System.out.println(Arrays.toString(students));











    }
}
