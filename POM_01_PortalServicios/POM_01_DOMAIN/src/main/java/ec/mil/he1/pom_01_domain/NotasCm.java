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
@Table(name = "NOTAS_CM")
@NamedQueries({
    @NamedQuery(name = "NotasCm.findAll", query = "SELECT n FROM NotasCm n")})
public class NotasCm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "NTA_CM_TYPE")
    private String ntaCmType;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DISCRIMINADOR")
    private String discriminador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "INGRESO_REAL")
    private Character ingresoReal;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PGS_CM_NUMERO")
    private Integer pgsCmNumero;
    @Column(name = "PLNHNRMDC_NUMERO")
    private Integer plnhnrmdcNumero;
    @Column(name = "DSC_CM_NUMERO")
    private Integer dscCmNumero;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "PGO_CM_CJA_CODIGO")
    private String pgoCmCjaCodigo;
    @Column(name = "ANT_NUMERO")
    private Integer antNumero;

    public NotasCm() {
    }

    public NotasCm(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNtaCmType() {
        return ntaCmType;
    }

    public void setNtaCmType(String ntaCmType) {
        this.ntaCmType = ntaCmType;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDiscriminador() {
        return discriminador;
    }

    public void setDiscriminador(String discriminador) {
        this.discriminador = discriminador;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Character getIngresoReal() {
        return ingresoReal;
    }

    public void setIngresoReal(Character ingresoReal) {
        this.ingresoReal = ingresoReal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPgsCmNumero() {
        return pgsCmNumero;
    }

    public void setPgsCmNumero(Integer pgsCmNumero) {
        this.pgsCmNumero = pgsCmNumero;
    }

    public Integer getPlnhnrmdcNumero() {
        return plnhnrmdcNumero;
    }

    public void setPlnhnrmdcNumero(Integer plnhnrmdcNumero) {
        this.plnhnrmdcNumero = plnhnrmdcNumero;
    }

    public Integer getDscCmNumero() {
        return dscCmNumero;
    }

    public void setDscCmNumero(Integer dscCmNumero) {
        this.dscCmNumero = dscCmNumero;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    public String getPgoCmCjaCodigo() {
        return pgoCmCjaCodigo;
    }

    public void setPgoCmCjaCodigo(String pgoCmCjaCodigo) {
        this.pgoCmCjaCodigo = pgoCmCjaCodigo;
    }

    public Integer getAntNumero() {
        return antNumero;
    }

    public void setAntNumero(Integer antNumero) {
        this.antNumero = antNumero;
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
        if (!(object instanceof NotasCm)) {
            return false;
        }
        NotasCm other = (NotasCm) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.NotasCm[ numero=" + numero + " ]";
    }
    
}
