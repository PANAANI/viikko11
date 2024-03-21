package com.jn.viikko11;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView first_name, last_name, email, degree_program, completed_programs;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        first_name = itemView.findViewById(R.id.textFirstName);
        last_name = itemView.findViewById(R.id.textLastName);
        email = itemView.findViewById(R.id.textEmail);
        degree_program = itemView.findViewById(R.id.textDegreeProgram);
        completed_programs = itemView.findViewById(R.id.textUserDegrees);
    }
}
