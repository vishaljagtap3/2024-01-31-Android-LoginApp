package in.bitcode.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

        btnLogin.setOnClickListener(new BtnLoginClickListener());
    }

    private class BtnLoginClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(edtUsername.getText().toString().equals("bitcode") && edtPassword.getText().toString().equals("bitcode")) {
                Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_LONG).show();
                //start home activity
                Intent homeActivityIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeActivityIntent);
                finish();
            }
            else {
                Toast.makeText(MainActivity.this, "Login failed...", Toast.LENGTH_LONG).show();
            }
        }
    }
}