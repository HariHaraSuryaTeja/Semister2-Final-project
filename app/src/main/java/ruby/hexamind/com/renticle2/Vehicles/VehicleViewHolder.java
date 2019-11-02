package ruby.hexamind.com.renticle2.Vehicles;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ruby.hexamind.com.renticle2.R;

public class VehicleViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView carName, noOfSeats, location;
    Button price, book;

    public VehicleViewHolder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.image);
        carName = itemView.findViewById(R.id.carName);
        noOfSeats = itemView.findViewById(R.id.noOfSeats);
        location = itemView.findViewById(R.id.location);
        price = itemView.findViewById(R.id.price);
        book = itemView.findViewById(R.id.book);
    }
}
