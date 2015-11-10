/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "RANGOS_NORMALIDAD_COMPLEMENTOS")
@NamedQueries({
    @NamedQuery(name = "RangosNormalidadComplementos.findAll", query = "SELECT r FROM RangosNormalidadComplementos r")})
public class RangosNormalidadComplementos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RangosNormalidadComplementosPK rangosNormalidadComplementosPK;
    @Column(name = "INDICADOR_DE_NORMALIDAD")
    private Character indicadorDeNormalidad;
    @Column(name = "LIMITE_INFERIOR")
    private String limiteInferior;
    @Column(name = "EDAD_SUPERIOR")
    private Short edadSuperior;
    @Column(name = "FECHA_DE_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeBaja;
    @Column(name = "LIMITE_SUPERIOR")
    private String limiteSuperior;
    @JoinColumn(name = "CMPLMT_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Complementos complementos;

    public RangosNormalidadComplementos() {
    }

    public RangosNormalidadComplementos(RangosNormalidadComplementosPK rangosNormalidadComplementosPK) {
        this.rangosNormalidadComplementosPK = rangosNormalidadComplementosPK;
    }

    public RangosNormalidadComplementos(short cmplmtCodigo, short edadInferior, Character sexo, Date fechaDeCreacion, String estadoDeActividad) {
        this.rangosNormalidadComplementosPK = new RangosNormalidadComplementosPK(cmplmtCodigo, edadInferior, sexo, fechaDeCreacion, estadoDeActividad);
    }

    public RangosNormalidadComplementosPK getRangosNormalidadComplementosPK() {
        return rangosNormalidadComplementosPK;
    }

    public void setRangosNormalidadComplementosPK(RangosNormalidadComplementosPK rangosNormalidadComplementosPK) {
        this.rangosNormalidadComplementosPK = rangosNormalidadComplementosPK;
    }

    public Character getIndicadorDeNormalidad() {
        return indicadorDeNormalidad;
    }

    public void setIndicadorDeNormalidad(Character indicadorDeNormalidad) {
        this.indicadorDeNormalidad = indicadorDeNormalidad;
    }

    public String getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(String limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public Short getEdadSuperior() {
        return edadSuperior;
    }

    public void setEdadSuperior(Short edadSuperior) {
        this.edadSuperior = edadSuperior;
    }

    public Date getFechaDeBaja() {
        return fechaDeBaja;
    }

    public void setFechaDeBaja(Date fechaDeBaja) {
        this.fechaDeBaja = fechaDeBaja;
    }

    public String getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(String limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public Complementos getComplementos() {
        return complementos;
    }

    public void setComplementos(Complementos complementos) {
        this.complementos = complementos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rangosNormalidadComplementosPK != null ? rangosNormalidadComplementosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangosNormalidadComplementos)) {
            return false;
        }
        RangosNormalidadComplementos other = (RangosNormalidadComplementos) object;
        if ((this.rangosNormalidadComplementosPK == null && other.rangosNormalidadComplementosPK != null) || (this.rangosNormalidadComplementosPK != null && !this.rangosNormalidadComplementosPK.equals(other.rangosNormalidadComplementosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RangosNormalidadComplementos[ rangosNormalidadComplementosPK=" + rangosNormalidadComplementosPK + " ]";
    }
    
}
