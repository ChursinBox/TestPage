package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();

        us.dropUsersTable();
        us.createUsersTable();
        us.saveUser("Vladimir", "Lenin", (byte) 44);
        us.saveUser("Iosof", "Stalin", (byte) 55);
        us.saveUser("Semen", "Budenyi", (byte) 66);
        us.saveUser("Feliks", "Dzerghinskyi", (byte) 50);

        System.out.println(us.getAllUsers());
        Util.shutdown();


//        UserService userService = new UserServiceImpl();
//        userService.dropUsersTable();
//        userService.createUsersTable();
//        userService.saveUser("Vladimir", "Lenin", (byte) 55);
//        userService.saveUser("Nikolai", "Vtoroy", (byte) 58);
//        userService.saveUser("Pop", "King", (byte) 25);
//        userService.saveUser("Harry", "Potter", (byte) 15);
//        userService.getAllUsers();
//        userService.removeUserById(3);
//        userService.getAllUsers();
//        userService.cleanUsersTable();
//        Util.closeConnection();

    }
}