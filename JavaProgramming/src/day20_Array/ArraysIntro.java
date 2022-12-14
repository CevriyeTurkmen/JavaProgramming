package day20_Array;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] MyGroup = new String[5];
        MyGroup[0] = "Gunay";
        MyGroup[1] = "Neira";
        MyGroup[2] = "Suat";
        MyGroup[3] = "Hulya";
        MyGroup[4] = "Mikael";
        System.out.println("------------------------------------");

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
      int number=5;
        if (number<1||number>7) {
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.println(days[number-1]);




    }
}
