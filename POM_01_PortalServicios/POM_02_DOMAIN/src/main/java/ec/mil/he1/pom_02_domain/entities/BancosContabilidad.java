/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "BANCOS_CONTABILIDAD")
@NamedQueries({
    @NamedQuery(name = "BancosContabilidad.findAll", query = "SELECT b FROM BancosContabilidad b")})
public class BancosContabilidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BNCCNT_ID")
    private Long bnccntId;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "SECUENCIA")
    private String secuencia;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empresas empresas;

    public BancosContabilidad() {
    }

    public BancosContabilidad(Long bnccntId) {
        this.bnccntId = bnccntId;
    }

    public Long getBnccntId() {
        return bnccntId;
    }

    public void setBnccntId(Long bnccntId) {
        this.bnccntId = bnccntId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bnccntId != null ? bnccntId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BancosContabilidad)) {
            return false;
        }
        BancosContabilidad other = (BancosContabilidad) object;
        if ((this.bnccntId == null && other.bnccntId != null) || (this.bnccntId != null && !this.bnccntId.equals(other.bnccntId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.BancosContabilidad[ bnccntId=" + bnccntId + " ]";
    }
    
}
