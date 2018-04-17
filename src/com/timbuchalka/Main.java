package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        switchStatement();
//        forStatement();
        whileDoWhile();
    }

    public static void switchStatement() {
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }
    }

    public static void forStatement() {
        System.out.println(calculateInterest(10000.0, 2.0));

        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void whileDoWhile() {
        int count = 1;
        while (count != 6) {
            System.out.println("count value is " + count);
            count++;
        }
        count = 6;
        do {
            System.out.println("count value was " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while (count != 6);
    }
}
