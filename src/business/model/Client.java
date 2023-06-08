package business.model;

import java.util.HashMap;
import java.util.Map;

import factories.ModelFactory;
import util.exceptions.PriceInvalidException;

public class Client extends User {
  private Map<String, Item> order;
  private String cpf;

  public Client(String name, String cpf, String login, String password) {
    super(name, login, password);
    this.cpf = cpf;
    order = new HashMap<String, Item>();
  }

  @Override
  public int getAccessLevel() {
    return User.CLIENT;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void addItemToOrder(Map<String, String> item) throws PriceInvalidException {
    order.put(item.get("id"), ModelFactory.newItem(item));
  }

  public Item findOrderItem(String id) {
    return order.get(id);
  }

  public void updateOrderItem() {
  }

  public void deleteOrderItem(String id) {
    order.remove(id);
  }

  public double totalPrice() {
    double total = 0.0;
    for (Item item : order.values()) {
      total += item.getPrice();
    }
    return total;
  }

  public void listAllOrderItems() {
    for (Item item : order.values()) {
      System.out.println(item.getName());
    }
  }
}
