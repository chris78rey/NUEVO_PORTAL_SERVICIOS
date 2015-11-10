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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "INGRESOS_ECONOMICOS")
@NamedQueries({
    @NamedQuery(name = "IngresosEconomicos.findAll", query = "SELECT i FROM IngresosEconomicos i")})
public class IngresosEconomicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IngresosEconomicosPK ingresosEconomicosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @JoinColumn(name = "FCHSCL_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FichasSociales fichasSociales;

    public IngresosEconomicos() {
    }

    public IngresosEconomicos(IngresosEconomicosPK ingresosEconomicosPK) {
        this.ingresosEconomicosPK = ingresosEconomicosPK;
    }

    public IngresosEconomicos(int fchsclNumero, String aportante) {
        this.ingresosEconomicosPK = new IngresosEconomicosPK(fchsclNumero, aportante);
    }

    public IngresosEconomicosPK getIngresosEconomicosPK() {
        return ingresosEconomicosPK;
    }

    public void setIngresosEconomicosPK(IngresosEconomicosPK ingresosEconomicosPK) {
        this.ingresosEconomicosPK = ingresosEconomicosPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public FichasSociales getFichasSociales() {
        return fichasSociales;
    }

    public void setFichasSociales(FichasSociales fichasSociales) {
        this.fichasSociales = fichasSociales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingresosEconomicosPK != null ? ingresosEconomicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresosEconomicos)) {
            return false;
        }
        IngresosEconomicos other = (IngresosEconomicos) object;
        if ((this.ingresosEconomicosPK == null && other.ingresosEconomicosPK != null) || (this.ingresosEconomicosPK != null && !this.ingresosEconomicosPK.equals(other.ingresosEconomicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.IngresosEconomicos[ ingresosEconomicosPK=" + ingresosEconomicosPK + " ]";
    }
    
}
