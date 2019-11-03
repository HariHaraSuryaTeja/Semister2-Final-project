package ruby.hexamind.com.renticle2.Users;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ruby.hexamind.com.renticle2.ForgotPassword.ForgotPasswordActivity;
import ruby.hexamind.com.renticle2.PostLogin.PostLoginActivity;
import ruby.hexamind.com.renticle2.R;
import ruby.hexamind.com.renticle2.Vehicles.Vehicle;
import ruby.hexamind.com.renticle2.admin.AdminMainActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText username, password;
    private TextView forgotPassword;
    private Button login, signUp;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        forgotPassword = findViewById(R.id.forgot_password);
        login = findViewById(R.id.login);
        signUp = findViewById(R.id.signUp);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (getIntent().getStringExtra("intent").equals("admin"))
            signUp.setVisibility(View.INVISIBLE);
        else
            signUp.setVisibility(View.VISIBLE);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
            }
        });
        if (getIntent().getStringExtra("intent").equals("admin"))
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LoginActivity.this, AdminMainActivity.class));
                }
            });
        else
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Vehicle[] vehicles = new Vehicle[3];

                    List<Drawable> viper = new ArrayList<>();
                    List<Drawable> ford = new ArrayList<>();
                    List<Drawable> porsche = new ArrayList<>();
                    viper.add(getDrawable(R.drawable.viper));
                    ford.add(getDrawable(R.drawable.ford));
                    porsche.add(getDrawable(R.drawable.porsche));
                    vehicles[0] = new Vehicle("H5T 9K4", "Dodge", "Viper", "3.2", "Automatic", 20.9, 2, 2019, "GREEN", viper);
                    vehicles[1] = new Vehicle("I8W 0P2", "Ford Mustang", "Shelby GT 250", "3.2", "Automatic", 20.9, 2, 2019, "BLACK", ford);
                    vehicles[2] = new Vehicle("J1V 1O6", "Porsche", "Cayanne", "3.2", "Automatic", 20.9, 6, 2019, "WHITE", porsche);
                    Intent intent = new Intent(LoginActivity.this, PostLoginActivity.class);
                    intent.putExtra("userData", username.getText().toString());
                    intent.putExtra("vehicleArray", vehicles);
                    startActivity(intent);

                }


            });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }

    private String getImagePath(int resourceId) {
        return Uri.parse("android.resource://" + R.class.getPackage().getName() + "/" + resourceId).toString();
    }
}
