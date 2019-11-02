package ruby.hexamind.com.renticle2.Vehicles;

public class Returns {
    String vehicleNo;
    String username;
    String returnDate;
    Double cost;

    public Returns(String vehicleNo, String username, String returnDate, Double cost) {
        this.vehicleNo = vehicleNo;
        this.username = username;
        this.returnDate = returnDate;
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

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
