import java.util.Scanner;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage program");
        int wagePerHour = 20;
        int fullTime = 8;
        int partTime = 4;
        int workingDays = 20;
        int salary;
        int totalSalary = 0;
        Random random = new Random();
        int employeeCheck = random.nextInt(3);
        for (int day = 0; day <= workingDays; day++) {
            if (employeeCheck == 2) {
                System.out.println("Employee is Present for Full Time");
                salary = wagePerHour * fullTime;
                totalSalary = totalSalary + salary;
                System.out.println("Monthly salary is: "+totalSalary);
            }
            else if (employeeCheck == 1) {
                System.out.println("Employee is Present for Part Time");
                salary = wagePerHour * partTime;
                totalSalary = totalSalary + salary;
                System.out.println("Monthly salary is: "+totalSalary);
            } else
                System.out.println("Employee is Absent");
        }
        switch (employeeCheck) {
            case 2:
                salary = fullTime * wagePerHour;
                System.out.println("Employee is present full time");
                break;
            case 1:
                salary = partTime * wagePerHour;
                System.out.println("Employee is present part time");
                break;
            default:
                System.out.println("Employee is absent");
        }
    }
}