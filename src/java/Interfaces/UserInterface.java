package Interfaces;

import Entities.Users;

public interface UserInterface {

    public void createUser(Users user);

    public void readUser();

    public void updateUser(Users user);

    public void deleteUser(Users user);

}
