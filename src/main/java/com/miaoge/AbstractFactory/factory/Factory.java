package com.miaoge.AbstractFactory.factory;

import com.miaoge.AbstractFactory.product.car.Car;
import com.miaoge.AbstractFactory.product.ship.Ship;

import java.util.Properties;

public abstract class Factory {

    private static Factory factory;

    public abstract Ship createShip();

    public abstract Car createCar();

    public static Factory getInstance() {
        if (factory == null) {
            try {
                Properties prop = new Properties();
                prop.load(Factory.class.getClassLoader().getResourceAsStream("config.properties"));
                String className = prop.getProperty("abstract_factory.factory");
                factory = (Factory) Class.forName(className)
                        .getDeclaredConstructor()
                        .newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return factory;
    }
}
