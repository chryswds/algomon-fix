package org.example;

import java.util.Scanner;

public class Firezard implements Habilities{

    private Types type;
    private Actions action;

    public Firezard(Types type, Actions action) {
        this.type = type;
        this.action = action;
    }

    public Firezard(){

    }

    public Types getType() {
        return type;
    }

    public Actions getAction() {
        return action;
    }

    @Override
    public String attack(){
        return "Im using my fire attack";
    }

    @Override
    public String defend(){
        return "Im using my fire defend";
    }

    @Override
    public String heal(){
        return "Im using my fire heal";
    }


    public void turnAction() {

        Scanner myKB = new Scanner(System.in);
        System.out.println("choose an action\n"
        + "1) Attack\n"
        + "2) Defend\n"
        + "3) Heal\n");

        Actions action = null;
        int actionChoice = myKB.nextInt();
        switch(actionChoice){
            case 1:
                action = Actions.OFFENSIVE;
                System.out.println(attack());
                break;
            case 2:
                action = Actions.DEFENSIVE;
                System.out.println(defend());
                break;
            case 3:
                action = Actions.HEALING;
                System.out.println(heal());
                break;
            default:
                System.out.println("Choose a valid action");
        }




    }
    }





