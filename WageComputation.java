package com.bridgelabz.Day4;

public class WageComputation {

        public static void calculateWage(String Name, int totalWorkingHourOfName, int totalWorkingDayOfName, int empWagePerHourOfName) {

            int empHour, totalWorkingHour = 0, totalWorkingDay = 0;

            while (totalWorkingHour <= totalWorkingHourOfName && totalWorkingDay < totalWorkingDayOfName) {
                totalWorkingDay++;
                int empCheck = (int) (Math.random() * 10) % 3;
                switch (empCheck) {
                    case 1:
                        empHour = 8;
                        break;
                    case 2:
                        empHour = 4;
                        break;
                    default:
                        empHour = 0;
                }

                totalWorkingHour += empHour;
            }

            int totalWage = totalWorkingHour * empWagePerHourOfName;
            System.out.println("Company Name: " + Name + ", " + "Total Wage: " + totalWage + ", " + ", " + "Working Days: " +
                    +totalWorkingDay + ", " + "Working Hour: " + totalWorkingHour + ", " + "Employee Wage per Hour: " + empWagePerHourOfName);
        }

        public static void main(String[] args) {

            calculateWage("TCS", 150, 24, 700);
            calculateWage("DEll", 100, 22, 400);

        }
    }
