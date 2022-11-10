import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] args) {

        //
        System.out.println("What is the Secret number?");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int secretNumber = scan.nextInt();

        System.out.print("The number entered is:");



        if (secretNumber < 5) {
            System.out.println("Too low");
        } else if (secretNumber == 5) {
            System.out.println("Well done! that's the correct answer.");

        } if (secretNumber > 5) {
            System.out.println("Too high");
        }
    }
}
