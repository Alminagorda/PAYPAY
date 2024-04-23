package pe.edu.upc.demotf.servicesinterfaces;

import pe.edu.upc.demotf.entities.Notification;

import java.util.List;

public interface INotificationService {
    public void insert(Notification notification);
    public List<Notification> list();
    public void delete(int id);
    public Notification lisId(int id);
}
