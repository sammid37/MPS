package business.controller;

import java.util.HashMap;

import business.model.Client;
import business.model.Seller;
import business.model.User;

public class UserDAO {
  private HashMap<String, User> users;

  private UserDAO() {
    users = new HashMap<String, User>();
  }

  private static UserDAO instance = null;

  public static UserDAO getInstance() {
    if (instance == null) {
      instance = new UserDAO();
    }
    return instance;
  }

  public void createClient(String[] args) {
    // Adiciona o usuário à lista
    users.put(args[0], new Client(args[1], args[2], args[3], args[4]));
  }

  public void createSeller(String[] args) {
    // Adiciona o usuário à lista
    users.put(args[0], new Seller(args[1], args[2], args[3], args[4]));
  }

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