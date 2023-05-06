package model;

import java.util.List;

public class Client extends User {
  private String cpf;
  private LinkedList<Order> orders;

  // construtor, getters e setters para os atributos acima
  // métodos para adicionar e remover pedidos
  void public Seller(String shopName, String cpf, int id, int login, int password){
    super(id, login, password);
    this.shopName = shopName;
    this.cpnj = cpnj;
  
    this.orders = new LinkedList<Order>();
  }

  String public getShopName(){
    return this.shopName;
  }

  void public setShopName(String newShopName){
    this.shopName = newShopName;
  }

  String public getCpf(){
    return this.cpf;
  }

  void public setCpf(String newCpf){
    this.cpf = newCpf;
  }

  void public addOrder(String orderName){
    this.orders.add(orderName);
  }

  void public removeOrder(String orderName){
    this.orders.remove(orderName)
  }
}
  
