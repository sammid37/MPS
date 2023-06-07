package view;

import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

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
  public void registrationMenu() throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException, CpfInvalidException {
    frontInterface.registrationMenu();
  }
}
