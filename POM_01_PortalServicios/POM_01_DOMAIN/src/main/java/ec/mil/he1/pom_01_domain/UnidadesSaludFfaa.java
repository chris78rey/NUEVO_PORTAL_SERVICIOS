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
@Table(name = "UNIDADES_SALUD_FFAA")
@NamedQueries({
    @NamedQuery(name = "UnidadesSaludFfaa.findAll", query = "SELECT u FROM UnidadesSaludFfaa u")})
public class UnidadesSaludFfaa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ABREVIATURA")
    private String abreviatura;
    @Column(name = "CNT_PRV_CODIGO")
    private String cntPrvCodigo;
    @Column(name = "CNT_CODIGO")
    private String cntCodigo;

    public UnidadesSaludFfaa() {
    }

    public UnidadesSaludFfaa(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getCntPrvCodigo() {
        return cntPrvCodigo;
    }

    public void setCntPrvCodigo(String cntPrvCodigo) {
        this.cntPrvCodigo = cntPrvCodigo;
    }

    public String getCntCodigo() {
        return cntCodigo;
    }

    public void setCntCodigo(String cntCodigo) {
        this.cntCodigo = cntCodigo;
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
        if (!(object instanceof UnidadesSaludFfaa)) {
            return false;
        }
        UnidadesSaludFfaa other = (UnidadesSaludFfaa) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.UnidadesSaludFfaa[ codigo=" + codigo + " ]";
    }
    
}
