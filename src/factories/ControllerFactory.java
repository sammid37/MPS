package factories;

import business.controller.UserDAO;
import business.controller.UserManagerFacade;
import util.exceptions.InfraException;

public class ControllerFactory {
  public static UserManagerFacade newUserManagerFacade() throws InfraException {
    return UserManagerFacade.getInstance();
  }

  public static UserDAO newUserDao() throws InfraException {
    return UserDAO.getInstance();
  }
}
