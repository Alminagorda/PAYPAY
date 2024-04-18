package pe.edu.upc.demotf.Dtos;



public class BankingEntityDTO {

    private  int id;
    private  String name;
    private  String description;
    private String address;
    private String cell_phone_number;
    private  String website;
    private  String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell_phone_number() {
        return cell_phone_number;
    }

    public void setCell_phone_number(String cell_phone_number) {
        this.cell_phone_number = cell_phone_number;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
