/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "GRUPOS_INGGST_REPORTE_CNT")
@NamedQueries({
    @NamedQuery(name = "GruposInggstReporteCnt.findAll", query = "SELECT g FROM GruposInggstReporteCnt g")})
public class GruposInggstReporteCnt implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GruposInggstReporteCntPK gruposInggstReporteCntPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "OPERADOR")
    private String operador;
    @Column(name = "ORDEN")
    private Short orden;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @OneToMany(mappedBy = "gruposInggstReporteCnt", fetch = FetchType.LAZY)
    private List<GruposInggstReporteCnt> gruposInggstReporteCntList;
    @JoinColumns({
        @JoinColumn(name = "GRPINGGST_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
        @JoinColumn(name = "GRPINGGST_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private GruposInggstReporteCnt gruposInggstReporteCnt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruposInggstReporteCnt", fetch = FetchType.LAZY)
    private List<DetallesGrupoInggstRpt> detallesGrupoInggstRptList;

    public GruposInggstReporteCnt() {
    }

    public GruposInggstReporteCnt(GruposInggstReporteCntPK gruposInggstReporteCntPK) {
        this.gruposInggstReporteCntPK = gruposInggstReporteCntPK;
    }

    public GruposInggstReporteCnt(String empCodigo, String codigo) {
        this.gruposInggstReporteCntPK = new GruposInggstReporteCntPK(empCodigo, codigo);
    }

    public GruposInggstReporteCntPK getGruposInggstReporteCntPK() {
        return gruposInggstReporteCntPK;
    }

    public void setGruposInggstReporteCntPK(GruposInggstReporteCntPK gruposInggstReporteCntPK) {
        this.gruposInggstReporteCntPK = gruposInggstReporteCntPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
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

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public List<GruposInggstReporteCnt> getGruposInggstReporteCntList() {
        return gruposInggstReporteCntList;
    }

    public void setGruposInggstReporteCntList(List<GruposInggstReporteCnt> gruposInggstReporteCntList) {
        this.gruposInggstReporteCntList = gruposInggstReporteCntList;
    }

    public GruposInggstReporteCnt getGruposInggstReporteCnt() {
        return gruposInggstReporteCnt;
    }

    public void setGruposInggstReporteCnt(GruposInggstReporteCnt gruposInggstReporteCnt) {
        this.gruposInggstReporteCnt = gruposInggstReporteCnt;
    }

    public List<DetallesGrupoInggstRpt> getDetallesGrupoInggstRptList() {
        return detallesGrupoInggstRptList;
    }

    public void setDetallesGrupoInggstRptList(List<DetallesGrupoInggstRpt> detallesGrupoInggstRptList) {
        this.detallesGrupoInggstRptList = detallesGrupoInggstRptList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gruposInggstReporteCntPK != null ? gruposInggstReporteCntPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GruposInggstReporteCnt)) {
            return false;
        }
        GruposInggstReporteCnt other = (GruposInggstReporteCnt) object;
        if ((this.gruposInggstReporteCntPK == null && other.gruposInggstReporteCntPK != null) || (this.gruposInggstReporteCntPK != null && !this.gruposInggstReporteCntPK.equals(other.gruposInggstReporteCntPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.GruposInggstReporteCnt[ gruposInggstReporteCntPK=" + gruposInggstReporteCntPK + " ]";
    }
    
}
