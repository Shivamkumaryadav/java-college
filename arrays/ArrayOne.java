import java.util.Scanner;
public class ArrayOne {

     // user input
    public int userIn()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for numbers Array : ");
        int userInput = sc.nextInt();
        return userInput;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            System.out.println(num);
        }
        
        int[] numbers = new int [5];
        int count = 0;
        ArrayOne arrObj = new ArrayOne();

        while(count < 5)
        {
            // arrObj.userIn();
            numbers[count] = arrObj.userIn();
            count++;
        }

        System.out.println("Enter all elements of numbers array is : ");
        

        for (int el : numbers) {
            System.out.println(el);
        }
        
    }

   
}
