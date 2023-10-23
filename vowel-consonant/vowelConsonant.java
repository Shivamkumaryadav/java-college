import java.util.Scanner;
public class vowelConsonant{
    public static void main(String[] args)
    {
        char vowel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        vowel = sc.next().charAt(0);

        // checking vowel or constant
        if(vowel == 'a' || vowel == 'e' ||  vowel == 'i' ||  vowel == 'o' ||  vowel == 'u')
        {
            System.out.println("The character is Vowel.");
        }else{
            System.out.println("The character is Constant.");
        }
    }
}
