package business.model;

import java.util.HashMap;
import java.util.Map;

public class Order {
  private Map<Item, Integer> items;

  public Order() {
    this.items = new HashMap<>();
  }

  public void addItem(Item item, int quantity) {
    if (items.containsKey(item)) {
      int currentQuantity = items.get(item);
      items.put(item, currentQuantity + quantity);
    } else {
      items.put(item, quantity);
    }
  }

  public void removeItem(Item item, int quantity) {
    if (items.containsKey(item)) {
      int currentQuantity = items.get(item);
      int newQuantity = currentQuantity - quantity;

      if (newQuantity > 0) {
        items.put(item, newQuantity);
      } else {
        items.remove(item);
      }
    }
  }

  public Map<Item, Integer> getItems() {
    return items;
  }

  public double getTotalPrice() {
    double totalPrice = 0.0;

    for (Map.Entry<Item, Integer> entry : items.entrySet()) {
      Item item = entry.getKey();
      int quantity = entry.getValue();
      totalPrice += item.getPrice() * quantity;
    }

    return totalPrice;
  }
}

