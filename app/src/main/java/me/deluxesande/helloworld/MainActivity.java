package me.deluxesande.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameInput;
    private EditText lastNameInput;
    private EditText emailInput;

    private TextView firstNameOutput;
    private TextView lastNameOutput;
    private TextView emailOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        firstNameInput = findViewById(R.id.firstNameInput);
        lastNameInput = findViewById(R.id.lastNameInput);
        emailInput = findViewById(R.id.emailInput);

        firstNameOutput = findViewById(R.id.firstNameOutput);
        lastNameOutput = findViewById(R.id.lastNameOutput);
        emailOutput = findViewById(R.id.emailOutput);
    }

    public void processInputData() {
        // Getting Values from the Input Field
        String firstName = firstNameInput.getText().toString();
        String lastName = lastNameInput.getText().toString();
        String email = emailInput.getText().toString();

        // Setting the Output Field
        firstNameOutput.setText(firstName);
        lastNameOutput.setText(lastName);
        emailOutput.setText(email);
    }

    public void onButtonClick(View view) {
        processInputData();
    }
}