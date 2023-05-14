package business.controller;

import java.util.Map;
import business.model.Client;
import business.model.Seller;
import business.model.User;
import factories.InfraFactory;
import factories.ModelFactory;
import infra.UserFile;
import util.UserValidador;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.InfraException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public class UserDAO {
  private Map<String, User> users;
  UserFile userFile;

  private UserDAO() throws InfraException {
    userFile = InfraFactory.newUserFile();
    users = userFile.loadUsers();
  }

  private static UserDAO instance = null;

  public static UserDAO getInstance() throws InfraException {
    if (instance == null) {
      instance = new UserDAO();
    }
    return instance;
  }

  public void createUser(Map<String, String> c)
      throws LoginInvalidException, PasswordInvalidException, CpfInvalidException, CnpjInvalidException {
    users.put(c.get("id"), ModelFactory.newUser(c));
  }

  // problema: o objeto retornado não tem acesso a cpf/cnpj
  public User findUser(String id) {
    return users.get(id);
  }

  public void updateUser(String id, String[] args) {
    // Atualiza o usuário
    // To Do
  }

  public void deleteUser(String id) {
    // Remove o usuário da lista
    users.remove(id);
  }
}