package com.example.hpnotebookpc.datastoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText firstName;

    public void setFirstName(EditText firstName) {
        this.firstName = firstName;
        firstName = (EditText) findViewById(R.id.firstName);
    }

    private EditText lastName;

    public void setLastName(EditText lastName) {
        this.lastName = lastName;
        lastName = (EditText) findViewById(R.id.lastName);
    }

    private EditText age;

    public void setAge(EditText age) {
        this.age = age;
        age = (EditText) findViewById(R.id.age);
    }

    private EditText email;

    public void setEmail(EditText email) {
        this.email = email;
        email = (EditText) findViewById(R.id.email);
    }

    private EditText number;

    public void setNumber(EditText number) {
        this.number = number;
        number = (EditText) findViewById(R.id.number);
    }

    private EditText courseName;

    public void setCourseName(EditText courseName) {
        this.courseName = courseName;
        courseName = (EditText) findViewById(R.id.courseName);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText[] studentData;

    public void studentData() {
        studentData = new EditText[]{};
        studentData[0] = firstName;
        studentData[1] = lastName;
        studentData[2] = age;
        studentData[3] = email;
        studentData[4] = number;
        studentData[5] = courseName;
    }

    public void submitInfo(View view)
    {
        Toast.makeText(this, " Submitted ", Toast.LENGTH_SHORT).show();
    }

}
