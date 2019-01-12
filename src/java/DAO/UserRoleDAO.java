package DAO;

import Entities.UsersRoles;
import Interfaces.UserRoleInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserRoleDAO implements UserRoleInterface {

    @Override
    public void createUserRole(UsersRoles userRole) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(userRole);
        em.getTransaction().commit();
        em.close();
        emf.close();    }

    @Override
    public void readUserRole() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Users.findAll");
        List<UsersRoles> usersRolesList = query.getResultList();

        for (UsersRoles ur : usersRolesList) {
            System.out.println(ur.toString());
        }

        em.close();
        emf.close();    }

    @Override
    public void updateUserRole(UsersRoles userRole) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        UsersRoles ur = em.find(UsersRoles.class, userRole.getId());

        //before Update
        ur.setId(ur.getId());
        ur.setRoleId(ur.getRoleId());
        ur.setUserId(ur.getUserId());
        
        em.getTransaction().commit();

        //after Update
        System.out.println(ur.toString());
        em.close();
        emf.close();    }

    @Override
    public void deleteUserRole(UsersRoles userRole) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        UsersRoles ur = em.find(UsersRoles.class, userRole.getId());
        em.remove(ur);
        em.getTransaction().commit();
        em.close();
        emf.close();    }

}
