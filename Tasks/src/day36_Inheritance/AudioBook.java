package day36_Inheritance;

public class AudioBook extends Book {

    public String lenght, narrator;

    public AudioBook(String lenght, String narrator) {
        this.lenght = lenght;
        this.narrator = narrator;
    }

    public void listen() {
        System.out.println("listening " + title);
    }


    public static void main(String[] args) {
        int[] numbers={34,59,19};
        System.out.println("First element: "+ numbers[0]);
        System.out.println("Middle element: "+numbers[1]);
        System.out.println("Last element: "+numbers[2]);


    }

}