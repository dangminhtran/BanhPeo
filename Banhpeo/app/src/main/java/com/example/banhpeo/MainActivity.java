package com.example.banhpeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] spinner = {"Announcements","Lectures","Assignment","Grade" };
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.course_page,spinner);

    Spinner spinner = findViewById(R.id.spinner);
    spinner.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}