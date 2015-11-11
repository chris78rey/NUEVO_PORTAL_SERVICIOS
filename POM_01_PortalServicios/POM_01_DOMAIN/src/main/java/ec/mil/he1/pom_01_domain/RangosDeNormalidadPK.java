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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class RangosDeNormalidadPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VRBEXM_CODIGO")
    private int vrbexmCodigo;
    @Basic(optional = false)
    @Column(name = "EDAD_INFERIOR")
    private short edadInferior;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private Character sexo;
    @Basic(optional = false)
    @Column(name = "FECHA_DE_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeCreacion;
    @Basic(optional = false)
    @Column(name = "FASE_CICLO_MENSTRUAL")
    private String faseCicloMenstrual;

    public RangosDeNormalidadPK() {
    }

    public RangosDeNormalidadPK(int vrbexmCodigo, short edadInferior, Character sexo, Date fechaDeCreacion, String faseCicloMenstrual) {
        this.vrbexmCodigo = vrbexmCodigo;
        this.edadInferior = edadInferior;
        this.sexo = sexo;
        this.fechaDeCreacion = fechaDeCreacion;
        this.faseCicloMenstrual = faseCicloMenstrual;
    }

    public int getVrbexmCodigo() {
        return vrbexmCodigo;
    }

    public void setVrbexmCodigo(int vrbexmCodigo) {
        this.vrbexmCodigo = vrbexmCodigo;
    }

    public short getEdadInferior() {
        return edadInferior;
    }

    public void setEdadInferior(short edadInferior) {
        this.edadInferior = edadInferior;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getFaseCicloMenstrual() {
        return faseCicloMenstrual;
    }

    public void setFaseCicloMenstrual(String faseCicloMenstrual) {
        this.faseCicloMenstrual = faseCicloMenstrual;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) vrbexmCodigo;
        hash += (int) edadInferior;
        hash += (sexo != null ? sexo.hashCode() : 0);
        hash += (fechaDeCreacion != null ? fechaDeCreacion.hashCode() : 0);
        hash += (faseCicloMenstrual != null ? faseCicloMenstrual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangosDeNormalidadPK)) {
            return false;
        }
        RangosDeNormalidadPK other = (RangosDeNormalidadPK) object;
        if (this.vrbexmCodigo != other.vrbexmCodigo) {
            return false;
        }
        if (this.edadInferior != other.edadInferior) {
            return false;
        }
        if ((this.sexo == null && other.sexo != null) || (this.sexo != null && !this.sexo.equals(other.sexo))) {
            return false;
        }
        if ((this.fechaDeCreacion == null && other.fechaDeCreacion != null) || (this.fechaDeCreacion != null && !this.fechaDeCreacion.equals(other.fechaDeCreacion))) {
            return false;
        }
        if ((this.faseCicloMenstrual == null && other.faseCicloMenstrual != null) || (this.faseCicloMenstrual != null && !this.faseCicloMenstrual.equals(other.faseCicloMenstrual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RangosDeNormalidadPK[ vrbexmCodigo=" + vrbexmCodigo + ", edadInferior=" + edadInferior + ", sexo=" + sexo + ", fechaDeCreacion=" + fechaDeCreacion + ", faseCicloMenstrual=" + faseCicloMenstrual + " ]";
    }
    
}
