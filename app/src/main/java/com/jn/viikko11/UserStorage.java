package com.jn.viikko11;

import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage us;
    private UserStorage() {
    }
    public static UserStorage getInstance() {
        if (us == null) {
            us = new UserStorage();
        }
        return us;
    }
    public ArrayList<User> getUsers() {
        return users;
    }
    public void addUser(User user) {
        users.add(user);
    }
    public void removeUser(int i) {
        users.remove(i);
    }
}
