package pe.edu.upc.demotf.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="entidadBancarias")
  public class BankingEntitys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column (nullable = false, length = 50)
    private  String name;
    @Column (nullable = false, length = 100)
    private  String description;
    @Column (nullable = false, length = 100)
    private String address;
    @Column (nullable = false, length = 9)
    private String cell_phone_number;
    @Column (nullable = false, length = 100)
    private  String website;
    @Column (nullable = false, length = 50)
    private  String email;

    public BankingEntitys() {
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
