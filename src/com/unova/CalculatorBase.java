package com.unova;

public class CalculatorBase implements ICalculator {

    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public double mult(double x, double y) {
        return x * y;
    }

    @Override
    public double div(double x, double y) {
        return x / y;
    }

    @Override
    public double mod(double x, double y) {
        return x % y;
    }

    public void art() {
        System.out.println("__    __ ____  _     ____  ____  __  __  ____                                                                      \n" +
                "\\ \\/\\/ /| ===|| |__ / (__`/ () \\|  \\/  || ===|                                                                     \n" +
                " \\_/\\_/ |____||____|\\____)\\____/|_|\\/|_||____|                                                                     \n" +
                " __  __   ____   ____  ____    _____ __  __    __  _   ____  _____  _   _   ____   __  _ __    __ ____  ____  _    \n" +
                "|  \\/  | / () \\ | _) \\| ===|   | () )\\ \\/ /   |  \\| | / () \\|_   _|| |_| | / () \\ |  \\| |\\ \\/\\/ /| ===|| ===|| |__ \n" +
                "|_|\\/|_|/__/\\__\\|____/|____|   |_()_) |__|    |_|\\__|/__/\\__\\ |_|  |_| |_|/__/\\__\\|_|\\__| \\_/\\_/ |____||____||____|");
    }

    public String operatorSwitch(String operation) {
        switch (operation) {
            case "add":
                return "+";

            case "sub":
                return "-";

            case "mult":
                return "*";

            case "div":
                return "/";

            case "mod":
                return "%";

            default:
                System.out.println("invalid operation");

        }
        return null;
    }

    public double getAnswer(double x, double y, double answer, String operation) {
        if (operation.equalsIgnoreCase("add")) {
            answer = add(x, y);
        } else if (operation.equalsIgnoreCase("sub")) {
            answer = sub(x, y);
        } else if (operation.equalsIgnoreCase("mult")) {
            answer = mult(x, y);
        } else if (operation.equalsIgnoreCase("div")) {
            answer = div(x, y);
        } else if (operation.equalsIgnoreCase("mod")) {
            answer = mod(x, y);
        } else {
            System.out.println("This operation does not exist");
        }
        return answer;
    }
}



