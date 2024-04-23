package pe.edu.upc.demotf.servicesinterfaces;

import pe.edu.upc.demotf.entities.AccountBanking;

import java.util.List;

public interface IAccountBankingService {
    public void insert(AccountBanking accountBanking);
    public List<AccountBanking> list();
    public void delete(int id);
    public AccountBanking lisId(int id);
}
