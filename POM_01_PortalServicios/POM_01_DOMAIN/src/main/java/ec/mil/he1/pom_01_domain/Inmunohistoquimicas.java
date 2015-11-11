/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "INMUNOHISTOQUIMICAS")
@NamedQueries({
    @NamedQuery(name = "Inmunohistoquimicas.findAll", query = "SELECT i FROM Inmunohistoquimicas i")})
public class Inmunohistoquimicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DGNLBR_CODIGO")
    private String dgnlbrCodigo;
    @Column(name = "DGNLBR_CODIGO_MORFOLOGICO")
    private String dgnlbrCodigoMorfologico;
    @Id
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private Integer exmNumero;
    @Column(name = "CONTRIBUCION")
    private String contribucion;

    public Inmunohistoquimicas() {
    }

    public Inmunohistoquimicas(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public String getDgnlbrCodigo() {
        return dgnlbrCodigo;
    }

    public void setDgnlbrCodigo(String dgnlbrCodigo) {
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    public String getDgnlbrCodigoMorfologico() {
        return dgnlbrCodigoMorfologico;
    }

    public void setDgnlbrCodigoMorfologico(String dgnlbrCodigoMorfologico) {
        this.dgnlbrCodigoMorfologico = dgnlbrCodigoMorfologico;
    }

    public Integer getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public String getContribucion() {
        return contribucion;
    }

    public void setContribucion(String contribucion) {
        this.contribucion = contribucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exmNumero != null ? exmNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inmunohistoquimicas)) {
            return false;
        }
        Inmunohistoquimicas other = (Inmunohistoquimicas) object;
        if ((this.exmNumero == null && other.exmNumero != null) || (this.exmNumero != null && !this.exmNumero.equals(other.exmNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Inmunohistoquimicas[ exmNumero=" + exmNumero + " ]";
    }
    
}
