/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "LINEAS_ENTREVISTAS")
@NamedQueries({
    @NamedQuery(name = "LineasEntrevistas.findAll", query = "SELECT l FROM LineasEntrevistas l")})
public class LineasEntrevistas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LineasEntrevistasPK lineasEntrevistasPK;
    @Column(name = "PRGENT_CODIGO")
    private String prgentCodigo;
    @Column(name = "RESPUESTA")
    private Character respuesta;

    public LineasEntrevistas() {
    }

    public LineasEntrevistas(LineasEntrevistasPK lineasEntrevistasPK) {
        this.lineasEntrevistasPK = lineasEntrevistasPK;
    }

    public LineasEntrevistas(int dnnNumero, BigInteger numeroEntrevista) {
        this.lineasEntrevistasPK = new LineasEntrevistasPK(dnnNumero, numeroEntrevista);
    }

    public LineasEntrevistasPK getLineasEntrevistasPK() {
        return lineasEntrevistasPK;
    }

    public void setLineasEntrevistasPK(LineasEntrevistasPK lineasEntrevistasPK) {
        this.lineasEntrevistasPK = lineasEntrevistasPK;
    }

    public String getPrgentCodigo() {
        return prgentCodigo;
    }

    public void setPrgentCodigo(String prgentCodigo) {
        this.prgentCodigo = prgentCodigo;
    }

    public Character getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Character respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lineasEntrevistasPK != null ? lineasEntrevistasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineasEntrevistas)) {
            return false;
        }
        LineasEntrevistas other = (LineasEntrevistas) object;
        if ((this.lineasEntrevistasPK == null && other.lineasEntrevistasPK != null) || (this.lineasEntrevistasPK != null && !this.lineasEntrevistasPK.equals(other.lineasEntrevistasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.LineasEntrevistas[ lineasEntrevistasPK=" + lineasEntrevistasPK + " ]";
    }
    
}
