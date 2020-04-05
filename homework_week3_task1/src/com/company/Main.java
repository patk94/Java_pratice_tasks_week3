package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TASK 1
	    boolean p = false;
	    boolean q = false;

        System.out.println("p\t\tq\t\tpANDq\tpORq\tpXORq\tNOTp");
        System.out.println(p + "\t"+ q + "\t" + (p&&q) + "\t" + (p||q) + "\t" + (p^q)+ "\t" + (!p));
        p = true;
        System.out.println(p + "\t"+ q + "\t" + (p&&q) + "\t" + (p||q) + "\t" + (p^q)+ "\t" + (!p));
        p = false;
        q = true;
        System.out.println(p + "\t"+ q + "\t" + (p&&q) + "\t" + (p||q) + "\t" + (p^q)+ "\t" + (!p));
        p = true;
        q = true;
        System.out.println(p + "\t"+ q + "\t" + (p&&q) + "\t" + (p||q) + "\t" + (p^q)+ "\t" + (!p));

        //TASK 2
        double ratio = 4.58;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value in euro currency");
        double euro = scanner.nextDouble();
        double pln = euro/ratio;
        System.out.println(euro + "EUR" + " = " + pln + "PLN");

        //TASK 3
        int win_val = 7;
        while(true) {
            System.out.println("Please guess integer number from 1 to 10 (Enter number below, to stop enter 0)");
            int val = scanner.nextInt();
            if (val == 0){break;}
            if ((val < 1 || val > 10) && val != 0) {
                System.out.println("Value is not in game range 1...10");
            } else {
                if (val == win_val) {
                    System.out.println("Correct!!!");
                    break;
                } else {
                    System.out.println("Not correct. Try again.");
                }
            }
        }
    }
}
