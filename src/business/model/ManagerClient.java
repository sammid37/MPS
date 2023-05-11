package business.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerClient {
  private List<Client> clients;

  public ManagerClient() {
    this.clients = new ArrayList<>();
  }

  public void addClient(Client client) {
    this.clients.add(client);
  }

  public void removeClient(Client client) {
    this.clients.remove(client);
  }

  public void updateClient(Client client) {
    // implementar lógica para atualizar informações do cliente
  }

  public Client findClientByName(String name) {
    for (Client client : clients) {
      if (client.getName() == name)
        return client;
    }
    return null;
  }

  public List<Order> getPedidos(Client cliente) {
    // implementar lógica para retornar lista de pedidos do cliente
    return null;
  }

}