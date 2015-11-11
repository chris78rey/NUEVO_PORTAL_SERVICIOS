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
@Table(name = "DATOS_DISCAPACIDAD")
@NamedQueries({
    @NamedQuery(name = "DatosDiscapacidad.findAll", query = "SELECT d FROM DatosDiscapacidad d")})
public class DatosDiscapacidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTD_ID")
    private String dtdId;
    @Column(name = "CRF_IDCARGAFAMILIAR")
    private Long crfIdcargafamiliar;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "DTD_TIPODISCAPACIDAD")
    private String dtdTipodiscapacidad;
    @Column(name = "DTD_PORCENTAJE")
    private Long dtdPorcentaje;
    @Column(name = "DTD_DESCRIPCION")
    private String dtdDescripcion;
    @Column(name = "DTD_USER")
    private String dtdUser;
    @Column(name = "DTD_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtdFechacreacion;
    @Column(name = "DTD_CDGACRDISSFA")
    private String dtdCdgacrdissfa;

    public DatosDiscapacidad() {
    }

    public DatosDiscapacidad(String dtdId) {
        this.dtdId = dtdId;
    }

    public String getDtdId() {
        return dtdId;
    }

    public void setDtdId(String dtdId) {
        this.dtdId = dtdId;
    }

    public Long getCrfIdcargafamiliar() {
        return crfIdcargafamiliar;
    }

    public void setCrfIdcargafamiliar(Long crfIdcargafamiliar) {
        this.crfIdcargafamiliar = crfIdcargafamiliar;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public String getDtdTipodiscapacidad() {
        return dtdTipodiscapacidad;
    }

    public void setDtdTipodiscapacidad(String dtdTipodiscapacidad) {
        this.dtdTipodiscapacidad = dtdTipodiscapacidad;
    }

    public Long getDtdPorcentaje() {
        return dtdPorcentaje;
    }

    public void setDtdPorcentaje(Long dtdPorcentaje) {
        this.dtdPorcentaje = dtdPorcentaje;
    }

    public String getDtdDescripcion() {
        return dtdDescripcion;
    }

    public void setDtdDescripcion(String dtdDescripcion) {
        this.dtdDescripcion = dtdDescripcion;
    }

    public String getDtdUser() {
        return dtdUser;
    }

    public void setDtdUser(String dtdUser) {
        this.dtdUser = dtdUser;
    }

    public Date getDtdFechacreacion() {
        return dtdFechacreacion;
    }

    public void setDtdFechacreacion(Date dtdFechacreacion) {
        this.dtdFechacreacion = dtdFechacreacion;
    }

    public String getDtdCdgacrdissfa() {
        return dtdCdgacrdissfa;
    }

    public void setDtdCdgacrdissfa(String dtdCdgacrdissfa) {
        this.dtdCdgacrdissfa = dtdCdgacrdissfa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtdId != null ? dtdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosDiscapacidad)) {
            return false;
        }
        DatosDiscapacidad other = (DatosDiscapacidad) object;
        if ((this.dtdId == null && other.dtdId != null) || (this.dtdId != null && !this.dtdId.equals(other.dtdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DatosDiscapacidad[ dtdId=" + dtdId + " ]";
    }
    
}
