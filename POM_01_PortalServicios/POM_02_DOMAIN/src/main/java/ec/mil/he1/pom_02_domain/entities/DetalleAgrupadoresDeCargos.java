/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLE_AGRUPADORES_DE_CARGOS")
@NamedQueries({
    @NamedQuery(name = "DetalleAgrupadoresDeCargos.findAll", query = "SELECT d FROM DetalleAgrupadoresDeCargos d")})
public class DetalleAgrupadoresDeCargos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLAGRCRG_ID")
    private Long dtlagrcrgId;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "DTLAGRCRG_CRG_TIPO")
    private Character dtlagrcrgCrgTipo;
    @Column(name = "DTLAGRCRG_CRG_CODIGO")
    private String dtlagrcrgCrgCodigo;
    @Column(name = "DTLAGRCRG_ITM_TIPO")
    private Character dtlagrcrgItmTipo;
    @Column(name = "DTLAGRCRG_ITM_SBS_SCC_CODIGO")
    private String dtlagrcrgItmSbsSccCodigo;
    @Column(name = "DTLAGRCRG_ITM_SBS_CODIGO")
    private String dtlagrcrgItmSbsCodigo;
    @Column(name = "DTLAGRCRG_ITM_CODIGO")
    private Short dtlagrcrgItmCodigo;
    @Column(name = "HONORARIO")
    private Character honorario;
    @JoinColumn(name = "AGRCRG_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrupadoresDeCargos agrupadoresDeCargos;

    public DetalleAgrupadoresDeCargos() {
    }

    public DetalleAgrupadoresDeCargos(Long dtlagrcrgId) {
        this.dtlagrcrgId = dtlagrcrgId;
    }

    public Long getDtlagrcrgId() {
        return dtlagrcrgId;
    }

    public void setDtlagrcrgId(Long dtlagrcrgId) {
        this.dtlagrcrgId = dtlagrcrgId;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Character getDtlagrcrgCrgTipo() {
        return dtlagrcrgCrgTipo;
    }

    public void setDtlagrcrgCrgTipo(Character dtlagrcrgCrgTipo) {
        this.dtlagrcrgCrgTipo = dtlagrcrgCrgTipo;
    }

    public String getDtlagrcrgCrgCodigo() {
        return dtlagrcrgCrgCodigo;
    }

    public void setDtlagrcrgCrgCodigo(String dtlagrcrgCrgCodigo) {
        this.dtlagrcrgCrgCodigo = dtlagrcrgCrgCodigo;
    }

    public Character getDtlagrcrgItmTipo() {
        return dtlagrcrgItmTipo;
    }

    public void setDtlagrcrgItmTipo(Character dtlagrcrgItmTipo) {
        this.dtlagrcrgItmTipo = dtlagrcrgItmTipo;
    }

    public String getDtlagrcrgItmSbsSccCodigo() {
        return dtlagrcrgItmSbsSccCodigo;
    }

    public void setDtlagrcrgItmSbsSccCodigo(String dtlagrcrgItmSbsSccCodigo) {
        this.dtlagrcrgItmSbsSccCodigo = dtlagrcrgItmSbsSccCodigo;
    }

    public String getDtlagrcrgItmSbsCodigo() {
        return dtlagrcrgItmSbsCodigo;
    }

    public void setDtlagrcrgItmSbsCodigo(String dtlagrcrgItmSbsCodigo) {
        this.dtlagrcrgItmSbsCodigo = dtlagrcrgItmSbsCodigo;
    }

    public Short getDtlagrcrgItmCodigo() {
        return dtlagrcrgItmCodigo;
    }

    public void setDtlagrcrgItmCodigo(Short dtlagrcrgItmCodigo) {
        this.dtlagrcrgItmCodigo = dtlagrcrgItmCodigo;
    }

    public Character getHonorario() {
        return honorario;
    }

    public void setHonorario(Character honorario) {
        this.honorario = honorario;
    }

    public AgrupadoresDeCargos getAgrupadoresDeCargos() {
        return agrupadoresDeCargos;
    }

    public void setAgrupadoresDeCargos(AgrupadoresDeCargos agrupadoresDeCargos) {
        this.agrupadoresDeCargos = agrupadoresDeCargos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlagrcrgId != null ? dtlagrcrgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleAgrupadoresDeCargos)) {
            return false;
        }
        DetalleAgrupadoresDeCargos other = (DetalleAgrupadoresDeCargos) object;
        if ((this.dtlagrcrgId == null && other.dtlagrcrgId != null) || (this.dtlagrcrgId != null && !this.dtlagrcrgId.equals(other.dtlagrcrgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetalleAgrupadoresDeCargos[ dtlagrcrgId=" + dtlagrcrgId + " ]";
    }
    
}
