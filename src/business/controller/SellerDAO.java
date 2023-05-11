package business.controller;

import java.util.ArrayList;
import java.util.List;

import business.model.Seller;

public class SellerDAO {
  private List<Seller> sellers = new ArrayList<>();

  private static SellerDAO instance = null;
  public static SellerDAO getInstance() {
    if (instance == null) {
      instance = new SellerDAO();
    }
    return instance;
  }

  public void createSeller(Seller seller) {
    sellers.add(seller);
  }

  public Seller readSeller(int id) {
    // Busca o usuário na lista pelo ID
    for (Seller seller : sellers) {
      if (seller.getId() == id) {
        return seller;
      }
    }
    return null;
  }

  public void updateSeller(Seller seller) {
    // Busca o usuário na lista pelo ID e atualiza
    for (int i = 0; i < sellers.size(); i++) {
      if (sellers.get(i).getId() == seller.getId()) {
        sellers.set(i, seller);
        break;
      }
    }
  }

  public void deleteSeller(Seller seller) {
    sellers.remove(seller);
  }
}
