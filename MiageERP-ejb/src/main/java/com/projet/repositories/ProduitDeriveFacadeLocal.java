/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.repositories;

import com.projet.entities.ProduitDerive;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Garrido
 */
@Local
public interface ProduitDeriveFacadeLocal {

    void create(ProduitDerive produitDerive);

    void edit(ProduitDerive produitDerive);

    void remove(ProduitDerive produitDerive);

    ProduitDerive find(Object id);

    List<ProduitDerive> findAll();

    List<ProduitDerive> findRange(int[] range);

    int count();
    
}
