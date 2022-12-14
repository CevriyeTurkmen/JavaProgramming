package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        //salaryBeforeTax=hourlyRate*weeklyHour*52
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
double stateTax= salaryBeforeTax*stateTaxRate/100;
double federalTax=salaryBeforeTax*federalTaxRate/100;
double totalTax= stateTax+federalTax;
        System.out.println("Gross pay is = $" + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
double salaryAfterTax=salaryBeforeTax-totalTax;
        System.out.println("Net income = $"+salaryAfterTax);




        
    }

}
