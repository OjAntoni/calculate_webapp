package service;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static List<User> users = new ArrayList<>();

    public void add(User user){
        users.add(user);
    }

    public boolean exists(String username, String password){
        return users.stream().anyMatch(u->(u.getUsername().equals(username) && u.getPassword().equals(password)));
    }
}
