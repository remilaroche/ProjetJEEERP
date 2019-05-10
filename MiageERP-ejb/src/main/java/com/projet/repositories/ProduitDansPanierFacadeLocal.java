/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.repositories;

import com.projet.entities.ProduitDansPanier;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Garrido
 */
@Local
public interface ProduitDansPanierFacadeLocal {

    void create(ProduitDansPanier produitDansPanier);

    void edit(ProduitDansPanier produitDansPanier);

    void remove(ProduitDansPanier produitDansPanier);

    ProduitDansPanier find(Object id);

    List<ProduitDansPanier> findAll();

    List<ProduitDansPanier> findRange(int[] range);

    int count();
    
}
