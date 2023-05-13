package business.model;

public class Seller extends User {
  private String cnpj;

  public Seller(String name, String cnpj, String login, String password) {
    super(name, login, password);
    this.cnpj = cnpj;
  }

  @Override
  public int getAccessLevel() {
    return User.SELLER;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
}