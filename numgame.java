import java.io.*;
class numgame
{
  public static void main(String args[])
  {
    Console con=System.console();
    int i,k,n=5;

//Declaring the number which is to be guessed//

    final int NUM=45;
    con.printf("\n\t\t\t\tWelcome to the 'Number Guessing Game'\nHere is the rule for the game:You are allowed to guess the number only for 5 times\nLet's go and enjoy the game");
    for(i=0;i<n;i++)
    {

//Getting number to be checked//

      con.printf("\n\nEnter any number to be checked:");
      k=Integer.parseInt(con.readLine());

//Checking whether the given number matches with the input number//

      if(k==NUM)
      {
        System.out.println("\t\t\t\tCongratulations!!!You won the game!!!\nYou guessed the number in "+(i+1)+" trial");
        break;
      }
      else if(k<=NUM)
      {
        System.out.println("TRY AGAIN!!!  You are too low to guess the correct number\nAlert:You have "+(n-i-1)+" trials");
      } 
      else if(k>=NUM)
      {
        System.out.println("TRY AGAIN!!!  You are too high to guess the correct number\nAlert:You have "+(n-i-1)+" trials");
      }
      else
      {
          System.out.println("SORRY!!!   You have entered invalid number"); 
      }
    }

//Awarding scores with respect to trials//

    System.out.println("You have scored "+((6-i-1)*10)+" out of 50");
    if(i==n)
    {
        System.out.println("And the correct number to be guessed is:  "+NUM);
    }
  }
}