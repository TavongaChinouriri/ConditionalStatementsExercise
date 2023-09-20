import java.util.Scanner;
public class Ex4 {
    //Write a Java program to find out the day of the week given
    //the number [1 for Monday, 2 for Tuesday … and so on!]
    public static void main(String[] args) {
        System.out.print("Enter number 1-7 ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1: {
                System.out.println("MONDAY");
                break;
            }
            case 2: {
                System.out.println("TUESDAY");
                break;
            }
            case 3: {
                System.out.println("WEDNESDAY");
                break;
            }
            case 4: {
                System.out.println("THURSDAY");
                break;
            }
            case 5: {
                System.out.println("FRIDAY");
                break;
            }
            case 6: {
                System.out.println("SATURDAY");
                break;
            }
            case 7: {
                System.out.println("SUNDAY");
                break;
            }
            default:{
                System.out.println("Invalid number");}

        }
    }
}

