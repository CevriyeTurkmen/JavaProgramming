package week02_09_17_2022;

public class ConvertMiutesToYearAndDay {

    public static void main(String[] args) {

/*    Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days

 */

        int minute = 3456789;
        int minuteInYear=365*24*60;
        int minuteInDay=24*60;
        int year = minute / minuteInYear;
        int day = (3456789 % minuteInYear)/ minuteInDay ;
        // int day = (3456789 - (year*minuteInYear))/ minuteInDay ;
        System.out.println("year = " + year);
        System.out.println("day = " + day);
    }
}