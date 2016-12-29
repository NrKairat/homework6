package ru.levelp;

import ru.levelp.dao.user.UserServiceMongo;
import ru.levelp.entities.AccessRight;
import ru.levelp.entities.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceMongo userServiceMongo = new UserServiceMongo();

        List<String> userList = new ArrayList<String>();
        List<User> userList1 = new ArrayList<User>();

        for(int i=0;i<5;i++){
            User user = new User(i+"","user"+i+"@mail.ru","xXxXx","name"+i,"ThisIsI"+i);
            userServiceMongo.add(user);
//            userList.add(user.getId());
        }

        userList.add("0");
        userList.add("1");
        List<User> userList2 = userServiceMongo.get(userList);
        System.out.println(userList2.size());

        AccessRight accessRight = new AccessRight(1,"3");

        for(int i=0;i<5;i++){
            User user = new User(i+"","user"+i+"@mail.ru","xXxXx","name"+i,"ThisIsI"+i);
            userServiceMongo.add(user);
//            userList.add(user.getId());
        }


    }
}
