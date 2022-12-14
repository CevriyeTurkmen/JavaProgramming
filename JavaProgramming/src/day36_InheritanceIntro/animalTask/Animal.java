package day36_InheritanceIntro.animalTask;

public class Animal {

    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String breed, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }















}
