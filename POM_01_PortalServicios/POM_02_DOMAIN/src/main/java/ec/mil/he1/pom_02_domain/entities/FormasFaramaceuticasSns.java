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
@Table(name = "FORMAS_FARAMACEUTICAS_SNS")
@NamedQueries({
    @NamedQuery(name = "FormasFaramaceuticasSns.findAll", query = "SELECT f FROM FormasFaramaceuticasSns f")})
public class FormasFaramaceuticasSns implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Short codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "formasFaramaceuticasSns", fetch = FetchType.LAZY)
    private List<TarifariosItems> tarifariosItemsList;

    public FormasFaramaceuticasSns() {
    }

    public FormasFaramaceuticasSns(Short codigo) {
        this.codigo = codigo;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<TarifariosItems> getTarifariosItemsList() {
        return tarifariosItemsList;
    }

    public void setTarifariosItemsList(List<TarifariosItems> tarifariosItemsList) {
        this.tarifariosItemsList = tarifariosItemsList;
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
        if (!(object instanceof FormasFaramaceuticasSns)) {
            return false;
        }
        FormasFaramaceuticasSns other = (FormasFaramaceuticasSns) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.FormasFaramaceuticasSns[ codigo=" + codigo + " ]";
    }
    
}
