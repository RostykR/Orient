package com.company;

public class Cargo {
    double gravel;
    double grain;
    double coal;
    double cement;

    public Cargo(double gravel,double grain,double coal,double cement){
        this.gravel = gravel;
        this.grain = grain;
        this.coal = coal;
        this.cement = cement;
    }

    void allCargo(double gravel,double grain,double coal,double cement){
        double c = gravel + grain + coal + cement;
        System.out.println("В бункері знаходиться "+c+" тонн сировини,загальна вмістимість 700 тонн");
    }

    int freeWeight(int gravel,int grain,int coal,int cement){
        int g = 700 - (gravel + grain + coal + cement);
        return g;
    }




}
