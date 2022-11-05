package com.bridgelabz;

public class EmployeeWageObject {
    //uc9-save total wage for each company
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    int totalEmpWage;

    public EmployeeWageObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {
        //variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days" + totalWorkingDays + "Emp Hr:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    public String toString() {
        return "Total Emp Wage for company:" + company + "is" + totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWageObject dMart = new EmployeeWageObject("DMart", 20, 2, 10);
        EmployeeWageObject reliance = new EmployeeWageObject("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}



