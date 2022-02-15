package com.unova;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CalculatorNW extends CalculatorBase {

    public void doWork(String[] args) {
        System.out.println("This is my first Calculator program");

        System.out.println("\nThe original Calculator program by Nathan Weel");

        //CMD art
        super.art();

        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E MM-dd-yyyy 'it is currently' hh:mm a zzz");

        System.out.println("\n" + ft.format(date));

        boolean loop = true;

        List memory = new ArrayList();

        while (loop) {
            double answer = 0;

            System.out.println("\nEnter the operation you would like to do\nValid values are: add, sub, mult, div, or mod ");
            String operation = System.console().readLine();

            System.out.println("Type your first value here:\nONLY NUMBERS");
            double x = Double.parseDouble(System.console().readLine());
            memory.add(x);

            memory.add(operatorSwitch(operation));

            System.out.println("Type your second value here:\nONLY NUMBERS");
            double y = Double.parseDouble(System.console().readLine());
            memory.add(y);

            answer = getAnswer(x, y, answer, operation);

            String opValues = "";
            for (int i = 0; i < memory.size(); i++) {
                opValues = opValues + memory.get(i) + " ";
            }

            System.out.println("\nThe equation is " + opValues);
            System.out.println("The answer is " + answer);

            System.out.println("\nWould you like to restart?\nValid answers are yes or no");
            String reply = System.console().readLine();

            loop = reply.equalsIgnoreCase("yes");

            if (reply.equalsIgnoreCase("no")) {
                System.out.println("Would you like to continue with existing numbers?\nValid answers are yes or no");
                String replyLoop = System.console().readLine();
                //Nested
                if (replyLoop.equalsIgnoreCase("yes")) {
                    System.out.println("Put your next operation here");
                    operation = System.console().readLine();
                    memory.add(operatorSwitch(operation));

                    x = answer;

                    System.out.println("Type your next value here\nONLY NUMBERS");
                    y = Double.parseDouble(System.console().readLine());
                    memory.add(y);

                    answer = getAnswer(x, y, answer, operation);

                    opValues = "";
                    for (int i = 0; i < memory.size(); i++) {
                        opValues = opValues + memory.get(i) + " ";
                    }

                    System.out.println("Your equation is " + opValues);
                    System.out.println("Your second answer is " + answer);

                }
            }
        }
    }
}
