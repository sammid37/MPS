package view;

public class FrontInterfaceAdapter implements FrontInterface {
  private FrontInterface frontInterface; // ou SellerInterface, dependendo do tipo de usuário

  public FrontInterfaceAdapter(FrontInterface frontInterface) {
    this.frontInterface = frontInterface;
  }

  @Override
  public void menuMessage() {
    frontInterface.menuMessage();
  }

  @Override
  public void registrationMenu() {
    frontInterface.registrationMenu();
  }

  @Override
  public void loginMenu() {
    frontInterface.loginMenu();
  }

  @Override
  public void operationsMenu() {
    frontInterface.operationsMenu();
  }
}
