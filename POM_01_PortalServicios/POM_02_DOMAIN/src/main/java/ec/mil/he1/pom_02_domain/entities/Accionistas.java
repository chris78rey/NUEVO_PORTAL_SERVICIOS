/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ACCIONISTAS")
@NamedQueries({
    @NamedQuery(name = "Accionistas.findAll", query = "SELECT a FROM Accionistas a")})
public class Accionistas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "ID_CONTABLE")
    private Short idContable;
    @OneToMany(mappedBy = "accionistas", fetch = FetchType.LAZY)
    private List<TitulosAcciones> titulosAccionesList;

    public Accionistas() {
    }

    public Accionistas(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Short getIdContable() {
        return idContable;
    }

    public void setIdContable(Short idContable) {
        this.idContable = idContable;
    }

    public List<TitulosAcciones> getTitulosAccionesList() {
        return titulosAccionesList;
    }

    public void setTitulosAccionesList(List<TitulosAcciones> titulosAccionesList) {
        this.titulosAccionesList = titulosAccionesList;
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
        if (!(object instanceof Accionistas)) {
            return false;
        }
        Accionistas other = (Accionistas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Accionistas[ codigo=" + codigo + " ]";
    }
    
}
