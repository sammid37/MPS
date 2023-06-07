package view.Seller;
import view.Command;

import util.exceptions.CpfInvalidException;
import util.exceptions.CnpjInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public class SellerManageMenuCommand implements Command {

  @Override
  public void execute() throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException, CpfInvalidException {
    System.out.println("Manage Menu by Seller");
    System.out.println("Create Menu");
    System.out.println("Read Menu");
    System.out.println("Update Menu");
    System.out.println("Delete Menu");
  }
}
