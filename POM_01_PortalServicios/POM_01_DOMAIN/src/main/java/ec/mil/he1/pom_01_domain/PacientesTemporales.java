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
@Table(name = "PACIENTES_TEMPORALES")
@NamedQueries({
    @NamedQuery(name = "PacientesTemporales.findAll", query = "SELECT p FROM PacientesTemporales p")})
public class PacientesTemporales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCNTMP_ID")
    private Long pcntmpId;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CLASIFICACION")
    private String clasificacion;
    @Column(name = "APELLIDOM")
    private String apellidom;
    @Column(name = "SNOMBRE")
    private String snombre;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "EDAD")
    private Short edad;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "DIRECCION_DOMICILIO")
    private String direccionDomicilio;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "REFENTE")
    private String refente;
    @Column(name = "DIAGNOSTICO")
    private String diagnostico;

    public PacientesTemporales() {
    }

    public PacientesTemporales(Long pcntmpId) {
        this.pcntmpId = pcntmpId;
    }

    public Long getPcntmpId() {
        return pcntmpId;
    }

    public void setPcntmpId(Long pcntmpId) {
        this.pcntmpId = pcntmpId;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRefente() {
        return refente;
    }

    public void setRefente(String refente) {
        this.refente = refente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcntmpId != null ? pcntmpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacientesTemporales)) {
            return false;
        }
        PacientesTemporales other = (PacientesTemporales) object;
        if ((this.pcntmpId == null && other.pcntmpId != null) || (this.pcntmpId != null && !this.pcntmpId.equals(other.pcntmpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PacientesTemporales[ pcntmpId=" + pcntmpId + " ]";
    }
    
}
