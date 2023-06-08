package business.model;

import factories.ModelFactory;

public class Seller extends User {
  private Menu menu;
  private String cnpj;

  public Seller(String name, String cnpj, String login, String password) {
    super(name, login, password);
    this.cnpj = cnpj;
    menu = ModelFactory.newMenu();
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