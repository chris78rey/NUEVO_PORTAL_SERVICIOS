/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @Column(name = "GRPINGGST_EMP_CODIGO")
    private String grpinggstEmpCodigo;
    @Column(name = "GRPINGGST_CODIGO")
    private String grpinggstCodigo;

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

    public String getGrpinggstEmpCodigo() {
        return grpinggstEmpCodigo;
    }

    public void setGrpinggstEmpCodigo(String grpinggstEmpCodigo) {
        this.grpinggstEmpCodigo = grpinggstEmpCodigo;
    }

    public String getGrpinggstCodigo() {
        return grpinggstCodigo;
    }

    public void setGrpinggstCodigo(String grpinggstCodigo) {
        this.grpinggstCodigo = grpinggstCodigo;
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
        return "ec.mil.he1.pom_01_domain.GruposInggstReporteCnt[ gruposInggstReporteCntPK=" + gruposInggstReporteCntPK + " ]";
    }
    
}
