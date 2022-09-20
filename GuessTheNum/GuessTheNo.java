import java.util.Scanner;
import java.util.Random;
  public class GuessTheNo {
      public static void main(String[] args) {
          int g=1;
          Random ran = new Random();
          int rand = ran.nextInt(100);

          while(true){
              System.out.println("guess the no: ");
              Scanner sc = new Scanner(System.in);
              int num = sc.nextInt();
              if(num>rand){
                  System.out.println("Guessed Higher: ");
                  g=g+1;
              }
              else if(num<rand){
                  System.out.println("Guessed Lower: ");
                  g=g+1;
              }
              else{
                  System.out.println("you guessed it right in "+g+" attempts");
                  break;
              }
          }
      }
  }