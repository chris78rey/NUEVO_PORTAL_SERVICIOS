/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "DESCARGOS_GENERALES")
@NamedQueries({
    @NamedQuery(name = "DescargosGenerales.findAll", query = "SELECT d FROM DescargosGenerales d")})
public class DescargosGenerales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PRMATN_NUMERO")
    private Integer prmatnNumero;
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Column(name = "FCT_DESDE")
    private Integer fctDesde;
    @Column(name = "FCT_HASTA")
    private Integer fctHasta;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "TIPO_CEDULA")
    private String tipoCedula;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;

    public DescargosGenerales() {
    }

    public DescargosGenerales(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Integer prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public Integer getFctDesde() {
        return fctDesde;
    }

    public void setFctDesde(Integer fctDesde) {
        this.fctDesde = fctDesde;
    }

    public Integer getFctHasta() {
        return fctHasta;
    }

    public void setFctHasta(Integer fctHasta) {
        this.fctHasta = fctHasta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public String getTipoCedula() {
        return tipoCedula;
    }

    public void setTipoCedula(String tipoCedula) {
        this.tipoCedula = tipoCedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
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
        if (!(object instanceof DescargosGenerales)) {
            return false;
        }
        DescargosGenerales other = (DescargosGenerales) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DescargosGenerales[ numero=" + numero + " ]";
    }
    
}
