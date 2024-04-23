package pe.edu.upc.demotf.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.Entities.Voucher;

import java.util.List;


@Repository
public interface IVoucherRepository extends JpaRepository<Voucher,Integer> {
@Query(value = "select s.name_service as Servicio, sum (i.amount_voucher)as Vaucher" +
        "     from Services s inner join Voucher v on s.id_service=v.id_vaucher group by s.name_service",nativeQuery = true)
  public List<String[]>findByAmountVoucherService();

}
