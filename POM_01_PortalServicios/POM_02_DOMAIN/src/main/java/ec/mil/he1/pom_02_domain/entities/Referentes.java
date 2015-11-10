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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "REFERENTES")
@NamedQueries({
    @NamedQuery(name = "Referentes.findAll", query = "SELECT r FROM Referentes r")})
public class Referentes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReferentesPK referentesPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "RELACION")
    private String relacion;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "EMAIL")
    private String email;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "PRQ_CNT_PRV_CODIGO", referencedColumnName = "CNT_PRV_CODIGO"),
        @JoinColumn(name = "PRQ_CNT_CODIGO", referencedColumnName = "CNT_CODIGO"),
        @JoinColumn(name = "PRQ_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Parroquias parroquias;

    public Referentes() {
    }

    public Referentes(ReferentesPK referentesPK) {
        this.referentesPK = referentesPK;
    }

    public Referentes(int numero, int pcnNumeroHc) {
        this.referentesPK = new ReferentesPK(numero, pcnNumeroHc);
    }

    public ReferentesPK getReferentesPK() {
        return referentesPK;
    }

    public void setReferentesPK(ReferentesPK referentesPK) {
        this.referentesPK = referentesPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Parroquias getParroquias() {
        return parroquias;
    }

    public void setParroquias(Parroquias parroquias) {
        this.parroquias = parroquias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (referentesPK != null ? referentesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referentes)) {
            return false;
        }
        Referentes other = (Referentes) object;
        if ((this.referentesPK == null && other.referentesPK != null) || (this.referentesPK != null && !this.referentesPK.equals(other.referentesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Referentes[ referentesPK=" + referentesPK + " ]";
    }
    
}
