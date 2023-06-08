package business.model;

import java.util.HashMap;
import java.util.Map;

import factories.ModelFactory;

public class Order {
  private Map<String, Item> order;

  public Order() {
    order = new HashMap<String, Item>();
  }

  public void addItem(Map<String, String> item) {
    order.put(item.get("id"), ModelFactory.newItem(item));
  }

  public Item findItem(String id) {
    return order.get(id);
  }

  public void updateItem() {
  }

  public void deleteItem(String id) {
    order.remove(id);
  }

  // totalPrice()
}
