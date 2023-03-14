package arithmeticoperators;

import java.util.Scanner;

public class Equalclass {

    public static void main(String[] args) {

        //Write a program that takes three integers as input
        // and checks if any two of them are equal. Print
        // "Two of the numbers are equal" if any two of the numbers
        // are equal, and "None of the numbers are equal" if none
        // of the numbers are equal.

        int car1 = 5;

        int car2 = 7;

        int car3 = 5;


        if (car1 == car2 || car1 == car3 || car2 == car3) {
            System.out.println("Two of the numbers are equal");

        } else {
            System.out.println("None of the numbers are equal");
        }

        //Write a program that takes an integer as input and checks
        // if it is a multiple of 3 or 5. Print "Multiple of 3 or 5"
        // if the number is a multiple of 3 or 5, and "Not a multiple
        // of 3 or 5" if the number is not a multiple of 3 or 5.


        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");

        int number = input.nextInt();

        if (number % 3 == 0 || number % 5 == 0) {

            System.out.println("Multiple of 3 or 5");
        } else {
            System.out.println("Not a multiple");

            input.close();
        }
        //========================================

        //Write a program that takes two integers as input and
        // checks if their sum is even or odd. Print "Even" if
        // the sum is even, and "Odd" if the sum is


        Scanner program = new Scanner(System.in);
        System.out.println("Enter the first integer");
        byte numb4 = program.nextByte();
        System.out.println("enter the second integer");
        byte numb5 = program.nextByte();
        byte sum = (byte) (numb4 + numb5);

        if (sum % 2 == 0) {
            System.out.println("Even ");
        } else {
            System.out.println("odd");


        }

        //Write a program that takes an integer as input and
        // checks if it is a prime number or not. A number is prime
        // if it is only divisible by 1 and itself. Print "Prime" if the number
        // is prime, and "Not prime" if the number is not prime.



        Scanner Sr = new Scanner(System.in);
        System.out.println("Enter a number ");
        int Pr= Sr.nextInt();


        if (Pr >1){
            boolean IsPrime = true;
            if (Pr > 1) {
                boolean isPrime = true;
                for (int i = 2; i < Pr; i++) {
                    if (Pr % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(Pr+ " is a prime number");
                } else {
                    System.out.println(Pr + " is not a prime number");
                }
            } else {
                System.out.println(Pr + " is not a prime number");
            }
        }
        }

        }



















