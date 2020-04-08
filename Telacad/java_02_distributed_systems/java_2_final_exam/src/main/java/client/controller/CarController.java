package client.controller;

import lib.db.Car;
import lib.rmi.ICarService;

import java.util.Collections;
import java.util.List;

public class CarController {
    private ICarService carService;

    private CarController() {
        try {
            carService = (ICarService) RegistryController.getInstance().getRegistry().lookup("carService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final class SingletonHolder {
        private static final CarController SINGLETON = new CarController();
    }

    public static CarController getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public void addCar(Car car) {
        try {
            carService.addCar(car);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Car> getCars() {
        try {
            return carService.getCars();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
