package com.jn.viikko11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList<User> users;
    public UserListAdapter (Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.first_name.setText(users.get(position).getFirstName());
        holder.last_name.setText(users.get(position).getLastName());
        holder.email.setText(users.get(position).getEmail());
        holder.degree_program.setText(users.get(position).getDegreeProgram());
        holder.completed_programs.setText(users.get(position).getCompletedDegrees());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
