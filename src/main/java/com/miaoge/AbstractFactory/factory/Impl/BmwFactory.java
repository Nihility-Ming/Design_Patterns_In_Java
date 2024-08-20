package com.miaoge.AbstractFactory.factory.Impl;

import com.miaoge.AbstractFactory.factory.Factory;
import com.miaoge.AbstractFactory.product.car.Car;
import com.miaoge.AbstractFactory.product.car.Impl.BmwCar;
import com.miaoge.AbstractFactory.product.ship.Impl.BmwShip;
import com.miaoge.AbstractFactory.product.ship.Ship;

public class BmwFactory extends Factory {
    @Override
    public Ship createShip() {
        return new BmwShip();
    }

    @Override
    public Car createCar() {
        return new BmwCar();
    }
}
