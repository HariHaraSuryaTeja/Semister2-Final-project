package ruby.hexamind.com.renticle2.Users;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import ruby.hexamind.com.renticle2.R;
import ruby.hexamind.com.renticle2.PostLogin.PostLoginActivity;
import ruby.hexamind.com.renticle2.Utils.Roles;

public class RegisterActivity extends AppCompatActivity {
    EditText username, password, confirmPassword, email, contactNo;
    RadioGroup gender;
    RadioButton male;
    RadioButton female;
    Button register;
    String selectedGender = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.retypePassword);
        email = findViewById(R.id.emailAddress);
        contactNo = findViewById(R.id.contactNumber);
        gender = findViewById(R.id.gender);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().length() > 0 && password.getText().toString().equals(confirmPassword.getText().toString()) && checkEmailValidity(email.getText()) && contactNo.getText().length() == 10) {
                    int selectedId = gender.getCheckedRadioButtonId();
                    if (selectedId == male.getId()) {
                        selectedGender = "M";
                    } else {
                        selectedGender = "F";
                    }

                    Users users = new Users(username.getText().toString(), password.getText().toString(), email.getText().toString(), contactNo.getText().toString(), selectedGender, Roles.CUSTOMER);

                    Intent intent = new Intent(RegisterActivity.this, PostLoginActivity.class);
                    intent.putExtra("userArray", new Users[]{users});
                    startActivity(intent);
                } else {
                    if (username.getText().length() <= 0) {
                        username.setError("Invalid username");
                    }
                    if (!password.getText().toString().equals(confirmPassword.getText().toString())) {
                        password.setError("Passwords don't match");
                    }
                    if (!checkEmailValidity(email.getText())) {
                        email.setError("Invalid email entered");
                    }
                    if (contactNo.getText().length() != 10) {
                        contactNo.setError("Invalid contact no.");
                    }
                }
            }
        });
    }

    private boolean checkEmailValidity(CharSequence email) {
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
