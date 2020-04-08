package client.controller;


import lib.db.CarRental;
import lib.db.User;
import lib.rmi.ICarRentalService;
import java.rmi.RemoteException;
import java.util.Collections;
import java.util.List;

public class CarRentalController {
    private ICarRentalService carRentalService;

    private CarRentalController() {
        try {
            carRentalService = (ICarRentalService) RegistryController.getInstance().getRegistry().lookup("carRentalService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final class SingletonHolder {
        private static final CarRentalController SINGLETON = new CarRentalController();
    }

    public static CarRentalController getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public void rentCarForUser(CarRental carRental){
        try {
            carRentalService.rentCarForUser(carRental);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public List<CarRental> carRentalsForUser(User user) {
        try {
            return carRentalService.carRentalsForUser(user);
        } catch (Exception e){
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
