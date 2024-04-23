package pe.edu.upc.demotf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.entities.BankingEntity;
import pe.edu.upc.demotf.repositories.IBankingEntityRepository;
import pe.edu.upc.demotf.servicesinterfaces.IBankingEntityService;

import java.util.List;

@Service
public class BankingEntityServiceImplement implements IBankingEntityService {
    @Autowired
    private IBankingEntityRepository bR;
    @Override
    public void insert(BankingEntity bankingEntity) {
        bR.save(bankingEntity);
    }

    @Override
    public List<BankingEntity> list() {
        return bR.findAll();
    }

    @Override
    public void delete(int id) {
        bR.deleteById(id);
    }

    @Override
    public BankingEntity lisId(int id) {
        return bR.findById(id).orElse(new BankingEntity());
    }
}
