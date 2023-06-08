package util.exceptions;

public class PriceInvalidException extends ItemException {

  public PriceInvalidException() {
    super("Preço Inválido");
  }

  public PriceInvalidException(String Message) {
    super(Message);
  }
}
