import java.util.Scanner;
class Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int userNumber=0;
        int myNumber = (int)(Math.random()*100);
        do
        {
            System.out.print("Guess my number between 1-100: ");
            userNumber = sc.nextInt();
            if(myNumber>userNumber)
            {
                System.out.println("Too small");
            }
            else if(myNumber==userNumber)
            {
                System.out.println("Correct");
                break;
            }
            else
            {
                System.out.println("Too large");
            }
        }
        while(userNumber>=0);
        {
            System.out.print("The correct number is: "+myNumber);
        }
    }
}