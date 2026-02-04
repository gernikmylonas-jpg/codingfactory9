package gr.aueb.cf.cf9.solutions.ch2;

import java.util.Scanner;

/**
 * Γράψτε ένα πρόγραμμα που διαβάζει
 * από τον χρήστη 3 ακέραιους αριθμούς
 * που αναπαριστούν ημέρα, μήνα, έτος
 * και την εμφανίζει σε μορφή:
 *  ΗΗ/ΜΜ/ΕΕ
 */
public class DateEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = 0;
        int month = 0;
        int year = 0;
        int formattedYear = 0;

        System.out.println("Please write the day:");
        day = scanner.nextInt();
        System.out.println("Please write the month:");
        month = scanner.nextInt();
        System.out.println("Please write the year:");
        year = scanner.nextInt();
        formattedYear = year % 100;

        //System.out.println("The date is: "+day+"/"+month+"/"+formattedYear);
        System.out.printf("%02d/%02d/%2d\n", day, month, formattedYear);
    }
}
