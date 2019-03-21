import java.util.Scanner;

public class driver
{
    public static void main (String[] args)
    {
        String theirPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password.");
        theirPassword = input.nextLine();

        if (Password_Verifier.validPassword(theirPassword))
            System.out.println("Your password is valid!");
        else
            System.out.println("Your password is invalid. Please try again.");
    }
}
