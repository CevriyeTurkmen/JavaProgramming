package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
int number= 9;
String months= "Ocak";

if (number>=1&&number<=12){
    if (number==1)
        months="January";
    else if (number==2) {
        months= "February";
    } else if (number==3) {
        months="March";
    } else if (number==4) {
        months="April";
    } else if (number==5) {
        months="May";
    } else if (number==6) {
        months="Jun";
    } else if (number==7) {
        months="July";
    } else if (number==8) {
        months="August";
    } else if (number==9) {
        months="September";
    } else if (number==10) {
        months= "October";
    } else if (number==11) {
        months= "November";
    }else months="December";

}else System.out.println("Invalid");

        System.out.println("months = " + months);




















        
    }
}
