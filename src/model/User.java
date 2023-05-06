package model;

public class User {
  private int id;
  private String login;
  private String password;

  // construtor, getters e setters para os atributos acima
  void public User(int id, String login, String password){
    this.id = id;
    this.login = login;
    this.password = password;
  }

  String public getLogin(){
    return this.login;
  }

  void public setLogin(String newLogin){
    this.login = newLogin;
  }

  String public getPassword(){
    return this.password;
  }

  void public setPassword(String newPassword){
    this.password = newPassword;
  }

  int public getId(){
    return this.id;
  }
}