package view;

public class frontClient {
  private Scanner reader;
  public frontClient(){
   this.reader = new Scanner(System.in);
  }

  public void menuMessage(){
    System.out.println("----------------------------------------------");
    System.out.println("           Little Hot Pot - Cliente           ");
    System.out.println("----------------------------------------------");
    System.out.println("       Selecione uma das opções abaixo:       ");
    System.out.println("----------------------------------------------");
    System.out.println("  1 - Cadastrar cliente                       ");
    System.out.println("  2 - A definir                               ");
    System.out.println("  3 - A definir                               ");
    System.out.println("----------------------------------------------");
    System.out.println("          Digite o número da opção:           ");

    try{
      int optionInt = reader.nextInt();
    }
    catch(Exception e){
      System.out.println("Erro " + e + " encontrado. Tente novamente.");
    }

    if(optionInt == 1){
      registrationMenu();
    }
    else{
      // nada por enquanto
    }
  } // da pra aplicar strategy nessas classes do modulo view se permanecermos nesse formato

  public void registrationMenu(){
    System.out.println("----------------------------------------------");
    System.out.println("             Cadastrar um Cliente             ");
    System.out.println("----------------------------------------------");
    System.out.println("       Insira o código de identificação       ");
    int id = reader.nextInt();
    System.out.println("           Insira o login desejado            ");
    String login = reader.next();
    System.out.println("           Insira a senha desejada            ");
    String password = reader.nextLine();
    System.out.println("          Insira o seu nome completo          ");
    String name = reader.nextLine();
    System.out.println("               Insira o seu CPF               ");
    String cpf = reader.next();

    // simulação de cadastro, pois o cadastro esta a ser resolvido
    System.out.println("Nome: " + name);
    System.out.println("CPF: " + cpf);
    System.out.println("Login: " + login);
    System.out.println("Senha: " + password);
    System.out.println("ID: " + id);
  }
}