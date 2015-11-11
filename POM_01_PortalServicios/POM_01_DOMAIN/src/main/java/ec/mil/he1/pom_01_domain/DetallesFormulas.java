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
@Table(name = "DETALLES_FORMULAS")
@NamedQueries({
    @NamedQuery(name = "DetallesFormulas.findAll", query = "SELECT d FROM DetallesFormulas d")})
public class DetallesFormulas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesFormulasPK detallesFormulasPK;
    @Column(name = "PRMROL_EMP_CODIGO")
    private String prmrolEmpCodigo;
    @Column(name = "PRMROL_CODIGO")
    private String prmrolCodigo;
    @Column(name = "SECUENCIA")
    private Short secuencia;
    @Column(name = "OPERADOR")
    private String operador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;

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

    public String getPrmrolEmpCodigo() {
        return prmrolEmpCodigo;
    }

    public void setPrmrolEmpCodigo(String prmrolEmpCodigo) {
        this.prmrolEmpCodigo = prmrolEmpCodigo;
    }

    public String getPrmrolCodigo() {
        return prmrolCodigo;
    }

    public void setPrmrolCodigo(String prmrolCodigo) {
        this.prmrolCodigo = prmrolCodigo;
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
        return "ec.mil.he1.pom_01_domain.DetallesFormulas[ detallesFormulasPK=" + detallesFormulasPK + " ]";
    }
    
}
