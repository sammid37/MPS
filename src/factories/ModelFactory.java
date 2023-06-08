package factories;

import java.util.Map;

import business.model.Client;
import business.model.Item;
import business.model.Seller;
import business.model.User;
import util.UserValidador;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public class ModelFactory {
  public static User newUser(Map<String, String> user)
      throws CpfInvalidException, LoginInvalidException, PasswordInvalidException, CnpjInvalidException {
    // user data validation
    UserValidador.validateLogin(user.get("login"));
    UserValidador.validatePassword(user.get("password"));

    if (user.containsKey("cpf")) {
      UserValidador.validateCpf(user.get("cpf"));
      return new Client(user.get("name"), user.get("cpf"), user.get("login"), user.get("password"));
    } else {
      UserValidador.validateCnpj(user.get("cnpj"));
      return new Seller(user.get("name"), user.get("cnpj"), user.get("login"), user.get("password"));
    }
  }

  public static Item newItem(Map<String, String> item) {
    // validar price (checar se eh int)
    return new Item(item.get("name"), Double.parseDouble(item.get("price")));
  }
}