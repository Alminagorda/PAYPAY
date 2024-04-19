package pe.edu.upc.demotf.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Users")
public class Users implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name="username",length = 35,unique = true)
private String username;
@Column(name="lastnameUser",nullable = false,length = 35)
private String lastnameUser;
@Column(name="addressUser",nullable = false,length = 60)
private String addressUser;
@Column(name="cellphoneUser",nullable = false,length = 35)
private int  cellphoneUser;
    @Column(length = 200)
    private String password;
    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
private List<Role>roles;


    public Users() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastnameUser() {
        return lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
    }

    public String getAddressUser() {
        return addressUser;
    }

    public void setAddressUser(String addressUser) {
        this.addressUser = addressUser;
    }

    public int getCellphoneUser() {
        return cellphoneUser;
    }

    public void setCellphoneUser(int cellphoneUser) {
        this.cellphoneUser = cellphoneUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
