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
@Table(name = "NOTAS")
@NamedQueries({
    @NamedQuery(name = "Notas.findAll", query = "SELECT n FROM Notas n")})
public class Notas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "NTA_TYPE")
    private String ntaType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "INGRESO_REAL")
    private Character ingresoReal;
    @Column(name = "REFERENTE_IVA")
    private Character referenteIva;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "CTACBR_NUMERO")
    private Long ctacbrNumero;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "DSCGNR_NUMERO")
    private Long dscgnrNumero;
    @Column(name = "FCT_NUMERO")
    private Integer fctNumero;
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Column(name = "ANT_NUMERO")
    private Integer antNumero;
    @Column(name = "DVL_NUMERO")
    private Integer dvlNumero;
    @Column(name = "VALORE")
    private BigDecimal valore;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "COTCBR_NUMERO")
    private Long cotcbrNumero;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "DISCRIMINADOR")
    private String discriminador;
    @Column(name = "COTCBR_CJA_CODIGO")
    private String cotcbrCjaCodigo;
    @Column(name = "ANTDVL_CAJA")
    private String antdvlCaja;

    public Notas() {
    }

    public Notas(Long numero) {
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNtaType() {
        return ntaType;
    }

    public void setNtaType(String ntaType) {
        this.ntaType = ntaType;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Character getIngresoReal() {
        return ingresoReal;
    }

    public void setIngresoReal(Character ingresoReal) {
        this.ingresoReal = ingresoReal;
    }

    public Character getReferenteIva() {
        return referenteIva;
    }

    public void setReferenteIva(Character referenteIva) {
        this.referenteIva = referenteIva;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public Long getCtacbrNumero() {
        return ctacbrNumero;
    }

    public void setCtacbrNumero(Long ctacbrNumero) {
        this.ctacbrNumero = ctacbrNumero;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Long getDscgnrNumero() {
        return dscgnrNumero;
    }

    public void setDscgnrNumero(Long dscgnrNumero) {
        this.dscgnrNumero = dscgnrNumero;
    }

    public Integer getFctNumero() {
        return fctNumero;
    }

    public void setFctNumero(Integer fctNumero) {
        this.fctNumero = fctNumero;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public Integer getAntNumero() {
        return antNumero;
    }

    public void setAntNumero(Integer antNumero) {
        this.antNumero = antNumero;
    }

    public Integer getDvlNumero() {
        return dvlNumero;
    }

    public void setDvlNumero(Integer dvlNumero) {
        this.dvlNumero = dvlNumero;
    }

    public BigDecimal getValore() {
        return valore;
    }

    public void setValore(BigDecimal valore) {
        this.valore = valore;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getCotcbrNumero() {
        return cotcbrNumero;
    }

    public void setCotcbrNumero(Long cotcbrNumero) {
        this.cotcbrNumero = cotcbrNumero;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    public String getDiscriminador() {
        return discriminador;
    }

    public void setDiscriminador(String discriminador) {
        this.discriminador = discriminador;
    }

    public String getCotcbrCjaCodigo() {
        return cotcbrCjaCodigo;
    }

    public void setCotcbrCjaCodigo(String cotcbrCjaCodigo) {
        this.cotcbrCjaCodigo = cotcbrCjaCodigo;
    }

    public String getAntdvlCaja() {
        return antdvlCaja;
    }

    public void setAntdvlCaja(String antdvlCaja) {
        this.antdvlCaja = antdvlCaja;
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
        if (!(object instanceof Notas)) {
            return false;
        }
        Notas other = (Notas) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Notas[ numero=" + numero + " ]";
    }
    
}
