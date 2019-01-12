package DAO;

import Entities.Cars;
import Interfaces.CarInterface;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CarDAO implements CarInterface {

    @Override
    public void createCar(Cars car) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void readCar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Cars.findAll");
        List<Cars> carsList = query.getResultList();

        for (Cars c : carsList) {
            System.out.println(c.toString());
        }

        em.close();
        emf.close();
    }

    @Override
    public void updateCar(Cars car) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        Cars c = em.find(Cars.class, car.getId());

        //before Update
        System.out.println(c.toString());
        c.setBrand(c.getBrand());
        c.setCategories(c.getCategories());
        c.setCc(c.getCc());
        c.setColor(c.getColor());
        c.setFuel(c.getFuel());
        c.setKm(c.getKm());
        c.setLocation(c.getLocation());
        c.setModel(c.getModel());
        c.setOwner(c.getOwner());
        c.setPhoto(c.getPhoto());
        c.setPrice(c.getPrice());
        c.setReleaseDate(c.getReleaseDate());
        
        em.getTransaction().commit();

        //after Update
        System.out.println(c.toString());
        em.close();
        emf.close();    }

    @Override
    public void deleteCar(Cars car) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarRentalProjectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cars c = em.find(Cars.class, car.getId());
        em.remove(c);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
