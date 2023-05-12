package business.controller;

import business.model.User;

/*
 * Singleton Facade de Gerenciamento de Usuários
 Declarada como final para impedir que outras classes possam 
 estendê-la e criar outras fachadas para gerenciamento de usuários
 */
public final class ManagerFacade {
  private static ManagerFacade instance;

  private UserDAO userDAO = UserDAO.getInstance();

  private ManagerFacade() {
  }

  public static ManagerFacade getInstance() {
    if (instance == null) {
      instance = new ManagerFacade();
    }
    return instance;
  }

  public void createUser(User user) {
    userDAO.createUser(user);
  }

  public User readUser(int id) {
    return userDAO.findUserById(id);
  }

  public void updateUser(User user) {
    userDAO.updateUser(user);
  }

  public void deleteUser(User user) {
    userDAO.deleteUser(user);
  }
}