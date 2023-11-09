import java.io.*;
class currency
{
  public static void main(String args[])
  {
    Console con = System.console();
    int ch;
    double am,rs,dl,eu,po,y;
    do
    {
      System.out.println("\n1)Rupees(₨) to Dollar($)");
      System.out.println("2)Dollar($) to Rupees(₨)");
      System.out.println("3)Euros(€) to Rupees(₨)");
      System.out.println("4)Pounds(£) to Rupees(₨)");
      System.out.println("5)Yen(¥) to Rupees(₨)");
      System.out.println("6)Exit");

//Getting Base currency and the target currency//

      System.out.println("\nEnter Your choice:");
      ch=Integer.parseInt(con.readLine());

//Getting the amount to be converted//

      System.out.println("Enter the amount to be converted:");
      am=Integer.parseInt(con.readLine());

//Using switch case for convertion process//

      switch(ch)
      {

//For rupees to dollar//

        case 1:
        {
          rs=am*0.012;
          System.out.println("The currency converted from RUPEES to DOLLAR= "+rs);
          System.out.println("The Currency Rates for this is: +0.03%");
          break;
        }

//For dollar to rupees//

        case 2:
        {
          dl=am*83.04;
          System.out.println("The currency converted from DOLLAR to RUPEES= "+dl);
          System.out.println("The Currency Rates for this is: -0.04%");
          break;
        }

//for euros to rupees//

        case 3:
        {
          eu=am*88.32;
          System.out.println("The currency converted from EUROS to RUPEES= "+eu);
          System.out.println("The Currency Rates for this is: -0.34%");
          break;
        }

//for pounds to rupees//

        case 4:
        {
          po=am*101.44;
          System.out.println("The currency converted from POUNDS to RUPEES= "+po);
          System.out.println("The Currency Rates for this is: -0.30%");
          break;
        }

//for yen to rupees//

        case 5:
        {
          y=am*0.55;
          System.out.println("The currency converted from YEN to RUPEES= "+y);
          System.out.println("The Currency Rates for this is: -0.10%");
          break;
        }

//returning from the process//

        case 6:
        {
          return;
        }
        default:
        {
          System.out.println("You have entered the wrong input");
          break;
        }
      }
    }while(ch!=0);
  }
}