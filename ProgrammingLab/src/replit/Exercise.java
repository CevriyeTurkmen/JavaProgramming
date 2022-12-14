package replit;

public class Exercise {

    public static void main(String[] args) {


        int num = 0;
        if (num == 0) {
            num += 50;
        }
        if (num != 0) {
            num += 50;
        }

        System.out.println(num);

        boolean x = true;
        boolean y = !x == false;
        boolean z = y;

        if (x) {
            System.out.println("a");
            if (y) {
                System.out.println("b");
                if (z) {
                    System.out.println("c");
                }


            }
        }
    }
}
