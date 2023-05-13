package business.controller;

import java.util.Map;
import business.model.Client;
import business.model.Seller;
import business.model.User;
import infra.UserFile;
import util.InfraException;
import util.LoginInvalidException;
import util.PasswordInvalidException;
import util.UserValidador;

public class UserDAO {
  private Map<String, User> users;
  UserFile userFile;

  private UserDAO() throws InfraException {
    userFile = new UserFile();
    users = userFile.loadUsers();
  }

  private static UserDAO instance = null;

  public static UserDAO getInstance() throws InfraException {
    if (instance == null) {
      instance = new UserDAO();
    }
    return instance;
  }

  public void createClient(String... args) throws LoginInvalidException, PasswordInvalidException {
    // validate name
    // validate cpf
    UserValidador.validateLogin(args[3]);
    UserValidador.validatePassword(args[4]);
    users.put(args[0], new Client(args[1], args[2], args[3], args[4]));
  }

  public void createSeller(String... args) throws LoginInvalidException, PasswordInvalidException {
    // validate name
    // validate cnpj
    UserValidador.validateLogin(args[3]);
    UserValidador.validatePassword(args[4]);
    users.put(args[0], new Seller(args[1], args[2], args[3], args[4]));
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