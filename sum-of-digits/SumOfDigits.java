public class SumOfDigits{
    public static void main(String[] args)
    {
        int num = 123;
        int res;
        int sum = 0;
        while(num > 0)
        {
            res = num % 10;//3
            sum += res;
            num = num / 10;
        }
        System.out.println(sum);
    }
}