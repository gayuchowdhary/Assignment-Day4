package com.bridgelabz.Day4;

import java.util.Random;

public class EmployeeWageUsingSwitchCase {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int PartTimeHrs = 8;
        int emprateperhrs = 20;
        int FullTimeHrs = 10;
        int salary;
        int dailyhrs =0;

        Random obj = new Random();
        int attendance = obj.nextInt(3);
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

        System.out.println(salary);

    }
}

