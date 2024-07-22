package Springboot.springboot_app.service;

import Springboot.springboot_app.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service

public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Aigi", 23, "wahyuaigi2@gmail.com");
        User user2 = new User(2, "Wahyu", 23, "wahyuaigi1@gmail.com");
        User user3 = new User(3, "Way", 23, "wahyuaigi3@gmail.com");
        User user4 = new User(4, "Ai", 23, "wahyuaigi4@gmail.com");
        User user5 = new User(5, "Muhammad", 23, "wahyuaigi5@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));

    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user : userList) {
            if (id.equals(user.getId())) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}

