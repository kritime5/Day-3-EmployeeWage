package com.bridgelabz;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class EmpWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static final int NUMBER_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        //UC6-CALCULATE WAGE TILL MAX CONDITION
        //VARIABLES
        int empHrs = 0;
        int empWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        //computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS)
            totalWorkingDays++;
        int a = (int) (Math.random() * 3);
        switch (a) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }

        empWage = empHrs * EMP_WAGE_PER_HOUR;
        System.out.println("TOTAL WORKING DAYS=" + totalWorkingDays + "Total employee hours=" + empHrs);

    }
}