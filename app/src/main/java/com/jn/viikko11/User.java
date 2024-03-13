package com.jn.viikko11;

public class User {
    private String first_name;
    private String last_name;
    private String email;
    private String degree_program;

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
    public User(String first_name, String last_name, String email, String degree_program) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.degree_program = degree_program;
        System.out.println("Käyttäjä " + first_name + " " + last_name + " luotu!");
    }
}
