import java.util.Scanner;
public class Employee{
    // public int id;
    // public String last_name;            
    // public String first_name;            
    // public int salary;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee id : ");
        int id = sc.nextInt();
        System.out.println("Enter the Employee first name : ");
        String first_name = sc.next();
        System.out.println("Enter the Employee last name : ");
        String last_name = sc.next();
        System.out.println("Enter the Employee salary : ");
        int salary = sc.nextInt();

        System.out.println("The employee id is :" + id);
        System.out.println("The employee first name is :" + first_name);
        System.out.println("The employee last name is :" + last_name);
        System.out.println("The employee salary is :" + salary);
    
    }
}