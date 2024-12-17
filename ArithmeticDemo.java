import java.awt.*;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class ArithmeticDemo {

    public static  void main(String[] args){

        int firstNumber;
        int secondNumber;
        int sum;
        int differance;
        double average;
/*
        float firstNumber;
        float secondNumber;
        float sum;
        float differance;
        float average;
*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1>> ");
        firstNumber = input.nextInt();
        System.out.print("Enter integer 2>> ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        differance = firstNumber - secondNumber;
        average = (double) sum / 2; // casting

        System.out.println(firstNumber + " + " + secondNumber +
                " is equal to " + sum);
        System.out.println(firstNumber + " - " + secondNumber +
                " is equal to " + differance);
        System.out.println("Average of " + firstNumber + " and " + secondNumber +
                " is equal " + average);


    }
}
