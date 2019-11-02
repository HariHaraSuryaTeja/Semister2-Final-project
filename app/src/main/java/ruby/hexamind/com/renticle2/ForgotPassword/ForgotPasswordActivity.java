package ruby.hexamind.com.renticle2.ForgotPassword;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import ruby.hexamind.com.renticle2.R;

public class ForgotPasswordActivity extends AppCompatActivity {
    private ImageView back;
    private EditText emailAddress;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        back = findViewById(R.id.back);
        emailAddress = findViewById(R.id.email);
        send = findViewById(R.id.send);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailAddress.getText().toString();
            }
        });
    }
}
