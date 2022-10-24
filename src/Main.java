import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter Operator from this : + or -");
        char operator = input.next().charAt(0);
        if(operator == '-') {
            Subtraction sub = new Subtraction();
            System.out.println("Please enter first number : ");
            int x = input.nextInt();
            System.out.println("please enter second nymber : ");
            int y = input.nextInt();
            System.out.println("Result = " + sub.sub(x, y));
        } else if (operator == '+') {

            Sum sum = new Sum();
            System.out.println("Please enter first number : ");
            int x = input.nextInt();
            System.out.println("please enter second nymber : ");
            int y = input.nextInt();
            System.out.println("Result = "+sum.add(x,y));

        }




    }
}