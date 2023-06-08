package business.model;

import java.util.HashMap;
import java.util.Map;
import factories.ModelFactory;

public class Seller extends User {
  private Map<String, Item> menu;
  private String cnpj;

  public Seller(String name, String cnpj, String login, String password) {
    super(name, login, password);
    this.cnpj = cnpj;
    menu = new HashMap<String, Item>();
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

  public void addItemToMenu(Map<String, String> item) {
    // validar: checar se o item já existe
    menu.put(item.get("id"), ModelFactory.newItem(item));
  }

  public Item getMenuItem(String id) {
    return menu.get(id);
  }

  public void updateMenuItem() {
  }

  public void deleteMenuItem(String id) {
    menu.remove(id);
  }
}