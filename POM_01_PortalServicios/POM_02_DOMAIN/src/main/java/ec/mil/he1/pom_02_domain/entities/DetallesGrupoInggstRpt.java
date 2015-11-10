/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_GRUPO_INGGST_RPT")
@NamedQueries({
    @NamedQuery(name = "DetallesGrupoInggstRpt.findAll", query = "SELECT d FROM DetallesGrupoInggstRpt d")})
public class DetallesGrupoInggstRpt implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesGrupoInggstRptPK detallesGrupoInggstRptPK;
    @Column(name = "PLNCNT_CODIGO")
    private String plncntCodigo;
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "ORDEN")
    private Short orden;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @JoinColumns({
        @JoinColumn(name = "GRPINGGST_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "GRPINGGST_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GruposInggstReporteCnt gruposInggstReporteCnt;

    public DetallesGrupoInggstRpt() {
    }

    public DetallesGrupoInggstRpt(DetallesGrupoInggstRptPK detallesGrupoInggstRptPK) {
        this.detallesGrupoInggstRptPK = detallesGrupoInggstRptPK;
    }

    public DetallesGrupoInggstRpt(String grpinggstCodigo, String grpinggstEmpCodigo, String codigo) {
        this.detallesGrupoInggstRptPK = new DetallesGrupoInggstRptPK(grpinggstCodigo, grpinggstEmpCodigo, codigo);
    }

    public DetallesGrupoInggstRptPK getDetallesGrupoInggstRptPK() {
        return detallesGrupoInggstRptPK;
    }

    public void setDetallesGrupoInggstRptPK(DetallesGrupoInggstRptPK detallesGrupoInggstRptPK) {
        this.detallesGrupoInggstRptPK = detallesGrupoInggstRptPK;
    }

    public String getPlncntCodigo() {
        return plncntCodigo;
    }

    public void setPlncntCodigo(String plncntCodigo) {
        this.plncntCodigo = plncntCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public GruposInggstReporteCnt getGruposInggstReporteCnt() {
        return gruposInggstReporteCnt;
    }

    public void setGruposInggstReporteCnt(GruposInggstReporteCnt gruposInggstReporteCnt) {
        this.gruposInggstReporteCnt = gruposInggstReporteCnt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesGrupoInggstRptPK != null ? detallesGrupoInggstRptPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesGrupoInggstRpt)) {
            return false;
        }
        DetallesGrupoInggstRpt other = (DetallesGrupoInggstRpt) object;
        if ((this.detallesGrupoInggstRptPK == null && other.detallesGrupoInggstRptPK != null) || (this.detallesGrupoInggstRptPK != null && !this.detallesGrupoInggstRptPK.equals(other.detallesGrupoInggstRptPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesGrupoInggstRpt[ detallesGrupoInggstRptPK=" + detallesGrupoInggstRptPK + " ]";
    }
    
}
