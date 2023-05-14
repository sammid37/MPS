package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import business.controller.UserManagerFacade;
import factories.ControllerFactory;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.InfraException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public class FrontClient {
  private Scanner reader;
  private UserManagerFacade manager;

  public FrontClient() throws InfraException {
    this.reader = new Scanner(System.in);
    manager = ControllerFactory.newUserManagerFacade();
  }

  public void menuMessage() {
    System.out.println("----------------------------------------------");
    System.out.println("           Little Hot Pot - Cliente           ");
    System.out.println("----------------------------------------------");
    System.out.println("       Selecione uma das opções abaixo:       ");
    System.out.println("----------------------------------------------");
    System.out.println("  1 - Cadastrar cliente                       ");
    System.out.println("  2 - A definir                               ");
    System.out.println("  3 - A definir                               ");
    System.out.println("----------------------------------------------");
    System.out.println("          Digite o número da opção:           ");

    try {
      int optionInt = reader.nextInt();
      if (optionInt == 1) {
        registrationMenu();
      } else {
        // nada por enquanto
      }
    } catch (Exception e) {
      System.out.println("Erro " + e + " encontrado. Tente novamente.");
    }

  } // da pra aplicar strategy nessas classes do modulo view se permanecermos nesse
    // formato

  public void registrationMenu()
      throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException, CpfInvalidException {
    System.out.println("----------------------------------------------");
    System.out.println("             Cadastrar um Cliente             ");
    System.out.println("----------------------------------------------");
    System.out.println("       Insira o código de identificação       ");
    String id = reader.next();
    System.out.println("           Insira o login desejado            ");
    reader.nextLine();
    String login = reader.nextLine();
    System.out.println("           Insira a senha desejada            ");
    String password = reader.nextLine();
    System.out.println("          Insira o seu nome completo          ");
    String name = reader.nextLine();
    System.out.println("               Insira o seu CPF               ");
    String cpf = reader.next();

    Map<String, String> c = new HashMap<>();
    c.put("id", id);
    c.put("name", name);
    c.put("cpf", cpf);
    c.put("login", login);
    c.put("password", password);

    manager.createUser(c);

    System.out.println();
    System.out.println(manager.getClient(id).getAccessLevel());
    System.out.println(manager.getClient(id).getCpf());
    System.out.println(manager.getClient(id).getLogin());
  }
}