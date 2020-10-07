import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
      
        /* Write your code here */
        System.out.println("Type a decimal number");
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        System.out.println("Another decimal number");
        double num2 = scan.nextDouble();

        System.out.println(num2 + " " + num1);


    }
}