import java.util.Scanner;
public class Ex5 {
    //Write a Java program to find whether a year entered by the user is a leap year or not
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter year ");
        int year = user.nextInt();
        if ((year%4)!=0){
            System.out.println("Year is not leap");}
        else {
            System.out.println("Year is leap");}
    }
}
