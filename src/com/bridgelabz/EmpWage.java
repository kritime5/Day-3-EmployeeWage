package com.bridgelabz;

import java.sql.SQLOutput;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        //UC3-ADD PART TIME EMPLOYEE AND WAGE-PART TIME HR IS 8
        //CONSTANTS
        int IS_PART_TIME=1;
        int IS_FULL_TIME=2;
        int EMP_WAGE_PER_HOUR=20;

        //VARIABLES
        int empHrs=0;
        int empWage=0;
        //computation
        int a=(int)(Math.random()*2);
        if(a==IS_PART_TIME)
            empHrs=4;
        else if (a==IS_FULL_TIME)
            empHrs=8;
        else
            empHrs=0;

        empWage=empHrs*EMP_WAGE_PER_HOUR;
        System.out.println("Emp Wage:"+empWage);



    }
}
