package day36_InheritanceIntro.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 5, "Large", "black");
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Sans", "Tekir", 2, "small", "brown");
        cat.eat();
        cat.drink();
        cat.move();
        cat.sleep();
        cat.meow();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
tiger.setInfo("Mali","Bengal",4,"large","red");
tiger.eat();
tiger.drink();
tiger.move();
tiger.sleep();
tiger.roar();
        System.out.println(tiger);

    }
}
