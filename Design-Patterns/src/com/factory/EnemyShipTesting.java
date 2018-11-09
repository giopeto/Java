package com.factory;

import java.util.Scanner;


public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip es = null;
        Scanner userInput = new Scanner(System.in);
        System.out.print("What type of ship? (U / R / B)");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            System.out.println(typeOfShip);
            es = shipFactory.makeEnemy(typeOfShip);
            if(es!=null){
                doStuff(es);
            }else{
                System.out.println(typeOfShip + " doesn't exists.");
            }
        }

    }

    private static void doStuff(EnemyShip es) {
        es.displayEnemyShip();
        es.followHeroShip();
        es.enemyShipShoots();
    }

}
