package util;

import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

public class UserValidador {

  public static void validateLogin(String login) throws LoginInvalidException {

    if (login.length() > 20)
      throw new LoginInvalidException("Login com mais de 20 caracteres!\n");
    else if (login.length() == 0)
      throw new LoginInvalidException("Login vazio!\n");
    else if (login.matches(".*\\d.*"))
      throw new LoginInvalidException("Login nao pode conter numeros!\n");
    ;
  }

  public static void validatePassword(String pass) throws PasswordInvalidException {

    if (pass.length() > 12)
      throw new PasswordInvalidException("Senha nao pode possuir mais de 12 caracteres!\n");
    else if (pass.length() < 8)
      throw new PasswordInvalidException("Senha nao pode possuir menos de 8 caracteres!\n");
    else if (!pass.matches(".*\\d.*") || !pass.matches(".*\\c.*"))
      throw new PasswordInvalidException("Senha deve possuir caracteres e numeros!\n");
    else if (countNumbers(pass) < 2)
      throw new PasswordInvalidException("Senha deve ter pelo menos 2 numeros!\n");
  }

  public static void validateCpf(String cpf) throws CpfInvalidException {
    if (cpf.length() != 11)
      throw new CpfInvalidException("Cpf deve possuir exatamente 11 caracteres!\n");
    else if (countNumbers(cpf) != cpf.length())
      throw new CpfInvalidException("Cpf so pode possuir digitos!\n");
  }

  public static void validateCnpj(String cnpj) throws CnpjInvalidException {
    if (cnpj.length() != 14)
      throw new CnpjInvalidException("Cnpj deve possuir exatamente 14 caracteres!\n");
    else if (countNumbers(cnpj) != cnpj.length())
      throw new CnpjInvalidException("Cnpj so pode possuir digitos!\n");
  }

  private static int countNumbers(String s) {
    int count = 0;
    for (int i = 0, len = s.length(); i < len; i++) {
      if (Character.isDigit(s.charAt(i))) {
        count++;
      }
    }
    return count;
  }
}
