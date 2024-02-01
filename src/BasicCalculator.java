import java.util.Scanner;
public class BasicCalculator {



    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Choose operation,(+,-,*,/): ");
        char operation = scanner.next().charAt(0);

        //switch statement for operation chosen
        switch(operation){
            case '+':
                System.out.println("num1 + num2: " + (num1+num2));
                break;
            case '-':
                System.out.println("num1 - num2: " + (num1-num2));
                break;
            case '*':
                System.out.println("num1 * num2: " + (num1*num2));
                break;
            case '/':
                System.out.println("num1 / num2: " + (num1/num2));
                break;
            default:
                System.out.println("Invalid operator chosen!");
        }
        scanner.close();

    }
}
