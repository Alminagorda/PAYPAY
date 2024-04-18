package pe.edu.upc.demotf.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int dni;
@Column(name="nameUser",nullable = false,length = 35)
private String nameUser;
@Column(name="lastnameUser",nullable = false,length = 35)
private String lastnameUser;
@Column(name="addressUser",nullable = false,length = 60)
private String addressUser;
@Column(name="cellphoneUser",nullable = false,length = 35)
private int  cellphoneUser;


public int rolId;



    public User() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
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

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }
}
