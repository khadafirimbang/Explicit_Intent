package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.etInput);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstname = etInput.getText().toString().trim();
                if(etInput.getText().toString().isEmpty()) {
                    etInput.setError("Please enter your firstname!");
                }else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("firstname", firstname);
                    startActivity(intent);
                }

            }
        });


    }
}