package ruby.hexamind.com.renticle2.Vehicles;

public class Rentals {
    public String vehicleNo;
    public String username;
    public String dateOfRental;
    public String endRentalDate;
    public Double cost;

    public Rentals(String vehicleNo, String username, String dateOfRental, String endRentalDate, Double cost) {
        this.vehicleNo = vehicleNo;
        this.username = username;
        this.dateOfRental = dateOfRental;
        this.endRentalDate = endRentalDate;
        this.cost = cost;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDateOfRental() {
        return dateOfRental;
    }

    public void setDateOfRental(String dateOfRental) {
        this.dateOfRental = dateOfRental;
    }

    public String getEndRentalDate() {
        return endRentalDate;
    }

    public void setEndRentalDate(String endRentalDate) {
        this.endRentalDate = endRentalDate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
