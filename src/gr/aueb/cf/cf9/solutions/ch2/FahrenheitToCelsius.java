package gr.aueb.cf.cf9.solutions.ch2;

import java.util.Scanner;

/**
 *  Θέλουμε να αναπτύξουμε ένα πρόγραμμα που να
 * μετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ
 * (Fahrenheit) στην κλίμακα Κελσίου.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fahrenheit;

        System.out.println("Εισαγετε την θερμοκρασια σε Fahrenheit: ");
        fahrenheit = scanner.nextInt();
        int celsius = 5*(fahrenheit-32)/9;
        System.out.println("Η θερμοκρασια σε Celsius ειναι: " + celsius);



    }

}
