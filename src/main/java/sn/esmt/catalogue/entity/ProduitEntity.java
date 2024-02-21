package sn.esmt.catalogue.entity;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {
  @Id
  @Column(name = "Reference",length = 10)
  private String ref;
  @Column(name = "Nom", length = 150,nullable = false)
  private String nom;
  @Column(name = "QuantiteStockee",nullable = false)
  private double qtStock;

}
