package day37_Inheritance.animalTask;

public class Dog extends Animal {

    public String dogowner;

    public Dog(String name, String breed, int age, String size, String color, String dogowner) {
        super(name, breed, age, size, color);
        this.dogowner=dogowner;
    }

   public void bark(){
       System.out.println(name+ " is barking");
   }


}
