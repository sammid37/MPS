package model;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {
  private String name;
  private String cpf;
  private ArrayList<Order> orders;

  // construtor, getters e setters para os atributos acima
  // métodos para adicionar e remover pedidos
  public Client(String name, String cpf, int id, String login, String password){
    super(id, login, password);
    this.name = name;
    this.cpf = cpf;
    
    this.orders = new ArrayList<Order>();
  }

  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public String getLogin(){
    return this.login;
  }

  public void setLogin(){
    
  }

  public String getCpf(){
    return this.cpf;
  }

  public void setCpf(String newCpf){
    this.cpf = newCpf;
  }
}
  
