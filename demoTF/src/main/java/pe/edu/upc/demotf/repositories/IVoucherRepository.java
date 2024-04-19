package pe.edu.upc.demotf.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.Entities.Voucher;


@Repository
public interface IVoucherRepository extends JpaRepository<Voucher,Integer> {

}
