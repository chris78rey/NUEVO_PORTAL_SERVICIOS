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
@Table(name = "PERSONAL")
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")})
public class Personal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "ESPPRS_CODIGO")
    private String espprsCodigo;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "NUMERO_CMA")
    private String numeroCma;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "PERMITIR_TURNO")
    private String permitirTurno;
    @Column(name = "PERSONAL_CIRUGIA")
    private Character personalCirugia;
    @Column(name = "BENEFICIARIO")
    private Character beneficiario;
    @Column(name = "CODIGO_CM")
    private String codigoCm;
    @Column(name = "LIBRO_MSP")
    private String libroMsp;
    @Column(name = "FOLIO_MSP")
    private String folioMsp;
    @Column(name = "NUMERO_MSP")
    private String numeroMsp;

    public Personal() {
    }

    public Personal(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspprsCodigo() {
        return espprsCodigo;
    }

    public void setEspprsCodigo(String espprsCodigo) {
        this.espprsCodigo = espprsCodigo;
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

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCma() {
        return numeroCma;
    }

    public void setNumeroCma(String numeroCma) {
        this.numeroCma = numeroCma;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPermitirTurno() {
        return permitirTurno;
    }

    public void setPermitirTurno(String permitirTurno) {
        this.permitirTurno = permitirTurno;
    }

    public Character getPersonalCirugia() {
        return personalCirugia;
    }

    public void setPersonalCirugia(Character personalCirugia) {
        this.personalCirugia = personalCirugia;
    }

    public Character getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Character beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getCodigoCm() {
        return codigoCm;
    }

    public void setCodigoCm(String codigoCm) {
        this.codigoCm = codigoCm;
    }

    public String getLibroMsp() {
        return libroMsp;
    }

    public void setLibroMsp(String libroMsp) {
        this.libroMsp = libroMsp;
    }

    public String getFolioMsp() {
        return folioMsp;
    }

    public void setFolioMsp(String folioMsp) {
        this.folioMsp = folioMsp;
    }

    public String getNumeroMsp() {
        return numeroMsp;
    }

    public void setNumeroMsp(String numeroMsp) {
        this.numeroMsp = numeroMsp;
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
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Personal[ codigo=" + codigo + " ]";
    }
    
}
