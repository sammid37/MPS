package controller;

import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserDAO {
  private List<User> users = new ArrayList<>();

  private static UserDAO instance = null;
  public static UserDAO getInstance() {
    if (instance == null) {
      instance = new UserDAO();
    }
    return instance;
  }

  public void createUser(User user) {
    // Adiciona o usuário à lista
    users.add(user);
  }

  public User readUser(int id) {
    // Busca o usuário na lista pelo ID
    for (User user : users) {
      if (user.getId() == id) {
        return user;
      }
    }
    return null;
  }

  public void updateUser(User user) {
    // Busca o usuário na lista pelo ID
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getId() == user.getId()) {
        // Atualiza o usuário na lista
        users.set(i, user);
        break;
      }
    }
  }

  public void deleteUser(User user) {
    // Remove o usuário da lista
    users.remove(user);
  }
}