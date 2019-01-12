package DAO;

import Entities.UserRentCar;
import Interfaces.UserRentCarInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserRentCarDAO implements UserRentCarInterface {

    @Override
    public void createUserRentCar(UserRentCar userRentCar) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(userRentCar);
        em.getTransaction().commit();
        em.close();
        emf.close();    }

    @Override
    public void readUserRentCar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Users.findAll");
        List<UserRentCarInterface> userRentCarInterfaceList = query.getResultList();

        for (UserRentCarInterface urci : userRentCarInterfaceList) {
            System.out.println(urci.toString());
        }

        em.close();
        emf.close();    }

    @Override
    public void updateUserRentCar(UserRentCar userRentCar) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        UserRentCar urc = em.find(UserRentCar.class, userRentCar.getId());

        //before Update
        System.out.println(urc.toString());
        urc.setCarId(urc.getCarId());
        urc.setEndDate(urc.getEndDate());
        urc.setStartDate(urc.getStartDate());
        urc.setUserId(urc.getUserId());
        urc.setId(urc.getId());
        em.getTransaction().commit();

        //after Update
        System.out.println(urc.toString());
        em.close();
        emf.close();    }

    @Override
    public void deleteUserRentCar(UserRentCar userRentCar) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        UserRentCar urc = em.find(UserRentCar.class, userRentCar.getId());
        em.remove(urc);
        em.getTransaction().commit();
        em.close();
        emf.close();  
    }

}
