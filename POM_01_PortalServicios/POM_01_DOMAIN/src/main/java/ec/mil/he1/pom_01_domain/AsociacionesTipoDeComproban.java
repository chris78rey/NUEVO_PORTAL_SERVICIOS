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
@Table(name = "ASOCIACIONES_TIPO_DE_COMPROBAN")
@NamedQueries({
    @NamedQuery(name = "AsociacionesTipoDeComproban.findAll", query = "SELECT a FROM AsociacionesTipoDeComproban a")})
public class AsociacionesTipoDeComproban implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsociacionesTipoDeComprobanPK asociacionesTipoDeComprobanPK;
    @Column(name = "SECUENCIA")
    private Short secuencia;
    @Column(name = "MASCARA")
    private String mascara;
    @Column(name = "TIPO_DE_DATO")
    private Character tipoDeDato;
    @Column(name = "LISTA")
    private String lista;
    @Column(name = "VALOR_POR_DEFECTO")
    private String valorPorDefecto;

    public AsociacionesTipoDeComproban() {
    }

    public AsociacionesTipoDeComproban(AsociacionesTipoDeComprobanPK asociacionesTipoDeComprobanPK) {
        this.asociacionesTipoDeComprobanPK = asociacionesTipoDeComprobanPK;
    }

    public AsociacionesTipoDeComproban(String tpocmpCodigo, String nombre) {
        this.asociacionesTipoDeComprobanPK = new AsociacionesTipoDeComprobanPK(tpocmpCodigo, nombre);
    }

    public AsociacionesTipoDeComprobanPK getAsociacionesTipoDeComprobanPK() {
        return asociacionesTipoDeComprobanPK;
    }

    public void setAsociacionesTipoDeComprobanPK(AsociacionesTipoDeComprobanPK asociacionesTipoDeComprobanPK) {
        this.asociacionesTipoDeComprobanPK = asociacionesTipoDeComprobanPK;
    }

    public Short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Short secuencia) {
        this.secuencia = secuencia;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Character getTipoDeDato() {
        return tipoDeDato;
    }

    public void setTipoDeDato(Character tipoDeDato) {
        this.tipoDeDato = tipoDeDato;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public String getValorPorDefecto() {
        return valorPorDefecto;
    }

    public void setValorPorDefecto(String valorPorDefecto) {
        this.valorPorDefecto = valorPorDefecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asociacionesTipoDeComprobanPK != null ? asociacionesTipoDeComprobanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsociacionesTipoDeComproban)) {
            return false;
        }
        AsociacionesTipoDeComproban other = (AsociacionesTipoDeComproban) object;
        if ((this.asociacionesTipoDeComprobanPK == null && other.asociacionesTipoDeComprobanPK != null) || (this.asociacionesTipoDeComprobanPK != null && !this.asociacionesTipoDeComprobanPK.equals(other.asociacionesTipoDeComprobanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AsociacionesTipoDeComproban[ asociacionesTipoDeComprobanPK=" + asociacionesTipoDeComprobanPK + " ]";
    }
    
}
