/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "REGISTROS_PACIENTE")
@NamedQueries({
    @NamedQuery(name = "RegistrosPaciente.findAll", query = "SELECT r FROM RegistrosPaciente r")})
public class RegistrosPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RGTPCN_ID")
    private Long rgtpcnId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CLAVE")
    private String clave;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;

    public RegistrosPaciente() {
    }

    public RegistrosPaciente(Long rgtpcnId) {
        this.rgtpcnId = rgtpcnId;
    }

    public Long getRgtpcnId() {
        return rgtpcnId;
    }

    public void setRgtpcnId(Long rgtpcnId) {
        this.rgtpcnId = rgtpcnId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rgtpcnId != null ? rgtpcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosPaciente)) {
            return false;
        }
        RegistrosPaciente other = (RegistrosPaciente) object;
        if ((this.rgtpcnId == null && other.rgtpcnId != null) || (this.rgtpcnId != null && !this.rgtpcnId.equals(other.rgtpcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RegistrosPaciente[ rgtpcnId=" + rgtpcnId + " ]";
    }
    
}
