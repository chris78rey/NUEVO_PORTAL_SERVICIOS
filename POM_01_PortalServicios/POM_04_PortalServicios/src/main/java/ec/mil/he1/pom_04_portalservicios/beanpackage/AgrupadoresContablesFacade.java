/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_04_portalservicios.beanpackage;

import ec.mil.he1.pom_01_domain.AgrupadoresContables;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author christian_ruiz
 */
@Stateless
public class AgrupadoresContablesFacade extends AbstractFacade<AgrupadoresContables> {
    @PersistenceContext(unitName = "PU-WEB-PORTAL")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgrupadoresContablesFacade() {
        super(AgrupadoresContables.class);
    }
    
}
