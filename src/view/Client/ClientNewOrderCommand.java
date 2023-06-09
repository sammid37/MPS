package view.Client;

import view.Command;

import java.util.Scanner;

import business.controller.UserManagerFacade;
import business.model.Client;
import business.model.Item;
import business.model.Order;

public class ClientNewOrderCommand implements Command {
  private ClientInterface clientInterface;
  private Scanner reader;
  private UserManagerFacade userManagerFacade;
  private String clientId;

  public ClientNewOrderCommand(ClientInterface clientInterface, UserManagerFacade userManagerFacade, String clientId) {
    this.clientInterface = clientInterface;
    this.userManagerFacade = userManagerFacade;
    this.clientId = clientId;
    this.reader = new Scanner(System.in);
  }
  //! Precisa consertar
  @Override
  public void execute() {
    System.out.println("New Order Client");

    Client client = (Client) userManagerFacade.getClient(clientId);

    if (client != null) {
      System.out.println("Menu de Itens Disponíveis:");
      clientInterface.displayItems();

      System.out.println("Insira o ID do item que deseja adicionar ao pedido:");
      String itemId = reader.next();

      System.out.println("Insira a quantidade desejada:");
      int quantity = reader.nextInt();

      try {
        Item item = clientInterface.getItem(itemId);

        if (item != null) {
          client.addItemToOrder(item, quantity);
          System.out.println("Item adicionado ao pedido com sucesso!");
        } else {
          System.out.println("Item não encontrado.");
        }
      } catch (PriceInvalidException e) {
        System.out.println("Erro ao adicionar item ao pedido: " + e.getMessage());
      }
    } else {
      System.out.println("Cliente não encontrado.");
    }
  }
}