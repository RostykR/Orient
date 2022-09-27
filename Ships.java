package com.company;

public class Ships {
    int passengerShip;
    int cargoShip;
    int specialShip;

    public Ships(int passengerShip,int cargoShip,int specialShip){
        this.passengerShip = passengerShip;
        this.cargoShip = cargoShip;
        this.specialShip = specialShip;
    }

    void allShips(int passengerShip,int cargoShip,int specialShip){
        int a = passengerShip + cargoShip + specialShip;
        System.out.println("В порту пришвартовано "+a+" судна,загалом кількість місць 300");
    }

    int remainingSpace(int passengerShip,int cargoShip,int specialShip){
        int f = 300 - (passengerShip + cargoShip + specialShip);
        return f;

    }

}
