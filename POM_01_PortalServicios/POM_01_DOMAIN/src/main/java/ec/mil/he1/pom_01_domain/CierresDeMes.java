/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "CIERRES_DE_MES")
@NamedQueries({
    @NamedQuery(name = "CierresDeMes.findAll", query = "SELECT c FROM CierresDeMes c")})
public class CierresDeMes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CierresDeMesPK cierresDeMesPK;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ESTADO")
    private Character estado;

    public CierresDeMes() {
    }

    public CierresDeMes(CierresDeMesPK cierresDeMesPK) {
        this.cierresDeMesPK = cierresDeMesPK;
    }

    public CierresDeMes(String empCodigo, Date mes) {
        this.cierresDeMesPK = new CierresDeMesPK(empCodigo, mes);
    }

    public CierresDeMesPK getCierresDeMesPK() {
        return cierresDeMesPK;
    }

    public void setCierresDeMesPK(CierresDeMesPK cierresDeMesPK) {
        this.cierresDeMesPK = cierresDeMesPK;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cierresDeMesPK != null ? cierresDeMesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CierresDeMes)) {
            return false;
        }
        CierresDeMes other = (CierresDeMes) object;
        if ((this.cierresDeMesPK == null && other.cierresDeMesPK != null) || (this.cierresDeMesPK != null && !this.cierresDeMesPK.equals(other.cierresDeMesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CierresDeMes[ cierresDeMesPK=" + cierresDeMesPK + " ]";
    }
    
}
