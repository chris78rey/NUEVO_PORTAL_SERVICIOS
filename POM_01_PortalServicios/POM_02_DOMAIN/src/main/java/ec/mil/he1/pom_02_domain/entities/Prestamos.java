/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "PRESTAMOS")
@NamedQueries({
    @NamedQuery(name = "Prestamos.findAll", query = "SELECT p FROM Prestamos p")})
public class Prestamos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRT_IDPRESTAMOS")
    private Long prtIdprestamos;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "PRT_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prtFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRT_MONTO")
    private BigDecimal prtMonto;
    @Column(name = "PRT_DESCUENTONOMINA")
    private BigDecimal prtDescuentonomina;
    @Column(name = "PRT_SALDO")
    private BigDecimal prtSaldo;
    @Column(name = "PRT_DESCRIPCION")
    private String prtDescripcion;
    @Column(name = "PRT_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prtFechacreacion;
    @Column(name = "PRT_USER")
    private String prtUser;
    @Column(name = "PRT_ESTADO")
    private Character prtEstado;
    @Column(name = "RPG_CONTROL")
    private Character rpgControl;
    @JoinColumn(name = "CNV_IDNOVEDAD", referencedColumnName = "CNV_IDNOVEDAD")
    @ManyToOne(fetch = FetchType.LAZY)
    private Novedades novedades;
    @JoinColumn(name = "RPG_IDROLPAGOS", referencedColumnName = "RPG_IDROLPAGOS")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rolpagos rolpagos;

    public Prestamos() {
    }

    public Prestamos(Long prtIdprestamos) {
        this.prtIdprestamos = prtIdprestamos;
    }

    public Long getPrtIdprestamos() {
        return prtIdprestamos;
    }

    public void setPrtIdprestamos(Long prtIdprestamos) {
        this.prtIdprestamos = prtIdprestamos;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Date getPrtFecha() {
        return prtFecha;
    }

    public void setPrtFecha(Date prtFecha) {
        this.prtFecha = prtFecha;
    }

    public BigDecimal getPrtMonto() {
        return prtMonto;
    }

    public void setPrtMonto(BigDecimal prtMonto) {
        this.prtMonto = prtMonto;
    }

    public BigDecimal getPrtDescuentonomina() {
        return prtDescuentonomina;
    }

    public void setPrtDescuentonomina(BigDecimal prtDescuentonomina) {
        this.prtDescuentonomina = prtDescuentonomina;
    }

    public BigDecimal getPrtSaldo() {
        return prtSaldo;
    }

    public void setPrtSaldo(BigDecimal prtSaldo) {
        this.prtSaldo = prtSaldo;
    }

    public String getPrtDescripcion() {
        return prtDescripcion;
    }

    public void setPrtDescripcion(String prtDescripcion) {
        this.prtDescripcion = prtDescripcion;
    }

    public Date getPrtFechacreacion() {
        return prtFechacreacion;
    }

    public void setPrtFechacreacion(Date prtFechacreacion) {
        this.prtFechacreacion = prtFechacreacion;
    }

    public String getPrtUser() {
        return prtUser;
    }

    public void setPrtUser(String prtUser) {
        this.prtUser = prtUser;
    }

    public Character getPrtEstado() {
        return prtEstado;
    }

    public void setPrtEstado(Character prtEstado) {
        this.prtEstado = prtEstado;
    }

    public Character getRpgControl() {
        return rpgControl;
    }

    public void setRpgControl(Character rpgControl) {
        this.rpgControl = rpgControl;
    }

    public Novedades getNovedades() {
        return novedades;
    }

    public void setNovedades(Novedades novedades) {
        this.novedades = novedades;
    }

    public Rolpagos getRolpagos() {
        return rolpagos;
    }

    public void setRolpagos(Rolpagos rolpagos) {
        this.rolpagos = rolpagos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prtIdprestamos != null ? prtIdprestamos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamos)) {
            return false;
        }
        Prestamos other = (Prestamos) object;
        if ((this.prtIdprestamos == null && other.prtIdprestamos != null) || (this.prtIdprestamos != null && !this.prtIdprestamos.equals(other.prtIdprestamos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Prestamos[ prtIdprestamos=" + prtIdprestamos + " ]";
    }
    
}
