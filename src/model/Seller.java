package model;

public class Seller extends User {
  private String shopName;
  private String cnpj;

  public Seller(String shopName, String cnpj, int id, String login, String password){
    super(id, login, password);
    this.shopName = shopName;
    this.cnpj = cnpj;
  }

  public String getShopName(){
    return this.shopName;
  }

  public void setShopName(String newShopName){
    this.shopName = newShopName;
  }

  public String getCnpj(){
    return this.cnpj;
  }

  public void setCnpj(String newCnpj){
    this.cnpj = newCnpj;
  }
}