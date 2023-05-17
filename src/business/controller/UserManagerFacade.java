package business.controller;

import java.util.Map;

import business.model.Client;
import business.model.Seller;
import factories.ControllerFactory;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.InfraException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

/*
 * Singleton Facade de Gerenciamento de Usuários
 Declarada como final para impedir que outras classes possam 
 estendê-la e criar outras fachadas para gerenciamento de usuários
 */
public final class UserManagerFacade {
  private static UserManagerFacade instance;
  private UserDAO userDAO;

  private UserManagerFacade() throws InfraException {
    userDAO = ControllerFactory.newUserDao();
  }

  public static UserManagerFacade getInstance() throws InfraException {
    if (instance == null) {
      instance = new UserManagerFacade();
    }
    return instance;
  }

  public void createUser(Map<String, String> c)
      throws LoginInvalidException, PasswordInvalidException, CpfInvalidException, CnpjInvalidException {
    userDAO.createUser(c);
  }

  public Client getClient(String id) {
    return (Client)userDAO.findUser(id);
  }

  public Seller getSeller(String id) {
    return (Seller)userDAO.findUser(id);
  }

  public void updateUser(String id, String... args) {
    userDAO.updateUser(id, args);
  }

  public void deleteUser(String id) {
    userDAO.deleteUser(id);
  }

  // list all users
}