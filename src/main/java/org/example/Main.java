package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        chooseOpt();


    }


    public static void chooseOpt() {
        Scanner myKB = new Scanner(System.in);
        System.out.println("choose an algomon\n"
                + "1) firezard\n"
                + "2) Leave program\n");
        int opt = myKB.nextInt();

        do {
            switch (opt) {
                case 1:
                    Firezard fire = new Firezard();
                    fire.turnAction();
                    break;
                case 2:
                    System.out.println("you lef");
                    break;
            }
        } while (opt <= 1 || opt > 2);

    }
}