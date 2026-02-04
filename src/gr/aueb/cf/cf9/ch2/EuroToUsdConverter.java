package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;
// οτι ξεκιναει με /** λεγεται Documentation Comments
/**
 * Λαμβανει απο τον χρηστη ενα ποσο (ακεραιος) σε ευρω και το
 * μετατρεπει σε δολαρια ΗΠΑ με βαση μια ισοτιμια.Για παραδειγμα,
 * αν ο χρηστησ δωσει 100 ευρω και η ισοτιμια ειναι 1 Euro = 99 Usa Cents,
 * τοτε τα συνολικα USA cents ειναι 99 και αυτο αντιστοιχει σε 99 Usa Dollars
 * και 0 USA CENTS
 */
public class EuroToUsdConverter {

    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβητων
        Scanner scanner = new Scanner(System.in);
        final int EURO_TO_USD_CONVERSION_RATE = 99;
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        //Data input from the user
        System.out.println("Παρακαλω εισαγετε ενα ποσο σε Ευρω:");
        inputEuros = scanner.nextInt();

        //System.out.println("How many Euros to Convey to Dollars:");

        // Data processing - Expressions
        totalUsaCents = inputEuros * EURO_TO_USD_CONVERSION_RATE;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Data Output
        System.out.printf("%d Euros = %d USD dollars και %d USD Cents\n", inputEuros, usaDollars, usaCents);


    }
}
