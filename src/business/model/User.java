package business.model;

public abstract class User {
  public static final int CLIENT = 0;
  public static final int SELLER = 1;

  private String name;
  private int id;
  private String login;
  private String password;

  public User(String name, int id, String login, String password){
    this.name = name;
    this.id = id;
    this.login = login;
    this.password = password;
  }

  public abstract int getAccessLevel();

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
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

  public void setId(int id){
    this.id = id;
  }
}