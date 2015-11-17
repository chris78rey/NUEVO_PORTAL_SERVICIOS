/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_03_ejb.stateless.procesos;

import ec.mil.he1.pom_01_domain.Cantones;
import ec.mil.he1.pom_01_domain.Cantones_;
import ec.mil.he1.pom_01_domain.Provincias;
import ec.mil.he1.pom_01_domain.Provincias_;
import java.util.List;
import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author christian_ruiz
 */
@Stateless
@PermitAll
public class ListasComunes implements ListasComunesRemote {

    @PersistenceContext(unitName = "PU-EJBPORTAL")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    public List<Provincias> ListProvincias() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Provincias> cq = cb.createQuery(Provincias.class);
        Root<Provincias> root = cq.from(Provincias.class);
        cq.orderBy(cb.asc(root.get(Provincias_.provincia)));
        List resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

    public List<Cantones> ListCantones() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Cantones> cq = cb.createQuery(Cantones.class);
        Root<Cantones> root = cq.from(Cantones.class);
        cq.orderBy(cb.asc(root.get(Cantones_.canton)));
        List resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
        return resultList;
    }

}
