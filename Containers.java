package com.company;

public class Containers {
    int autoContainers;
    int clothingContainer;
    int devicesContainer;

    public Containers(int autoContainers,int clothingContainer,int devicesContainer){
        this.autoContainers = autoContainers;
        this.clothingContainer = clothingContainer;
        this.devicesContainer = devicesContainer;
    }

    void allContainers(int autoContainers,int clothingContainer,int devicesContainer){
        int b = autoContainers + clothingContainer + devicesContainer;
        System.out.println("В порту знаходиться "+b+" контейнера,загальна кількість місць 1000");
    }

    int freePlace(int autoContainers,int clothingContainer,int devicesContainer){
        int d = 1000 - (autoContainers + clothingContainer + devicesContainer);
        return d;
    }



}
