import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        //Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33%
        // in each subject to pass. Assume 3 subjects and take marks as input from the user.
        Scanner user = new Scanner(System.in);
        int pass = 0;
        System.out.println("Enter mark for subject 1");
        double mark1 = user.nextDouble();
        System.out.println("Enter mark for subject 2");
        double mark2 = user.nextDouble();
        System.out.println("Enter mark for subject 3");
        double mark3 = user.nextDouble();
        if (mark1 >= 33 && mark1 <= 40) {
            ++pass;
        }
        if (mark2 >= 33 && mark2 <= 40) {
            ++pass;
        }
        if (mark3 >= 33 && mark3 <= 40) {
            ++pass;
        }
        if (pass != 3) {
            System.out.println("Student Failed");
        } else {
            System.out.println("Student Passed");
        }
    }}
