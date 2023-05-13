package business.controller;

import business.model.User;
import util.InfraException;
import util.LoginInvalidException;
import util.PasswordInvalidException;

/*
 * Singleton Facade de Gerenciamento de Usuários
 Declarada como final para impedir que outras classes possam 
 estendê-la e criar outras fachadas para gerenciamento de usuários
 */
public final class ManagerFacade {
  private static ManagerFacade instance;
  private UserDAO userDAO;

  private ManagerFacade() throws InfraException {
    userDAO = UserDAO.getInstance();
  }

  public static ManagerFacade getInstance() throws InfraException {
    if (instance == null) {
      instance = new ManagerFacade();
    }
    return instance;
  }

  public void createClient(String... args) throws LoginInvalidException, PasswordInvalidException {
    userDAO.createClient(args);
  }

  public void createSeller(String... args) throws LoginInvalidException, PasswordInvalidException {
    userDAO.createSeller(args);
  }

  public User readUser(String id) {
    return userDAO.findUser(id);
  }

  public void updateUser(String id, String... args) {
    userDAO.updateUser(id, args);
  }

  public void deleteUser(String id) {
    userDAO.deleteUser(id);
  }
}