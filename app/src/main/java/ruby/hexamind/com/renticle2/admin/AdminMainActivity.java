package ruby.hexamind.com.renticle2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import ruby.hexamind.com.renticle2.AllCustomers;
import ruby.hexamind.com.renticle2.R;

public class AdminMainActivity extends AppCompatActivity {
    TextView addCar;
    Button cust_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);

        addCar = (TextView) findViewById(R.id.addCar);
        cust_list = (Button) findViewById(R.id.cust_List);
        addCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(AdminMainActivity.this, AdminAddCarActivity.class));
                Intent intent = new Intent(AdminMainActivity.this, AdminAddCarActivity.class);
                startActivity(intent);
            }
        });

        cust_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMainActivity.this, AllCustomers.class);
                startActivity(intent);
            }
        });
    }
}