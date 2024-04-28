package pe.edu.upc.demotf.servicesinterfaces;


import pe.edu.upc.demotf.entities.BankingEntity;

import java.util.List;

public interface IBankingEntityService {
    public void insert(BankingEntity bankingEntity);
    public List<BankingEntity> list();
    public void delete(int id);
    public BankingEntity lisId(int id);
}
