/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_HONORARIOS_MEDICOS")
@NamedQueries({
    @NamedQuery(name = "DetallesHonorariosMedicos.findAll", query = "SELECT d FROM DetallesHonorariosMedicos d")})
public class DetallesHonorariosMedicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PLNHNRMDC_NUMERO")
    private Integer plnhnrmdcNumero;
    @Column(name = "ENTBNF_MSTBNF_CODIGO")
    private String entbnfMstbnfCodigo;
    @Column(name = "ENTBNF_CODIGO")
    private Integer entbnfCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "REMUNERACION_POR")
    private String remuneracionPor;
    @Column(name = "MEDICO_TRATANTE")
    private Character medicoTratante;
    @Column(name = "INGRESADO_DESPUES_CONTABILIZAR")
    private Character ingresadoDespuesContabilizar;
    @Column(name = "ASIGNADO_POR_LA_CLINICA")
    private Character asignadoPorLaClinica;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FACTURAS")
    private String facturas;

    public DetallesHonorariosMedicos() {
    }

    public DetallesHonorariosMedicos(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPlnhnrmdcNumero() {
        return plnhnrmdcNumero;
    }

    public void setPlnhnrmdcNumero(Integer plnhnrmdcNumero) {
        this.plnhnrmdcNumero = plnhnrmdcNumero;
    }

    public String getEntbnfMstbnfCodigo() {
        return entbnfMstbnfCodigo;
    }

    public void setEntbnfMstbnfCodigo(String entbnfMstbnfCodigo) {
        this.entbnfMstbnfCodigo = entbnfMstbnfCodigo;
    }

    public Integer getEntbnfCodigo() {
        return entbnfCodigo;
    }

    public void setEntbnfCodigo(Integer entbnfCodigo) {
        this.entbnfCodigo = entbnfCodigo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRemuneracionPor() {
        return remuneracionPor;
    }

    public void setRemuneracionPor(String remuneracionPor) {
        this.remuneracionPor = remuneracionPor;
    }

    public Character getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(Character medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    public Character getIngresadoDespuesContabilizar() {
        return ingresadoDespuesContabilizar;
    }

    public void setIngresadoDespuesContabilizar(Character ingresadoDespuesContabilizar) {
        this.ingresadoDespuesContabilizar = ingresadoDespuesContabilizar;
    }

    public Character getAsignadoPorLaClinica() {
        return asignadoPorLaClinica;
    }

    public void setAsignadoPorLaClinica(Character asignadoPorLaClinica) {
        this.asignadoPorLaClinica = asignadoPorLaClinica;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFacturas() {
        return facturas;
    }

    public void setFacturas(String facturas) {
        this.facturas = facturas;
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
        if (!(object instanceof DetallesHonorariosMedicos)) {
            return false;
        }
        DetallesHonorariosMedicos other = (DetallesHonorariosMedicos) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesHonorariosMedicos[ numero=" + numero + " ]";
    }
    
}
