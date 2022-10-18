package com.bridgelabz;

import java.sql.SQLOutput;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        //UC2-CALCULATE EMPLOYEE DAILY WAGE-given wage per hr is 20 and full day hr is 8
        //CONSTANTS
        int EMP_WAGE_PER_HOUR=20;
        int IS_FULL_TIME=1;
        //VARIABLES
        int empHrs=0;
        int empWage=0;
        //computation
        int a=(int)(Math.random()*2);
        if(a==1) {
            System.out.println("The employee is present");
            empHrs=8;
        }else{
            System.out.println("Employee is absent");
            empHrs=0;
        }
        empWage=empHrs*EMP_WAGE_PER_HOUR;
        System.out.println("Emp Wage:"+empWage);



    }
}
