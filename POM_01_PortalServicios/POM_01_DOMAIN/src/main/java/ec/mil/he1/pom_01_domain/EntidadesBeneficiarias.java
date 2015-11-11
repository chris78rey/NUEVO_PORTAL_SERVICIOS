/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "ENTIDADES_BENEFICIARIAS")
@NamedQueries({
    @NamedQuery(name = "EntidadesBeneficiarias.findAll", query = "SELECT e FROM EntidadesBeneficiarias e")})
public class EntidadesBeneficiarias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntidadesBeneficiariasPK entidadesBeneficiariasPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "NOMBRE_LEGAL")
    private String nombreLegal;
    @Column(name = "ID")
    private String id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RETENCION_FUENTE")
    private BigDecimal retencionFuente;
    @Column(name = "RETENCION_CLINICA")
    private BigDecimal retencionClinica;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public EntidadesBeneficiarias() {
    }

    public EntidadesBeneficiarias(EntidadesBeneficiariasPK entidadesBeneficiariasPK) {
        this.entidadesBeneficiariasPK = entidadesBeneficiariasPK;
    }

    public EntidadesBeneficiarias(String mstbnfCodigo, int codigo) {
        this.entidadesBeneficiariasPK = new EntidadesBeneficiariasPK(mstbnfCodigo, codigo);
    }

    public EntidadesBeneficiariasPK getEntidadesBeneficiariasPK() {
        return entidadesBeneficiariasPK;
    }

    public void setEntidadesBeneficiariasPK(EntidadesBeneficiariasPK entidadesBeneficiariasPK) {
        this.entidadesBeneficiariasPK = entidadesBeneficiariasPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getNombreLegal() {
        return nombreLegal;
    }

    public void setNombreLegal(String nombreLegal) {
        this.nombreLegal = nombreLegal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(BigDecimal retencionFuente) {
        this.retencionFuente = retencionFuente;
    }

    public BigDecimal getRetencionClinica() {
        return retencionClinica;
    }

    public void setRetencionClinica(BigDecimal retencionClinica) {
        this.retencionClinica = retencionClinica;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entidadesBeneficiariasPK != null ? entidadesBeneficiariasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadesBeneficiarias)) {
            return false;
        }
        EntidadesBeneficiarias other = (EntidadesBeneficiarias) object;
        if ((this.entidadesBeneficiariasPK == null && other.entidadesBeneficiariasPK != null) || (this.entidadesBeneficiariasPK != null && !this.entidadesBeneficiariasPK.equals(other.entidadesBeneficiariasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EntidadesBeneficiarias[ entidadesBeneficiariasPK=" + entidadesBeneficiariasPK + " ]";
    }
    
}
