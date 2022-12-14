package week13_12_03_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    static ArrayList<Teacher>teachers=new ArrayList<>();

    static {

        Teacher teacher1= new Teacher("Nazmiye","Uysal",'F', LocalDate.of(1954,1,21),1512432);
        Teacher teacher2= new Teacher("Aliye","Saglam",'F', LocalDate.of(1953,3,23),15535622);
        Teacher teacher3= new Teacher("Ali","Erbil",'M', LocalDate.of(1952,2,24),15212345);
        Teacher teacher4= new Teacher("Serife","Dik",'F', LocalDate.of(1951,6,25),1524525);
        Teacher teacher5= new Teacher("DayiAli","Tosun",'M', LocalDate.of(1968,5,26),1521234);

        teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5));
    }

    public static void main(String[] args) {

    }

}
