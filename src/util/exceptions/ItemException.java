package util.exceptions;

public class ItemException extends Exception {

  public ItemException() {
    super("Item inválido");
  }

  public ItemException(String message) {
    super(message);
  }
}
