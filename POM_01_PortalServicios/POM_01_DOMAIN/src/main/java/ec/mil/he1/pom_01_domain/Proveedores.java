/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "PROVEEDORES")
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")})
public class Proveedores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Short codigo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "RUC")
    private String ruc;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PLNCTA_CODIGO")
    private String plnctaCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE_COMPRA")
    private BigDecimal porcentajeCompra;
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Column(name = "AUTORIZACION_SRI")
    private BigInteger autorizacionSri;
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;
    @Column(name = "IDENTIFICACION")
    private String identificacion;
    @Column(name = "CONTRIBUYENTE_ESPECIAL")
    private String contribuyenteEspecial;
    @Column(name = "RETENCION_FUENTE")
    private String retencionFuente;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "PROVEEDOR_VARIO")
    private Character proveedorVario;
    @Column(name = "NOMBRE_LEGAL")
    private String nombreLegal;
    @Column(name = "LINEAS_FACTURA")
    private Short lineasFactura;

    public Proveedores() {
    }

    public Proveedores(Short codigo) {
        this.codigo = codigo;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public String getPlnctaCodigo() {
        return plnctaCodigo;
    }

    public void setPlnctaCodigo(String plnctaCodigo) {
        this.plnctaCodigo = plnctaCodigo;
    }

    public BigDecimal getPorcentajeCompra() {
        return porcentajeCompra;
    }

    public void setPorcentajeCompra(BigDecimal porcentajeCompra) {
        this.porcentajeCompra = porcentajeCompra;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public BigInteger getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(BigInteger autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
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

    public String getContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public void setContribuyenteEspecial(String contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public String getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(String retencionFuente) {
        this.retencionFuente = retencionFuente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Character getProveedorVario() {
        return proveedorVario;
    }

    public void setProveedorVario(Character proveedorVario) {
        this.proveedorVario = proveedorVario;
    }

    public String getNombreLegal() {
        return nombreLegal;
    }

    public void setNombreLegal(String nombreLegal) {
        this.nombreLegal = nombreLegal;
    }

    public Short getLineasFactura() {
        return lineasFactura;
    }

    public void setLineasFactura(Short lineasFactura) {
        this.lineasFactura = lineasFactura;
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
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Proveedores[ codigo=" + codigo + " ]";
    }
    
}
