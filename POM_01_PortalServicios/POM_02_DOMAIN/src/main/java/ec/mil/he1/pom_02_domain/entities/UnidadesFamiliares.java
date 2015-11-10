/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "UNIDADES_FAMILIARES")
@NamedQueries({
    @NamedQuery(name = "UnidadesFamiliares.findAll", query = "SELECT u FROM UnidadesFamiliares u")})
public class UnidadesFamiliares implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "APELLIDO_PATERNO_MADRE")
    private String apellidoPaternoMadre;
    @Column(name = "APELLIDO_MATERNO_MADRE")
    private String apellidoMaternoMadre;
    @Column(name = "NOMBRES_MADRE")
    private String nombresMadre;
    @Column(name = "APELLIDO_PATERNO_PADRE")
    private String apellidoPaternoPadre;
    @Column(name = "APELLIDO_MATERNO_PADRE")
    private String apellidoMaternoPadre;
    @Column(name = "NOMBRES_PADRE")
    private String nombresPadre;
    @Column(name = "DIRECCION_DOMICILIO")
    private String direccionDomicilio;
    @Column(name = "TELEFONO")
    private String telefono;
    @JoinColumn(name = "OCUPACION_MADRE", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ocupaciones ocupaciones;
    @JoinColumn(name = "OCUPACION_PADRE", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ocupaciones ocupaciones1;
    @JoinColumns({
        @JoinColumn(name = "PRQ_CNT_PRV_CODIGO", referencedColumnName = "CNT_PRV_CODIGO"),
        @JoinColumn(name = "PRQ_CNT_CODIGO", referencedColumnName = "CNT_CODIGO"),
        @JoinColumn(name = "PRQ_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Parroquias parroquias;

    public UnidadesFamiliares() {
    }

    public UnidadesFamiliares(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getApellidoPaternoMadre() {
        return apellidoPaternoMadre;
    }

    public void setApellidoPaternoMadre(String apellidoPaternoMadre) {
        this.apellidoPaternoMadre = apellidoPaternoMadre;
    }

    public String getApellidoMaternoMadre() {
        return apellidoMaternoMadre;
    }

    public void setApellidoMaternoMadre(String apellidoMaternoMadre) {
        this.apellidoMaternoMadre = apellidoMaternoMadre;
    }

    public String getNombresMadre() {
        return nombresMadre;
    }

    public void setNombresMadre(String nombresMadre) {
        this.nombresMadre = nombresMadre;
    }

    public String getApellidoPaternoPadre() {
        return apellidoPaternoPadre;
    }

    public void setApellidoPaternoPadre(String apellidoPaternoPadre) {
        this.apellidoPaternoPadre = apellidoPaternoPadre;
    }

    public String getApellidoMaternoPadre() {
        return apellidoMaternoPadre;
    }

    public void setApellidoMaternoPadre(String apellidoMaternoPadre) {
        this.apellidoMaternoPadre = apellidoMaternoPadre;
    }

    public String getNombresPadre() {
        return nombresPadre;
    }

    public void setNombresPadre(String nombresPadre) {
        this.nombresPadre = nombresPadre;
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

    public Ocupaciones getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(Ocupaciones ocupaciones) {
        this.ocupaciones = ocupaciones;
    }

    public Ocupaciones getOcupaciones1() {
        return ocupaciones1;
    }

    public void setOcupaciones1(Ocupaciones ocupaciones1) {
        this.ocupaciones1 = ocupaciones1;
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
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadesFamiliares)) {
            return false;
        }
        UnidadesFamiliares other = (UnidadesFamiliares) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.UnidadesFamiliares[ numero=" + numero + " ]";
    }
    
}
