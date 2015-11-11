/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CLIENTES_PAGAN")
@NamedQueries({
    @NamedQuery(name = "ClientesPagan.findAll", query = "SELECT c FROM ClientesPagan c")})
public class ClientesPagan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClientesPaganPK clientesPaganPK;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "NOMBRE_LEGAL")
    private String nombreLegal;
    @Column(name = "EXCENTO_IVA")
    private Character excentoIva;
    @Column(name = "EMAIL")
    private String email;

    public ClientesPagan() {
    }

    public ClientesPagan(ClientesPaganPK clientesPaganPK) {
        this.clientesPaganPK = clientesPaganPK;
    }

    public ClientesPagan(String tipoCodigo, String codigo) {
        this.clientesPaganPK = new ClientesPaganPK(tipoCodigo, codigo);
    }

    public ClientesPaganPK getClientesPaganPK() {
        return clientesPaganPK;
    }

    public void setClientesPaganPK(ClientesPaganPK clientesPaganPK) {
        this.clientesPaganPK = clientesPaganPK;
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

    public String getNombreLegal() {
        return nombreLegal;
    }

    public void setNombreLegal(String nombreLegal) {
        this.nombreLegal = nombreLegal;
    }

    public Character getExcentoIva() {
        return excentoIva;
    }

    public void setExcentoIva(Character excentoIva) {
        this.excentoIva = excentoIva;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientesPaganPK != null ? clientesPaganPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientesPagan)) {
            return false;
        }
        ClientesPagan other = (ClientesPagan) object;
        if ((this.clientesPaganPK == null && other.clientesPaganPK != null) || (this.clientesPaganPK != null && !this.clientesPaganPK.equals(other.clientesPaganPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ClientesPagan[ clientesPaganPK=" + clientesPaganPK + " ]";
    }
    
}
