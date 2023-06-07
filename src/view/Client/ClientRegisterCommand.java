package view.Client;

import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;
import view.Command;
import view.FrontInterface;

public class ClientRegisterCommand implements Command {
  private FrontInterface frontInterface;

  public ClientRegisterCommand(FrontInterface frontInterface) {
      this.frontInterface = frontInterface;
  }

  @Override
  public void execute() {
      try {
          frontInterface.registrationMenu();
      } catch (LoginInvalidException | PasswordInvalidException | CnpjInvalidException | CpfInvalidException e) {
          System.out.println("Erro: " + e.getMessage());
      }
  }
}

// Implemente outras classes de comando de acordo com as operações do sistema
