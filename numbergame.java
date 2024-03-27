import java.util.*;
public class numbergame
{
    public static void main(String args[])
    {
        System.out.println("Welcome to Task 1: Number Game of CodSoft JAVA Programming Internship: \nRules of this game are as follows:");
        System.out.println("1)You have select a difficulty. \n Easy:15 attempts \n Medium:10 attempts \n Hard:5 attempts");
        System.out.println("2)You have to guess the correct number between 0 to 100");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println();
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        int Continue = 0;
        int Number_of_Rounds = 0;
        int result_score = 0;
        int win_counter = 0;
        do
        {
            Number_of_Rounds++;
            int no = rand.nextInt(101);
            System.out.println("Enter Difficulty:");
            System.out.println("1)Easy \n2)Medium \n3)Hard");
            int choice_of_difficulty = sc.nextInt();
            int n = 0;
            int c = 0;
            int score = 100;
            switch(choice_of_difficulty)
            {
                case 1:
                    n = 15;
                    System.out.println("Selected Difficulty is Easy");
                    break;
                case 2:
                    n = 10;
                    System.out.println("Selected Difficulty is Medium");
                    break;
                case 3:
                    n = 5;
                    System.out.println("Selected Difficulty is Hard");
                    break;
            }
            System.out.println("Guess the number:");
            int num = 0;      
            for(int i = 0; i<n; i++)
            {
                num = sc.nextInt();
                if(num==no)
                {
                    c++;
                    win_counter++;
                    System.out.println("Correct!");
                    score +=10;
                    break;
                }
                else if(Math.abs(num-no)<=5)
                {
                    score -= 2;
                    System.out.println("Close!");            
                }
                else if((no-num)>5 && (no-num)<=20)
                {
                    score -=5;
                    System.out.println("Low!");
                }
                else if((no-num)>20)
                {
                    score -=7;
                    System.out.println("Too Low!");
                }
                else if((num-no)>5 && (num-no)<20)
                {
                    score -=5;
                    System.out.println("High!");
                }
                else
                {
                    score -=7;
                    System.out.println("Too High!");
                }
            }
            System.out.print("\u000C");
            if(c>0)
                System.out.println("You won this Round! \nYour Score is " + score);
            else
            {
                score = 0;
                System.out.println("You have lost this Round. Try Again! \nYour Score is " + score);
            }
            result_score += score;
            System.out.println("To play again, Press 1. \nTo exit, Press any other number.");
            Continue = sc.nextInt();
            System.out.print("\u000C");
        }while(Continue==1);
        System.out.println("PLAYER NAME : " + name);
        System.out.println("NO OF ROUNDS : " + Number_of_Rounds);
        System.out.println("NO OF ROUNDS WON : " + win_counter);
        System.out.println("TOTAL SCORE : " + result_score);
    }
}
