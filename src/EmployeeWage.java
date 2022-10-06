import java.util.Scanner;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage program");
        Random random = new Random();
        int employeeCheck = random.nextInt(3);
        if(employeeCheck >=2) {
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }

}
