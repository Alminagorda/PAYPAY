package pe.edu.upc.demotf.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.Entities.BankingEntitys;
import pe.edu.upc.demotf.ServicesInterfaces.IBankingEntityServices;
import pe.edu.upc.demotf.repositories.IEntidadBancariaRepository;

import java.util.List;

@Service
public class EntidadBancariaServiceImplement implements IBankingEntityServices {
   @Autowired
    private IEntidadBancariaRepository banER;
    @Override
    public void insert(BankingEntitys EB)  {
        banER.save(EB);
    }
    @Override
    public void delete(int id) {
        banER.deleteById(id);
    }

    @Override
    public void update(BankingEntitys EB) {

    }

    @Override
    public BankingEntitys listId(int id) {
        return banER.findById(id).orElse(new BankingEntitys());
    }

    @Override
    public List<BankingEntitys> list() {
        return banER.findAll();
    }
}
