package sn.esmt.catalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.catalogue.entity.ProduitEntity;

import java.util.Optional;
@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {

}
