/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "HOJAS_EVOLUCIONES_ENFERMERIA")
@NamedQueries({
    @NamedQuery(name = "HojasEvolucionesEnfermeria.findAll", query = "SELECT h FROM HojasEvolucionesEnfermeria h")})
public class HojasEvolucionesEnfermeria implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HojasEvolucionesEnfermeriaPK hojasEvolucionesEnfermeriaPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public HojasEvolucionesEnfermeria() {
    }

    public HojasEvolucionesEnfermeria(HojasEvolucionesEnfermeriaPK hojasEvolucionesEnfermeriaPK) {
        this.hojasEvolucionesEnfermeriaPK = hojasEvolucionesEnfermeriaPK;
    }

    public HojasEvolucionesEnfermeria(int prmatnPcnNumeroHc, int prmatnNumero, String turno, Date fecha) {
        this.hojasEvolucionesEnfermeriaPK = new HojasEvolucionesEnfermeriaPK(prmatnPcnNumeroHc, prmatnNumero, turno, fecha);
    }

    public HojasEvolucionesEnfermeriaPK getHojasEvolucionesEnfermeriaPK() {
        return hojasEvolucionesEnfermeriaPK;
    }

    public void setHojasEvolucionesEnfermeriaPK(HojasEvolucionesEnfermeriaPK hojasEvolucionesEnfermeriaPK) {
        this.hojasEvolucionesEnfermeriaPK = hojasEvolucionesEnfermeriaPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hojasEvolucionesEnfermeriaPK != null ? hojasEvolucionesEnfermeriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HojasEvolucionesEnfermeria)) {
            return false;
        }
        HojasEvolucionesEnfermeria other = (HojasEvolucionesEnfermeria) object;
        if ((this.hojasEvolucionesEnfermeriaPK == null && other.hojasEvolucionesEnfermeriaPK != null) || (this.hojasEvolucionesEnfermeriaPK != null && !this.hojasEvolucionesEnfermeriaPK.equals(other.hojasEvolucionesEnfermeriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.HojasEvolucionesEnfermeria[ hojasEvolucionesEnfermeriaPK=" + hojasEvolucionesEnfermeriaPK + " ]";
    }
    
}
