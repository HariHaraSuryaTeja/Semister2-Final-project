package ruby.hexamind.com.renticle2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ruby.hexamind.com.renticle2.R;
import ruby.hexamind.com.renticle2.Vehicles.Vehicle;

public class AdminAddCarActivity extends AppCompatActivity {
    EditText vehicleNo, vehicleName, vehicleModel, engine, costPerMile, noOfSeats, year, color;
    RadioButton manual, automatic;
    RadioGroup transmission;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;
    Button add;
    String selectedTransmission = "";
    Drawable selectedDrawable = null;
    int selectedDrawableInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_car);

        vehicleNo = findViewById(R.id.vehicleNo);
        vehicleName = findViewById(R.id.vehicleName);
        vehicleModel = findViewById(R.id.vehicleModel);
        engine = findViewById(R.id.engine);
        costPerMile = findViewById(R.id.costPerMile);
        noOfSeats = findViewById(R.id.noOfSeats);
        year = findViewById(R.id.year);
        color = findViewById(R.id.color);
        manual = findViewById(R.id.manual);
        automatic = findViewById(R.id.automatic);
        transmission = findViewById(R.id.transmission);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        add = findViewById(R.id.add);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setBackground(getDrawable(R.drawable.drawable_button));
                img1.setPadding(8, 8, 8, 8);
                img2.setBackgroundColor(getColor(android.R.color.transparent));
                img2.setPadding(0, 0, 0, 0);
                img3.setBackgroundColor(getColor(android.R.color.transparent));
                img3.setPadding(0, 0, 0, 0);
                img4.setBackgroundColor(getColor(android.R.color.transparent));
                img4.setPadding(0, 0, 0, 0);
                img5.setBackgroundColor(getColor(android.R.color.transparent));
                img5.setPadding(0, 0, 0, 0);
                img6.setBackgroundColor(getColor(android.R.color.transparent));
                img6.setPadding(0, 0, 0, 0);
                img7.setBackgroundColor(getColor(android.R.color.transparent));
                img7.setPadding(0, 0, 0, 0);
                img8.setBackgroundColor(getColor(android.R.color.transparent));
                img8.setPadding(0, 0, 0, 0);

                selectedDrawableInt = 1;
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setBackground(getDrawable(R.drawable.drawable_button));
                img2.setPadding(8, 8, 8, 8);
                img1.setBackgroundColor(getColor(android.R.color.transparent));
                img1.setPadding(0, 0, 0, 0);
                img3.setBackgroundColor(getColor(android.R.color.transparent));
                img3.setPadding(0, 0, 0, 0);
                img4.setBackgroundColor(getColor(android.R.color.transparent));
                img4.setPadding(0, 0, 0, 0);
                img5.setBackgroundColor(getColor(android.R.color.transparent));
                img5.setPadding(0, 0, 0, 0);
                img6.setBackgroundColor(getColor(android.R.color.transparent));
                img6.setPadding(0, 0, 0, 0);
                img7.setBackgroundColor(getColor(android.R.color.transparent));
                img7.setPadding(0, 0, 0, 0);
                img8.setBackgroundColor(getColor(android.R.color.transparent));
                img8.setPadding(0, 0, 0, 0);

                selectedDrawableInt = 2;
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setBackground(getDrawable(R.drawable.drawable_button));
                img3.setPadding(8, 8, 8, 8);
                img1.setBackgroundColor(getColor(android.R.color.transparent));
                img1.setPadding(0, 0, 0, 0);
                img2.setBackgroundColor(getColor(android.R.color.transparent));
                img2.setPadding(0, 0, 0, 0);
                img4.setBackgroundColor(getColor(android.R.color.transparent));
                img4.setPadding(0, 0, 0, 0);
                img5.setBackgroundColor(getColor(android.R.color.transparent));
                img5.setPadding(0, 0, 0, 0);
                img6.setBackgroundColor(getColor(android.R.color.transparent));
                img6.setPadding(0, 0, 0, 0);
                img7.setBackgroundColor(getColor(android.R.color.transparent));
                img7.setPadding(0, 0, 0, 0);
                img8.setBackgroundColor(getColor(android.R.color.transparent));
                img8.setPadding(0, 0, 0, 0);

                selectedDrawableInt = 3;
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img4.setBackground(getDrawable(R.drawable.drawable_button));
                img4.setPadding(8, 8, 8, 8);
                img1.setBackgroundColor(getColor(android.R.color.transparent));
                img1.setPadding(0, 0, 0, 0);
                img3.setBackgroundColor(getColor(android.R.color.transparent));
                img3.setPadding(0, 0, 0, 0);
                img2.setBackgroundColor(getColor(android.R.color.transparent));
                img2.setPadding(0, 0, 0, 0);
                img5.setBackgroundColor(getColor(android.R.color.transparent));
                img5.setPadding(0, 0, 0, 0);
                img6.setBackgroundColor(getColor(android.R.color.transparent));
                img6.setPadding(0, 0, 0, 0);
                img7.setBackgroundColor(getColor(android.R.color.transparent));
                img7.setPadding(0, 0, 0, 0);
                img8.setBackgroundColor(getColor(android.R.color.transparent));
                img8.setPadding(0, 0, 0, 0);

                selectedDrawableInt = 4;
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img5.setBackground(getDrawable(R.drawable.drawable_button));
                img5.setPadding(8, 8, 8, 8);
                img1.setBackgroundColor(getColor(android.R.color.transparent));
                img1.setPadding(0, 0, 0, 0);
                img3.setBackgroundColor(getColor(android.R.color.transparent));
                img3.setPadding(0, 0, 0, 0);
                img4.setBackgroundColor(getColor(android.R.color.transparent));
                img4.setPadding(0, 0, 0, 0);
                img2.setBackgroundColor(getColor(android.R.color.transparent));
                img2.setPadding(0, 0, 0, 0);
                img6.setBackgroundColor(getColor(android.R.color.transparent));
                img6.setPadding(0, 0, 0, 0);
                img7.setBackgroundColor(getColor(android.R.color.transparent));
                img7.setPadding(0, 0, 0, 0);
                img8.setBackgroundColor(getColor(android.R.color.transparent));
                img8.setPadding(0, 0, 0, 0);

                selectedDrawableInt = 5;
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img6.setBackground(getDrawable(R.drawable.drawable_button));
                img6.setPadding(8, 8, 8, 8);
                img1.setBackgroundColor(getColor(android.R.color.transparent));
                img1.setPadding(0, 0, 0, 0);
                img3.setBackgroundColor(getColor(android.R.color.transparent));
                img3.setPadding(0, 0, 0, 0);
                img4.setBackgroundColor(getColor(android.R.color.transparent));
                img4.setPadding(0, 0, 0, 0);
                img5.setBackgroundColor(getColor(android.R.color.transparent));
                img5.setPadding(0, 0, 0, 0);
                img2.setBackgroundColor(getColor(android.R.color.transparent));
                img2.setPadding(0, 0, 0, 0);
                img7.setBackgroundColor(getColor(android.R.color.transparent));
                img7.setPadding(0, 0, 0, 0);
                img8.setBackgroundColor(getColor(android.R.color.transparent));
                img8.setPadding(0, 0, 0, 0);

                selectedDrawableInt = 6;
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img7.setBackground(getDrawable(R.drawable.drawable_button));
                img7.setPadding(8, 8, 8, 8);
                img1.setBackgroundColor(getColor(android.R.color.transparent));
                img1.setPadding(0, 0, 0, 0);
                img3.setBackgroundColor(getColor(android.R.color.transparent));
                img3.setPadding(0, 0, 0, 0);
                img4.setBackgroundColor(getColor(android.R.color.transparent));
                img4.setPadding(0, 0, 0, 0);
                img5.setBackgroundColor(getColor(android.R.color.transparent));
                img5.setPadding(0, 0, 0, 0);
                img6.setBackgroundColor(getColor(android.R.color.transparent));
                img6.setPadding(0, 0, 0, 0);
                img2.setBackgroundColor(getColor(android.R.color.transparent));
                img2.setPadding(0, 0, 0, 0);
                img8.setBackgroundColor(getColor(android.R.color.transparent));
                img8.setPadding(0, 0, 0, 0);

                selectedDrawableInt = 7;
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img8.setBackground(getDrawable(R.drawable.drawable_button));
                img8.setPadding(8, 8, 8, 8);
                img1.setBackgroundColor(getColor(android.R.color.transparent));
                img1.setPadding(0, 0, 0, 0);
                img3.setBackgroundColor(getColor(android.R.color.transparent));
                img3.setPadding(0, 0, 0, 0);
                img4.setBackgroundColor(getColor(android.R.color.transparent));
                img4.setPadding(0, 0, 0, 0);
                img5.setBackgroundColor(getColor(android.R.color.transparent));
                img5.setPadding(0, 0, 0, 0);
                img6.setBackgroundColor(getColor(android.R.color.transparent));
                img6.setPadding(0, 0, 0, 0);
                img7.setBackgroundColor(getColor(android.R.color.transparent));
                img7.setPadding(0, 0, 0, 0);
                img2.setBackgroundColor(getColor(android.R.color.transparent));
                img2.setPadding(0, 0, 0, 0);

                selectedDrawableInt = 8;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = transmission.getCheckedRadioButtonId();
                if (selectedId == manual.getId()) {
                    selectedTransmission = "Manual";
                } else {
                    selectedTransmission = "Automatic";
                }

                List<Drawable> drawables = new ArrayList<>();
                selectedDrawable = getDrawable(R.drawable.ic_directions_car_black_2_24dp);
                drawables.add(selectedDrawable);
                addVehicleDetails(vehicleNo.getText().toString(), vehicleName.getText().toString(), vehicleModel.getText().toString(), engine.getText().toString(),
                        selectedTransmission, Double.parseDouble(costPerMile.getText().toString()), Integer.parseInt(noOfSeats.getText().toString()), Integer.parseInt(year.getText().toString()), color.getText().toString(), drawables);

                
                Toast.makeText(AdminAddCarActivity.this, "The details of the vehicle were added successfully", Toast.LENGTH_SHORT).show();

                finish();
            }
        });
    }

    private void addVehicleDetails(String vehicleNo, String vehicleName, String vehicleModel, String engine, String transmission, Double costPerMile, int noOfSeats, int year, String color, List<Drawable> image) {
        Vehicle vehicle = new Vehicle(vehicleNo, vehicleName, vehicleModel, engine, transmission, costPerMile, noOfSeats, year, color, image);
    }
}
