package gr.aueb.cf.cf9.solutions.ch7;

public class CryptoDe {

    public static void main(String[] args) {
        String str ="xyz";
        System.out.println(encrypt(str));

    }

    public static String encrypt(String str){
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            encrypted.append((char)(str.charAt(i)+1));
        }
        return encrypted.toString();
    }

    public static String decrypt(String str){
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            decrypted.append((char)(str.charAt(i)-1));
        }
        return decrypted.toString();
    }
}
