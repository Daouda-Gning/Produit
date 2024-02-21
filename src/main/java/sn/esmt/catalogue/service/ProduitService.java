package sn.esmt.catalogue.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sn.esmt.catalogue.entity.ProduitEntity;
import sn.esmt.catalogue.repository.ProduitRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ProduitService implements IProduitService{
  private ProduitRepository produitRepository;


  @Override
  public ProduitEntity save(ProduitEntity produitEntity) {

    return produitRepository.save(produitEntity);
  }

  @Override
  public ProduitEntity update(String ref, ProduitEntity produitEntity) {
    Optional<ProduitEntity> produitEntity1 = this.get(ref);
    if (produitEntity1.isPresent()){
      produitEntity1.get().setRef(produitEntity.getRef());
      produitEntity1.get().setNom(produitEntity.getNom());
      produitEntity1.get().setQtStock(produitEntity.getQtStock());
      //TODO pour tous les autres champs
      return produitRepository.save(produitEntity1.get());
    }
    return produitEntity;
  }

  @Override
  public Optional<ProduitEntity> get(String ref) {

    return produitRepository.findById(ref);
  }

  @Override
  public Optional<List<ProduitEntity>> getAll() {

    return Optional.of(produitRepository.findAll());
  }

  @Override
  public void delete(String ref) {
    Optional<ProduitEntity> produitEntity1 = this.get(ref);
    if(produitEntity1.isPresent()){
      produitRepository.delete(this.get(ref).get());
    }
    //TODO verifier sil'objet existe avant de le supprimer
  }

}
