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
public class RangosNormalidadComplementosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CMPLMT_CODIGO")
    private short cmplmtCodigo;
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
    @Column(name = "ESTADO_DE_ACTIVIDAD")
    private String estadoDeActividad;

    public RangosNormalidadComplementosPK() {
    }

    public RangosNormalidadComplementosPK(short cmplmtCodigo, short edadInferior, Character sexo, Date fechaDeCreacion, String estadoDeActividad) {
        this.cmplmtCodigo = cmplmtCodigo;
        this.edadInferior = edadInferior;
        this.sexo = sexo;
        this.fechaDeCreacion = fechaDeCreacion;
        this.estadoDeActividad = estadoDeActividad;
    }

    public short getCmplmtCodigo() {
        return cmplmtCodigo;
    }

    public void setCmplmtCodigo(short cmplmtCodigo) {
        this.cmplmtCodigo = cmplmtCodigo;
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

    public String getEstadoDeActividad() {
        return estadoDeActividad;
    }

    public void setEstadoDeActividad(String estadoDeActividad) {
        this.estadoDeActividad = estadoDeActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cmplmtCodigo;
        hash += (int) edadInferior;
        hash += (sexo != null ? sexo.hashCode() : 0);
        hash += (fechaDeCreacion != null ? fechaDeCreacion.hashCode() : 0);
        hash += (estadoDeActividad != null ? estadoDeActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangosNormalidadComplementosPK)) {
            return false;
        }
        RangosNormalidadComplementosPK other = (RangosNormalidadComplementosPK) object;
        if (this.cmplmtCodigo != other.cmplmtCodigo) {
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
        if ((this.estadoDeActividad == null && other.estadoDeActividad != null) || (this.estadoDeActividad != null && !this.estadoDeActividad.equals(other.estadoDeActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RangosNormalidadComplementosPK[ cmplmtCodigo=" + cmplmtCodigo + ", edadInferior=" + edadInferior + ", sexo=" + sexo + ", fechaDeCreacion=" + fechaDeCreacion + ", estadoDeActividad=" + estadoDeActividad + " ]";
    }
    
}
