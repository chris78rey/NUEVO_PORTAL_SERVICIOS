/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "GENERICOS")
@NamedQueries({
    @NamedQuery(name = "Genericos.findAll", query = "SELECT g FROM Genericos g")})
public class Genericos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "MAXIMA_DIARIA")
    private BigInteger maximaDiaria;
    @Column(name = "MINIMA_DIARIA")
    private BigInteger minimaDiaria;
    @Lob
    @Column(name = "POSOLOGIA")
    private String posologia;

    public Genericos() {
    }

    public Genericos(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getMaximaDiaria() {
        return maximaDiaria;
    }

    public void setMaximaDiaria(BigInteger maximaDiaria) {
        this.maximaDiaria = maximaDiaria;
    }

    public BigInteger getMinimaDiaria() {
        return minimaDiaria;
    }

    public void setMinimaDiaria(BigInteger minimaDiaria) {
        this.minimaDiaria = minimaDiaria;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
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
        if (!(object instanceof Genericos)) {
            return false;
        }
        Genericos other = (Genericos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Genericos[ codigo=" + codigo + " ]";
    }
    
}
