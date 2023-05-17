package factories;

import infra.UserFile;

public class InfraFactory {
  public static UserFile newUserFile() {
    return new UserFile();
  }
}