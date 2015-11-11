/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "PARAMETROS_EMPRESAS")
@NamedQueries({
    @NamedQuery(name = "ParametrosEmpresas.findAll", query = "SELECT p FROM ParametrosEmpresas p")})
public class ParametrosEmpresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosEmpresasPK parametrosEmpresasPK;
    @Column(name = "VALOR")
    private String valor;

    public ParametrosEmpresas() {
    }

    public ParametrosEmpresas(ParametrosEmpresasPK parametrosEmpresasPK) {
        this.parametrosEmpresasPK = parametrosEmpresasPK;
    }

    public ParametrosEmpresas(String prmaplNombre, String empCodigo) {
        this.parametrosEmpresasPK = new ParametrosEmpresasPK(prmaplNombre, empCodigo);
    }

    public ParametrosEmpresasPK getParametrosEmpresasPK() {
        return parametrosEmpresasPK;
    }

    public void setParametrosEmpresasPK(ParametrosEmpresasPK parametrosEmpresasPK) {
        this.parametrosEmpresasPK = parametrosEmpresasPK;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosEmpresasPK != null ? parametrosEmpresasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosEmpresas)) {
            return false;
        }
        ParametrosEmpresas other = (ParametrosEmpresas) object;
        if ((this.parametrosEmpresasPK == null && other.parametrosEmpresasPK != null) || (this.parametrosEmpresasPK != null && !this.parametrosEmpresasPK.equals(other.parametrosEmpresasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ParametrosEmpresas[ parametrosEmpresasPK=" + parametrosEmpresasPK + " ]";
    }
    
}
