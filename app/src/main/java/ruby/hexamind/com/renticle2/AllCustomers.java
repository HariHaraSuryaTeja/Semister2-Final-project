package ruby.hexamind.com.renticle2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AllCustomers extends AppCompatActivity {

    RecyclerView rvCust;
    CustomerAdapter customerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_customers);
        rvCust = findViewById(R.id.rvCust);

        rvCust.setLayoutManager(new LinearLayoutManager(this));
        customerAdapter = new CustomerAdapter(getApplicationContext());
        rvCust.setAdapter(customerAdapter);
    }
}
