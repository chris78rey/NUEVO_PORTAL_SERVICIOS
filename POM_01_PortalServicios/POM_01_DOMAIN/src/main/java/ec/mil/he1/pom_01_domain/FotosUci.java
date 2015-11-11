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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "FOTOS_UCI")
@NamedQueries({
    @NamedQuery(name = "FotosUci.findAll", query = "SELECT f FROM FotosUci f")})
public class FotosUci implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "UCI_EPC_PRMATN_NUMERO")
    private Integer uciEpcPrmatnNumero;
    @Column(name = "UCI_EPC_PRMATN_PCN_NUMERO_HC")
    private Integer uciEpcPrmatnPcnNumeroHc;
    @Lob
    @Column(name = "FOTO")
    private Serializable foto;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public FotosUci() {
    }

    public FotosUci(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getUciEpcPrmatnNumero() {
        return uciEpcPrmatnNumero;
    }

    public void setUciEpcPrmatnNumero(Integer uciEpcPrmatnNumero) {
        this.uciEpcPrmatnNumero = uciEpcPrmatnNumero;
    }

    public Integer getUciEpcPrmatnPcnNumeroHc() {
        return uciEpcPrmatnPcnNumeroHc;
    }

    public void setUciEpcPrmatnPcnNumeroHc(Integer uciEpcPrmatnPcnNumeroHc) {
        this.uciEpcPrmatnPcnNumeroHc = uciEpcPrmatnPcnNumeroHc;
    }

    public Serializable getFoto() {
        return foto;
    }

    public void setFoto(Serializable foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FotosUci)) {
            return false;
        }
        FotosUci other = (FotosUci) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FotosUci[ codigo=" + codigo + " ]";
    }
    
}
