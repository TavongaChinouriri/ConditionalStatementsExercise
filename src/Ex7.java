import java.util.Scanner;
import java.security.SecureRandom;
// SecureRandom is a java class that randomly select numbers from a given criteria.
// In this case, it will select the three moves of the opponent, which is the system
public class Ex7 { //Create a simple Rock, Paper Scissors game
    public static void main(String[] args) {
        System.out.println("This is Tav's Rock, Paper and Scissors Program run by Java :)");
        int exit = 0; //variable that determines number of trials that you can have
     do {
        System.out.println("Enter SCI for Scissors, PP for Paper & RCK for Rock");
        Scanner user = new Scanner(System.in);
        String MyMove = user.next();
        SecureRandom rand = new SecureRandom();
        int opponent = 3; //This variable contains the criteria for the random numbers that will be chosen i.e 0 to 2
        int v = rand.nextInt(opponent);//a method from the SecureRandom Class that will pick values from opponent variable

            if (MyMove.equals("SCI") || MyMove.equals("RCK") || MyMove.equals("PP")) {
             if (v == 0 && MyMove.equals("RCK")) {
                 System.out.println("Rock, its a tie! :)");
             } else if (v == 0 && MyMove.equals("SCI")) {
                 System.out.println("Rock, You've lost");
             } else if (v == 0 && MyMove.equals("PP")) {
                 System.out.println("Rock, You've won");
             } else if (v == 1 && MyMove.equals("RCK")) {
                 System.out.println("Paper, you've lost");
             } else if (v == 1 && MyMove.equals("SCI")) {
                 System.out.println("Paper, You've won");
             } else if (v == 1 && MyMove.equals("PP")) {
                 System.out.println("Paper, its a tie! :)");
             } else if (v == 2 && MyMove.equals("RCK")) {
                 System.out.println("Scissors, you've won");
             } else if (v == 2 && MyMove.equals("SCI")) {
                 System.out.println("Scissors, its a tie :)");
             } else if (v == 2 && MyMove.equals("PP")) {
                 System.out.println("Scissors, you've won :)");
             } else {
                 System.out.println("");
             }

         } else {
             System.out.println("Invalid input");
         }
         exit++;
     }
     while (exit != 7);
    }
}