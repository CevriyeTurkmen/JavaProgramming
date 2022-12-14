package day08_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        //a=10 b=15 c=20

        int a=10,b=15,c=20;
        if (a < b&& a> c || a < c&& a>b) {
            System.out.println(a+ " is median number");}
            if (b<c&& b>a|| b<a&&b>c){
                System.out.println(b+ " is median number");}
            if (c<a&&c>b||c<b&&c>a){
                System.out.println(c+" is median number");}






















    }
}
