/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PARAMETROSCALCULO")
@NamedQueries({
    @NamedQuery(name = "Parametroscalculo.findAll", query = "SELECT p FROM Parametroscalculo p")})
public class Parametroscalculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCL_IDPARAMETRO")
    private String pclIdparametro;
    @Column(name = "PCL_DESCRIPCION")
    private String pclDescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PCL_VALOR")
    private BigDecimal pclValor;
    @Column(name = "PCL_BASEIMPONIBLE")
    private BigDecimal pclBaseimponible;
    @Column(name = "PCL_NUMEROCUOTAS")
    private Long pclNumerocuotas;
    @Column(name = "PCL_MINIMOPAGAR")
    private BigDecimal pclMinimopagar;
    @Column(name = "PCL_MAXIMOPAGAR")
    private BigDecimal pclMaximopagar;
    @Column(name = "PCL_MESESPAGAR")
    private String pclMesespagar;
    @Column(name = "PCL_CUENTACONTABLE")
    private String pclCuentacontable;
    @Column(name = "PCL_DESCRIPCIONCUENTACONTABLE")
    private String pclDescripcioncuentacontable;
    @Column(name = "PCL_USER")
    private String pclUser;
    @Column(name = "PCL_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pclFechacreacion;

    public Parametroscalculo() {
    }

    public Parametroscalculo(String pclIdparametro) {
        this.pclIdparametro = pclIdparametro;
    }

    public String getPclIdparametro() {
        return pclIdparametro;
    }

    public void setPclIdparametro(String pclIdparametro) {
        this.pclIdparametro = pclIdparametro;
    }

    public String getPclDescripcion() {
        return pclDescripcion;
    }

    public void setPclDescripcion(String pclDescripcion) {
        this.pclDescripcion = pclDescripcion;
    }

    public BigDecimal getPclValor() {
        return pclValor;
    }

    public void setPclValor(BigDecimal pclValor) {
        this.pclValor = pclValor;
    }

    public BigDecimal getPclBaseimponible() {
        return pclBaseimponible;
    }

    public void setPclBaseimponible(BigDecimal pclBaseimponible) {
        this.pclBaseimponible = pclBaseimponible;
    }

    public Long getPclNumerocuotas() {
        return pclNumerocuotas;
    }

    public void setPclNumerocuotas(Long pclNumerocuotas) {
        this.pclNumerocuotas = pclNumerocuotas;
    }

    public BigDecimal getPclMinimopagar() {
        return pclMinimopagar;
    }

    public void setPclMinimopagar(BigDecimal pclMinimopagar) {
        this.pclMinimopagar = pclMinimopagar;
    }

    public BigDecimal getPclMaximopagar() {
        return pclMaximopagar;
    }

    public void setPclMaximopagar(BigDecimal pclMaximopagar) {
        this.pclMaximopagar = pclMaximopagar;
    }

    public String getPclMesespagar() {
        return pclMesespagar;
    }

    public void setPclMesespagar(String pclMesespagar) {
        this.pclMesespagar = pclMesespagar;
    }

    public String getPclCuentacontable() {
        return pclCuentacontable;
    }

    public void setPclCuentacontable(String pclCuentacontable) {
        this.pclCuentacontable = pclCuentacontable;
    }

    public String getPclDescripcioncuentacontable() {
        return pclDescripcioncuentacontable;
    }

    public void setPclDescripcioncuentacontable(String pclDescripcioncuentacontable) {
        this.pclDescripcioncuentacontable = pclDescripcioncuentacontable;
    }

    public String getPclUser() {
        return pclUser;
    }

    public void setPclUser(String pclUser) {
        this.pclUser = pclUser;
    }

    public Date getPclFechacreacion() {
        return pclFechacreacion;
    }

    public void setPclFechacreacion(Date pclFechacreacion) {
        this.pclFechacreacion = pclFechacreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pclIdparametro != null ? pclIdparametro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametroscalculo)) {
            return false;
        }
        Parametroscalculo other = (Parametroscalculo) object;
        if ((this.pclIdparametro == null && other.pclIdparametro != null) || (this.pclIdparametro != null && !this.pclIdparametro.equals(other.pclIdparametro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Parametroscalculo[ pclIdparametro=" + pclIdparametro + " ]";
    }
    
}
