package pe.edu.upc.demotf.ServicesInterfaces;

import pe.edu.upc.demotf.Entities.BankingEntitys;

import java.util.List;

public interface IBankingEntityServices {
    public  void insert (BankingEntitys EB);
    public  void delete (int id);
    public  void update (BankingEntitys EB);
    public  BankingEntitys listId(int id);
    public List<BankingEntitys> list();
}

