package Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(catalog = "cteam", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c")
    , @NamedQuery(name = "Cars.findById", query = "SELECT c FROM Cars c WHERE c.id = :id")
    , @NamedQuery(name = "Cars.findByOwner", query = "SELECT c FROM Cars c WHERE c.owner = :owner")
    , @NamedQuery(name = "Cars.findByModel", query = "SELECT c FROM Cars c WHERE c.model = :model")
    , @NamedQuery(name = "Cars.findByLocation", query = "SELECT c FROM Cars c WHERE c.location = :location")
    , @NamedQuery(name = "Cars.findByBrand", query = "SELECT c FROM Cars c WHERE c.brand = :brand")
    , @NamedQuery(name = "Cars.findByKm", query = "SELECT c FROM Cars c WHERE c.km = :km")
    , @NamedQuery(name = "Cars.findByFuel", query = "SELECT c FROM Cars c WHERE c.fuel = :fuel")
    , @NamedQuery(name = "Cars.findByCc", query = "SELECT c FROM Cars c WHERE c.cc = :cc")
    , @NamedQuery(name = "Cars.findByPrice", query = "SELECT c FROM Cars c WHERE c.price = :price")
    , @NamedQuery(name = "Cars.findByCategories", query = "SELECT c FROM Cars c WHERE c.categories = :categories")
    , @NamedQuery(name = "Cars.findByReleaseDate", query = "SELECT c FROM Cars c WHERE c.releaseDate = :releaseDate")
    , @NamedQuery(name = "Cars.findByColor", query = "SELECT c FROM Cars c WHERE c.color = :color")})
public class Cars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false)
    private int owner;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String model;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String location;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String brand;
    @Basic(optional = false)
    @Column(nullable = false)
    private long km;
    @Basic(optional = false)
    @Column(nullable = false, length = 30)
    private String fuel;
    @Basic(optional = false)
    @Column(nullable = false)
    private int cc;
    @Basic(optional = false)
    @Column(nullable = false)
    private double price;
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String categories;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String color;
    @Lob
    private byte[] photo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carId")
    private Collection<UsersRentCars> usersRentCarsCollection;

    public Cars() {
    }

    public Cars(Integer id) {
        this.id = id;
    }

    public Cars(Integer id, int owner, String model, String location, String brand, long km, String fuel, int cc, double price, String categories, Date releaseDate, String color) {
        this.id = id;
        this.owner = owner;
        this.model = model;
        this.location = location;
        this.brand = brand;
        this.km = km;
        this.fuel = fuel;
        this.cc = cc;
        this.price = price;
        this.categories = categories;
        this.releaseDate = releaseDate;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @XmlTransient
    public Collection<UsersRentCars> getUsersRentCarsCollection() {
        return usersRentCarsCollection;
    }

    public void setUsersRentCarsCollection(Collection<UsersRentCars> usersRentCarsCollection) {
        this.usersRentCarsCollection = usersRentCarsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Cars[ id=" + id + " ]";
    }
    
}
