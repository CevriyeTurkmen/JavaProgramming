package day20_Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String[] classmates={"Yasemin Coskun","Sirin Kasim","Gulsah Tosun","Suheda Erbag","Seyma Alaca","Arzu Kizilari"};

        for (String each : classmates) {
            String result="";

            for (int i = each.length()-1; i >= 0; i--) {
                result+=each.charAt(i);

            }
            System.out.println(result);
        }











    }
}
