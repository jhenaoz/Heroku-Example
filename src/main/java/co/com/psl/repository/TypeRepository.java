package co.com.psl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.psl.model.Type;


@Repository
public interface TypeRepository extends JpaRepository<Type, Long>{

	
}
