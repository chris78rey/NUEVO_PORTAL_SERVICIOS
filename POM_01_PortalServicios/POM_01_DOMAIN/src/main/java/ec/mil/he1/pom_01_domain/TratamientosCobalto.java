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
@Table(name = "TRATAMIENTOS_COBALTO")
@NamedQueries({
    @NamedQuery(name = "TratamientosCobalto.findAll", query = "SELECT t FROM TratamientosCobalto t")})
public class TratamientosCobalto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TratamientosCobaltoPK tratamientosCobaltoPK;
    @Column(name = "CMPTRT_CMPTRT_ID")
    private Long cmptrtCmptrtId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "TIEMPO")
    private Integer tiempo;
    @Column(name = "DOSIS_DADA")
    private Integer dosisDada;
    @Column(name = "DOSIS_TUMOR")
    private Integer dosisTumor;
    @Column(name = "DIAS_TRATAMIENTO")
    private Short diasTratamiento;

    public TratamientosCobalto() {
    }

    public TratamientosCobalto(TratamientosCobaltoPK tratamientosCobaltoPK) {
        this.tratamientosCobaltoPK = tratamientosCobaltoPK;
    }

    public TratamientosCobalto(int fchcblNumero, short numero) {
        this.tratamientosCobaltoPK = new TratamientosCobaltoPK(fchcblNumero, numero);
    }

    public TratamientosCobaltoPK getTratamientosCobaltoPK() {
        return tratamientosCobaltoPK;
    }

    public void setTratamientosCobaltoPK(TratamientosCobaltoPK tratamientosCobaltoPK) {
        this.tratamientosCobaltoPK = tratamientosCobaltoPK;
    }

    public Long getCmptrtCmptrtId() {
        return cmptrtCmptrtId;
    }

    public void setCmptrtCmptrtId(Long cmptrtCmptrtId) {
        this.cmptrtCmptrtId = cmptrtCmptrtId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getDosisDada() {
        return dosisDada;
    }

    public void setDosisDada(Integer dosisDada) {
        this.dosisDada = dosisDada;
    }

    public Integer getDosisTumor() {
        return dosisTumor;
    }

    public void setDosisTumor(Integer dosisTumor) {
        this.dosisTumor = dosisTumor;
    }

    public Short getDiasTratamiento() {
        return diasTratamiento;
    }

    public void setDiasTratamiento(Short diasTratamiento) {
        this.diasTratamiento = diasTratamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tratamientosCobaltoPK != null ? tratamientosCobaltoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TratamientosCobalto)) {
            return false;
        }
        TratamientosCobalto other = (TratamientosCobalto) object;
        if ((this.tratamientosCobaltoPK == null && other.tratamientosCobaltoPK != null) || (this.tratamientosCobaltoPK != null && !this.tratamientosCobaltoPK.equals(other.tratamientosCobaltoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TratamientosCobalto[ tratamientosCobaltoPK=" + tratamientosCobaltoPK + " ]";
    }
    
}
