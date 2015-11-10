/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "GRUPOS_DETALLES")
@NamedQueries({
    @NamedQuery(name = "GruposDetalles.findAll", query = "SELECT g FROM GruposDetalles g")})
public class GruposDetalles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GruposDetallesPK gruposDetallesPK;
    @Column(name = "OPERADOR")
    private String operador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruposDetalles", fetch = FetchType.LAZY)
    private List<DetallesFormulas> detallesFormulasList;
    @JoinColumns({
        @JoinColumn(name = "FRMROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "FRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FormulasRoles formulasRoles;

    public GruposDetalles() {
    }

    public GruposDetalles(GruposDetallesPK gruposDetallesPK) {
        this.gruposDetallesPK = gruposDetallesPK;
    }

    public GruposDetalles(String frmrolEmpCodigo, String frmrolCodigo, short secuencia) {
        this.gruposDetallesPK = new GruposDetallesPK(frmrolEmpCodigo, frmrolCodigo, secuencia);
    }

    public GruposDetallesPK getGruposDetallesPK() {
        return gruposDetallesPK;
    }

    public void setGruposDetallesPK(GruposDetallesPK gruposDetallesPK) {
        this.gruposDetallesPK = gruposDetallesPK;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<DetallesFormulas> getDetallesFormulasList() {
        return detallesFormulasList;
    }

    public void setDetallesFormulasList(List<DetallesFormulas> detallesFormulasList) {
        this.detallesFormulasList = detallesFormulasList;
    }

    public FormulasRoles getFormulasRoles() {
        return formulasRoles;
    }

    public void setFormulasRoles(FormulasRoles formulasRoles) {
        this.formulasRoles = formulasRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gruposDetallesPK != null ? gruposDetallesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GruposDetalles)) {
            return false;
        }
        GruposDetalles other = (GruposDetalles) object;
        if ((this.gruposDetallesPK == null && other.gruposDetallesPK != null) || (this.gruposDetallesPK != null && !this.gruposDetallesPK.equals(other.gruposDetallesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.GruposDetalles[ gruposDetallesPK=" + gruposDetallesPK + " ]";
    }
    
}
