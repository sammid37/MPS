package view;
// Arquivo Principal

import util.exceptions.InfraException;

public class Main {

  public static void main(String[] args) throws InfraException {
    FrontClient fc = new FrontClient();

    System.out.println("Little Hot Pot");
    fc.menuMessage();
  }
}