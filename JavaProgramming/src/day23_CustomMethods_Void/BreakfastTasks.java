package day23_CustomMethods_Void;

public class BreakfastTasks {
    public static void main(String[] args) {

        initial("Cevriye", "Turkmen");
        domain("cberkcan@gmail.com");
        String[] emails = {"mseyit@gmail.com", "cberkcan@hotmail.com", "aberkcan@gmail.com", "seydoo42@hotmail.com"};
        for (String email : emails) {
            domain(email);
        }
        nameOfMonths(3);
nameOfTheDay(5);



    }


    public static void initial(String firstname, String secondname) {
        String initial = firstname.charAt(0) + "." + secondname.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);

    }

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain:" + domain);
    }

    public static void nameOfMonths(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ?
                    "April" : (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "July" : (number == 8) ? "August" :
                    (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        } else {

            name = "invalid";
        }

        System.out.println("name of the months: " + name);
    }

    public static void nameOfTheDay(int dayNumber){
        String day="";
        if (dayNumber>=1&&dayNumber<=7){
          day=(dayNumber==1)?"Monday":(dayNumber==2)?"Tueasday":(dayNumber==3)?
                  "Wednesday":(dayNumber==4)?"Thursday":(dayNumber==5)?"Friday":
                  (dayNumber==6)?"Saturday":"Sunday";

        }else day="Invalid";

        System.out.println("day is:"+day);
    }




}




































