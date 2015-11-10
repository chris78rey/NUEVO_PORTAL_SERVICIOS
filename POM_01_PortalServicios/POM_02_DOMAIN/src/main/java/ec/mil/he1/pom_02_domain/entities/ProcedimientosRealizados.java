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
@Table(name = "PROCEDIMIENTOS_REALIZADOS")
@NamedQueries({
    @NamedQuery(name = "ProcedimientosRealizados.findAll", query = "SELECT p FROM ProcedimientosRealizados p")})
public class ProcedimientosRealizados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "NUMERO_DE_VECES")
    private Short numeroDeVeces;
    @Column(name = "INTCNS_NUMERO")
    private Integer intcnsNumero;
    @Column(name = "DESCRIPCION_ADICIONAL")
    private String descripcionAdicional;
    @Column(name = "VIA_DE_ACCESO")
    private String viaDeAcceso;
    @Column(name = "LATERALIDAD")
    private String lateralidad;
    @Column(name = "DURACION")
    private Short duracion;
    @JoinColumns({
        @JoinColumn(name = "EPC_PRMATN_PCN_NUMERO_HC", referencedColumnName = "PRTOPRSLC_PCN_NUMERO_HC"),
        @JoinColumn(name = "PRTOPRSLC_NUMERO", referencedColumnName = "PRTOPRSLC_NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PartesOperatorios partesOperatorios;
    @JoinColumns({
        @JoinColumn(name = "EPC_PRMATN_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "EPC_PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRCHSP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProcedimientosHospitalarios procedimientosHospitalarios;
    @JoinColumns({
        @JoinColumn(name = "PRCMNR_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "EPC_PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ProcedimientosMenores procedimientosMenores;

    public ProcedimientosRealizados() {
    }

    public ProcedimientosRealizados(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Short getNumeroDeVeces() {
        return numeroDeVeces;
    }

    public void setNumeroDeVeces(Short numeroDeVeces) {
        this.numeroDeVeces = numeroDeVeces;
    }

    public Integer getIntcnsNumero() {
        return intcnsNumero;
    }

    public void setIntcnsNumero(Integer intcnsNumero) {
        this.intcnsNumero = intcnsNumero;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    public String getViaDeAcceso() {
        return viaDeAcceso;
    }

    public void setViaDeAcceso(String viaDeAcceso) {
        this.viaDeAcceso = viaDeAcceso;
    }

    public String getLateralidad() {
        return lateralidad;
    }

    public void setLateralidad(String lateralidad) {
        this.lateralidad = lateralidad;
    }

    public Short getDuracion() {
        return duracion;
    }

    public void setDuracion(Short duracion) {
        this.duracion = duracion;
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

    public ProcedimientosHospitalarios getProcedimientosHospitalarios() {
        return procedimientosHospitalarios;
    }

    public void setProcedimientosHospitalarios(ProcedimientosHospitalarios procedimientosHospitalarios) {
        this.procedimientosHospitalarios = procedimientosHospitalarios;
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
        if (!(object instanceof ProcedimientosRealizados)) {
            return false;
        }
        ProcedimientosRealizados other = (ProcedimientosRealizados) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ProcedimientosRealizados[ numero=" + numero + " ]";
    }
    
}
