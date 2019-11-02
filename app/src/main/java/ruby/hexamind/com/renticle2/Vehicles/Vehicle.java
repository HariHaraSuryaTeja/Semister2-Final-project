package ruby.hexamind.com.renticle2.Vehicles;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Serializable {
    public String vehicleNo;
    public String vehicleName;
    public String vehicleModel;
    public String engine;
    public String transmission;
    public Double costPerMile;
    public int noOfSeats;
    public int year;
    public String color;
    public List<Drawable> imagePath;

    public Vehicle(String vehicleNo, String vehicleName, String vehicleModel, String engine, String transmission, Double costPerMile, int noOfSeats, int year, String color, List<Drawable> imagePat) {
        this.vehicleNo = vehicleNo;
        this.vehicleName = vehicleName;
        this.vehicleModel = vehicleModel;
        this.engine = engine;
        this.transmission = transmission;
        this.costPerMile = costPerMile;
        this.noOfSeats = noOfSeats;
        this.year = year;
        this.color = color;
        this.imagePath = imagePath;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Double getCostPerMile() {
        return costPerMile;
    }

    public void setCostPerMile(Double costPerMile) {
        this.costPerMile = costPerMile;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Drawable> getImage() {
        return imagePath;
    }

    public void setImage(List<Drawable> imagePath) {
        this.imagePath = imagePath;
    }
}
