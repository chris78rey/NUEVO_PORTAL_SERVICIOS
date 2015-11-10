/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "SEG_USUARIO")
@NamedQueries({
    @NamedQuery(name = "SegUsuario.findAll", query = "SELECT s FROM SegUsuario s")})
public class SegUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "USU_TIPO")
    private Character usuTipo;
    @Column(name = "USU_CLAVE")
    private String usuClave;
    @Column(name = "NOM_ID")
    private BigInteger nomId;
    @Column(name = "CEDULA_LOGIN")
    private String cedulaLogin;
    @Column(name = "BFILE_FOTO")
    private Serializable bfileFoto;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "DIRECCION_DOMICILIO")
    private String direccionDomicilio;
    @Column(name = "INACTIVA")
    private Character inactiva;
    @Column(name = "OCULTAR")
    private BigInteger ocultar;
    @JoinColumn(name = "NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "CNT_PRV_CODIGO", referencedColumnName = "CNT_PRV_CODIGO"),
        @JoinColumn(name = "CNT_CODIGO", referencedColumnName = "CNT_CODIGO"),
        @JoinColumn(name = "CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Parroquias parroquias;
    @JoinColumn(name = "PER_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "UEX_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SegUsuariosExternos segUsuariosExternos;
    @OneToMany(mappedBy = "segUsuario", fetch = FetchType.LAZY)
    private List<SegUsuarioPerfil> segUsuarioPerfilList;

    public SegUsuario() {
    }

    public SegUsuario(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Character getUsuTipo() {
        return usuTipo;
    }

    public void setUsuTipo(Character usuTipo) {
        this.usuTipo = usuTipo;
    }

    public String getUsuClave() {
        return usuClave;
    }

    public void setUsuClave(String usuClave) {
        this.usuClave = usuClave;
    }

    public BigInteger getNomId() {
        return nomId;
    }

    public void setNomId(BigInteger nomId) {
        this.nomId = nomId;
    }

    public String getCedulaLogin() {
        return cedulaLogin;
    }

    public void setCedulaLogin(String cedulaLogin) {
        this.cedulaLogin = cedulaLogin;
    }

    public Serializable getBfileFoto() {
        return bfileFoto;
    }

    public void setBfileFoto(Serializable bfileFoto) {
        this.bfileFoto = bfileFoto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public Character getInactiva() {
        return inactiva;
    }

    public void setInactiva(Character inactiva) {
        this.inactiva = inactiva;
    }

    public BigInteger getOcultar() {
        return ocultar;
    }

    public void setOcultar(BigInteger ocultar) {
        this.ocultar = ocultar;
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

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public SegUsuariosExternos getSegUsuariosExternos() {
        return segUsuariosExternos;
    }

    public void setSegUsuariosExternos(SegUsuariosExternos segUsuariosExternos) {
        this.segUsuariosExternos = segUsuariosExternos;
    }

    public List<SegUsuarioPerfil> getSegUsuarioPerfilList() {
        return segUsuarioPerfilList;
    }

    public void setSegUsuarioPerfilList(List<SegUsuarioPerfil> segUsuarioPerfilList) {
        this.segUsuarioPerfilList = segUsuarioPerfilList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegUsuario)) {
            return false;
        }
        SegUsuario other = (SegUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SegUsuario[ id=" + id + " ]";
    }
    
}
