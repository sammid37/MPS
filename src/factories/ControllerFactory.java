package factories;

import business.controller.UserManagerFacade;
import business.model.UserList;
import util.exceptions.InfraException;

public class ControllerFactory {
  public static UserManagerFacade newUserManagerFacade() throws InfraException {
    return UserManagerFacade.getInstance();
  }

  public static UserList newUserList() throws InfraException {
    return UserList.getInstance();
  }
}
