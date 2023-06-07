package view.Client;

import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;
import view.Command;
import view.FrontInterfaceAdapter;

public class ClientLoginCommand implements Command {
  private FrontInterfaceAdapter clientInterface;

  public ClientLoginCommand(FrontInterfaceAdapter clientInterface) {
    this.clientInterface = clientInterface;
  }

  @Override
  public void execute() throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException, CpfInvalidException {
    System.out.println("LOGIN Client");

    clientInterface.menuMessage();
    clientInterface.registrationMenu();
    // outras operações

  }
}
