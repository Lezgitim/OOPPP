package org.example;

import java.util.Scanner;


public class View {

    protected static int a;
    protected static int b;
    protected static String operator;




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

    }


}
