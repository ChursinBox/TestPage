package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoJDBCImpl();

        userDao.dropUsersTable();

        userDao.createUsersTable();

        userDao.saveUser("Vladimir", "Lenin", (byte) 55);
        userDao.saveUser("Nikolai", "Vtoroy", (byte) 58);
        userDao.saveUser("Pop", "King", (byte) 25);
        userDao.saveUser("Harry", "Potter", (byte) 15);

        userDao.getAllUsers();

        userDao.removeUserById(3);
        userDao.getAllUsers();

        userDao.cleanUsersTable();

        Util.closeConnection();

    }
}