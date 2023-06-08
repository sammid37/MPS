package business.model;

import java.util.Map;

import factories.InfraFactory;
import factories.ModelFactory;
import infra.UserFile;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.InfraException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public class UserList {
  private Map<String, User> users;
  UserFile userFile;

  private UserList() throws InfraException {
    userFile = InfraFactory.newUserFile();
    users = userFile.loadUsers();
  }

  private static UserList instance = null;

  public static UserList getInstance() throws InfraException {
    if (instance == null) {
      instance = new UserList();
    }
    return instance;
  }

  public void createUser(Map<String, String> user)
      throws LoginInvalidException, PasswordInvalidException, CpfInvalidException, CnpjInvalidException {
    users.put(user.get("id"), ModelFactory.newUser(user));
  }

  public User findUser(String id) {
    return users.get(id);
  }

  public void updateUser() {
  }

  public void deleteUser(String id) {
    users.remove(id);
  }
}