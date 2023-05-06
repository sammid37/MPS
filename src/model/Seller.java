package model;

import java.util.List;

public class Seller extends User {
  private String shopName;
  private String cnpj;
  private LinkedList<Product> products;

  // construtor, getters e setters para os atributos acima
  // métodos para adicionar e remover produtos
  void public Seller(String shopName, String cnpj, int id, int login, int password){
    super(id, login, password);
    this.shopName = shopName;
    this.cpnj = cpnj;
    this.products = new LinkedList<Product>();
  }

  String public getShopName(){
    return this.shopName;
  }

  void public setShopName(String newShopName){
    this.shopName = newShopName;
  }

  String public getCnpj(){
    return this.cnpj;
  }

  void public setCnpj(String newCnpj){
    this.cnpj = newCnpj;
  }

  void public addProduct(String productName){
    this.products.add(productName);
  }

  void public removeProduct(String productName){
    this.products.remove(productName)
  }
}