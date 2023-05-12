package business.model;

public class Client extends User {
  private String cpf;

  public Client(String name, String cpf, int id, String login, String password){
    super(name, id, login, password);
    this.cpf = cpf;
  }

  @Override
  public int getAccessLevel() {
    return User.CLIENT;
  }

  public String getCpf(){
    return this.cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }
}
  
