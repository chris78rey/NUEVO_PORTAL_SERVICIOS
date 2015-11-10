/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "PRUEBAS_SEROLOGICAS")
@NamedQueries({
    @NamedQuery(name = "PruebasSerologicas.findAll", query = "SELECT p FROM PruebasSerologicas p")})
public class PruebasSerologicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PruebasSerologicasPK pruebasSerologicasPK;
    @Column(name = "RESULTADO")
    private String resultado;
    @JoinColumn(name = "PRBSNG_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PruebasSanguineas pruebasSanguineas;

    public PruebasSerologicas() {
    }

    public PruebasSerologicas(PruebasSerologicasPK pruebasSerologicasPK) {
        this.pruebasSerologicasPK = pruebasSerologicasPK;
    }

    public PruebasSerologicas(String undNumero, String prbsngCodigo) {
        this.pruebasSerologicasPK = new PruebasSerologicasPK(undNumero, prbsngCodigo);
    }

    public PruebasSerologicasPK getPruebasSerologicasPK() {
        return pruebasSerologicasPK;
    }

    public void setPruebasSerologicasPK(PruebasSerologicasPK pruebasSerologicasPK) {
        this.pruebasSerologicasPK = pruebasSerologicasPK;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public PruebasSanguineas getPruebasSanguineas() {
        return pruebasSanguineas;
    }

    public void setPruebasSanguineas(PruebasSanguineas pruebasSanguineas) {
        this.pruebasSanguineas = pruebasSanguineas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pruebasSerologicasPK != null ? pruebasSerologicasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PruebasSerologicas)) {
            return false;
        }
        PruebasSerologicas other = (PruebasSerologicas) object;
        if ((this.pruebasSerologicasPK == null && other.pruebasSerologicasPK != null) || (this.pruebasSerologicasPK != null && !this.pruebasSerologicasPK.equals(other.pruebasSerologicasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PruebasSerologicas[ pruebasSerologicasPK=" + pruebasSerologicasPK + " ]";
    }
    
}
