package client.gui;

import client.controller.CarController;
import client.controller.CarRentalController;
import client.controller.UserController;
import lib.db.Car;
import lib.db.CarRental;
import lib.db.User;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class MainGui extends JFrame implements ICarAdded{
    private JPanel panel1;
    private JList<CarRental> rentedCarsList;
    private JButton addCarButton;
    private JList<Car> carList;
    private JButton rentCarButton;
    private JLabel loggedUserLabel;

    private DefaultListModel<Car> carsModel;
    private DefaultListModel<CarRental> rentedCarsModel;

    private User user;

    public MainGui(User user) {
        this.user = user;
        Dimension dimension = new Dimension();
        dimension.setSize(700, 800);
        setMinimumSize(dimension);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addCarButton.addActionListener(e -> activateAddCarGui());
        rentCarButton.addActionListener(e -> rentCar());
        carsModel = new DefaultListModel<>();
        carList.setModel(carsModel);

        rentedCarsModel = new DefaultListModel<>();
        rentedCarsList.setModel(rentedCarsModel);
        rentedCarsList.setAutoscrolls(true);
        displayCarsList();
        displayRentedCarsList();

        loggedUserLabel.setText("Connected user: " + user.getUsername());
    }


    private void activateAddCarGui() {
        new AddCarGui(this);
    }

    private void displayCarsList() {
        carsModel.clear();
        CarController.getInstance().getCars().forEach(carsModel::addElement);
    }

    private void displayRentedCarsList() {
        rentedCarsModel.clear();
        List<CarRental> carRentalList =  CarRentalController.getInstance().carRentalsForUser(user);
        carRentalList.forEach(rentedCarsModel::addElement);
    }

    private void rentCar() {
        Car car = selectedCar();
        if (car == null) {
            GuiAlerts.getInstance().showAlertWithMessage("Please select a car before renting!");
            return;
        }
        CarRental carRental = new CarRental();
        carRental.setUser(user);
        carRental.setCar(car);
        carRental.setRentalDate(LocalDateTime.now());
        CarRentalController.getInstance().rentCarForUser(carRental);
        displayRentedCarsList();
    }

    private Car selectedCar() {
        return carList.getSelectedValue();
    }

    @Override
    public void carAdded() {
        displayCarsList();
    }
}
