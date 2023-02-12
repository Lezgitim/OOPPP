package org.example;

public class Service extends View {

    protected static int resultat;

    /**
     * S: Single Responsibility Principle (Принцип единственной ответственности).
     * Перенес операции по подсчету с класса View.
     */
    public static void Calc() {
        if (operator.equals("+")) {
            resultat = a + b;
            System.out.println(a + operator + b + "=" + resultat);
        } else if (operator.equals("-")) {
            resultat = a - b;
            System.out.println(a + operator + b + "=" + resultat);
        } else if (operator.equals("*")) {
            resultat = a * b;
            System.out.println(a + operator + b + "=" + resultat);
        } else if (operator.equals("/")) {
            resultat = a / b;
            System.out.println(a + operator + b + "=" + resultat);
        }

    }
}
