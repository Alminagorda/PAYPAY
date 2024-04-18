package pe.edu.upc.demotf.Dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class ServiceDTO {
    private int idService;
    private String nameService;
    private String descriptionService;
    private LocalDate dateService;
    private LocalTime timeService;
    public int userdni;

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

    public void setTimeService(LocalTime timeService) {
        this.timeService = timeService;
    }

    public int getUserdni() {
        return userdni;
    }

    public void setUserdni(int userdni) {
        this.userdni = userdni;
    }
}
