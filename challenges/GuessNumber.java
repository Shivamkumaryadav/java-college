import java.lang.Math;
import java.util.Scanner;
public class GuessNumber{
    public double targetNumber;
    public void generateRandomNumber()
    {
        targetNumber = Math.random();
        System.out.println(Math.floor(targetNumber * 20));
    }

    public void guess()
    {
        System.out.println("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        int inputNum = number;
        if(inputNum > targetNumber)
        {
            System.out.println("Too High.");
        }else if(inputNum < targetNumber)
        {
            System.out.println("Too Low.");
        }
    }

    public void isGameWon()
    {
        if(inputNum == targetNumber)
        {
            System.out.println("Correctly Guessed.");
        }
    }

    public static void main(String[] args)
    {
        GuessNumber guessNum = new GuessNumber();
        // guessNum.generateRandomNumber()
        while(inputNum != targetNumber)
        {
            guessNum.guess();
        }
        guessNum.isGameWon();
    }
}