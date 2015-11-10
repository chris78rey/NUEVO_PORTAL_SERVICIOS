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
@Table(name = "COMPORTAMIENTOS_GERMEN")
@NamedQueries({
    @NamedQuery(name = "ComportamientosGermen.findAll", query = "SELECT c FROM ComportamientosGermen c")})
public class ComportamientosGermen implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComportamientosGermenPK comportamientosGermenPK;
    @Column(name = "TIPO")
    private String tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNIDADES")
    private BigDecimal unidades;
    @JoinColumn(name = "ANTBTC_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Antibioticos antibioticos;
    @JoinColumns({
        @JoinColumn(name = "GRMPRB_DTLEXM_EXM_NUMERO", referencedColumnName = "DTLEXM_EXM_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "GRMPRB_DTLEXM_VRBEXM_CODIGO", referencedColumnName = "DTLEXM_VRBEXM_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "GRMPRB_GRM_CODIGO", referencedColumnName = "GRM_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GermenesDePruebas germenesDePruebas;

    public ComportamientosGermen() {
    }

    public ComportamientosGermen(ComportamientosGermenPK comportamientosGermenPK) {
        this.comportamientosGermenPK = comportamientosGermenPK;
    }

    public ComportamientosGermen(String antbtcCodigo, int grmprbDtlexmExmNumero, int grmprbDtlexmVrbexmCodigo, String grmprbGrmCodigo) {
        this.comportamientosGermenPK = new ComportamientosGermenPK(antbtcCodigo, grmprbDtlexmExmNumero, grmprbDtlexmVrbexmCodigo, grmprbGrmCodigo);
    }

    public ComportamientosGermenPK getComportamientosGermenPK() {
        return comportamientosGermenPK;
    }

    public void setComportamientosGermenPK(ComportamientosGermenPK comportamientosGermenPK) {
        this.comportamientosGermenPK = comportamientosGermenPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getUnidades() {
        return unidades;
    }

    public void setUnidades(BigDecimal unidades) {
        this.unidades = unidades;
    }

    public Antibioticos getAntibioticos() {
        return antibioticos;
    }

    public void setAntibioticos(Antibioticos antibioticos) {
        this.antibioticos = antibioticos;
    }

    public GermenesDePruebas getGermenesDePruebas() {
        return germenesDePruebas;
    }

    public void setGermenesDePruebas(GermenesDePruebas germenesDePruebas) {
        this.germenesDePruebas = germenesDePruebas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comportamientosGermenPK != null ? comportamientosGermenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComportamientosGermen)) {
            return false;
        }
        ComportamientosGermen other = (ComportamientosGermen) object;
        if ((this.comportamientosGermenPK == null && other.comportamientosGermenPK != null) || (this.comportamientosGermenPK != null && !this.comportamientosGermenPK.equals(other.comportamientosGermenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ComportamientosGermen[ comportamientosGermenPK=" + comportamientosGermenPK + " ]";
    }
    
}
