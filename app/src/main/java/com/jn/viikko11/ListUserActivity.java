package com.jn.viikko11;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListUserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_user_activity);
        UserStorage us = UserStorage.getInstance();
        RecyclerView rv = findViewById(R.id.rvUserView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new UserListAdapter(getApplicationContext(), us.getUsers()));
    }
}