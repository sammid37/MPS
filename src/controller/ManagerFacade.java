package controller;

import model.User;

/*
 /todo
 */

public class ManagerFacade {
  private static ManagerFacade instance;

  private ManagerFacade() {}

  public static ManagerFacade getInstance() {
    if (instance == null) {
      instance = new ManagerFacade();
    }
    return instance;
  }

  public void createUser(User user) {
    UserDAO userDAO = new UserDAO();
    userDAO.createUser(user);
  }

  public User readUser(int id) {
    UserDAO userDAO = new UserDAO();
    return userDAO.readUser(id);
  }

  public void updateUser(User user) {
    UserDAO userDAO = new UserDAO();
    userDAO.updateUser(user);
  }

  public void deleteUser(User user) {
    UserDAO userDAO = new UserDAO();
    userDAO.deleteUser(user);
  }
}