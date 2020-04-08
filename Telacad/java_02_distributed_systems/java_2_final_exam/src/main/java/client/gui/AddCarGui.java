package client.gui;

import client.controller.CarController;
import lib.db.Car;
import lib.db.Manufacturer;
import lib.db.PlateNumber;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;
import java.util.Arrays;

public class AddCarGui extends JFrame {
    private JPanel panel1;
    private JButton addButton;
    private JSpinner manufacturerSpinner;
    private JTextField countyTextField;
    private JTextField numberTextField;
    private JTextField codeTextField;

    SpinnerListModel spinnerListModel;
    ICarAdded carAdded;

    public AddCarGui(ICarAdded carAdded) {
        this.carAdded = carAdded;
        Dimension dimension = new Dimension();
        dimension.setSize(500, 400);
        setMinimumSize(dimension);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        spinnerListModel = new SpinnerListModel();
        manufacturerSpinner.setModel(spinnerListModel);
        setManufacturerSpinner();
        addButton.addActionListener(e -> addCar());
    }

    private void setManufacturerSpinner(){
        spinnerListModel.setList(Arrays.asList(Manufacturer.values()));
    }

    private void addCar() {
        Car car = new Car();
        try {
            car.setPlateNumber(newPlateNumber());
            car.setManufacturer((Manufacturer) manufacturerSpinner.getValue());
        } catch (Exception e) {
            GuiAlerts.getInstance().showAlertWithMessage(e.getMessage());
            return;
        }
        CarController.getInstance().addCar(car);
        carAdded.carAdded();
        GuiAlerts.getInstance().showAlertWithMessage("Car added!");
    }

    private PlateNumber newPlateNumber() throws Exception{
        String county = FieldController.validateStringTextField(countyTextField);
        Integer number = FieldController.validateIntegerTextField(numberTextField);
        String code = FieldController.validateStringTextField(codeTextField);
        PlateNumber plateNumber = new PlateNumber();
        plateNumber.setCode(code.toUpperCase());
        plateNumber.setCounty(county.toUpperCase());
        plateNumber.setNumber(number);
        return plateNumber;
    }
}
