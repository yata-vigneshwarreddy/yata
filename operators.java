package practical;
import java.util.Scanner;
public class operators {

  public static void main(String args[]) {
    int a,b;
    Scanner S = new Scanner(System.in); 
      a = S.nextInt();
      System.out.println("enter a number");
      b = S.nextInt();
        System.out.println("Enter another number");
        
    System.out.println("a + b = " + (a + b));

     
      System.out.println("a - b = " + (a - b));

     
      System.out.println("a * b = " + (a * b));

     
      System.out.println("a / b = " + (a / b));

     
      System.out.println("a % b = " + (a % b));
    }
  }