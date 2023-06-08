package view.Client;

import java.util.Scanner;

import view.Command;

public class ClientNewOrderCommand implements Command {
  private ClientInterface clientInterface;
  private Scanner reader; // leitura de dados

  public ClientNewOrderCommand(ClientInterface clientInterface) {
    this.clientInterface = clientInterface;

  }

  @Override
  public void execute() {
    // ! Inserir lógica para realizar pedidos do usuário Client
    System.out.println("New Order Client");
  }
}
