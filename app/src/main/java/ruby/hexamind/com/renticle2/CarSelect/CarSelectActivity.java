package ruby.hexamind.com.renticle2.CarSelect;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TimePicker;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import ruby.hexamind.com.renticle2.Main.MainActivity;
import ruby.hexamind.com.renticle2.R;
import ruby.hexamind.com.renticle2.Vehicles.Vehicle;

public class CarSelectActivity extends AppCompatActivity {
    private EditText pickupTime, dropTime, pickupDate, dropDate, startPt, endPt;
    Button findCars;
    String username;
    Calendar calendar;
    int pickUpSelectedHr = 0;
    int pickUpSelectedMin = 0;
    int dropSelectedHr = 0;
    int dropSelectedMin = 0;
    Vehicle[] vehicles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_select);

        startPt = findViewById(R.id.startPoint);
        endPt = findViewById(R.id.endPoint);
        pickupTime = findViewById(R.id.pickupTime);
        dropTime = findViewById(R.id.dropTime);
        pickupDate = findViewById(R.id.pickupDate);
        dropDate = findViewById(R.id.dropDate);
        findCars = findViewById(R.id.findCars);
        username = getIntent().getStringExtra("userData");
        vehicles = (Vehicle[]) getIntent().getSerializableExtra("vehicleArray");

        calendar = Calendar.getInstance();

        final DatePickerDialog.OnDateSetListener datePick = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabelPickUp();
            }
        };

        pickupDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(CarSelectActivity.this, datePick,
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        pickupTime.setText(pickUpSelectedHr + ":" + pickUpSelectedMin);

        pickupTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar currentTime = Calendar.getInstance();
                int hour = currentTime.get(Calendar.HOUR_OF_DAY);
                int minute = currentTime.get(Calendar.MINUTE);
                TimePickerDialog timePicker;
                timePicker = new TimePickerDialog(CarSelectActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        pickupTime.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                timePicker.setTitle("Select Time");
                timePicker.show();
            }
        });

        final DatePickerDialog.OnDateSetListener dateDrop = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabelDrop();
            }
        };

        dropDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(CarSelectActivity.this, dateDrop,
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        dropTime.setText(dropSelectedHr + ":" + dropSelectedMin);

        dropTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar currentTime = Calendar.getInstance();
                int hour = currentTime.get(Calendar.HOUR_OF_DAY);
                int minute = currentTime.get(Calendar.MINUTE);
                TimePickerDialog timePicker;
                timePicker = new TimePickerDialog(CarSelectActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        dropTime.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                timePicker.setTitle("Select Time");
                timePicker.show();
            }
        });

        findCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarSelectActivity.this, MainActivity.class);
                intent.putExtra("userData", username);
                intent.putExtra("pickup_date", pickupDate.getText().toString());
                intent.putExtra("drop_date", dropDate.getText().toString());
                intent.putExtra("pickup_time", pickupTime.getText().toString());
                intent.putExtra("drop_time", dropTime.getText().toString());
                intent.putExtra("vehicleArray", vehicles);
                startActivity(intent);
            }
        });
    }

    private void updateLabelPickUp() {
        String myFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.getDefault());

        pickupDate.setText(sdf.format(calendar.getTime()));
    }

    private void updateLabelDrop() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        dropDate.setText(sdf.format(calendar.getTime()));
    }
}