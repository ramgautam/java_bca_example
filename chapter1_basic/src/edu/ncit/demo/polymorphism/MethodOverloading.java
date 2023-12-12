package edu.ncit.demo.polymorphism;

public class MethodOverloading {
    public static int calculateSalary(int monthlySalary,
                                      boolean isLeaveAllowedInMonth,
                                      int totalDaysWorkedInMonth) {

        final int totalDaysInMonth = 30;

        if (isLeaveAllowedInMonth) {
            return monthlySalary;
        } else {
            return (monthlySalary / totalDaysInMonth)
                    * totalDaysWorkedInMonth;
        }
    }

    public static int calculateSalary
            (int hourlyRate, int numberOfHourWorked) {
        return hourlyRate * numberOfHourWorked;
    }

    public static double calculateSalary
            (double hourlyRate, double numberOfHourWorked) {
        return  ((double)hourlyRate * numberOfHourWorked);
    }
    public static void main(String args[]){
        //hourly Rate Salary package
        int hourlyRate=500;
        int numberOfHourWorked=15;
        System.out.println("Hourly calculated salary::"+
                calculateSalary(hourlyRate,numberOfHourWorked));

         double hourlyRateWithDecimal=500.50;
         double numberOfHourWorkedFloating=15.5;
        System.out.println("Hourly calculated salary with decimal::"+
                calculateSalary(hourlyRateWithDecimal,
                        numberOfHourWorkedFloating));
        //based on monthly package
        int monthlySalary=30000;
        boolean isLeaveAllowedInMonth=true;
        int totalDaysWorkedInMonth=25;

        System.out.println("Monthly based salary calculation::"+
                calculateSalary(monthlySalary,
                        isLeaveAllowedInMonth,
                        totalDaysWorkedInMonth));

        isLeaveAllowedInMonth=false;
        System.out.println("Monthly based salary calculation without allowed leave::"+
                calculateSalary(monthlySalary,
                        isLeaveAllowedInMonth,
                        totalDaysWorkedInMonth));
    }
}
