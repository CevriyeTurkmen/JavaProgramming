package Tasks_Adam;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {


ArrayList<Student>students=new ArrayList<>();


        Student student1=new Student("Ali Kaya",'M',25.05,22,1222,'B');
        Student student2=new Student("Aliye Kaya",'F',15.05,23,1322,'A');
        Student student3=new Student("Hazal Kaya",'F',12.12,18,1342,'A');
        Student student4=new Student("Fevzi Kaya",'M',23.11,19,1278,'C');
        Student student5=new Student("Seyit Akay",'M',15.10,17,1123,'B');

students.addAll(Arrays.asList(student1,student2,student3,student4,student5));

ArrayList<Student>list=startWithA(students);

        System.out.println(list);












    }

   public static ArrayList<Student> startWithA(ArrayList<Student>students) {

        ArrayList<Student>list=new ArrayList<>();

       for (Student each : students) {
           if (each.name.startsWith("A")){
               list.add(each);

           }

       }
return list;
   }
}
