/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "NCRS")
@NamedQueries({
    @NamedQuery(name = "Ncrs.findAll", query = "SELECT n FROM Ncrs n")})
public class Ncrs implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NcrsPK ncrsPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "TOTAL_NC")
    private BigInteger totalNc;
    @Column(name = "TOTAL_IVA")
    private BigInteger totalIva;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Column(name = "FCT_NUMERO")
    private Integer fctNumero;
    @Column(name = "OBSERVACION")
    private String observacion;

    public Ncrs() {
    }

    public Ncrs(NcrsPK ncrsPK) {
        this.ncrsPK = ncrsPK;
    }

    public Ncrs(String cjaCodigo, BigInteger numero) {
        this.ncrsPK = new NcrsPK(cjaCodigo, numero);
    }

    public NcrsPK getNcrsPK() {
        return ncrsPK;
    }

    public void setNcrsPK(NcrsPK ncrsPK) {
        this.ncrsPK = ncrsPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getTotalNc() {
        return totalNc;
    }

    public void setTotalNc(BigInteger totalNc) {
        this.totalNc = totalNc;
    }

    public BigInteger getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(BigInteger totalIva) {
        this.totalIva = totalIva;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public Integer getFctNumero() {
        return fctNumero;
    }

    public void setFctNumero(Integer fctNumero) {
        this.fctNumero = fctNumero;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ncrsPK != null ? ncrsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ncrs)) {
            return false;
        }
        Ncrs other = (Ncrs) object;
        if ((this.ncrsPK == null && other.ncrsPK != null) || (this.ncrsPK != null && !this.ncrsPK.equals(other.ncrsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Ncrs[ ncrsPK=" + ncrsPK + " ]";
    }
    
}
