/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "EQUIPOS_OPERATORIOS")
@NamedQueries({
    @NamedQuery(name = "EquiposOperatorios.findAll", query = "SELECT e FROM EquiposOperatorios e")})
public class EquiposOperatorios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EquiposOperatoriosPK equiposOperatoriosPK;
    @Column(name = "FUNCION")
    private String funcion;
    @Column(name = "PAGAR")
    private Character pagar;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "POOL")
    private Integer pool;
    @Column(name = "ORDEN")
    private Short orden;
    @JoinColumns({
        @JoinColumn(name = "PRTOPRSLC_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "PRTOPRSLC_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PartesOperatoriosSolicitud partesOperatoriosSolicitud;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personal personal;

    public EquiposOperatorios() {
    }

    public EquiposOperatorios(EquiposOperatoriosPK equiposOperatoriosPK) {
        this.equiposOperatoriosPK = equiposOperatoriosPK;
    }

    public EquiposOperatorios(int prtoprslcPcnNumeroHc, int prtoprslcNumero, String prsCodigo) {
        this.equiposOperatoriosPK = new EquiposOperatoriosPK(prtoprslcPcnNumeroHc, prtoprslcNumero, prsCodigo);
    }

    public EquiposOperatoriosPK getEquiposOperatoriosPK() {
        return equiposOperatoriosPK;
    }

    public void setEquiposOperatoriosPK(EquiposOperatoriosPK equiposOperatoriosPK) {
        this.equiposOperatoriosPK = equiposOperatoriosPK;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Character getPagar() {
        return pagar;
    }

    public void setPagar(Character pagar) {
        this.pagar = pagar;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public PartesOperatoriosSolicitud getPartesOperatoriosSolicitud() {
        return partesOperatoriosSolicitud;
    }

    public void setPartesOperatoriosSolicitud(PartesOperatoriosSolicitud partesOperatoriosSolicitud) {
        this.partesOperatoriosSolicitud = partesOperatoriosSolicitud;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equiposOperatoriosPK != null ? equiposOperatoriosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquiposOperatorios)) {
            return false;
        }
        EquiposOperatorios other = (EquiposOperatorios) object;
        if ((this.equiposOperatoriosPK == null && other.equiposOperatoriosPK != null) || (this.equiposOperatoriosPK != null && !this.equiposOperatoriosPK.equals(other.equiposOperatoriosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EquiposOperatorios[ equiposOperatoriosPK=" + equiposOperatoriosPK + " ]";
    }
    
}
