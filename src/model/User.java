package model;

public class User {
  private int id;
  private String login;
  private String password;

  // construtor, getters e setters para os atributos acima
  public User(int id, String login, String password){
    this.id = id;
    this.login = login;
    this.password = password;
  }

  public String getLogin(){
    return this.login;
  }

  public void setLogin(String newLogin){
    this.login = newLogin;
  }

  public String getPassword(){
    return this.password;
  }

  public void setPassword(String newPassword){
    this.password = newPassword;
  }

  public int getId(){
    return this.id;
  }
}