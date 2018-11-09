package designpattern;

public class Abstract {

    public static void main(String[] args) {
        RealRoom bigRoom = new BigRoomFactory();
        bigRoom.createRooms().createRoom();
        bigRoom.createFurniture().addFurniture();

        RealRoom smallRoom = new SmallRoomFactory();
        smallRoom.createRooms().createRoom();
        smallRoom.createFurniture().addFurniture();
    }
}

/* Rooms */
interface Rooms {

    public void createRoom();
}

class Blueroom implements Rooms {

    @Override
    public void createRoom() {
        System.out.println("Create blue room");
    }
}

class Redroom implements Rooms {

    @Override
    public void createRoom() {
        System.out.println("Create red room");
    }
}

/* Furniture */
interface Furniture {

    public void addFurniture();
}

class TwoChairsFurniture implements Furniture {

    @Override
    public void addFurniture() {
        System.out.println("Add 2 chairs");
    }
}

class FourChairsFurniture implements Furniture {

    @Override
    public void addFurniture() {
        System.out.println("Add 4 chairs");
    }
}

/* Abstract Factory */
abstract class RealRoom {
    public abstract Rooms createRooms();
    public abstract Furniture createFurniture();
}

class SmallRoomFactory extends RealRoom {

    @Override
    public Rooms createRooms() {
        return new Blueroom();
    }

    @Override
    public Furniture createFurniture() {
        return new TwoChairsFurniture();
    }
}

class BigRoomFactory extends RealRoom {

    @Override
    public Rooms createRooms() {
        return new Redroom();
    }

    @Override
    public Furniture createFurniture() {
        return new FourChairsFurniture();
    }
}