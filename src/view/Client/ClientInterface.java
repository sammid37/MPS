package view.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import business.controller.UserManagerFacade;
import factories.ControllerFactory;
import util.exceptions.InfraException;
import view.Command;
import view.FrontInterface;
import view.ExitCommand;

public class ClientInterface implements FrontInterface {
  private Scanner reader;
  private UserManagerFacade manager;
  private Map<Integer, Command> commandMap;


  public ClientInterface() throws InfraException {
    this.reader = new Scanner(System.in);
    manager = ControllerFactory.newUserManagerFacade();
    initializeCommandMap();
  }

  private void initializeCommandMap() {
    commandMap = new HashMap<>();
    commandMap.put(1, new ClientRegisterCommand(this, manager, reader));
    commandMap.put(2, new ClientLoginCommand(this, reader));
    commandMap.put(3, new ExitCommand(this));
  }

  public void menuMessage() {
    System.out.println("----------------------------------------------");
    System.out.println("           Little Hot Pot - Cliente           ");
    System.out.println("----------------------------------------------");
    System.out.println("       Selecione uma das opções abaixo:       ");
    System.out.println("----------------------------------------------");
    System.out.println("  1 - Cadastrar cliente                       ");
    System.out.println("  2 - Login do cliente                        ");
    System.out.println("  3 - Sair                                    ");
    System.out.println("----------------------------------------------");
    System.out.println("          Digite o número da opção:           ");

    try {
      int optionInt = reader.nextInt();
      if (commandMap.containsKey(optionInt)) {
        Command command = commandMap.get(optionInt);
        command.execute();
      } else {
        System.out.println("Opção indisponível. Tente novamente.");
      }
    } catch (Exception e) {
      System.out.println("Erro " + e + " encontrado. Tente novamente.");
    }
  }

  public void registrationMenu() {
    System.out.println("----------------------------------------------");
    System.out.println("         Little Hot Pot - Client Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> REGISTER");
  }

  public void loginMenu() {
    System.out.println("----------------------------------------------");
    System.out.println("         Little Hot Pot - Client Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> LOGIN");
  }

  public void operationsMenu() {
    System.out.println("----------------------------------------------");
    System.out.println("         Little Hot Pot - Client Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> Operations");
    System.out.println("1 - Order Meal or Snacks");
    System.out.println("2 - Update Account");
    System.out.println("3 - Logout");
    System.out.print("\nType an option: ");
  }
}