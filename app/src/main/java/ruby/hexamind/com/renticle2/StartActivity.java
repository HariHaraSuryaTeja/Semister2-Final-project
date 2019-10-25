package ruby.hexamind.com.renticle2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    private Button signInAsUser, signInAsAdmin;
    private final String USER_INTENT = "user";
    private final String ADMIN_INTENT = "admin";
    private final String INTENT_KEY = "intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        signInAsUser = findViewById(R.id.signInAsUser);
        signInAsAdmin = findViewById(R.id.signInAsAdmin);

        signInAsUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                intent.putExtra(INTENT_KEY, USER_INTENT);
                startActivity(intent);
            }
        });

        signInAsAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                intent.putExtra(INTENT_KEY, ADMIN_INTENT);
                startActivity(intent);
            }
        });
    }
}
