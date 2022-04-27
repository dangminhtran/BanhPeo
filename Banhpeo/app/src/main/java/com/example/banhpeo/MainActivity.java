package com.example.banhpeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button studentButton;
    private Button teacherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.role);
    }

    public void buttonClick (View view){
        studentButton = (Button) findViewById(R.id.student_button);
        studentButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setContentView(R.layout.login);
            }});

        teacherButton = (Button) findViewById(R.id.teacher_button);
        teacherButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setContentView(R.layout.login);
            }});
    }


    public void dropDown (Spinner spinners){
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Menu, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text = parent.getItemAtPosition(position).toString();
        if(text.equals("Announcement")){
            setContentView(R.layout.announcement_stud);
        } else if (text.equals("Lectures")){
            setContentView(R.layout.lecture_stud);
        } else if (text.equals("Assignment")){
            setContentView(R.layout.assignment_stud);
        } else if (text.equals("Grade")){
            setContentView(R.layout.grade_stud);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public Button getTeacherButton() {
        return teacherButton;
    }
}