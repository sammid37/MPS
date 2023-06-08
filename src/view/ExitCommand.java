package view;

// Comando Exit comum à usuários CLient e Server (ambos podem ativar o mesmo comando que sai do sistema)
public class ExitCommand implements Command {
  FrontInterface frontInterface;

  public ExitCommand(FrontInterface frontInterface) {
    this.frontInterface = frontInterface;
  }

  public void execute() {
    System.out.println("Encerrando o Little Hot Pot... \nObrigado pela experiência!");
  }
}
