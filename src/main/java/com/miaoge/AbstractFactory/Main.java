package com.miaoge.AbstractFactory;

import com.miaoge.AbstractFactory.factory.Factory;
import com.miaoge.AbstractFactory.product.car.Car;
import com.miaoge.AbstractFactory.product.ship.Ship;

public class Main {
    public static void main(String[] args) {
        try {
            Factory factory = Factory.getInstance();
            Car car = factory.createCar();
            Ship ship = factory.createShip();

            System.out.println(car);
            System.out.println(ship);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
