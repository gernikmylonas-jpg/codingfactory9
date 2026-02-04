package gr.aueb.cf.cf9.solutions.ch3;

import java.util.Scanner;

/**
 * Θέλουμε να αναπτύξουμε ένα
 * πρόγραμμα που να αποφαίνεται αν
 * ένα έτος είναι δίσεκτο ή όχι
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 0;
        boolean leapYear;

        System.out.println("Please write year: ");
        year = scanner.nextInt();

        leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (leapYear) {
            System.out.println("The year is leap");
        } else {
            System.out.println("The year is NOT leap");
        }

    }
}
