package pe.edu.upc.demotf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TypeService")
public class TypeService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeService;
    @Column(name = "nameTypeService",nullable = false,length = 40)
    private String nameTypeService;

    @ManyToOne
    @JoinColumn(name = "idService")
    private ServiceB service;


    public TypeService() {
    }

    public TypeService(int idTypeService, String nameTypeService, ServiceB service) {
        this.idTypeService = idTypeService;
        this.nameTypeService = nameTypeService;
        this.service = service;
    }

    public int getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(int idTypeService) {
        this.idTypeService = idTypeService;
    }

    public String getNameTypeService() {
        return nameTypeService;
    }

    public void setNameTypeService(String nameTypeService) {
        this.nameTypeService = nameTypeService;
    }

    public ServiceB getService() {
        return service;
    }

    public void setService(ServiceB service) {
        this.service = service;
    }
}
