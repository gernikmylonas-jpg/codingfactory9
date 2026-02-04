package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγει ενα ακεραιοπου συμβολιζει μια
 * θερμοκρασια. Κια το προγραμμαυπολογιζει αν η θερμοκρασια < 0
 * τοτε μια μεταβλητηγινεται true,
 * αλλιως γινεται false
 */
public class TemperatureApp {

    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        //Εισαγωγη Δεδομενων
        System.out.println("Παρακαλω εισαγεται μια θερμοκρασια");
        temperature = scanner.nextInt();

        //Επεξεργασια των Δεδομενων
        isTempBelowZero = temperature < 0;

        //Εκτυπωση των αποτελεσματων
        System.out.println("Η θερμοκρασια ειναι μικροτερη απο 0: ");
    }
}
