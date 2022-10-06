import java.util.Scanner;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage program");
        int wagePerHour = 20;
        int fullTime = 8;
        int salary = 0;
        Random random = new Random();
        int employeeCheck = random.nextInt(3);
        if(employeeCheck >= 2) {
            System.out.println("Employee is Present");
            salary = wagePerHour * fullTime;
            System.out.println("Salary is: "+salary);
        }
        else
            System.out.println("Employee is Absent");
    }

}
