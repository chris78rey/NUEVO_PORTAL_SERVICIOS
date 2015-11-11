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
@Table(name = "VISITAS_CONVENIOS_DETALLES")
@NamedQueries({
    @NamedQuery(name = "VisitasConveniosDetalles.findAll", query = "SELECT v FROM VisitasConveniosDetalles v")})
public class VisitasConveniosDetalles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VisitasConveniosDetallesPK visitasConveniosDetallesPK;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "TIPO_HONORARIO")
    private String tipoHonorario;

    public VisitasConveniosDetalles() {
    }

    public VisitasConveniosDetalles(VisitasConveniosDetallesPK visitasConveniosDetallesPK) {
        this.visitasConveniosDetallesPK = visitasConveniosDetallesPK;
    }

    public VisitasConveniosDetalles(String valor, String cnvConvenio, short secuencia) {
        this.visitasConveniosDetallesPK = new VisitasConveniosDetallesPK(valor, cnvConvenio, secuencia);
    }

    public VisitasConveniosDetallesPK getVisitasConveniosDetallesPK() {
        return visitasConveniosDetallesPK;
    }

    public void setVisitasConveniosDetallesPK(VisitasConveniosDetallesPK visitasConveniosDetallesPK) {
        this.visitasConveniosDetallesPK = visitasConveniosDetallesPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoHonorario() {
        return tipoHonorario;
    }

    public void setTipoHonorario(String tipoHonorario) {
        this.tipoHonorario = tipoHonorario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitasConveniosDetallesPK != null ? visitasConveniosDetallesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitasConveniosDetalles)) {
            return false;
        }
        VisitasConveniosDetalles other = (VisitasConveniosDetalles) object;
        if ((this.visitasConveniosDetallesPK == null && other.visitasConveniosDetallesPK != null) || (this.visitasConveniosDetallesPK != null && !this.visitasConveniosDetallesPK.equals(other.visitasConveniosDetallesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VisitasConveniosDetalles[ visitasConveniosDetallesPK=" + visitasConveniosDetallesPK + " ]";
    }
    
}
