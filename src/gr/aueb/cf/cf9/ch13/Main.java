package gr.aueb.cf.cf9.ch13;

public class Main {

    public static void main(String[] args) {
        HelloUti.sayHello();
        OnlyOneCodingFactory onlyOneCodingFactory1 = OnlyOneCodingFactory.getInstance();
        OnlyOneCodingFactory onlyOneCodingFactory2 = OnlyOneCodingFactory.getInstance();

        OnlyOneCodingLazy onlyOneCodingLazy1 = OnlyOneCodingLazy.getInstance();
        OnlyOneCodingLazy onlyOneCodingLazy2 = OnlyOneCodingLazy.getInstance();

    }
}
