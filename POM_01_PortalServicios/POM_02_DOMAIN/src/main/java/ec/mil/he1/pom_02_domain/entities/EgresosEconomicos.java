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
@Table(name = "EGRESOS_ECONOMICOS")
@NamedQueries({
    @NamedQuery(name = "EgresosEconomicos.findAll", query = "SELECT e FROM EgresosEconomicos e")})
public class EgresosEconomicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EgresosEconomicosPK egresosEconomicosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @JoinColumn(name = "FCHSCL_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FichasSociales fichasSociales;

    public EgresosEconomicos() {
    }

    public EgresosEconomicos(EgresosEconomicosPK egresosEconomicosPK) {
        this.egresosEconomicosPK = egresosEconomicosPK;
    }

    public EgresosEconomicos(int fchsclNumero, String descripcion) {
        this.egresosEconomicosPK = new EgresosEconomicosPK(fchsclNumero, descripcion);
    }

    public EgresosEconomicosPK getEgresosEconomicosPK() {
        return egresosEconomicosPK;
    }

    public void setEgresosEconomicosPK(EgresosEconomicosPK egresosEconomicosPK) {
        this.egresosEconomicosPK = egresosEconomicosPK;
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
        hash += (egresosEconomicosPK != null ? egresosEconomicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresosEconomicos)) {
            return false;
        }
        EgresosEconomicos other = (EgresosEconomicos) object;
        if ((this.egresosEconomicosPK == null && other.egresosEconomicosPK != null) || (this.egresosEconomicosPK != null && !this.egresosEconomicosPK.equals(other.egresosEconomicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EgresosEconomicos[ egresosEconomicosPK=" + egresosEconomicosPK + " ]";
    }
    
}
