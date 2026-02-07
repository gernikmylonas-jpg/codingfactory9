package gr.aueb.cf.cf9.solutions.ch11;

public class Main {

    public static void main(String[] args) {

        User stella = new User(2, "Stella","Makri");

        System.out.println("{"+ stella.getId() + ", " + stella.getFirstname() + ", "
        + stella.getLastname() + "}");
    }

}

