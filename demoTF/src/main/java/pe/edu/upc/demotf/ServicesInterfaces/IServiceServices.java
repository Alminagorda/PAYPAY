package pe.edu.upc.demotf.ServicesInterfaces;

import pe.edu.upc.demotf.Entities.Services;

import java.util.List;

public interface IServiceServices {
    public void insert(Services Service);
    public List<Services>list();
    public  void  delete(int id);
    public  void update(Services service);
    public Services listId(int id);

}


