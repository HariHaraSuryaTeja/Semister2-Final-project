package ruby.hexamind.com.renticle2.Vehicles;

public class Reservation {
    String vehicleNo;
    String username;
    String startDate;
    String endDate;
    Double cost;

    public Reservation(String vehicleNo, String username, String startDate, String endDate, Double cost) {
        this.vehicleNo = vehicleNo;
        this.username = username;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
