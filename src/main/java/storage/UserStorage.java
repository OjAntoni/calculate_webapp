package storage;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private static List<User> users = new ArrayList<>();

    public static void add(User u){
        users.add(u);
    }
}
