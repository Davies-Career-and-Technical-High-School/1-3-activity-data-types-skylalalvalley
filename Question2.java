import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        System.out.print("What is your name? ");
        name = scan.nextLine();
        System.out.print("Hi " + name + ", what is your age? ");
        age = scan.nextInt();
        System.out.println( name + " is " + age + " years old.");

    }
}