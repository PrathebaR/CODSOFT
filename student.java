import java.io.*;
class student
{
  public static void main(String args[])
  {
    Console con=System.console();
    String name;
    int i,n;
    double m1,m2,m3,tot,avg;

//Getting number of students for grade calculation//

    con.printf("\nEnter number of students:");
    n=Integer.parseInt(con.readLine());
    for(i=1;i<=n;i++)
    {
      con.printf("\nEnter Name of student "+i+ " : ");
      name=con.readLine();

     //Gettng Student's marks//

      System.out.println("Enter mark1 of student "+i+" : ");
      m1=Double.parseDouble(con.readLine());
      System.out.println("Enter mark2 of student "+i+" : ");
      m2=Double.parseDouble(con.readLine());
      System.out.println("Enter mark3 of student "+i+" ; ");
      m3=Double.parseDouble(con.readLine());
 
     //Finding TOTAL marks scored by the student//

      tot=m1+m2+m3;
      System.out.println("\nTotal Marks scored by the student:"+tot);

     //Finding AVERAGE percentage secured by the student//

      avg=tot/3;
      System.out.println("\nAverage Percentage scored by the student:"+avg);

     //Student's Grade based on their corresponding average percentage//

      if(avg>=85)
      {
        System.out.println("\nGrade : A+");
      }
      else if(avg>=75)
      {
        System.out.println("\nGrade : A");
      }
      else if(avg>=65)
      {
        System.out.println("\nGrade : B");
      }
      else if(avg>=55)
      {
        System.out.println("\nGrade : C");
      }
      else if(avg>=45)
      {
       System.out.println("\nGrade : D");
       }
      else
      {
        System.out.println("\nGrade : Fail");
      }
    }
  }
}
