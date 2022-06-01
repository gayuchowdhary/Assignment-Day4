package com.bridgelabz.Day4;

import java.util.Random;

public class CalculatingWagePerMonth {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int PartTimeHrs = 8;
        int emprateperhrs = 20;
        int FullTimeHrs = 10;
        int salary = 0;
        int dailyhrs = 0;
        int WORKING_DAYS = 20;
        int WAGE_PER_HR = 20;
        Random obj = new Random();
        int attendance = obj.nextInt(3);

        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++) {
            int workingHrs = 0;

            switch (attendance) {
                case 0:
                    System.out.println("Employee Full Time Work");
                    salary = FullTimeHrs * emprateperhrs;
                    break;
                case 1:
                    System.out.println("Employee is Part Time Work");
                    salary = PartTimeHrs * emprateperhrs;
                    break;

                default:
                    System.out.println("Employee is absent");
                    salary = dailyhrs * emprateperhrs;
                    break;
            }
            int dailyWage = workingHrs * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + dailyWage);
            totalWage += dailyWage;
        }
        System.out.println("Total wage for a month is " + totalWage);
        System.out.println(salary);

    }
}
