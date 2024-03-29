package com.jn.viikko11;

import android.content.Context;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();
    private Context context;
    private static UserStorage us;
    private static final String FILENAME = "users.data";
    private UserStorage() {
    }
    public static UserStorage getInstance() {
        if (us == null) {
            us = new UserStorage();
        }
        return us;
    }
    public void saveUsers() {
        try {
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput(FILENAME, Context.MODE_PRIVATE));
            userWriter.writeObject(users);
            userWriter.close();
        } catch (IOException e) {
            System.out.println("Saving user data failed");
            e.printStackTrace();
        }
    }
    public void loadUsers() {
        try {
            ObjectInputStream userLoader = new ObjectInputStream(context.openFileInput(FILENAME));
            users = (ArrayList<User>)userLoader.readObject();
            System.out.println("Reading user data successful!");
            userLoader.close();
        } catch (IOException e) {
            System.out.println("Reading user data failed");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Reading user data failed");
            e.printStackTrace();
        }
    }
    public ArrayList<User> getUsers() {
        return users;
    }
    public void addUser(User user) {
        users.add(user);

        // This code snippet taken from here: https://stackoverflow.com/questions/19471005/sorting-an-arraylist-of-objects-alphabetically
        Collections.sort(users, new Comparator<User>() {
            public int compare(User u1, User u2) {
                return u1.getFirstName().compareTo(u2.getFirstName());
            }
        });

    }
    public void removeUser(int i) {
        users.remove(i);
    }
    public void setContext (Context context) {
        this.context = context;
    }
}
