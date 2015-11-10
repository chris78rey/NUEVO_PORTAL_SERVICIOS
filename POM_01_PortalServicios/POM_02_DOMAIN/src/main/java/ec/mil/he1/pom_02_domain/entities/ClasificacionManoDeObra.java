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
@Table(name = "CLASIFICACION_MANO_DE_OBRA")
@NamedQueries({
    @NamedQuery(name = "ClasificacionManoDeObra.findAll", query = "SELECT c FROM ClasificacionManoDeObra c")})
public class ClasificacionManoDeObra implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClasificacionManoDeObraPK clasificacionManoDeObraPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_ESTIMADO")
    private BigDecimal valorEstimado;
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @JoinColumn(name = "PRD_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Periodos periodos;

    public ClasificacionManoDeObra() {
    }

    public ClasificacionManoDeObra(ClasificacionManoDeObraPK clasificacionManoDeObraPK) {
        this.clasificacionManoDeObraPK = clasificacionManoDeObraPK;
    }

    public ClasificacionManoDeObra(int prdNumero, String mnoobrTipo, int mnoobrCodigo, String clasificacion) {
        this.clasificacionManoDeObraPK = new ClasificacionManoDeObraPK(prdNumero, mnoobrTipo, mnoobrCodigo, clasificacion);
    }

    public ClasificacionManoDeObraPK getClasificacionManoDeObraPK() {
        return clasificacionManoDeObraPK;
    }

    public void setClasificacionManoDeObraPK(ClasificacionManoDeObraPK clasificacionManoDeObraPK) {
        this.clasificacionManoDeObraPK = clasificacionManoDeObraPK;
    }

    public BigDecimal getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(BigDecimal valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Periodos getPeriodos() {
        return periodos;
    }

    public void setPeriodos(Periodos periodos) {
        this.periodos = periodos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clasificacionManoDeObraPK != null ? clasificacionManoDeObraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasificacionManoDeObra)) {
            return false;
        }
        ClasificacionManoDeObra other = (ClasificacionManoDeObra) object;
        if ((this.clasificacionManoDeObraPK == null && other.clasificacionManoDeObraPK != null) || (this.clasificacionManoDeObraPK != null && !this.clasificacionManoDeObraPK.equals(other.clasificacionManoDeObraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ClasificacionManoDeObra[ clasificacionManoDeObraPK=" + clasificacionManoDeObraPK + " ]";
    }
    
}
