package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobTitle = " SDET";
        String companyName = "Apple Inc";


        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is " + age + " years old");
        System.out.println(fullName + " is" + jobTitle +" works at "+ companyName);

        //Full name of the person...
        //...is ... years old
        // FullName is JobTitle works at CompanyName
    }


}
