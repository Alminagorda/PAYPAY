package pe.edu.upc.demotf.ServicesInterfaces;

import pe.edu.upc.demotf.Entities.User;

import java.util.List;

public interface IUserService {
    public void insert(User users);
    public List<User> list();
    public void delete(int dni);

    public List<User> findByLastnameUser(String lastname);
}
