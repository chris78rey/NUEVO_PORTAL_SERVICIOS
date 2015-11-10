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
@Table(name = "DETALLE_CREACION_NOVEDADES")
@NamedQueries({
    @NamedQuery(name = "DetalleCreacionNovedades.findAll", query = "SELECT d FROM DetalleCreacionNovedades d")})
public class DetalleCreacionNovedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLCRCNVD_ID")
    private Integer dtlcrcnvdId;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "EMPROL_CODIGO")
    private Integer emprolCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CAJA")
    private String caja;
    @Column(name = "CTACBR_NUMERO")
    private Integer ctacbrNumero;
    @Column(name = "CUOTA_NUMERO")
    private Integer cuotaNumero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "NOVEDAD")
    private String novedad;
    @Column(name = "ESTADO")
    private Character estado;
    @JoinColumn(name = "CRCNVDFCT_CRCNVDFCT_ID", referencedColumnName = "CRCNVDFCT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CreacionNovedadesFct creacionNovedadesFct;

    public DetalleCreacionNovedades() {
    }

    public DetalleCreacionNovedades(Integer dtlcrcnvdId) {
        this.dtlcrcnvdId = dtlcrcnvdId;
    }

    public Integer getDtlcrcnvdId() {
        return dtlcrcnvdId;
    }

    public void setDtlcrcnvdId(Integer dtlcrcnvdId) {
        this.dtlcrcnvdId = dtlcrcnvdId;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Integer getEmprolCodigo() {
        return emprolCodigo;
    }

    public void setEmprolCodigo(Integer emprolCodigo) {
        this.emprolCodigo = emprolCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public Integer getCtacbrNumero() {
        return ctacbrNumero;
    }

    public void setCtacbrNumero(Integer ctacbrNumero) {
        this.ctacbrNumero = ctacbrNumero;
    }

    public Integer getCuotaNumero() {
        return cuotaNumero;
    }

    public void setCuotaNumero(Integer cuotaNumero) {
        this.cuotaNumero = cuotaNumero;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public CreacionNovedadesFct getCreacionNovedadesFct() {
        return creacionNovedadesFct;
    }

    public void setCreacionNovedadesFct(CreacionNovedadesFct creacionNovedadesFct) {
        this.creacionNovedadesFct = creacionNovedadesFct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlcrcnvdId != null ? dtlcrcnvdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCreacionNovedades)) {
            return false;
        }
        DetalleCreacionNovedades other = (DetalleCreacionNovedades) object;
        if ((this.dtlcrcnvdId == null && other.dtlcrcnvdId != null) || (this.dtlcrcnvdId != null && !this.dtlcrcnvdId.equals(other.dtlcrcnvdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetalleCreacionNovedades[ dtlcrcnvdId=" + dtlcrcnvdId + " ]";
    }
    
}
