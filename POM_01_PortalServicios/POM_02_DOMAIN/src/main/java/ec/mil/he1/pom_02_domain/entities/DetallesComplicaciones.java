/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "DETALLES_COMPLICACIONES")
@NamedQueries({
    @NamedQuery(name = "DetallesComplicaciones.findAll", query = "SELECT d FROM DetallesComplicaciones d")})
public class DetallesComplicaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @JoinColumn(name = "ENF_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Enfermedades enfermedades;
    @JoinColumns({
        @JoinColumn(name = "EPC_PRMATN_PCN_NUMERO_HC", referencedColumnName = "PRTOPRSLC_PCN_NUMERO_HC"),
        @JoinColumn(name = "PRTOPR_NUMERO", referencedColumnName = "PRTOPRSLC_NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PartesOperatorios partesOperatorios;
    @JoinColumns({
        @JoinColumn(name = "EPC_PRMATN_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "EPC_PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumns({
        @JoinColumn(name = "PRCMNR_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "EPC_PRMATN_NUMERO", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ProcedimientosMenores procedimientosMenores;

    public DetallesComplicaciones() {
    }

    public DetallesComplicaciones(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Enfermedades getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(Enfermedades enfermedades) {
        this.enfermedades = enfermedades;
    }

    public PartesOperatorios getPartesOperatorios() {
        return partesOperatorios;
    }

    public void setPartesOperatorios(PartesOperatorios partesOperatorios) {
        this.partesOperatorios = partesOperatorios;
    }

    public PermanenciasYAtenciones getPermanenciasYAtenciones() {
        return permanenciasYAtenciones;
    }

    public void setPermanenciasYAtenciones(PermanenciasYAtenciones permanenciasYAtenciones) {
        this.permanenciasYAtenciones = permanenciasYAtenciones;
    }

    public ProcedimientosMenores getProcedimientosMenores() {
        return procedimientosMenores;
    }

    public void setProcedimientosMenores(ProcedimientosMenores procedimientosMenores) {
        this.procedimientosMenores = procedimientosMenores;
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
        if (!(object instanceof DetallesComplicaciones)) {
            return false;
        }
        DetallesComplicaciones other = (DetallesComplicaciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesComplicaciones[ numero=" + numero + " ]";
    }
    
}
