package util.exceptions;

public class CnpjInvalidException extends UserException {
  public CnpjInvalidException() {
    super("CNPJ Invalido");
  }

  public CnpjInvalidException(String Message) {
    super(Message);
  }
}
