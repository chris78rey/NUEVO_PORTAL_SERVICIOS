/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PRUEBAS_SANGUINEAS")
@NamedQueries({
    @NamedQuery(name = "PruebasSanguineas.findAll", query = "SELECT p FROM PruebasSanguineas p")})
public class PruebasSanguineas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "ABREVIACION")
    private String abreviacion;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "MALIGNO")
    private String maligno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pruebasSanguineas", fetch = FetchType.LAZY)
    private List<PruebasSerologicas> pruebasSerologicasList;

    public PruebasSanguineas() {
    }

    public PruebasSanguineas(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMaligno() {
        return maligno;
    }

    public void setMaligno(String maligno) {
        this.maligno = maligno;
    }

    public List<PruebasSerologicas> getPruebasSerologicasList() {
        return pruebasSerologicasList;
    }

    public void setPruebasSerologicasList(List<PruebasSerologicas> pruebasSerologicasList) {
        this.pruebasSerologicasList = pruebasSerologicasList;
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
        if (!(object instanceof PruebasSanguineas)) {
            return false;
        }
        PruebasSanguineas other = (PruebasSanguineas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PruebasSanguineas[ codigo=" + codigo + " ]";
    }
    
}
