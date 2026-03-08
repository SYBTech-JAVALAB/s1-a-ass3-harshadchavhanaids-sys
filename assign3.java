import java.util.Scanner;

class EmployeePayroll {

    
    double calculateSalary(int employeeID) {
        System.out.println("Employee ID: " + employeeID);
        return 30000;
    }

  
    double calculateSalary(int hoursWorked, double rate) {
        return hoursWorked * rate;
    }

    
    double calculateSalary(int employeeID, double bonus, boolean flag) {
        System.out.println("Employee ID: " + employeeID);
        return 30000 + bonus;
    }

   
    double calculateSalary(double annualSalary) {
        return annualSalary;
    }

 
    double calculateSalary(int hoursWorked, double rate, int overtimeHours) {
        return (hoursWorked * rate) + (overtimeHours * rate * 1.5);
    }

    
    double calculateSalary(double salary, double deductions, boolean flag) {
        return salary - deductions;
    }

 
    double calculateSalary(double salary, double bonus, double deductions) {
        return salary + bonus - deductions;
    }
}

public class assign3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeePayroll emp = new EmployeePayroll();
        int choice;
        
        do{
        System.out.println("EMPLOYEE PAYROLL SYSTEM");
        System.out.println("1. Salary by Employee ID");
        System.out.println("2. Salary by Hours & Rate");
        System.out.println("3. Salary by ID with Bonus");
        System.out.println("4. Annual Salary");
        System.out.println("5. Salary with Overtime");
        System.out.println("6. Salary with Deductions");
        System.out.println("7. Salary with Bonus & Deductions");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        double salary = 0;

        switch (choice) {

            case 1:
                System.out.print("Enter Employee ID: ");
                int id1 = sc.nextInt();
                salary = emp.calculateSalary(id1);
                break;

            case 2:
                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();
                System.out.print("Enter Rate per Hour: ");
                double rate = sc.nextDouble();
                salary = emp.calculateSalary(hours, rate);
                break;

            case 3:
                System.out.print("Enter Employee ID: ");
                int id2 = sc.nextInt();
                System.out.print("Enter Bonus: ");
                double bonus = sc.nextDouble();
                salary = emp.calculateSalary(id2, bonus, true);
                break;

            case 4:
                System.out.print("Enter Annual Salary: ");
                double annual = sc.nextDouble();
                salary = emp.calculateSalary(annual);
                break;

            case 5:
                System.out.print("Enter Hours Worked: ");
                int h = sc.nextInt();
                System.out.print("Enter Rate per Hour: ");
                double r = sc.nextDouble();
                System.out.print("Enter Overtime Hours: ");
                int ot = sc.nextInt();
                salary = emp.calculateSalary(h, r, ot);
                break;

            case 6:
                System.out.print("Enter Salary: ");
                double sal = sc.nextDouble();
                System.out.print("Enter Deductions: ");
                double ded = sc.nextDouble();
                salary = emp.calculateSalary(sal, ded, true);
                break;

            case 7:
                System.out.print("Enter Salary: ");
                double s = sc.nextDouble();
                System.out.print("Enter Bonus: ");
                double b = sc.nextDouble();
                System.out.print("Enter Deductions: ");
                double d = sc.nextDouble();
                salary = emp.calculateSalary(s, b, d);
                break;

            case 0:
                System.out.println("exititng payroll system");
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Final Salary: " + salary);
    }while(choice!=0);
        sc.close();
    }
}