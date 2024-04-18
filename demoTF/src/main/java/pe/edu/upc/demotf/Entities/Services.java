package pe.edu.upc.demotf.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Service")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idService;
    @Column(name="nameService",nullable = false,length =40)
    private String nameService;
    @Column(name = "descriptionService",nullable = false,length = 100)
    private String descriptionService;
    @Column(name="dateService",nullable = false)
    private LocalDate dateService;
    @Column(name = "hourService",nullable = false)
    private LocalTime timeService;
    public int userdni;


    public Services() {
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(String descriptionService) {
        this.descriptionService = descriptionService;
    }

    public LocalDate getDateService() {
        return dateService;
    }

    public void setDateService(LocalDate dateService) {
        this.dateService = dateService;
    }

    public LocalTime getTimeService() {
        return timeService;
    }

    public void setTimeService(LocalTime hourService) {
        this.timeService = hourService;
    }

    public int getUserdni() {
        return userdni;
    }

    public void setUserdni(int userdni) {
        this.userdni = userdni;
    }
}
