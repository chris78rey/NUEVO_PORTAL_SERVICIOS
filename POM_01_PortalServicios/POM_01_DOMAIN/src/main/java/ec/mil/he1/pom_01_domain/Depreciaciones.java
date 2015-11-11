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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DEPRECIACIONES")
@NamedQueries({
    @NamedQuery(name = "Depreciaciones.findAll", query = "SELECT d FROM Depreciaciones d")})
public class Depreciaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepreciacionesPK depreciacionesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OSERVACIONES")
    private String oservaciones;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;

    public Depreciaciones() {
    }

    public Depreciaciones(DepreciacionesPK depreciacionesPK) {
        this.depreciacionesPK = depreciacionesPK;
    }

    public Depreciaciones(String empCodigo, short anio, short mes) {
        this.depreciacionesPK = new DepreciacionesPK(empCodigo, anio, mes);
    }

    public DepreciacionesPK getDepreciacionesPK() {
        return depreciacionesPK;
    }

    public void setDepreciacionesPK(DepreciacionesPK depreciacionesPK) {
        this.depreciacionesPK = depreciacionesPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOservaciones() {
        return oservaciones;
    }

    public void setOservaciones(String oservaciones) {
        this.oservaciones = oservaciones;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depreciacionesPK != null ? depreciacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depreciaciones)) {
            return false;
        }
        Depreciaciones other = (Depreciaciones) object;
        if ((this.depreciacionesPK == null && other.depreciacionesPK != null) || (this.depreciacionesPK != null && !this.depreciacionesPK.equals(other.depreciacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Depreciaciones[ depreciacionesPK=" + depreciacionesPK + " ]";
    }
    
}
