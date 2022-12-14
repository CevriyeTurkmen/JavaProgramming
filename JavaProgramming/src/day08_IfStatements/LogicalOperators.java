package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven ";
        int age = 19;
        String citizen = "UK";
        boolean isEligible=age>=18 && citizen=="USA";
        System.out.println(name+ "is eligible for the vote = "+isEligible);

        String name1 = "Daniel ";
        int age1 = 34;
        String citizen1 = "USA";
        boolean isEligible1=age1>=18 && citizen1=="USA";
        System.out.println(name1+ "is eligible for the vote = "+isEligible1);

        System.out.println("_____________________________________");

        String name2="Josh";
        int creditScore=720;
        int age2= 23;
        int income=40000;

        boolean isEligibleForTheLoan= age2>=21&&creditScore>=700;
        System.out.println(name2+" is eligible for the loan= "+isEligibleForTheLoan);

        String name3="Shay";
        int age3= 20;
        char gender='F';
        boolean isEligible3=age>=18&&(gender=='F'||gender=='M');
        System.out.println(name3+" is eligible for the loan="+isEligible3);















    }
}
