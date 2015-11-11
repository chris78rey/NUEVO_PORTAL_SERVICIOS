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
public class HonorariosMedicosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;
    @Basic(optional = false)
    @Column(name = "DOCUMENTO")
    private String documento;
    @Basic(optional = false)
    @Column(name = "ID")
    private short id;

    public HonorariosMedicosPK() {
    }

    public HonorariosMedicosPK(int numero, String documento, short id) {
        this.numero = numero;
        this.documento = documento;
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numero;
        hash += (documento != null ? documento.hashCode() : 0);
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HonorariosMedicosPK)) {
            return false;
        }
        HonorariosMedicosPK other = (HonorariosMedicosPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.documento == null && other.documento != null) || (this.documento != null && !this.documento.equals(other.documento))) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.HonorariosMedicosPK[ numero=" + numero + ", documento=" + documento + ", id=" + id + " ]";
    }
    
}
