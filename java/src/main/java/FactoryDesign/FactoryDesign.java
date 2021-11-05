package FactoryDesign;

import javax.swing.*;
import java.util.Scanner;

abstract class Vehicle {

    public abstract void getPrint();

}

class Car extends Vehicle{
    public void getPrint() {
    System.out.println("Car");
    }
}

class Bike extends Vehicle{
    public void getPrint() {
        System.out.println("Bke");
    }
}



public  class FactoryDesign{
    public static void main(String[] args) {
        Integer in [] = {5,3,6,1,4,5};
        Integer firstSmall = Integer.MIN_VALUE;
         Integer       secondSMall = Integer.MIN_VALUE;

        for(Integer i :in){
            if(i> firstSmall ){
                secondSMall = firstSmall;
                firstSmall = i;
            }else if(i> secondSMall){
                secondSMall = i;
            }
        }
        System.out.println(firstSmall+"     "+secondSMall);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Vehicle veh = null;

        if(input == 1 ){
            veh =  new Car();
        }else if(input == 2){
            veh = new Bike();
        }

        veh.getPrint();


    }
}