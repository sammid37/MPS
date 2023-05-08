package model;

import java.util.List;
import java.util.LinkedList;

public class Seller extends User {
  private String shopName;
  private String cnpj;
  private LinkedList<Product> products;

  // construtor, getters e setters para os atributos acima
  // métodos para adicionar e remover produtos
  public Seller(String shopName, String cnpj, int id, String login, String password){
    super(id, login, password);
    this.shopName = shopName;
    this.cnpj = cnpj;
    this.products = new LinkedList<Product>();
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