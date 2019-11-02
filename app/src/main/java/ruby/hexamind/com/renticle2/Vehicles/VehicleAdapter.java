package ruby.hexamind.com.renticle2.Vehicles;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ruby.hexamind.com.renticle2.R;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleViewHolder> {
    private Context context;
    private List<Vehicle> vehicles;
    String username, startDate, endDate;

    public VehicleAdapter(Context context, List<Vehicle> vehicles, String username, String startDate, String endDate) {
        this.context = context;
        this.vehicles = vehicles;
        this.username = username;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VehicleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_vehicle_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder holder, final int position) {
        final Vehicle vehicle = vehicles.get(position);

        if (position == 0)
            holder.image.setImageResource(R.drawable.viper);
        else if (position == 1)
            holder.image.setImageResource(R.drawable.ford);
        else if (position == 2)
            holder.image.setImageResource(R.drawable.porsche);
        holder.carName.setText(vehicle.getVehicleName());
        holder.noOfSeats.setText(vehicle.noOfSeats + "seater");
        holder.location.setText("Montreal, Quebec, Canada");
        holder.price.setText("$" + vehicle.getCostPerMile());
        holder.book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Booking confirmation");
                builder.setMessage("Are you sure you want to book the ride?");
                builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        saveRentalDetails(vehicle.getVehicleNo(), username, new SimpleDateFormat("MM/DD/YYYY", Locale.getDefault()).format(new Date()), endDate, (vehicle.getCostPerMile() * 10));
                        saveReservationDetails(vehicle.getVehicleNo(), username, new SimpleDateFormat("MM/DD/YYYY", Locale.getDefault()).format(new Date()), endDate, (vehicle.getCostPerMile() * 10));
                        saveReturnsDetails(vehicle.getVehicleNo(), username, endDate, (vehicle.getCostPerMile() * 10));
                        Toast.makeText(context, "Booking was confirmed..", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return vehicles.size();
    }

    public void saveRentalDetails(String vehicleNo, String username, String startDate, String endDate, Double cost) {
        Rentals rental = new Rentals(vehicleNo, username, startDate, endDate, cost);
        List<Rentals> rentalList = new ArrayList<>();

        rentalList.add(rental);
    }

    public void saveReservationDetails(String vehicleNo, String username, String startDate, String endDate, Double cost) {
        Reservation rental = new Reservation(vehicleNo, username, startDate, endDate, cost);
        List<Reservation> reservationList = new ArrayList<>();

        reservationList.add(rental);
    }

    public void saveReturnsDetails(String vehicleNo, String username, String endDate, Double cost) {
        Returns returns = new Returns(vehicleNo, username, endDate, cost);
        List<Returns> returnsList = new ArrayList<>();

        returnsList.add(returns);
    }
}
