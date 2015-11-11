/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "NOVEDADES")
@NamedQueries({
    @NamedQuery(name = "Novedades.findAll", query = "SELECT n FROM Novedades n")})
public class Novedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNV_IDNOVEDAD")
    private String cnvIdnovedad;
    @Column(name = "CNV_TIPOPRESTACION")
    private Character cnvTipoprestacion;
    @Column(name = "CNV_INGRESOEGRESO")
    private Character cnvIngresoegreso;
    @Column(name = "CNV_CONCEPTONOVEDAD")
    private String cnvConceptonovedad;
    @Column(name = "CNV_FACTOR")
    private Long cnvFactor;
    @Column(name = "CNV_TIPO")
    private Character cnvTipo;
    @Column(name = "CNV_CUENTACONTABLE")
    private String cnvCuentacontable;
    @Column(name = "CNV_DESCRIPCION")
    private String cnvDescripcion;
    @Column(name = "CNV_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cnvFechacreacion;
    @Column(name = "CNV_USER")
    private String cnvUser;

    public Novedades() {
    }

    public Novedades(String cnvIdnovedad) {
        this.cnvIdnovedad = cnvIdnovedad;
    }

    public String getCnvIdnovedad() {
        return cnvIdnovedad;
    }

    public void setCnvIdnovedad(String cnvIdnovedad) {
        this.cnvIdnovedad = cnvIdnovedad;
    }

    public Character getCnvTipoprestacion() {
        return cnvTipoprestacion;
    }

    public void setCnvTipoprestacion(Character cnvTipoprestacion) {
        this.cnvTipoprestacion = cnvTipoprestacion;
    }

    public Character getCnvIngresoegreso() {
        return cnvIngresoegreso;
    }

    public void setCnvIngresoegreso(Character cnvIngresoegreso) {
        this.cnvIngresoegreso = cnvIngresoegreso;
    }

    public String getCnvConceptonovedad() {
        return cnvConceptonovedad;
    }

    public void setCnvConceptonovedad(String cnvConceptonovedad) {
        this.cnvConceptonovedad = cnvConceptonovedad;
    }

    public Long getCnvFactor() {
        return cnvFactor;
    }

    public void setCnvFactor(Long cnvFactor) {
        this.cnvFactor = cnvFactor;
    }

    public Character getCnvTipo() {
        return cnvTipo;
    }

    public void setCnvTipo(Character cnvTipo) {
        this.cnvTipo = cnvTipo;
    }

    public String getCnvCuentacontable() {
        return cnvCuentacontable;
    }

    public void setCnvCuentacontable(String cnvCuentacontable) {
        this.cnvCuentacontable = cnvCuentacontable;
    }

    public String getCnvDescripcion() {
        return cnvDescripcion;
    }

    public void setCnvDescripcion(String cnvDescripcion) {
        this.cnvDescripcion = cnvDescripcion;
    }

    public Date getCnvFechacreacion() {
        return cnvFechacreacion;
    }

    public void setCnvFechacreacion(Date cnvFechacreacion) {
        this.cnvFechacreacion = cnvFechacreacion;
    }

    public String getCnvUser() {
        return cnvUser;
    }

    public void setCnvUser(String cnvUser) {
        this.cnvUser = cnvUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnvIdnovedad != null ? cnvIdnovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Novedades)) {
            return false;
        }
        Novedades other = (Novedades) object;
        if ((this.cnvIdnovedad == null && other.cnvIdnovedad != null) || (this.cnvIdnovedad != null && !this.cnvIdnovedad.equals(other.cnvIdnovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Novedades[ cnvIdnovedad=" + cnvIdnovedad + " ]";
    }
    
}
