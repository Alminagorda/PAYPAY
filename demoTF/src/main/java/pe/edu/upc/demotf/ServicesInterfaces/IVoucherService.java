package pe.edu.upc.demotf.servicesinterfaces;

import pe.edu.upc.demotf.entities.Voucher;

import java.util.List;

public interface IVoucherService {
    public void insert(Voucher voucher);
    public List<Voucher> list();
    public void delete(int id);
    public Voucher lisId(int id);

    public List<String[]>findByAmountVoucherService();
}
