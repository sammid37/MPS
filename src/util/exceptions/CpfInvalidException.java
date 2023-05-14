package util.exceptions;

public class CpfInvalidException extends UserException {
  private static final long serialVersionUID = 1L;

  public CpfInvalidException() {
    super("CPF Invalido");
  }

  public CpfInvalidException(String Message) {
    super(Message);
  }
}
