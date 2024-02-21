package sn.esmt.catalogue.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.catalogue.entity.ProduitEntity;
import sn.esmt.catalogue.service.ProduitService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produit")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;
  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity){

    return produitService.save(produitEntity);
  }
  @GetMapping
  public List<ProduitEntity> all(){

    return produitService.getAll().get();
  }
  @GetMapping("{ref}")
  public Optional<ProduitEntity> get(@PathVariable String ref){
    return produitService.get(ref);
  }
  @PutMapping("/{ref}")
  public ProduitEntity updtae(String ref, ProduitEntity produitEntity){
    return produitService.update(ref, produitEntity);
  }

  @DeleteMapping("/{ref}")
  public void delete(@PathVariable String ref){
    produitService.delete(ref);
  }
}
