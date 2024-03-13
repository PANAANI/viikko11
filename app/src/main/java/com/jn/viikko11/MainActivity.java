package com.jn.viikko11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserStorage.getInstance();
    }
    public void switchToAddUserActivity(View view) {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }
}