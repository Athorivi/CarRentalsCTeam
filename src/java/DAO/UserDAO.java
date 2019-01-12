package DAO;

import Entities.Users;
import Interfaces.UserInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDAO implements UserInterface {

    @Override
    public void createUser(Users user) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void readUser() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Users.findAll");
        List<Users> usersList = query.getResultList();

        for (Users u : usersList) {
            System.out.println(u.toString());
        }

        em.close();
        emf.close();
    }

    @Override
    public void updateUser(Users user) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        Users u = em.find(Users.class, user.getId());

        //before Update
        System.out.println(u.toString());
        u.setUsername(user.getUsername());
        u.setPassword(user.getPassword());
        u.setFname(user.getFname());
        u.setLname(user.getLname());
        u.setDob(user.getDob());
        u.setEmail(user.getEmail());
        u.setAddress(user.getAddress());
        u.setPhone(user.getPhone());
        u.setPhoto(user.getPhoto());

        em.getTransaction().commit();

        //after Update
        System.out.println(u.toString());
        em.close();
        emf.close();

    }

    @Override
    public void deleteUser(Users user) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Users u = em.find(Users.class, user.getId());
        em.remove(u);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
