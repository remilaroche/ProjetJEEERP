/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.repositories;

import com.projet.entities.ProduitDansPanier;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Garrido
 */
@Stateless
public class ProduitDansPanierFacade extends AbstractFacade<ProduitDansPanier> implements ProduitDansPanierFacadeLocal {

    @PersistenceContext(unitName = "MiageERPPersistenseUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitDansPanierFacade() {
        super(ProduitDansPanier.class);
    }
    
}