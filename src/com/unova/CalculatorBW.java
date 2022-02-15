package com.unova;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CalculatorBW extends CalculatorBase {
    public void doWork(String[] args) {
        System.out.println("This is my first Calculator program");
        //CMD art

        super.art();

        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'it is currently' hh:mm:ss a zzz");

        System.out.println("\nThe date and time is: " + ft.format(date));

        boolean loop = true;

        double x = 0;
        double y = 0;
        int count = 0;
        double answer = 0;

        List memory = new ArrayList();

        while (loop) {
            System.out.println("\nEnter the operation you would like to do\nValid values are: add, sub, mult, div, or mod ");
            String operation = System.console().readLine();

            if (count == 0) {
                System.out.println("Type your first value here:\nONLY NUMBERS");
                x = Double.parseDouble(System.console().readLine());
                memory.add(x);

                memory.add(operatorSwitch(operation));

                System.out.println("Type your second value here:\nONLY NUMBERS");
                y = Double.parseDouble(System.console().readLine());
                memory.add(y);

                String opValues = "";
                for (int i = 0; i < memory.size(); i++) {
                    opValues = opValues + memory.get(i) + " ";
                }

                answer = getAnswer(x, y, answer, operation);

                System.out.println("The equation is " + opValues);
                System.out.println("The answer is " + answer);

            } else {

                x = answer;

                memory.add(operatorSwitch(operation));

                System.out.println("Type your next value here:\nONLY NUMBERS");
                y = Double.parseDouble(System.console().readLine());
                memory.add(y);


                answer = getAnswer(x, y, answer, operation);

                String opValues = "";
                for (int i = 0; i < memory.size(); i++) {
                    opValues = opValues + memory.get(i) + " ";
                }

                System.out.println("The equation is " + opValues);
                System.out.println("The answer is " + answer);
            }

            System.out.println("Would you like to restart (yes or no)?");
            String reply = System.console().readLine();

            if (reply.equalsIgnoreCase("yes")) {
                count = 0;
                memory = new ArrayList();
            } else {
                System.out.println("Would you like to stop (yes or no)?");
                reply = System.console().readLine();
                if (reply.equalsIgnoreCase("yes")) {
                    System.out.println("Thank you for using Nathans calculator!!");
                    loop = false;
                }
                count++;
            }
        }
    }
}
