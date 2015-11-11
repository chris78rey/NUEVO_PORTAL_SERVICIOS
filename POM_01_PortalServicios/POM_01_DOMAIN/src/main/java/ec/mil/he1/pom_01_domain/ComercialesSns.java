/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "COMERCIALES_SNS")
@NamedQueries({
    @NamedQuery(name = "ComercialesSns.findAll", query = "SELECT c FROM ComercialesSns c")})
public class ComercialesSns implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComercialesSnsPK comercialesSnsPK;
    @Column(name = "LBRSNS_CODIGO")
    private Integer lbrsnsCodigo;
    @Column(name = "NOMBRE_COMERCIAL")
    private String nombreComercial;
    @Column(name = "PRESENTACION_COMERCIAL")
    private String presentacionComercial;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "TRFITM_SECUENCIA")
    private Short trfitmSecuencia;

    public ComercialesSns() {
    }

    public ComercialesSns(ComercialesSnsPK comercialesSnsPK) {
        this.comercialesSnsPK = comercialesSnsPK;
    }

    public ComercialesSns(String trfitmCnvConvenio, String trtitmAtiAnexo, String trfitmTipo, String trfitmCodigo, int codigo) {
        this.comercialesSnsPK = new ComercialesSnsPK(trfitmCnvConvenio, trtitmAtiAnexo, trfitmTipo, trfitmCodigo, codigo);
    }

    public ComercialesSnsPK getComercialesSnsPK() {
        return comercialesSnsPK;
    }

    public void setComercialesSnsPK(ComercialesSnsPK comercialesSnsPK) {
        this.comercialesSnsPK = comercialesSnsPK;
    }

    public Integer getLbrsnsCodigo() {
        return lbrsnsCodigo;
    }

    public void setLbrsnsCodigo(Integer lbrsnsCodigo) {
        this.lbrsnsCodigo = lbrsnsCodigo;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getPresentacionComercial() {
        return presentacionComercial;
    }

    public void setPresentacionComercial(String presentacionComercial) {
        this.presentacionComercial = presentacionComercial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Short getTrfitmSecuencia() {
        return trfitmSecuencia;
    }

    public void setTrfitmSecuencia(Short trfitmSecuencia) {
        this.trfitmSecuencia = trfitmSecuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comercialesSnsPK != null ? comercialesSnsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComercialesSns)) {
            return false;
        }
        ComercialesSns other = (ComercialesSns) object;
        if ((this.comercialesSnsPK == null && other.comercialesSnsPK != null) || (this.comercialesSnsPK != null && !this.comercialesSnsPK.equals(other.comercialesSnsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComercialesSns[ comercialesSnsPK=" + comercialesSnsPK + " ]";
    }
    
}
