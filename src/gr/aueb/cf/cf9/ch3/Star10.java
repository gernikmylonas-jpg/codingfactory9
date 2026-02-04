package gr.aueb.cf.cf9.ch3;

/**
 * Prints 10 horizontal stars.
 */
public class Star10 {

    public static void main(String[] args) {
        int i = 1;
        int j = 10;

        while(i <= 10) {
            System.out.printf("*");
            i++;
        }

        while( j >= 10) {
            System.out.printf("*");
            j--;
        }

    }
}
