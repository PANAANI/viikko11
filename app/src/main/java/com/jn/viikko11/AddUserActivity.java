package com.jn.viikko11;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddUserActivity extends AppCompatActivity {
    EditText first_name_input, last_name_input, email_input;
    RadioGroup degree_program_input;
    UserStorage us = UserStorage.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        first_name_input = findViewById(R.id.editFirstName);
        last_name_input = findViewById(R.id.editLastName);
        email_input = findViewById(R.id.editEmail);
        degree_program_input = findViewById(R.id.radioDegreeProgram);
    }
    public void addUser(View view) {
        String first_name = first_name_input.getText().toString();
        String last_name = last_name_input.getText().toString();
        String email = email_input.getText().toString();
        String degree_program;
        int checked = degree_program_input.getCheckedRadioButtonId();
        if (checked == R.id.seRadioButton) {
            degree_program = "Software Engineering";
        } else if (checked == R.id.imRadioButton) {
            degree_program = "Industrial Management";
        } else if (checked == R.id.ceRadioButton) {
            degree_program = "Computational Engineering";
        } else if (checked == R.id.eeRadioButton) {
            degree_program = "Electrical Engineering";
        } else {
            degree_program = "";
        }
        us.addUser(new User(first_name, last_name, email, degree_program));
        us.saveUsers();
    }
}