package pe.edu.upc.demotf.ServicesInterfaces;

import pe.edu.upc.demotf.Entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users users);
    public List<Users> list();
    public void delete(int dni);

    public List<Users> findByLastnameUser(String lastname);
}
