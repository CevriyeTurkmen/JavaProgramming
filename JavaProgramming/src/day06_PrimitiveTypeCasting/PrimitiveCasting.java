package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;
        int c = b;

        long d = c;
        float e = d;
        double f = e;
        System.out.println(f);
        System.out.println("_____________________________________");


        int x = 55;
        short y = (short) x;
        System.out.println(x+ ":" +y);
long j= 1000000;
short k= (short)j;
        System.out.println(j+"="+k);
        //Because 1000000 is not the short range.

        double l=2.5;
        float m= (float)l;
        System.out.println(l+"="+m);

        double n= 10.8;
        int s= (int) n;

        System.out.println(n+"="+s);
        System.out.println("________________________________-");















    }
}
