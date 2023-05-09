package model;

public class Client extends User {
  private String name;
  private String cpf;

  public Client(String name, String cpf, int id, String login, String password){
    super(id, login, password);
    this.name = name;   //precisa de id e name? id deve ser int?
    this.cpf = cpf;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getCpf(){
    return this.cpf;
  }

  public void setCpf(String newCpf){
    this.cpf = newCpf;
  }
}
  
