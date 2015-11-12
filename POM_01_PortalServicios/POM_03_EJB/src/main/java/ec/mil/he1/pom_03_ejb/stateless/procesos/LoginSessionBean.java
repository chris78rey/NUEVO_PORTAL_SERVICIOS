/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_03_ejb.stateless.procesos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author christian_ruiz
 */
@Stateless
public class LoginSessionBean implements LoginSessionBeanRemote {

    @PersistenceContext(unitName = "PU-EJBPORTAL")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    public String Login(String pCedula, String pClave, String pModulo, String pRetorna) {
        StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("P_LOGIN_COMUN_MODULO");
        // set parameters
        storedProcedure.registerStoredProcedureParameter("P_CEDULA", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("P_CLAVE", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("P_MODULO", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("P_RETORNA", String.class, ParameterMode.OUT);

        storedProcedure.setParameter("P_CEDULA", pCedula);
        storedProcedure.setParameter("P_CLAVE", pClave);
        storedProcedure.setParameter("P_MODULO", pModulo);
        // execute SP
        storedProcedure.execute();
        // get result
        pRetorna = (String) storedProcedure.getOutputParameterValue("P_RETORNA");
        return pRetorna;
    }

}
