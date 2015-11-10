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
@Table(name = "RANGOS_DE_NORMALIDAD")
@NamedQueries({
    @NamedQuery(name = "RangosDeNormalidad.findAll", query = "SELECT r FROM RangosDeNormalidad r")})
public class RangosDeNormalidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RangosDeNormalidadPK rangosDeNormalidadPK;
    @Column(name = "EDAD_SUPERIOR")
    private Short edadSuperior;
    @Column(name = "INDICADOR")
    private Character indicador;
    @Column(name = "LIMITE_INFERIOR")
    private String limiteInferior;
    @Column(name = "ESTADO_DE_ACTIVIDAD")
    private String estadoDeActividad;
    @Column(name = "FECHA_DE_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeBaja;
    @Column(name = "LIMITE_SUPERIOR")
    private String limiteSuperior;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumn(name = "VRBEXM_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private VariablesDeExamenes variablesDeExamenes;

    public RangosDeNormalidad() {
    }

    public RangosDeNormalidad(RangosDeNormalidadPK rangosDeNormalidadPK) {
        this.rangosDeNormalidadPK = rangosDeNormalidadPK;
    }

    public RangosDeNormalidad(int vrbexmCodigo, short edadInferior, Character sexo, Date fechaDeCreacion, String faseCicloMenstrual) {
        this.rangosDeNormalidadPK = new RangosDeNormalidadPK(vrbexmCodigo, edadInferior, sexo, fechaDeCreacion, faseCicloMenstrual);
    }

    public RangosDeNormalidadPK getRangosDeNormalidadPK() {
        return rangosDeNormalidadPK;
    }

    public void setRangosDeNormalidadPK(RangosDeNormalidadPK rangosDeNormalidadPK) {
        this.rangosDeNormalidadPK = rangosDeNormalidadPK;
    }

    public Short getEdadSuperior() {
        return edadSuperior;
    }

    public void setEdadSuperior(Short edadSuperior) {
        this.edadSuperior = edadSuperior;
    }

    public Character getIndicador() {
        return indicador;
    }

    public void setIndicador(Character indicador) {
        this.indicador = indicador;
    }

    public String getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(String limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public String getEstadoDeActividad() {
        return estadoDeActividad;
    }

    public void setEstadoDeActividad(String estadoDeActividad) {
        this.estadoDeActividad = estadoDeActividad;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public VariablesDeExamenes getVariablesDeExamenes() {
        return variablesDeExamenes;
    }

    public void setVariablesDeExamenes(VariablesDeExamenes variablesDeExamenes) {
        this.variablesDeExamenes = variablesDeExamenes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rangosDeNormalidadPK != null ? rangosDeNormalidadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangosDeNormalidad)) {
            return false;
        }
        RangosDeNormalidad other = (RangosDeNormalidad) object;
        if ((this.rangosDeNormalidadPK == null && other.rangosDeNormalidadPK != null) || (this.rangosDeNormalidadPK != null && !this.rangosDeNormalidadPK.equals(other.rangosDeNormalidadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RangosDeNormalidad[ rangosDeNormalidadPK=" + rangosDeNormalidadPK + " ]";
    }
    
}
