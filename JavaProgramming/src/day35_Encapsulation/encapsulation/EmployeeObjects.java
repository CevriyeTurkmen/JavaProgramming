package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee("Cevriye",'F',38,50000);
        Employee employee2=new Employee("Seyit",'M',39,100000);
employee1.setAge(32);
employee2.setSalary(employee2.getSalary()+15000);

        System.out.println(employee1);
        System.out.println(employee2);








    }




}
