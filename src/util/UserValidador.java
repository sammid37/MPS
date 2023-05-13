package util;

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
