package view.Seller;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;
import view.Command;
import view.FrontInterfaceAdapter;


public class SellerLoginCommand implements Command {
  private FrontInterfaceAdapter sellerInterface;

  public SellerLoginCommand(FrontInterfaceAdapter sellerInterface) {
    this.sellerInterface = sellerInterface;
  }

  @Override
  public void execute() throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException, CpfInvalidException {
    System.out.println("LOGIN Seller");
    sellerInterface.menuMessage();
    sellerInterface.registrationMenu();
    // operações
  }
}
