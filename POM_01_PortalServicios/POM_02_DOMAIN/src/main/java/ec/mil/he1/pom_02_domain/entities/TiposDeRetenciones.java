/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TIPOS_DE_RETENCIONES")
@NamedQueries({
    @NamedQuery(name = "TiposDeRetenciones.findAll", query = "SELECT t FROM TiposDeRetenciones t")})
public class TiposDeRetenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Short codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FORMULA_IVA")
    private String formulaIva;
    @Column(name = "FORMULA_RETENCION")
    private String formulaRetencion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposDeRetenciones", fetch = FetchType.LAZY)
    private List<TiposRetencionesEmpresas> tiposRetencionesEmpresasList;

    public TiposDeRetenciones() {
    }

    public TiposDeRetenciones(Short codigo) {
        this.codigo = codigo;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFormulaIva() {
        return formulaIva;
    }

    public void setFormulaIva(String formulaIva) {
        this.formulaIva = formulaIva;
    }

    public String getFormulaRetencion() {
        return formulaRetencion;
    }

    public void setFormulaRetencion(String formulaRetencion) {
        this.formulaRetencion = formulaRetencion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<TiposRetencionesEmpresas> getTiposRetencionesEmpresasList() {
        return tiposRetencionesEmpresasList;
    }

    public void setTiposRetencionesEmpresasList(List<TiposRetencionesEmpresas> tiposRetencionesEmpresasList) {
        this.tiposRetencionesEmpresasList = tiposRetencionesEmpresasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposDeRetenciones)) {
            return false;
        }
        TiposDeRetenciones other = (TiposDeRetenciones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TiposDeRetenciones[ codigo=" + codigo + " ]";
    }
    
}
