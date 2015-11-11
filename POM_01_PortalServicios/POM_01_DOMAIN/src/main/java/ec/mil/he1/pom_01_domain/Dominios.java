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
@Table(name = "DOMINIOS")
@NamedQueries({
    @NamedQuery(name = "Dominios.findAll", query = "SELECT d FROM Dominios d")})
public class Dominios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DominiosPK dominiosPK;
    @Column(name = "CATEGORIA")
    private String categoria;
    @Column(name = "SIGNIFICADO")
    private String significado;
    @Column(name = "VALOR_POR_DEFECTO")
    private String valorPorDefecto;
    @Column(name = "VALOR_MINIMO")
    private Long valorMinimo;
    @Column(name = "VALOR_MAXIMO")
    private Long valorMaximo;
    @Column(name = "ORDEN")
    private Short orden;
    @Column(name = "MASCARA")
    private String mascara;

    public Dominios() {
    }

    public Dominios(DominiosPK dominiosPK) {
        this.dominiosPK = dominiosPK;
    }

    public Dominios(String valor, String tipo, short numeroRegistros) {
        this.dominiosPK = new DominiosPK(valor, tipo, numeroRegistros);
    }

    public DominiosPK getDominiosPK() {
        return dominiosPK;
    }

    public void setDominiosPK(DominiosPK dominiosPK) {
        this.dominiosPK = dominiosPK;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getValorPorDefecto() {
        return valorPorDefecto;
    }

    public void setValorPorDefecto(String valorPorDefecto) {
        this.valorPorDefecto = valorPorDefecto;
    }

    public Long getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Long valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public Long getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(Long valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dominiosPK != null ? dominiosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dominios)) {
            return false;
        }
        Dominios other = (Dominios) object;
        if ((this.dominiosPK == null && other.dominiosPK != null) || (this.dominiosPK != null && !this.dominiosPK.equals(other.dominiosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Dominios[ dominiosPK=" + dominiosPK + " ]";
    }
    
}
