/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_03_ejb.stateless;

import ec.mil.he1.pom_01_domain.SegUrls;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author christian_ruiz
 */
@Stateless
public class SegUrlsFacade extends AbstractFacade<SegUrls> implements ec.mil.he1.pom_03_ejb.stateless.SegUrlsFacadeRemote {
    @PersistenceContext(unitName = "PU-EJBPORTAL")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SegUrlsFacade() {
        super(SegUrls.class);
    }
    
    public SegUrls findBySalir(String name) {
        SegUrls singleResult = (SegUrls) em.createQuery(
                "SELECT s FROM SegUrls s WHERE s.urlDescrip = :urlDescrip")
                .setParameter("urlDescrip", name).setHint("eclipselink.refresh", "true").getSingleResult();
        return singleResult;
    }

    public SegUrls findURL(String name) {
        SegUrls singleResult = (SegUrls) em.createQuery(
                "SELECT s FROM SegUrls s WHERE s.urlDescrip = :urlDescrip")
                .setParameter("urlDescrip", name).setHint("eclipselink.refresh", "true").getSingleResult();
        return singleResult;
    }
    
}
