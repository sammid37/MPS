package view.Seller;

import java.util.Scanner;

import util.exceptions.CnpjInvalidException;
import view.FrontInterface;

public class SellerInterface implements FrontInterface {
  private Scanner reader;

  public SellerInterface() {
    this.reader = new Scanner(System.in);
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
      if (optionInt == 1) {
        loginMenu();
      } else if (optionInt == 2) {
        registrationMenu();
      } else {
        System.out.println("Saindo do programa");
      }
    } catch (Exception e) {
      System.out.println("Erro " + e + " encontrado. Tente novamente.");
    }

  }

  // ! REALIZAR MESMO PROCEDIMENTO DE CLIENT
  public void registrationMenu() throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException {
    System.out.println("----------------------------------------------");
    System.out.println("         Little Hot Pot - Seller Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> REGISTER");
    System.out.println("       Insira o código de identificação       ");
    int id = reader.nextInt();
    System.out.println("           Insira o login desejado            ");
    String login = reader.next();
    System.out.println("           Insira a senha desejada            ");
    String password = reader.nextLine();
    System.out.println("            Insira o nome da loja             ");
    String shopName = reader.nextLine();
    System.out.println("                Insira o CNPJ                 ");
    String cnpj = reader.next();

    // simulação de cadastro, pois o cadastro esta a ser resolvido
    System.out.println("Nome da Loja: " + shopName);
    System.out.println("CNPJ: " + cnpj);
    System.out.println("Login: " + login);
    System.out.println("Senha: " + password);
    System.out.println("ID: " + id);
  }

  public void loginMenu() {
    System.out.println("----------------------------------------------");
    System.out.println("         Little Hot Pot - Seller Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> LOGIN");
  }

  public void operationsMenu() {
    System.out.println("----------------------------------------------");
    System.out.println("         Little Hot Pot - Seller Side         ");
    System.out.println("----------------------------------------------");
    System.out.println(">>> Manage Orders from your clients and Products");
    System.out.println("\nWould you like to read the instructions? ");
  }
}
