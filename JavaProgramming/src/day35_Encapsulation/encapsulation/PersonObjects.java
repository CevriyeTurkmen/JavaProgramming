package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Daniel");
        person1.setAge(19);

        System.out.println(person1.getAge());
        System.out.println(person1.getName());


    }
}
