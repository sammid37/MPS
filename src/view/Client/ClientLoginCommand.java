package view.Client;

import java.util.Scanner;

import view.Command;

public class ClientLoginCommand implements Command {
  private ClientInterface clientInterface;
  private Scanner reader; // leitura de dados

  // Construtor
  public ClientLoginCommand(ClientInterface clientInterface) {
    this.clientInterface = clientInterface;
  }

  // Implementação do comando
  @Override
  public void execute() {
    clientInterface.loginMenu(); // exibe menu
    System.out.print("Username: ");
    String username_input = reader.nextLine();
    System.out.print("Senha: ");
    String password_input = reader.nextLine();

    /*//? Implementar limite de 3 tentativas
    if (username_input.doesExist()) { // ! implementar verificação se o usernama existe no DB
      if (password_input.doesMatchUsername()) { // ! implementar verificação se o usernama existe no DB
        System.out.println("Login bem sucedido. Bem vindo, <nome>!");
        clientInterface.operationsMenu(); // Chama o menu de operações
      } else {
        System.out.println("Username ou senha incorretos. Tente novamente. ");
      }
    }*/
  }
}
