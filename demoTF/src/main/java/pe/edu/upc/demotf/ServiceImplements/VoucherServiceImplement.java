package pe.edu.upc.demotf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.entities.Voucher;
import pe.edu.upc.demotf.repositories.IVoucherRepository;
import pe.edu.upc.demotf.servicesinterfaces.IVoucherService;

import java.util.List;

@Service
public class VoucherServiceImplement implements IVoucherService {
    @Autowired
    private IVoucherRepository vR;
    @Override
    public void insert(Voucher voucher) {
        vR.save(voucher);
    }

    @Override
    public List<Voucher> list() {
        return vR.findAll();
    }

    @Override
    public void delete(int id) {
        vR.deleteById(id);
    }

    @Override
    public Voucher lisId(int id) {
        return vR.findById(id).orElse(new Voucher());
    }
}
