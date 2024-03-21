package com.jn.viikko11;

import java.io.Serializable;

public class User implements Serializable {
    private String first_name;
    private String last_name;
    private String email;
    private String degree_program;
    private String completed_degrees;

    public String getFirstName() {
        return first_name;
    }
    public String getLastName() {
        return last_name;
    }
    public String getEmail() {
        return email;
    }
    public String getDegreeProgram() {
        return degree_program;
    }
    public  String getCompletedDegrees() { return completed_degrees; }
    public User(String first_name, String last_name, String email, String degree_program, String completed_degrees) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.degree_program = degree_program;
        this.completed_degrees = completed_degrees;
    }
}
