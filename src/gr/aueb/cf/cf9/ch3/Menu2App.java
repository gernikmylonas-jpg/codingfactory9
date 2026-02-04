package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφασνιζει ενα μενοθ επιλογων μεχρι  οχρσητης να
 * επιλεξει'Exit' (number 3)
 */
public class Menu2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice  = 0;

        while (true) {
            System.out.println("Παρακαλω επιλεξετε ενα απο τα παρακατω");
            System.out.println("1. Εισαγωγη αιτησης");
            System.out.println("2.Διαγραφη αιτησης");
            System.out.println("3. Εξοδος");
            choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }

        }

        System.out.println("Thanks for using the program");
    }
}
