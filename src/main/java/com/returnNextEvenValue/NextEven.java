package com.returnNextEvenValue;

import java.util.*;

public class NextEven {
    public static void main(String[] args) {

        // Lambda Expression to perform the task : return next even number.
        NextEvenInterface evenNumber= number-> (number % 2 != 0) ? number+1 : number+2 ;

        Scanner input = new Scanner(System.in);

        // Taking input From User
        System.out.println("\n Enter a Number : ");
        long userInput = input.nextLong();

        // Display result.
        System.out.println("Next Even Number from " + userInput + " is : ");
        System.out.println(evenNumber.nextEvenNumber(userInput));
    }
}
