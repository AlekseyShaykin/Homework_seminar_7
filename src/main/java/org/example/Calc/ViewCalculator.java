package org.example.Calc;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {

           String primaryArg = prompt("Введите первый аргумент в форме 2+1i : ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, -) : ");
                if (cmd.equals("*")) {
                    String arg = prompt("Введите второй аргумент в форме 2+1i: ");
                    calculator.multi(arg);
                    break;
                }
                if (cmd.equals("-")) {
                    String arg = prompt("Введите второй аргумент в форме 2+1i: ");
                    calculator.deviation(arg);
//
                    break;
                }
                if (cmd.equals("+")) {
                    String arg = prompt("Введите второй аргумент в форме 2+1i: ");
                    calculator.sum(arg);
//                    continue;
                    break;
                }
//                if (cmd.equals("=")) {
//                    ArrayList<String> result = calculator.getResult();
//
//                    System.out.println("Результат: " + result);
//                    break;
//                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

//    private String promptInt(String message) {
//
//        Scanner in = new Scanner(System.in);
//        System.out.print(message);
//        char[] array = message.toCharArray();
//        return message;
//    }
}
