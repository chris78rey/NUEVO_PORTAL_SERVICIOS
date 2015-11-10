/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DETALLES_FORMULAS")
@NamedQueries({
    @NamedQuery(name = "DetallesFormulas.findAll", query = "SELECT d FROM DetallesFormulas d")})
public class DetallesFormulas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesFormulasPK detallesFormulasPK;
    @Column(name = "SECUENCIA")
    private Short secuencia;
    @Column(name = "OPERADOR")
    private String operador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @JoinColumns({
        @JoinColumn(name = "GRPDTL_FRMROL_EMP_CODIGO", referencedColumnName = "FRMROL_EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "GRPDTL_FRMROL_CODIGO", referencedColumnName = "FRMROL_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "GRPDTL_SECUENCIA", referencedColumnName = "SECUENCIA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GruposDetalles gruposDetalles;
    @JoinColumns({
        @JoinColumn(name = "PRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
        @JoinColumn(name = "PRMROL_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ParametrosRoles parametrosRoles;

    public DetallesFormulas() {
    }

    public DetallesFormulas(DetallesFormulasPK detallesFormulasPK) {
        this.detallesFormulasPK = detallesFormulasPK;
    }

    public DetallesFormulas(String grpdtlFrmrolEmpCodigo, String grpdtlFrmrolCodigo, short grpdtlSecuencia, int numero) {
        this.detallesFormulasPK = new DetallesFormulasPK(grpdtlFrmrolEmpCodigo, grpdtlFrmrolCodigo, grpdtlSecuencia, numero);
    }

    public DetallesFormulasPK getDetallesFormulasPK() {
        return detallesFormulasPK;
    }

    public void setDetallesFormulasPK(DetallesFormulasPK detallesFormulasPK) {
        this.detallesFormulasPK = detallesFormulasPK;
    }

    public Short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Short secuencia) {
        this.secuencia = secuencia;
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

    public GruposDetalles getGruposDetalles() {
        return gruposDetalles;
    }

    public void setGruposDetalles(GruposDetalles gruposDetalles) {
        this.gruposDetalles = gruposDetalles;
    }

    public ParametrosRoles getParametrosRoles() {
        return parametrosRoles;
    }

    public void setParametrosRoles(ParametrosRoles parametrosRoles) {
        this.parametrosRoles = parametrosRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesFormulasPK != null ? detallesFormulasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesFormulas)) {
            return false;
        }
        DetallesFormulas other = (DetallesFormulas) object;
        if ((this.detallesFormulasPK == null && other.detallesFormulasPK != null) || (this.detallesFormulasPK != null && !this.detallesFormulasPK.equals(other.detallesFormulasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesFormulas[ detallesFormulasPK=" + detallesFormulasPK + " ]";
    }
    
}
