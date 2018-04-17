package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        switchStatement();
        
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

            case 3:case 4:case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }
    }
}
