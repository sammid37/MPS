package business.model;

import java.util.ArrayList;

public class ManagerSellers {
  private ArrayList<Seller> sellers;

  public ManagerSellers() {
    this.sellers = new ArrayList<>();
  }

  public void addSeller(Seller seller) {
    this.sellers.add(seller);
  }

  public void removeSeller(Seller seller) {
    this.sellers.remove(seller);
  }

  public void updateSeller(Seller seller) {
    // decidir o que isso deve fazer
  }

  public Seller findSellerByName(String name) {
    for (Seller seller : sellers) {
      if (seller.getShopName() == name)
        return seller;
    }
    return null;
  }

  public Seller findSellerById(int id) {
    for (Seller seller : sellers) {
      if (seller.getId() == id)
        return seller;
    }
    return null;
  }

  public ArrayList<Seller> getSellers() {
    return sellers;
  }

}
