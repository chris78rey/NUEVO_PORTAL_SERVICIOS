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
@Table(name = "CONVENIOS_EQUIVALENCIAS")
@NamedQueries({
    @NamedQuery(name = "ConveniosEquivalencias.findAll", query = "SELECT c FROM ConveniosEquivalencias c")})
public class ConveniosEquivalencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConveniosEquivalenciasPK conveniosEquivalenciasPK;
    @Column(name = "PRIORIDAD_CARGO")
    private Character prioridadCargo;
    @Column(name = "AGRUPADOR")
    private Character agrupador;
    @Column(name = "PRIORIDAD_DESCRIPCION")
    private Character prioridadDescripcion;
    @JoinColumns({
        @JoinColumn(name = "CRG_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "CRG_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cargos cargos;
    @JoinColumns({
        @JoinColumn(name = "CNVTRF_CONVENIO", referencedColumnName = "CONVENIO", insertable = false, updatable = false),
        @JoinColumn(name = "TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "CNVTRF_CODIGO", referencedColumnName = "CODIGO_ITEM", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tarifarios tarifarios;

    public ConveniosEquivalencias() {
    }

    public ConveniosEquivalencias(ConveniosEquivalenciasPK conveniosEquivalenciasPK) {
        this.conveniosEquivalenciasPK = conveniosEquivalenciasPK;
    }

    public ConveniosEquivalencias(String crgCodigo, Character crgTipo, String cnvtrfConvenio, String cnvtrfCodigo, String tipo) {
        this.conveniosEquivalenciasPK = new ConveniosEquivalenciasPK(crgCodigo, crgTipo, cnvtrfConvenio, cnvtrfCodigo, tipo);
    }

    public ConveniosEquivalenciasPK getConveniosEquivalenciasPK() {
        return conveniosEquivalenciasPK;
    }

    public void setConveniosEquivalenciasPK(ConveniosEquivalenciasPK conveniosEquivalenciasPK) {
        this.conveniosEquivalenciasPK = conveniosEquivalenciasPK;
    }

    public Character getPrioridadCargo() {
        return prioridadCargo;
    }

    public void setPrioridadCargo(Character prioridadCargo) {
        this.prioridadCargo = prioridadCargo;
    }

    public Character getAgrupador() {
        return agrupador;
    }

    public void setAgrupador(Character agrupador) {
        this.agrupador = agrupador;
    }

    public Character getPrioridadDescripcion() {
        return prioridadDescripcion;
    }

    public void setPrioridadDescripcion(Character prioridadDescripcion) {
        this.prioridadDescripcion = prioridadDescripcion;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public Tarifarios getTarifarios() {
        return tarifarios;
    }

    public void setTarifarios(Tarifarios tarifarios) {
        this.tarifarios = tarifarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conveniosEquivalenciasPK != null ? conveniosEquivalenciasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConveniosEquivalencias)) {
            return false;
        }
        ConveniosEquivalencias other = (ConveniosEquivalencias) object;
        if ((this.conveniosEquivalenciasPK == null && other.conveniosEquivalenciasPK != null) || (this.conveniosEquivalenciasPK != null && !this.conveniosEquivalenciasPK.equals(other.conveniosEquivalenciasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ConveniosEquivalencias[ conveniosEquivalenciasPK=" + conveniosEquivalenciasPK + " ]";
    }
    
}
