package view;
// Arquivo Principal

import util.exceptions.InfraException;
import view.Client.ClientInterface;
import view.Seller.SellerInterface;

public class Main {

  public static void main(String[] args) throws InfraException {
    FrontInterface clientInterface = new FrontInterfaceAdapter(new ClientInterface());
    FrontInterface sellerInterface = new FrontInterfaceAdapter(new SellerInterface());

    System.out.println("Little Hot Pot");
    clientInterface.menuMessage();
    sellerInterface.menuMessage();

    /*
    UserInterface userInterface = new UserInterface(clientInterface, sellerInterface);
    userInterface.showInitialScreen();
    */

  }
}


/*
OrderTemplate snackOrder = new SnackOrder();
snackOrder.processOrder();

OrderTemplate mealOrder = new MealOrder();
mealOrder.processOrder();
 */