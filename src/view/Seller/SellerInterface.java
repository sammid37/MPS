package view.Seller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import util.exceptions.CnpjInvalidException;
import view.FrontInterface;
import business.controller.UserManagerFacade;
import factories.ControllerFactory;
import util.exceptions.InfraException;
import view.Command;
import view.ExitCommand;

public class SellerInterface implements FrontInterface {
  private Scanner reader;
  private UserManagerFacade manager;
  private Map<Integer, Command> commandMap;


public SellerInterface() throws InfraException{
    this.reader = new Scanner(System.in);
    manager = ControllerFactory.newUserManagerFacade();
    InitializeCommandMap();
  }

  private void InitializeCommandMap() {
    commandMap = new HashMap<>();
    // commandMap.put(1, new SellerRegisterCommand(this));
    // commandMap.put(2, new SellerLoginCommand(this));
    commandMap.put(3, new ExitCommand(this));
  }
  
  public void menuMessage() {
    System.out.println("----------------------------------------------");
    System.out.println("          Little Hot Pot - Seller           ");
    System.out.println("----------------------------------------------");
    System.out.println("       Selecione uma das opções abaixo:       ");
    System.out.println("----------------------------------------------");
    System.out.println("  1 - Login Seller                            ");
    System.out.println("  2 - Register Seller                         ");
    System.out.println("  3 - Quit Application                        ");
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
    System.out.println("         Little Hot Pot - Seller Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> REGISTER");
  }

  public void loginMenu() {
    System.out.println("----------------------------------------------");
    System.out.println("         Little Hot Pot - Seller Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> LOGIN");
  }

  public void operationsMenu() {
    System.out.println("----------------------------------------------");
    System.out.println("         Little Hot Pot - Client Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> Operations");
    System.out.println("1 - Manager Menu");
    System.out.println("2 - Update Account");
    System.out.println("3 - Logout");
    System.out.print("\nType an option: ");
  }
}
