package com.jn.viikko11;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserStorage us = UserStorage.getInstance();
        Context context = MainActivity.this;
        us.setContext(context);
        us.loadUsers();
    }
    public void switchToAddUserActivity(View view) {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }
    public void switchToListUserActivity(View view) {
        Intent intent = new Intent(this, ListUserInRecycleViewActivity.class);
        startActivity(intent);
    }
}