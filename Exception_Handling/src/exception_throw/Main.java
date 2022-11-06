package exception_throw;

import java.util.Scanner;

public class Main {

    public static void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("You are underage");
        }
        System.out.println("You are of legal age");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}