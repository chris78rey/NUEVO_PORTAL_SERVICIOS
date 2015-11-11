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
@Table(name = "DEVOLUCIONES")
@NamedQueries({
    @NamedQuery(name = "Devoluciones.findAll", query = "SELECT d FROM Devoluciones d")})
public class Devoluciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_DVL")
    private BigDecimal totalDvl;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "TOTAL_DVLE")
    private BigDecimal totalDvle;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "CAJA")
    private String caja;
    @Column(name = "GENERADO_FCTELE")
    private Character generadoFctele;

    public Devoluciones() {
    }

    public Devoluciones(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotalDvl() {
        return totalDvl;
    }

    public void setTotalDvl(BigDecimal totalDvl) {
        this.totalDvl = totalDvl;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public BigDecimal getTotalDvle() {
        return totalDvle;
    }

    public void setTotalDvle(BigDecimal totalDvle) {
        this.totalDvle = totalDvle;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public Character getGeneradoFctele() {
        return generadoFctele;
    }

    public void setGeneradoFctele(Character generadoFctele) {
        this.generadoFctele = generadoFctele;
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
        if (!(object instanceof Devoluciones)) {
            return false;
        }
        Devoluciones other = (Devoluciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Devoluciones[ numero=" + numero + " ]";
    }
    
}
