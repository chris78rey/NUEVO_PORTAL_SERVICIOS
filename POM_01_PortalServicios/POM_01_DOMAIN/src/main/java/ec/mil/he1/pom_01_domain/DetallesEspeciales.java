/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DETALLES_ESPECIALES")
@NamedQueries({
    @NamedQuery(name = "DetallesEspeciales.findAll", query = "SELECT d FROM DetallesEspeciales d")})
public class DetallesEspeciales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesEspecialesPK detallesEspecialesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;

    public DetallesEspeciales() {
    }

    public DetallesEspeciales(DetallesEspecialesPK detallesEspecialesPK) {
        this.detallesEspecialesPK = detallesEspecialesPK;
    }

    public DetallesEspeciales(String pagespprmespPrmrolEmpCodigo, String mvmpagespPrmespPrmrolCodigo, String mvmpagespEmprolEmpCodigo, int mvmpagespEmprolCodigo, int mvmpagespPagespNumero, String prmrolEmpCodigo, String prmrolCodigo) {
        this.detallesEspecialesPK = new DetallesEspecialesPK(pagespprmespPrmrolEmpCodigo, mvmpagespPrmespPrmrolCodigo, mvmpagespEmprolEmpCodigo, mvmpagespEmprolCodigo, mvmpagespPagespNumero, prmrolEmpCodigo, prmrolCodigo);
    }

    public DetallesEspecialesPK getDetallesEspecialesPK() {
        return detallesEspecialesPK;
    }

    public void setDetallesEspecialesPK(DetallesEspecialesPK detallesEspecialesPK) {
        this.detallesEspecialesPK = detallesEspecialesPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesEspecialesPK != null ? detallesEspecialesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesEspeciales)) {
            return false;
        }
        DetallesEspeciales other = (DetallesEspeciales) object;
        if ((this.detallesEspecialesPK == null && other.detallesEspecialesPK != null) || (this.detallesEspecialesPK != null && !this.detallesEspecialesPK.equals(other.detallesEspecialesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesEspeciales[ detallesEspecialesPK=" + detallesEspecialesPK + " ]";
    }
    
}
