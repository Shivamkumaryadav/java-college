public class ReverseNumber{
    public static void main(String[] args)
    {
        int num = 123;
        int temp = num;
        int res;
        int rev = 0;
        
        while(num > 0)
        {
            res = num % 10;//3
            rev = rev * 10 + res ;//30 //
            num = num / 10;
        }
        System.out.println("The reverse no of " + temp + " is = " + rev);
    }
}