package view;
// Arquivo Principal

import util.exceptions.InfraException;

public class Main {

  public static void main(String[] args) throws InfraException {
    FrontInterface clientInterface = new FrontInterfaceAdapter(new ClientInterface());
    FrontInterface sellerInterface = new FrontInterfaceAdapter(new SellerInterface());

    System.out.println("Little Hot Pot");
    clientInterface.menuMessage();
    sellerInterface.menuMessage();

  }
}