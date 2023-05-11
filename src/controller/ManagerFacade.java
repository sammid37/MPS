package controller;

import model.Client;
import model.Seller;
import model.User;

/*
 * Singleton Facade de Gerenciamento de Usuários
 Declarada como final para impedir que outras classes possam 
 estendê-la e criar outras fachadas para gerenciamento de usuários
 */
public final class ManagerFacade {
  private static ManagerFacade instance;
  
  private UserDAO userDAO = UserDAO.getInstance();
  private SellerDAO sellerDAO = SellerDAO.getInstance();
  private ClientDAO clientDAO = ClientDAO.getInstance();
  
  private ManagerFacade() {}

  public static ManagerFacade getInstance() {
    if (instance == null) {
      instance = new ManagerFacade();
    }
    return instance;
  }

  public void createUser(User user) {
    if (user instanceof Client) {
      clientDAO.createClient((Client) user);
    } else if (user instanceof Seller) {
      sellerDAO.createSeller((Seller) user);
    } else {
      UserDAO userDAO = new UserDAO();
      userDAO.createUser(user);
    }

  }

  public User readUser(int id) {
    return userDAO.readUser(id);
  }

  public void updateUser(User user) {
    if (user instanceof Client) {
      clientDAO.updateClient((Client) user);
    } else if (user instanceof Seller) {
        sellerDAO.updateSeller((Seller) user);
    } else {
        userDAO.updateUser(user);
    }
  }

  public void deleteUser(User user) {
    if (user instanceof Client) {
      clientDAO.deleteClient((Client) user);
    } else if (user instanceof Seller) {
        sellerDAO.deleteSeller((Seller) user);
    } else {
        userDAO.deleteUser(user);
    }
  }
}