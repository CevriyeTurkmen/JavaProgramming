package day31_CustomClass;

public class Exercise1 {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public Exercise1(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
       return hourlyRate*weeklyHours*52;

    }

    public double stateTax(){
       return salary() *stateTaxRate;

    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()+federalTax()+stateTax();
    }


    public String toString() {
        return "Exercise1{" +
                "salary =" + salary()+
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax()+
                '}';
    }

   /*SalaryCalculator Task:
1.1 Create a class named Salary calculator:
        Attributes:
            hourlyRate, stateTaxRate,
federalTaxRate, weeklyHours
            Add a constructor to set all the fields
        Actions:
            salary(): calculates the salary (
hourlyRate * weeklyHour * 52)
            stateTax(): calculates the
totalStateTax
            federalTax(): calculates the
total federal tax
            salaryAfterTax(): calculates the
salary after tax
            toString(): displays the salary,
stateTax, federalTax, salaryAfterTax of the Object

  */

}
