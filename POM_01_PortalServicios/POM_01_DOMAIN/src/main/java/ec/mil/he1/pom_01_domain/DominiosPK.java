/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class DominiosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VALOR")
    private String valor;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "NUMERO_REGISTROS")
    private short numeroRegistros;

    public DominiosPK() {
    }

    public DominiosPK(String valor, String tipo, short numeroRegistros) {
        this.valor = valor;
        this.tipo = tipo;
        this.numeroRegistros = numeroRegistros;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public short getNumeroRegistros() {
        return numeroRegistros;
    }

    public void setNumeroRegistros(short numeroRegistros) {
        this.numeroRegistros = numeroRegistros;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valor != null ? valor.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (int) numeroRegistros;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DominiosPK)) {
            return false;
        }
        DominiosPK other = (DominiosPK) object;
        if ((this.valor == null && other.valor != null) || (this.valor != null && !this.valor.equals(other.valor))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if (this.numeroRegistros != other.numeroRegistros) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DominiosPK[ valor=" + valor + ", tipo=" + tipo + ", numeroRegistros=" + numeroRegistros + " ]";
    }
    
}
