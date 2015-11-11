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
@Table(name = "MOVIMIENTOS_ROLES")
@NamedQueries({
    @NamedQuery(name = "MovimientosRoles.findAll", query = "SELECT m FROM MovimientosRoles m")})
public class MovimientosRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovimientosRolesPK movimientosRolesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;

    public MovimientosRoles() {
    }

    public MovimientosRoles(MovimientosRolesPK movimientosRolesPK) {
        this.movimientosRolesPK = movimientosRolesPK;
    }

    public MovimientosRoles(int rolpgsNumero, String rolpgsEmpCodigo, String emprolEmpCodigo, int emprolCodigo, String prmrolEmpCodigo, String prmrolCodigo, int numero) {
        this.movimientosRolesPK = new MovimientosRolesPK(rolpgsNumero, rolpgsEmpCodigo, emprolEmpCodigo, emprolCodigo, prmrolEmpCodigo, prmrolCodigo, numero);
    }

    public MovimientosRolesPK getMovimientosRolesPK() {
        return movimientosRolesPK;
    }

    public void setMovimientosRolesPK(MovimientosRolesPK movimientosRolesPK) {
        this.movimientosRolesPK = movimientosRolesPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getDebe() {
        return debe;
    }

    public void setDebe(BigDecimal debe) {
        this.debe = debe;
    }

    public BigDecimal getHaber() {
        return haber;
    }

    public void setHaber(BigDecimal haber) {
        this.haber = haber;
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
        hash += (movimientosRolesPK != null ? movimientosRolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosRoles)) {
            return false;
        }
        MovimientosRoles other = (MovimientosRoles) object;
        if ((this.movimientosRolesPK == null && other.movimientosRolesPK != null) || (this.movimientosRolesPK != null && !this.movimientosRolesPK.equals(other.movimientosRolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MovimientosRoles[ movimientosRolesPK=" + movimientosRolesPK + " ]";
    }
    
}
