package gr.aueb.cf.cf9.ch1;


/**
 * Προσθετει δυο ακεραιουσ και εμφανιζει το
 * αποτελεσμα στην κονσολα
 */
public class AddApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 5;
        int num2 = 10;
        int result = 0;

        // Εντολες
        result = num1 + num2 ;

        //  Εκτύπωση αποτελέσματος
        System.out.println("Το αποτελεσμα είναι: " + result);
        System.out.println("Το αθροισμα των: " + num1 + ", " + num2 + " ειναι: " + result);
        System.out.printf("Το αθροισμα των %d, %d ειναι: %d\n", num1, num2, result);

    }

}
