    /*
    Write a program to find out the type of website from the URL:
.com – commercial website
.org – organization website
.in – Indian website
     */
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        int exit = 0;
        do {
            Scanner user = new Scanner(System.in);
            System.out.println("Enter your Website name:");
            String name = user.nextLine();
            if (name.endsWith(".in")) {
                System.out.println("Your website is an Indian");
            } else if (name.endsWith(".org")) {
                System.out.println("Your website is an Organizational");
            } else if (name.endsWith(".com")) {
                System.out.println("Your website is an Commercial");
            }else if (name.endsWith(".zw")) {
                System.out.println("Your website is from Zimbabwe");
            }else if (name.endsWith(".uk")) {
                System.out.println("Your website is from the UK");
            }
            exit++;
        }
        while (exit != 5);
    }

}