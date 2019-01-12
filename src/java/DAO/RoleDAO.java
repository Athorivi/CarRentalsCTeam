package DAO;

import Entities.Roles;
import Interfaces.RoleInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RoleDAO implements RoleInterface {

    @Override
    public void createRole(Roles role) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(role);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void readRole() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Roles.findAll");
        List<Roles> rolesList = query.getResultList();

        for (Roles r : rolesList) {
            System.out.println(r.toString());
        }

        em.close();
        emf.close();
    }

    @Override
    public void updateRole(Roles role) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        Roles r = em.find(Roles.class, role.getId());

        //before Update
        System.out.println(r.toString());
        r.setDescription(role.getDescription());
        r.setName(r.getName());
        em.getTransaction().commit();

        //after Update
        System.out.println(r.toString());
        em.close();
        emf.close();

    }

    @Override
    public void deleteRole(Roles role) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Roles r = em.find(Roles.class, role.getId());
        em.remove(r);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

}
