package gr.aueb.cf.cf9.solutions.ch13;

public class StringUtils {

    private StringUtils() {
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String uppercase(String str) {
        return str.toUpperCase();
    }

    public static boolean isPalidrome(String str) {
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}

//public class StringUtil {
//
//    public static boolean isPalindrome(String str) {
//        return str.contentEquals(new StringBuilder(str).reverse());
//    }
//
//    public static String reverse(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
//
//    public static String capitalize(String str) {
//        return str.substring(0, 1).toUpperCase() + str.substring(1);
//    }
//}