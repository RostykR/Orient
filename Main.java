package com.company;

public class Main {

    public static void main(String[] args) {
	Ships s = new Ships(67,43,25);
    Containers c = new Containers(60,100,76);
    Cargo r = new Cargo(50,34,65,43);
    s.allShips(67,43,25);
    System.out.println("Залишок місць для швартування:" + s.remainingSpace(67,43,25));
    c.allContainers(60,100,76);
    System.out.println("Залишок місць для контейнерів становить:" + c.freePlace(60,100,76));
    r.allCargo(50,34,65,43);
    System.out.println("Залишок вільного тоннажу становить: " + r.freeWeight(50,34,65,43));

    }
}
