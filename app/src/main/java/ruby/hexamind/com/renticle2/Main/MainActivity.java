package ruby.hexamind.com.renticle2.Main;

import android.os.Bundle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import ruby.hexamind.com.renticle2.R;
import ruby.hexamind.com.renticle2.Vehicles.Rentals;
import ruby.hexamind.com.renticle2.Vehicles.Reservation;
import ruby.hexamind.com.renticle2.Vehicles.Returns;
import ruby.hexamind.com.renticle2.Vehicles.Vehicle;
import ruby.hexamind.com.renticle2.Vehicles.VehicleAdapter;

public class MainActivity extends AppCompatActivity {
    String pickupDate, dropDate, pickupTime, dropTime, username;
    Vehicle[] vehicles;
    List<Vehicle> vehicleList;
    Date dropDt;
    Date pickupDt;
    Rentals rental;
    Reservation reservation;
    Returns returns;
    RecyclerView recyclerview;
    VehicleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pickupDate = getIntent().getStringExtra("pickup_date");
        dropDate = getIntent().getStringExtra("drop_date");
        pickupTime = getIntent().getStringExtra("pickup_time");
        dropTime = getIntent().getStringExtra("drop_time");
        username = getIntent().getStringExtra("userData");
        vehicles = (Vehicle[]) getIntent().getSerializableExtra("vehicleArray");
        vehicleList = Arrays.asList(vehicles);
        recyclerview = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        adapter = new VehicleAdapter(this, vehicleList, username, pickupDate, dropDate);
        recyclerview.setAdapter(adapter);

        try {
            pickupDt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).parse(pickupDate);
            dropDt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).parse(dropDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        boolean checkRental = checkRentalInfo(pickupDt);
        boolean checkReservation = checkReservationInfo(pickupDt, checkRental);
        checkReturnsInfo(dropDt, checkReservation);
    }

    private boolean checkRentalInfo(Date rentalDate) {
        try {
            Date rentalEndDt = new SimpleDateFormat("dd/MM/yyyy").parse(rental.getEndRentalDate());

            return rentalDate.after(rentalEndDt);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return false;
        }
    }

    private boolean checkReservationInfo(Date reservationStartDate, boolean checkRental) {
        if (checkRental) {
            try {
                Date reservationEndDt = new SimpleDateFormat("dd/MM/yyyy").parse(reservation.getEndDate());

                return reservationStartDate.after(reservationEndDt);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                return false;
            }
        } else {
            return false;
        }
    }

    private void checkReturnsInfo(Date returnDate, boolean checkReservation) {
        if (checkReservation) {
            try {
                Date returnsDt = new SimpleDateFormat("dd/MM/yyyy").parse(returns.getReturnDate());

                if (returnDate.after(returnsDt)) {
                    Vehicle vehicle = getVehicle(rental.getVehicleNo());
                    vehicleList.add(vehicle);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {

            }
        }
    }

    private Vehicle getVehicle(String vehicleNo) {
        Vehicle vehicle = null;

        if (vehicleList.size() > 0) {
            for (int i=0; i<vehicleList.size(); i++) {
                if (vehicleList.get(i).vehicleNo.equals(vehicleNo)) {
                    vehicle = vehicleList.get(i);
                    break;
                }
            }
        }

        return vehicle;
    }
}
