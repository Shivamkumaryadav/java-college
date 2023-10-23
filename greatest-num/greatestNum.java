//write a program to check greatest no among the three no.
import java.util.Scanner;
 class greatestNum{
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        System.out.println("Enter the value of b :");
        b = sc.nextInt();
        System.out.println("Enter the value of c :");
        c = sc.nextInt();

        // greatest
        if(a > b && a >c)
        {
            System.out.println("The greatest number is" + a);
        }else  if(b > c && b > a)
        {
            System.out.println("The greatest number is" + b);
        }else
        {
            System.out.println("The greatest number is" + c);
        }
    }
}