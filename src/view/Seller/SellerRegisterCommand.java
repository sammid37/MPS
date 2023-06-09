package view.Seller;

import java.util.Scanner;
import java.util.Map;

import business.controller.UserManagerFacade;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;
import view.Command;

public class ClientRegisterCommand implements Command {
  private ClientInterface clientInterface;
  private UserManagerFacade manager;
  private Scanner reader; // leitura de dados
  
  // Construtor
  public SellerRegisterCommand(SellerInterface sellerInterface) {
    this.sellerInterface = sellerInterface;
  }

  // Implementação do comando
  @Override
  public void execute() throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException, CpfInvalidException {
    sellerInterface.registrationMenu(); // exibe o cabeçalho deste menu
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
  
    Map<String, String> c = Map.of("id", id, "name", name, "cpf", cpf, "login", login, "password", password);
  
    try {
      manager.createUser(c);
      System.out.println("Usuário criado com sucesso!");
    } catch (LoginInvalidException | PasswordInvalidException | CpfInvalidException | CnpjInvalidException e) {
      System.out.println("Erro ao criar o usuário: " + e.getMessage());
    }
  }
}