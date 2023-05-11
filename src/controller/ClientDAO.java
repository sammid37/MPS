package controller;

import java.util.ArrayList;
import java.util.List;

import model.Client;

public class ClientDAO {
  private List<Client> clients = new ArrayList<>();

  private static ClientDAO instance = null;
  public static ClientDAO getInstance() {
    if (instance == null) {
      instance = new ClientDAO();
    }
    return instance;
  }
  
  public void createClient(Client client) {
    clients.add(client);
  }

  public Client readClient(int id) {
    // Busca o usuário na lista pelo ID
    for (Client client : clients) {
      if (client.getId() == id) {
        return client;
      }
    }
    return null;
  }

  public void updateClient(Client client) {
    // Busca o usuário na lista pelo ID e atualiza
    for (int i = 0; i < clients.size(); i++) {
      if (clients.get(i).getId() == client.getId()) {
        clients.set(i, client);
        break;
      }
    }
  }

  public void deleteClient(Client client) {
    clients.remove(client);
  }
}
