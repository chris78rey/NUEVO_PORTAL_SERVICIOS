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
@Table(name = "QUIMIOTERAPIAS")
@NamedQueries({
    @NamedQuery(name = "Quimioterapias.findAll", query = "SELECT q FROM Quimioterapias q")})
public class Quimioterapias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PRTQMT_CODIGO")
    private String prtqmtCodigo;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "EDAD")
    private Short edad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "TALLA")
    private Short talla;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    public Quimioterapias() {
    }

    public Quimioterapias(Integer numero) {
        this.numero = numero;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPrtqmtCodigo() {
        return prtqmtCodigo;
    }

    public void setPrtqmtCodigo(String prtqmtCodigo) {
        this.prtqmtCodigo = prtqmtCodigo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Short getTalla() {
        return talla;
    }

    public void setTalla(Short talla) {
        this.talla = talla;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quimioterapias)) {
            return false;
        }
        Quimioterapias other = (Quimioterapias) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Quimioterapias[ numero=" + numero + " ]";
    }
    
}
