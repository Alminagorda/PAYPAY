package pe.edu.upc.demotf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.entities.AccountBanking;
import pe.edu.upc.demotf.repositories.IAccountBankingRepository;
import pe.edu.upc.demotf.servicesinterfaces.IAccountBankingService;

import java.util.List;
@Service
public class AccountBankingServiceImplement implements IAccountBankingService {
    @Autowired
    private IAccountBankingRepository aR;
    @Override
    public void insert(AccountBanking accountBanking) {aR.save(accountBanking);}

    @Override
    public List<AccountBanking> list() {return aR.findAll();}

    @Override
    public void delete(int id) {aR.deleteById(id);}

    @Override
    public AccountBanking lisId(int id) {return aR.findById(id).orElse(new AccountBanking());}
}
