package pe.edu.upc.demotf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.entities.TypeService;

import java.util.List;

@Repository
public interface ITypeServiceRepository extends JpaRepository<TypeService,Integer> {
    @Query("from TypeService  t where t.idTypeService=:t")
    public List<TypeService> findTypeServicesByNameTypeService(@Param("t")String typeName);

}
