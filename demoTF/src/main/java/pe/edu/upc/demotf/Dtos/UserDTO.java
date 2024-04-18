package pe.edu.upc.demotf.Dtos;



public class UserDTO {
    private int dni;
    private String nameUser;
    private String lastnameUser;
    private String addressUser;
    private int  cellphoneUser;
    public int rolId;

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
