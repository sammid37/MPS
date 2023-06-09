package view;
// Arquivo Principal

import java.util.Scanner;

import util.exceptions.InfraException;
import view.Client.ClientInterface;
import view.Seller.SellerInterface;

public class Main {
  public static void main(String[] args) throws InfraException {
    FrontInterface clientInterface = new FrontInterfaceAdapter(new ClientInterface());
    FrontInterface sellerInterface = new FrontInterfaceAdapter(new SellerInterface());

    System.out.println("Little Hot Pot");

    int userType = getUserType(); 

    if (userType == 1) {
      clientInterface.menuMessage();
    } else if (userType == 2) {
      sellerInterface.menuMessage();
    } else {
      System.out.println("Tipo de usuário inválido.");
      return;
    }
  }

  private static int getUserType() {
    // Solicite ao usuário que insira o tipo de usuário (1 para Client, 2 para Seller) e retorne o valor inserido
    // Exemplo: Utilize a classe Scanner para obter a entrada do usuário e faça a validação necessária
    // Você pode usar o seguinte código como ponto de partida:
   
    Scanner scanner = new Scanner(System.in);
    System.out.println("Selecione o tipo de usuário:");
    System.out.println("1 - Cliente");
    System.out.println("2 - Vendedor");
    
    int userType = scanner.nextInt();
    scanner.nextLine();

    return userType;
  }
}
