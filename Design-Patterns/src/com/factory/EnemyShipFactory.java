package com.factory;

public class EnemyShipFactory {


    public EnemyShip makeEnemy(String typeOfShip){
        EnemyShip es = null;

        if(typeOfShip.equalsIgnoreCase("R")){
            es = new RocketEnemyShip();
        }else if(typeOfShip.equalsIgnoreCase("U")){
            es = new UFOEnemyShip();
        }
        else if(typeOfShip.equalsIgnoreCase("B")){
            es = new BigUFOEnemyShip();
        }
        return es;
    }


}
