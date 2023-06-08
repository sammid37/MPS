package business.model;

import java.util.HashMap;
import java.util.Map;

import factories.ModelFactory;

public class Menu {
  private Map<String, Item> menu;

  public Menu() {
    menu = new HashMap<String, Item>();
  }

  public void addItem(Map<String, String> item) {
    menu.put(item.get("id"), ModelFactory.newItem(item));
  }

  public Item findItem(String id) {
    return menu.get(id);
  }

  public void updateItem() {
  }

  public void deleteItem(String id) {
    menu.remove(id);
  }

  // totalPrice()
}
