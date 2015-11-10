/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "CLASIFICADORES")
@NamedQueries({
    @NamedQuery(name = "Clasificadores.findAll", query = "SELECT c FROM Clasificadores c")})
public class Clasificadores implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "TIPO_SERVICIO_TARIFARIO")
    private String tipoServicioTarifario;
    @Column(name = "TIPO_SERVICIO")
    private String tipoServicio;
    @Column(name = "CLASIFICADOR")
    private String clasificador;
    @Column(name = "SUBCLASIFICACION")
    private String subclasificacion;
    @Column(name = "ALTA_COMPLEJIDAD")
    private String altaComplejidad;
    @Column(name = "VALOR_UNITARIO")
    private BigInteger valorUnitario;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "CALCULO_AUTOMATICO")
    private Character calculoAutomatico;
    @JoinColumn(name = "CONVENIO", referencedColumnName = "CONVENIO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Convenios convenios;

    public Clasificadores() {
    }

    public Clasificadores(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTipoServicioTarifario() {
        return tipoServicioTarifario;
    }

    public void setTipoServicioTarifario(String tipoServicioTarifario) {
        this.tipoServicioTarifario = tipoServicioTarifario;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getClasificador() {
        return clasificador;
    }

    public void setClasificador(String clasificador) {
        this.clasificador = clasificador;
    }

    public String getSubclasificacion() {
        return subclasificacion;
    }

    public void setSubclasificacion(String subclasificacion) {
        this.subclasificacion = subclasificacion;
    }

    public String getAltaComplejidad() {
        return altaComplejidad;
    }

    public void setAltaComplejidad(String altaComplejidad) {
        this.altaComplejidad = altaComplejidad;
    }

    public BigInteger getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigInteger valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Character getCalculoAutomatico() {
        return calculoAutomatico;
    }

    public void setCalculoAutomatico(Character calculoAutomatico) {
        this.calculoAutomatico = calculoAutomatico;
    }

    public Convenios getConvenios() {
        return convenios;
    }

    public void setConvenios(Convenios convenios) {
        this.convenios = convenios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasificadores)) {
            return false;
        }
        Clasificadores other = (Clasificadores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Clasificadores[ id=" + id + " ]";
    }
    
}
