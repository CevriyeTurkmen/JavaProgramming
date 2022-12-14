package day35_Encapsulation;

public class CydeoStudentObject {
    public static void main(String[] args) {

        CydeoStudent student1=new CydeoStudent("Cevriye",'F',38,10,19,"Sdet");
        student1.attendClass();
        student1.study();
CydeoStudent.printSchoolNAme();
CydeoStudent.printSecretCode();

        System.out.println(student1);



    }
}
