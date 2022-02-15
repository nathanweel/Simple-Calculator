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
        System.out.println(" __  __  ______  ______  __  __  ______  __  __         __         ____    ______  ____      \n" + "/\\ \\/\\ \\/\\  _  \\/\\__  _\\/\\ \\/\\ \\/\\  _  \\/\\ \\/\\ \\       /\\ \\       /\\  _`\\ /\\  _  \\/\\  _`\\    \n" + "\\ \\ `\\\\ \\ \\ \\L\\ \\/_/\\ \\/\\ \\ \\_\\ \\ \\ \\L\\ \\ \\ `\\\\ \\      \\_\\ \\___   \\ \\ \\/\\ \\ \\ \\L\\ \\ \\ \\/\\ \\  \n" + " \\ \\ , ` \\ \\  __ \\ \\ \\ \\ \\ \\  _  \\ \\  __ \\ \\ , ` \\    /\\___  __\\   \\ \\ \\ \\ \\ \\  __ \\ \\ \\ \\ \\ \n" + "  \\ \\ \\`\\ \\ \\ \\/\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\/\\ \\ \\ \\`\\ \\   \\/__/\\ \\_/    \\ \\ \\_\\ \\ \\ \\/\\ \\ \\ \\_\\ \\\n" + "   \\ \\_\\ \\_\\ \\_\\ \\_\\ \\ \\_\\ \\ \\_\\ \\_\\ \\_\\ \\_\\ \\_\\ \\_\\      \\ \\_\\      \\ \\____/\\ \\_\\ \\_\\ \\____/\n" + "    \\/_/\\/_/\\/_/\\/_/  \\/_/  \\/_/\\/_/\\/_/\\/_/\\/_/\\/_/       \\/_/       \\/___/  \\/_/\\/_/\\/___/ \n");
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



