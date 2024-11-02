package com.example.mmmm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int year;
    String name, details;
    TextView text1, text2;
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        et1 = findViewById(R.id.etName);
        et2 = findViewById(R.id.etYear);
    }

    public void showDetails(View view){
        if(et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()){
            Toast.makeText(this, "Please fill in fields", Toast.LENGTH_LONG).show();
        }
        else {
            name = et1.getText().toString();
            year = Integer.parseInt(et2.getText().toString());
            int age = 2024 - year;
            details = "Welcome "+name+ "\nYour age is "+age+" years";
            text1.setText(details);
        }

    }
}