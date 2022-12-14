package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;
public class Test {

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);
        System.out.println("--------------------------");
       int r1= sum(10,20);
       int r3=subtract(10,2);
       int r2=max(10,30);

        System.out.println(r1+r2+r3);

    }
}
