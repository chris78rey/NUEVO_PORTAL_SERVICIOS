/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PERMISOS")
@NamedQueries({
    @NamedQuery(name = "Permisos.findAll", query = "SELECT p FROM Permisos p")})
public class Permisos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PermisosPK permisosPK;
    @Column(name = "ELIMINAR")
    private Character eliminar;
    @Column(name = "T_ACTUALIZAR")
    private Integer tActualizar;
    @Column(name = "ACTUALIZAR")
    private Character actualizar;
    @Column(name = "T_ELIMINAR")
    private Integer tEliminar;
    @Column(name = "T_INSERTAR")
    private Integer tInsertar;
    @Column(name = "INSERTAR")
    private Character insertar;
    @Column(name = "CONSULTAR")
    private Character consultar;
    @Column(name = "T_CONSULTAR")
    private Integer tConsultar;
    @Column(name = "H_CERO")
    private Character hCero;
    @JoinColumn(name = "MDL_MODULO", referencedColumnName = "MODULO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Modulos modulos;

    public Permisos() {
    }

    public Permisos(PermisosPK permisosPK) {
        this.permisosPK = permisosPK;
    }

    public Permisos(String componente, String mdlModulo, String role) {
        this.permisosPK = new PermisosPK(componente, mdlModulo, role);
    }

    public PermisosPK getPermisosPK() {
        return permisosPK;
    }

    public void setPermisosPK(PermisosPK permisosPK) {
        this.permisosPK = permisosPK;
    }

    public Character getEliminar() {
        return eliminar;
    }

    public void setEliminar(Character eliminar) {
        this.eliminar = eliminar;
    }

    public Integer getTActualizar() {
        return tActualizar;
    }

    public void setTActualizar(Integer tActualizar) {
        this.tActualizar = tActualizar;
    }

    public Character getActualizar() {
        return actualizar;
    }

    public void setActualizar(Character actualizar) {
        this.actualizar = actualizar;
    }

    public Integer getTEliminar() {
        return tEliminar;
    }

    public void setTEliminar(Integer tEliminar) {
        this.tEliminar = tEliminar;
    }

    public Integer getTInsertar() {
        return tInsertar;
    }

    public void setTInsertar(Integer tInsertar) {
        this.tInsertar = tInsertar;
    }

    public Character getInsertar() {
        return insertar;
    }

    public void setInsertar(Character insertar) {
        this.insertar = insertar;
    }

    public Character getConsultar() {
        return consultar;
    }

    public void setConsultar(Character consultar) {
        this.consultar = consultar;
    }

    public Integer getTConsultar() {
        return tConsultar;
    }

    public void setTConsultar(Integer tConsultar) {
        this.tConsultar = tConsultar;
    }

    public Character getHCero() {
        return hCero;
    }

    public void setHCero(Character hCero) {
        this.hCero = hCero;
    }

    public Modulos getModulos() {
        return modulos;
    }

    public void setModulos(Modulos modulos) {
        this.modulos = modulos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permisosPK != null ? permisosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permisos)) {
            return false;
        }
        Permisos other = (Permisos) object;
        if ((this.permisosPK == null && other.permisosPK != null) || (this.permisosPK != null && !this.permisosPK.equals(other.permisosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Permisos[ permisosPK=" + permisosPK + " ]";
    }
    
}
