package week12_11_26_2022.employee.statics;

public class EatCake {

    public static int totalSlices=10;


    public void eatCake(int eatSlice) {
        totalSlices-=eatSlice;

        System.out.println("Remaining slices: " +totalSlices);
    }















}
