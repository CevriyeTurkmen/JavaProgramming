package day09_IfStatements;

public class Task_AgeGroups {

    public static void main(String[] args) {

/*Create a class called AgeGroups, and write a program that can define
the age groups of a person
             age groups are:
                    infant (1 - 2)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult
(40 - 49),
                    Middle-Aged Adult (50 -
54),
                    Very Young Senior Citizen
(55 - 64),
                    Young Senior Citizen (65
- 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */
int age= 38;

if (age>=1&&age<=2){
    System.out.println(" Age Group NameOfMonth = " +"infant" );} else if (age>=3&&age<=5) {
    System.out.println(" Age Group NameOfMonth = " +"Toddler" );} else if (age>=6&&age<=9) {
    System.out.println(" Age Group NameOfMonth = " +"Kid");} else if (age>=21&&age<=39) {
    System.out.println(" Age Group NameOfMonth = " +"Adult");
}


    }
}
