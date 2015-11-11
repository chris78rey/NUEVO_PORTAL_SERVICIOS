/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_04_portalservicios.sessionbean;

import ec.mil.he1.pom_02_domain.entities.EspecialidadPersonal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author christian_ruiz
 */
@Stateless
public class EspecialidadPersonalFacade extends AbstractFacade<EspecialidadPersonal> {
    @PersistenceContext(unitName = "PU-WEBPORTAL")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EspecialidadPersonalFacade() {
        super(EspecialidadPersonal.class);
    }
    
}
