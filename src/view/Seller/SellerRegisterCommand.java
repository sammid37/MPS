package view.Seller;
import view.Command;

import util.exceptions.CpfInvalidException;
import util.exceptions.CnpjInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public class SellerRegisterCommand implements Command{

  @Override
  public void execute() throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException, CpfInvalidException {
    System.out.println("Register new Seller");
  }
}
