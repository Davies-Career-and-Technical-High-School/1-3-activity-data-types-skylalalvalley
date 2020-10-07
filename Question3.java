import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        boolean ans1;
        boolean ans2;
        boolean ans3;
        System.out.println("Java is a programming language, true or false? ");
        ans1 = scan.nextBoolean();
        System.out.println("Only numbers can be stored by variables in Java, true or false?");
        ans2 = scan.nextBoolean();
        System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
        ans3 = scan.nextBoolean();
        System.out.println("Question 1 - Your answer: " + ans1 + " Correct answer: true");
        System.out.println("Question 2 - Your answer: " + ans2 + " Correct answer: false");
        System.out.println("Question 3 - Your answer: " + ans3 + " Correct answer: true");

    }
}