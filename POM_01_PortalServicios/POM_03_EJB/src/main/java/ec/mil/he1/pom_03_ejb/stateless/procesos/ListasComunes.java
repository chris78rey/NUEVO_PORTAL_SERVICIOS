/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_03_ejb.stateless.procesos;

import ec.mil.he1.pom_01_domain.Cantones;
import ec.mil.he1.pom_01_domain.Cantones_;
import ec.mil.he1.pom_01_domain.Parroquias;
import ec.mil.he1.pom_01_domain.Parroquias_;
import ec.mil.he1.pom_01_domain.Provincias;
import ec.mil.he1.pom_01_domain.Provincias_;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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

    @Override
    public List<Cantones> ListCantones(String proId) {
        if (proId.length() != 0) {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Cantones> cq = cb.createQuery(Cantones.class);
            Root<Cantones> root = cq.from(Cantones.class);
            cq.orderBy(cb.asc(root.get(Cantones_.canton)));
            List<Cantones> resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
            List<Cantones> resultList2 = new ArrayList<>();

            for (Cantones resultList1 : resultList) {
                if (resultList1.getCantonesPK().getPrvCodigo().equalsIgnoreCase(proId)) {
                    resultList2.add(resultList1);
                }
            }
            return resultList2;
        } else {
            return null;
        }

    }

    @Override
    public List<Parroquias> ListParroquias(String proId, String canId) {
        if (canId.length() != 0) {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Parroquias> cq = cb.createQuery(Parroquias.class);
            Root<Parroquias> root = cq.from(Parroquias.class);
            cq.orderBy(cb.asc(root.get(Parroquias_.parroquia)));
            List<Parroquias> resultList = em.createQuery(cq).setHint("eclipselink.refresh", "true").getResultList();
            List<Parroquias> resultList2 = new ArrayList<>();

            for (Parroquias resultList21 : resultList) {
                if (resultList21.getParroquiasPK().getCntCodigo().equalsIgnoreCase(canId) && resultList21.getParroquiasPK().getCntPrvCodigo().equals(proId)) {
                    resultList2.add(resultList21);
                }

            }
            return resultList2;
        } else {
            return null;
        }

    }

    public List<Map> buscaHistorial(String pCriterio) {

        String sql;
        sql = " SELECT TO_CHAR (FECHA,  'fmday/dd/month/yyyy',  'nls_date_language = spanish')FECHAS, "
                + "NUMERO, APELLIDOS, NOMBRES, "
                + "(CASE ESTADO WHEN 'R' THEN 'RESERVADO' WHEN "
                + "'A' THEN 'ATENDIDO' WHEN 'P' THEN 'PAGADO'  END) "
                + "ESTADO, TIPO   "
                + "FROM SIS.TURNOS_CE, "
                + "SIS.PERSONAL, SIS.PACIENTES  "
                + "WHERE TURNOS_CE.PCN_NUMERO_HC = " + pCriterio + " "
                + "AND CODIGO = TURNOS_CE.PRS_CODIGO AND "
                + "NUMERO_HC = TURNOS_CE.PCN_NUMERO_HC "
                + "AND ESTADO IN ('R') "
                + " ORDER BY FECHA DESC";
//si existen parámetros se deben poner ? en las posiciones respectivas 
        Query query = em.createNativeQuery(sql);

        List<Object[]> results = query.getResultList();
        List data = new ArrayList<HashMap>();

        if (!results.isEmpty()) {
            for (Object[] result : results) {
                HashMap resultMap = new HashMap();
                resultMap.put("FECHAS", result[0]);
                resultMap.put("NUMERO", result[1]);
                resultMap.put("APELLIDOS", result[2]);
                resultMap.put("NOMBRES", result[3]);
                resultMap.put("ESTADO", result[4]);
                resultMap.put("TIPO", result[5]);
                data.add(resultMap);

            }
        }

        return data;

    }

}
