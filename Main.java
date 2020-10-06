import java.util.Scanner;
/**
 * a program thats counts from 1 to a user entered number in a single line
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a positive integer
    System.out.println("Please enter a positive integer");
    int n = input.nextInt();

    // create a for loop
    for(int count = 1; count <= n; count++){
      // make it so the last number doesnt have a comma
      if(count < n){
        System.out.print(count + ",");
      } else {
        System.out.print(count);
      }
    }
    
  }
}
