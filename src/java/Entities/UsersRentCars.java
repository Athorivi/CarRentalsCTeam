package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "users_rent_cars", catalog = "cteam", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersRentCars.findAll", query = "SELECT u FROM UsersRentCars u")
    , @NamedQuery(name = "UsersRentCars.findById", query = "SELECT u FROM UsersRentCars u WHERE u.id = :id")
    , @NamedQuery(name = "UsersRentCars.findByStartDate", query = "SELECT u FROM UsersRentCars u WHERE u.startDate = :startDate")
    , @NamedQuery(name = "UsersRentCars.findByEndDate", query = "SELECT u FROM UsersRentCars u WHERE u.endDate = :endDate")})
public class UsersRentCars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Users userId;
    @JoinColumn(name = "car_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Cars carId;

    public UsersRentCars() {
    }

    public UsersRentCars(Integer id) {
        this.id = id;
    }

    public UsersRentCars(Integer id, Date startDate, Date endDate) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Cars getCarId() {
        return carId;
    }

    public void setCarId(Cars carId) {
        this.carId = carId;
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
        if (!(object instanceof UsersRentCars)) {
            return false;
        }
        UsersRentCars other = (UsersRentCars) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.UsersRentCars[ id=" + id + " ]";
    }
    
}
