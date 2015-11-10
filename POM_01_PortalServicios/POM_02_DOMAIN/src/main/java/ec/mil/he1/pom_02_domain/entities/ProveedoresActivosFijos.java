/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
@Table(name = "PROVEEDORES_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "ProveedoresActivosFijos.findAll", query = "SELECT p FROM ProveedoresActivosFijos p")})
public class ProveedoresActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProveedoresActivosFijosPK proveedoresActivosFijosPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;
    @Column(name = "IDENTIFICACION")
    private String identificacion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "AUTORIZACION_SRI")
    private BigInteger autorizacionSri;
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "CONTRIBUYENTE_ESPECIAL")
    private Character contribuyenteEspecial;
    @Column(name = "RETENCION_FUENTE")
    private Character retencionFuente;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "PROVEEDOR_VARIO")
    private String proveedorVario;
    @OneToMany(mappedBy = "proveedoresActivosFijos", fetch = FetchType.LAZY)
    private List<ActivosFijosEspecificos> activosFijosEspecificosList;
    @OneToMany(mappedBy = "proveedoresActivosFijos", fetch = FetchType.LAZY)
    private List<IngresosActivosFijos> ingresosActivosFijosList;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;

    public ProveedoresActivosFijos() {
    }

    public ProveedoresActivosFijos(ProveedoresActivosFijosPK proveedoresActivosFijosPK) {
        this.proveedoresActivosFijosPK = proveedoresActivosFijosPK;
    }

    public ProveedoresActivosFijos(String empCodigo, int codigo) {
        this.proveedoresActivosFijosPK = new ProveedoresActivosFijosPK(empCodigo, codigo);
    }

    public ProveedoresActivosFijosPK getProveedoresActivosFijosPK() {
        return proveedoresActivosFijosPK;
    }

    public void setProveedoresActivosFijosPK(ProveedoresActivosFijosPK proveedoresActivosFijosPK) {
        this.proveedoresActivosFijosPK = proveedoresActivosFijosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public BigInteger getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(BigInteger autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Character getContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public void setContribuyenteEspecial(Character contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public Character getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(Character retencionFuente) {
        this.retencionFuente = retencionFuente;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getProveedorVario() {
        return proveedorVario;
    }

    public void setProveedorVario(String proveedorVario) {
        this.proveedorVario = proveedorVario;
    }

    public List<ActivosFijosEspecificos> getActivosFijosEspecificosList() {
        return activosFijosEspecificosList;
    }

    public void setActivosFijosEspecificosList(List<ActivosFijosEspecificos> activosFijosEspecificosList) {
        this.activosFijosEspecificosList = activosFijosEspecificosList;
    }

    public List<IngresosActivosFijos> getIngresosActivosFijosList() {
        return ingresosActivosFijosList;
    }

    public void setIngresosActivosFijosList(List<IngresosActivosFijos> ingresosActivosFijosList) {
        this.ingresosActivosFijosList = ingresosActivosFijosList;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proveedoresActivosFijosPK != null ? proveedoresActivosFijosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProveedoresActivosFijos)) {
            return false;
        }
        ProveedoresActivosFijos other = (ProveedoresActivosFijos) object;
        if ((this.proveedoresActivosFijosPK == null && other.proveedoresActivosFijosPK != null) || (this.proveedoresActivosFijosPK != null && !this.proveedoresActivosFijosPK.equals(other.proveedoresActivosFijosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ProveedoresActivosFijos[ proveedoresActivosFijosPK=" + proveedoresActivosFijosPK + " ]";
    }
    
}
