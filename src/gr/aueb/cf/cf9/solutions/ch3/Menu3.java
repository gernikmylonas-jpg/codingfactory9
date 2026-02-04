package gr.aueb.cf.cf9.solutions.ch3;

import java.util.Scanner;

/**
 * Εμφανίστε επαναληπτικά ένα μενού με τις παρακάτω
 * επιλογές, το οποίο να επαναλαμβάνεται μέχρι ο χρήστης να
 * δώσει τον αριθμό 5. Για κάθε επιλογή από 1 – 4 θα πρέπει
 * να εμφανίζεται feedback, για παράδειγμα αν ο χρήστης
 * δώσει 1, θα εμφανίζεται το μήνυμα “Επιλέξατε Εισαγωγή».
 * Θα πρέπει επίσης να ελέγχετε αν ο χρήστης δώσει αριθμό
 * < 1 ή > 5 και να δίνετε κατάλληλο μήνυμα.
 */
public class Menu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selection = 0;

        while (true) {
            System.out.println("1. Εισαγωγή\n" + "2. Διαγραφή\n" + "3. Ενημέρωση\n" + "4. Αναζήτηση\n" + "5. Έξοδος\n");
            selection = scanner.nextInt();
            if (selection < 1 || selection > 5) {
                System.out.println("Παρακαλώ διαλέξτε έναν αριθμό απο το 1 εώς το 5");
                continue;
            } else if (selection == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (selection == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (selection == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (selection == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (selection == 5) {
                break;

            }


        }
    }
}
