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
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(catalog = "cteam", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"email"})
    , @UniqueConstraint(columnNames = {"username"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id")
    , @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.findByFname", query = "SELECT u FROM Users u WHERE u.fname = :fname")
    , @NamedQuery(name = "Users.findByLname", query = "SELECT u FROM Users u WHERE u.lname = :lname")
    , @NamedQuery(name = "Users.findByDob", query = "SELECT u FROM Users u WHERE u.dob = :dob")
    , @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email")
    , @NamedQuery(name = "Users.findByAddress", query = "SELECT u FROM Users u WHERE u.address = :address")
    , @NamedQuery(name = "Users.findByPhone", query = "SELECT u FROM Users u WHERE u.phone = :phone")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String username;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String password;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String fname;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String lname;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(nullable = false, length = 360)
    private String email;
    @Basic(optional = false)
    @Column(nullable = false, length = 250)
    private String address;
    @Column(length = 15)
    private String phone;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false)
    private byte[] photo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<UserRentCar> usersRentCarsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<UsersRoles> usersRolesCollection;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Users(Integer id, String username, String password, String fname, String lname, Date dob, String email, String address, byte[] photo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.photo = photo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @XmlTransient
    public Collection<UserRentCar> getUsersRentCarsCollection() {
        return usersRentCarsCollection;
    }

    public void setUsersRentCarsCollection(Collection<UserRentCar> usersRentCarsCollection) {
        this.usersRentCarsCollection = usersRentCarsCollection;
    }

    @XmlTransient
    public Collection<UsersRoles> getUsersRolesCollection() {
        return usersRolesCollection;
    }

    public void setUsersRolesCollection(Collection<UsersRoles> usersRolesCollection) {
        this.usersRolesCollection = usersRolesCollection;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", username=" + username + ", password=" + password + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", email=" + email + ", address=" + address + ", phone=" + phone + ", photo=" + photo + ", usersRentCarsCollection=" + usersRentCarsCollection + ", usersRolesCollection=" + usersRolesCollection + '}';
    }

    
    
}
