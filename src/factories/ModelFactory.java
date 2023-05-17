package factories;

import java.util.Map;
import java.util.jar.Attributes.Name;

import business.model.Client;
import business.model.Seller;
import business.model.User;
import util.UserValidador;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public class ModelFactory {
  public static User newUser(Map<String, String> c)
      throws CpfInvalidException, LoginInvalidException, PasswordInvalidException, CnpjInvalidException {
    // user data validation
    UserValidador.validateLogin(c.get("login"));
    UserValidador.validatePassword(c.get("password"));

    if (c.containsKey("cpf")) {
      UserValidador.validateCpf(c.get("cpf"));
      return new Client(c.get("name"), c.get("cpf"), c.get("login"), c.get("password"));
    } else {
      UserValidador.validateCnpj(c.get("cnpj"));
      return new Seller(c.get("name"), c.get("cnpj"), c.get("login"), c.get("password"));
    }
  }
}