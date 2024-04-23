package pe.edu.upc.demotf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.entities.Notification;
import pe.edu.upc.demotf.repositories.INotificationRepository;
import pe.edu.upc.demotf.servicesinterfaces.INotificationService;

import java.util.List;
@Service
public class NotificationServiceImplement implements INotificationService {
   @Autowired
   private INotificationRepository nR;
    @Override
    public void insert(Notification notification) {
        nR.save(notification);
    }

    @Override
    public List<Notification> list() {
        return nR.findAll();
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }

    @Override
    public Notification lisId(int id) {
        return nR.findById(id).orElse(new Notification());
    }
}
