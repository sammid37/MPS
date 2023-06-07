package view;

import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public interface FrontInterface {
  void menuMessage();
  void registrationMenu() throws LoginInvalidException, PasswordInvalidException, CnpjInvalidException, CpfInvalidException ;
}