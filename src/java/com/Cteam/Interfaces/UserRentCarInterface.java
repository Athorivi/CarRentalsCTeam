package com.Cteam.Interfaces;

import com.Cteam.Tables.UserRentCar;
import java.util.ArrayList;

public interface UserRentCarInterface {

    public void createUserRentCar(UserRentCar userRentCar);

    public ArrayList<UserRentCar> readUserRentCar();

    public void updateUserRentCar(UserRentCar userRentCar);

    public void deleteUserRentCar(UserRentCar userRentCar);

}
