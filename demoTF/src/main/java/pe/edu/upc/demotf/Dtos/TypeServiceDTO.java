package pe.edu.upc.demotf.dtos;
import pe.edu.upc.demotf.entities.ServiceB;

public class TypeServiceDTO {
    private int idTypeService;
    private String nameTypeService;
    private ServiceB service;
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
