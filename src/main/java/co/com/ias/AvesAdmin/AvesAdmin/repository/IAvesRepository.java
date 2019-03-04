package co.com.ias.AvesAdmin.AvesAdmin.repository;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.ias.AvesAdmin.AvesAdmin.entities.Aves;


@Repository
public interface IAvesRepository extends  JpaRepository<co.com.ias.AvesAdmin.AvesAdmin.entities.Aves, Long>{

	@Query(value = "SELECT * FROM  Aves", nativeQuery = true)
	public List<co.com.ias.AvesAdmin.AvesAdmin.entities.Aves> listar();
	
	@Query(value = "SELECT * FROM  Aves   WHERE cdave= ?1" , nativeQuery = true)
	public Aves registroByCdave(String cdave);
	

}
