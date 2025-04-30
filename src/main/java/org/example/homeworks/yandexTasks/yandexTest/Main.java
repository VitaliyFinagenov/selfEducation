package org.example.homeworks.yandexTasks.yandexTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws SymbolException  {
        try (Scanner sc = new Scanner(System.in)) {
            String symbol = sc.nextLine();
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
//            try {
                System.out.println(calculate(symbol, n1, n2));
//            } catch (SymbolException e){
//                System.out.println("неправильный символ");
//            } finally {
//                System.out.println("процесс завершен!");
//            }
        }
    }

    private static int calculate(String symbol, int n1, int n2) throws SymbolException {
        switch (symbol) {
            case "+" -> {return n1 + n2;}
            case "-" -> {return n1 - n2;}
            case "*" -> {return n1 * n2;}
            case "/" -> {return n1 / n2;}
            default -> throw new SymbolException("неправильный символ");
        }
    }
}
