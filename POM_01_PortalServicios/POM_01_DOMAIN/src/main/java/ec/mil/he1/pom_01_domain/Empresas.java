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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EMPRESAS")
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")})
public class Empresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "PRQ_CNT_CODIGO")
    private String prqCntCodigo;
    @Column(name = "PRQ_CNT_PRV_CODIGO")
    private String prqCntPrvCodigo;
    @Column(name = "PRQ_CODIGO")
    private String prqCodigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "RUC")
    private String ruc;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "CONTABILIDAD")
    private Character contabilidad;
    @Column(name = "NOMBRE_LEGAL")
    private String nombreLegal;
    @Column(name = "LOGO")
    private String logo;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "APELLIDO_MATERNO_RL")
    private String apellidoMaternoRl;
    @Column(name = "APELLIDO_PATERNO_RL")
    private String apellidoPaternoRl;
    @Column(name = "PRIMER_NOMBRE_RL")
    private String primerNombreRl;
    @Column(name = "SEGUNDO_NOMBRE_RL")
    private String segundoNombreRl;
    @Column(name = "NO_PATRONAL_IESS")
    private String noPatronalIess;
    @Column(name = "CEDULA_RL")
    private String cedulaRl;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "MENSAJE")
    private String mensaje;
    @Column(name = "TIPOID_RL")
    private String tipoidRl;
    @Column(name = "RUC_CONTADOR")
    private String rucContador;
    @Lob
    @Column(name = "LOGO_IMAGEN")
    private Serializable logoImagen;
    @Column(name = "CONTRIBUYENTE_ESPECIAL")
    private String contribuyenteEspecial;
    @Lob
    @Column(name = "CODIGO_BARRAS")
    private Serializable codigoBarras;

    public Empresas() {
    }

    public Empresas(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrqCntCodigo() {
        return prqCntCodigo;
    }

    public void setPrqCntCodigo(String prqCntCodigo) {
        this.prqCntCodigo = prqCntCodigo;
    }

    public String getPrqCntPrvCodigo() {
        return prqCntPrvCodigo;
    }

    public void setPrqCntPrvCodigo(String prqCntPrvCodigo) {
        this.prqCntPrvCodigo = prqCntPrvCodigo;
    }

    public String getPrqCodigo() {
        return prqCodigo;
    }

    public void setPrqCodigo(String prqCodigo) {
        this.prqCodigo = prqCodigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getContabilidad() {
        return contabilidad;
    }

    public void setContabilidad(Character contabilidad) {
        this.contabilidad = contabilidad;
    }

    public String getNombreLegal() {
        return nombreLegal;
    }

    public void setNombreLegal(String nombreLegal) {
        this.nombreLegal = nombreLegal;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellidoMaternoRl() {
        return apellidoMaternoRl;
    }

    public void setApellidoMaternoRl(String apellidoMaternoRl) {
        this.apellidoMaternoRl = apellidoMaternoRl;
    }

    public String getApellidoPaternoRl() {
        return apellidoPaternoRl;
    }

    public void setApellidoPaternoRl(String apellidoPaternoRl) {
        this.apellidoPaternoRl = apellidoPaternoRl;
    }

    public String getPrimerNombreRl() {
        return primerNombreRl;
    }

    public void setPrimerNombreRl(String primerNombreRl) {
        this.primerNombreRl = primerNombreRl;
    }

    public String getSegundoNombreRl() {
        return segundoNombreRl;
    }

    public void setSegundoNombreRl(String segundoNombreRl) {
        this.segundoNombreRl = segundoNombreRl;
    }

    public String getNoPatronalIess() {
        return noPatronalIess;
    }

    public void setNoPatronalIess(String noPatronalIess) {
        this.noPatronalIess = noPatronalIess;
    }

    public String getCedulaRl() {
        return cedulaRl;
    }

    public void setCedulaRl(String cedulaRl) {
        this.cedulaRl = cedulaRl;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipoidRl() {
        return tipoidRl;
    }

    public void setTipoidRl(String tipoidRl) {
        this.tipoidRl = tipoidRl;
    }

    public String getRucContador() {
        return rucContador;
    }

    public void setRucContador(String rucContador) {
        this.rucContador = rucContador;
    }

    public Serializable getLogoImagen() {
        return logoImagen;
    }

    public void setLogoImagen(Serializable logoImagen) {
        this.logoImagen = logoImagen;
    }

    public String getContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public void setContribuyenteEspecial(String contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public Serializable getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Serializable codigoBarras) {
        this.codigoBarras = codigoBarras;
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
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Empresas[ codigo=" + codigo + " ]";
    }
    
}
