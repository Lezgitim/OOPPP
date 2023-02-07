package org.example;

import java.util.Scanner;


public class View {

    private static int a;
    private static int b;
    private static String operator;
    private static int resultat;

    public static void getMenu() {
        System.out.println("Калькулятор");
        System.out.println("Введите первую цифру:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Введите оператор(+,-,*,/):");
        Scanner scanner2 = new Scanner(System.in);
        operator = scanner2.nextLine();
        System.out.println("Введите вторую цифру:");
        b = scanner.nextInt();

        if (operator.equals("+")) {
            resultat = a + b;
            System.out.println(a + operator + b + "=" + resultat);
        }
        else if (operator.equals("-")) {
            resultat = a - b;
            System.out.println(a + operator + b + "=" + resultat);
        }
        else if (operator.equals("*")) {
            resultat = a * b;
            System.out.println(a + operator + b + "=" + resultat);
        }
        else if (operator.equals("/")) {
            resultat = a / b;
            System.out.println(a + operator + b + "=" + resultat);
        }
    }

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static String getOperator() {
        return operator;
    }

    public static int getResultat() {
        return resultat;
    }

    public View() {
    }
}
