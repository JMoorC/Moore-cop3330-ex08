/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("How many people? ");
        int numPeople = inScan.nextInt();
        System.out.print("How many pizzas do you have? ");
        int numPizza = inScan.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicesPer = inScan.nextInt();
        int numSlices = numPizza * slicesPer;

        System.out.printf(
                "%d people with %d pizzas (%d slices)\n" +
                "Each person gets %d pieces of pizza.\n" +
                "There are %d leftover pieces",
                numPeople, numPizza, numSlices,
                numSlices/numPeople,
                numSlices%numPeople);

    }
}
