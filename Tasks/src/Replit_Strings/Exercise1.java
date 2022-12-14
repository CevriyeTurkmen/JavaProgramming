package Replit_Strings;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word1 = scan.next();
    if (word1.startsWith("a")&&word1.endsWith("e")){
        System.out.println("starts with a:"+" true");
   System.out.println("ends with a:"+" true");}
   if (word1.startsWith("a")&&!word1.endsWith("e")){
       System.out.println("starts with a:"+" true");
       System.out.println("ends with a:"+" false");}
       if (!word1.startsWith("a")&&word1.endsWith("e")){
           System.out.println("starts with a:"+" false");
           System.out.println("ends with a:"+" true");}

           if (!word1.startsWith("a")&&!word1.endsWith("e")){
               System.out.println("starts with a:"+" false");
               System.out.println("ends with a:"+" false");}




































    }
}
