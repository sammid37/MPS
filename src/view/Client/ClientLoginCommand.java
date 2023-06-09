package view.Client;

import java.util.Scanner;

import business.controller.UserManagerFacade;
import util.exceptions.InfraException;
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
    try {
      if (UserManagerFacade.getInstance().checkUsernameExists(username_input)) {
        if (UserManagerFacade.getInstance().checkPasswordMatchesUsername(username_input, password_input)) {
          System.out.println("Login bem sucedido. Bem vindo, <nome>!");
          clientInterface.operationsMenu(); // Chama o menu de operações
        } else {
          System.out.println("Username ou senha incorretos. Tente novamente. ");
        }
      } else {
        System.out.println("Usuário não encontrado. Tente novamente. ");
      }
    } catch(InfraException e) {
      System.out.println("Ocorreu um erro na infraestrutura. Tente novamente mais tarde.");
    }
  }
}
