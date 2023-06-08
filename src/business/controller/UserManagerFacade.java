package business.controller;

import java.util.Map;

import business.model.User;
import business.model.Client;
import business.model.Seller;
import business.model.UserList;
import factories.ControllerFactory;
import util.exceptions.CnpjInvalidException;
import util.exceptions.CpfInvalidException;
import util.exceptions.InfraException;
import util.exceptions.LoginInvalidException;
import util.exceptions.PasswordInvalidException;

/*
 * Singleton Facade de Gerenciamento de Usuários
 Declarada como final para impedir que outras classes possam 
 estendê-la e criar outras fachadas para gerenciamento de usuários
 */
public final class UserManagerFacade {
  private static UserManagerFacade instance;
  private UserList userList;

  private UserManagerFacade() throws InfraException {
    userList = ControllerFactory.newUserList();
  }

  public static UserManagerFacade getInstance() throws InfraException {
    if (instance == null) {
      instance = new UserManagerFacade();
    }
    return instance;
  }

  public void createUser(Map<String, String> c)
      throws LoginInvalidException, PasswordInvalidException, CpfInvalidException, CnpjInvalidException {
    userList.createUser(c);
  }

  public Client getClient(String id) {
    return (Client) userList.findUser(id);
  }

  public Seller getSeller(String id) {
    return (Seller) userList.findUser(id);
  }

  public void updateUser(String id, String... args) {
    User user = userList.findUser(id);
    if (user != null) {
      if (user instanceof Seller) {
        Seller seller = (Seller) user;
        // Atualize os atributos do vendedor com os novos valores
        // seller.setCnpj(args[0]);
        // seller.setName(args[1]);
        // ...
        System.out.println("Vendedor atualizado com sucesso!");
      } else if (user instanceof Client) {
        Client client = (Client) user;
        // Atualize os atributos do cliente com os novos valores
        // client.setCpf(args[0]);
        // client.setName(args[1]);
        // ...
        System.out.println("Cliente atualizado com sucesso!");
      } else {
        System.out.println("Tipo de usuário não reconhecido.");
      }
    } else {
      System.out.println("Usuário não encontrado.");
    }
  }  
  
  public void deleteUser(String id) {
    userList.deleteUser(id);
  }
  
  public void listUsers() {
    System.out.println("Lista de Usuários:");
    for (User user : userList.getUsers().values()) {
      if (user instanceof Seller) {
        Seller seller = (Seller) user;
        System.out.println("Vendedor: " + seller.getName() + " (CNPJ: " + seller.getCnpj() + ")");
      } else if (user instanceof Client) {
        Client client = (Client) user;
        System.out.println("Cliente: " + client.getName() + " (CPF: " + client.getCpf() + ")");
      } else {
        System.out.println("Tipo de usuário não reconhecido.");
      }
    }
  }
}