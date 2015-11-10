/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
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
@Table(name = "EMPRESAS")
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")})
public class Empresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<TiposRetencionesEmpresas> tiposRetencionesEmpresasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<CentrosDeCostos> centrosDeCostosList;
    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<CreacionEgresosFct> creacionEgresosFctList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<CierresDeMes> cierresDeMesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<CentrosDeGastos> centrosDeGastosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<FormulasRoles> formulasRolesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<AgrupadoresContables> agrupadoresContablesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<Iva> ivaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<RegulacionesActivosFijos> regulacionesActivosFijosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<RolesDePagos> rolesDePagosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<GruposInggstReporteCnt> gruposInggstReporteCntList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<HistoricosDeMayorizacion> historicosDeMayorizacionList;
    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ContabilizacionIngresosCm> contabilizacionIngresosCmList;
    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ContabilizacionRegulacionBtc> contabilizacionRegulacionBtcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ParametrosIntegracion> parametrosIntegracionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<Mayores> mayoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<GruposActivosFijos> gruposActivosFijosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<PerfilesEmpleados> perfilesEmpleadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<AsignacionesReingresosActivo> asignacionesReingresosActivoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<IngresosActivosFijos> ingresosActivosFijosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<CuentasBancarias> cuentasBancariasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<Depreciaciones> depreciacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ParametrosRoles> parametrosRolesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ParametrosEmpresas> parametrosEmpresasList;
    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<BancosContabilidad> bancosContabilidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<EgresosActivosFijos> egresosActivosFijosList;
    @JoinColumns({
        @JoinColumn(name = "PRQ_CNT_PRV_CODIGO", referencedColumnName = "CNT_PRV_CODIGO"),
        @JoinColumn(name = "PRQ_CNT_CODIGO", referencedColumnName = "CNT_CODIGO"),
        @JoinColumn(name = "PRQ_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Parroquias parroquias;
    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ContabilizacionIngresos> contabilizacionIngresosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<HistoricoTiposDeCambio> historicoTiposDeCambioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<EmpleadosRoles> empleadosRolesList;
    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ContabilizacionCierreMes> contabilizacionCierreMesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<TiposComprobantesEmpresas> tiposComprobantesEmpresasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<CargosEmpleados> cargosEmpleadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ProveedoresActivosFijos> proveedoresActivosFijosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<ContabilizacionAsignaciones> contabilizacionAsignacionesList;
    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<DatosAsociacion> datosAsociacionList;

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

    public List<TiposRetencionesEmpresas> getTiposRetencionesEmpresasList() {
        return tiposRetencionesEmpresasList;
    }

    public void setTiposRetencionesEmpresasList(List<TiposRetencionesEmpresas> tiposRetencionesEmpresasList) {
        this.tiposRetencionesEmpresasList = tiposRetencionesEmpresasList;
    }

    public List<CentrosDeCostos> getCentrosDeCostosList() {
        return centrosDeCostosList;
    }

    public void setCentrosDeCostosList(List<CentrosDeCostos> centrosDeCostosList) {
        this.centrosDeCostosList = centrosDeCostosList;
    }

    public List<CreacionEgresosFct> getCreacionEgresosFctList() {
        return creacionEgresosFctList;
    }

    public void setCreacionEgresosFctList(List<CreacionEgresosFct> creacionEgresosFctList) {
        this.creacionEgresosFctList = creacionEgresosFctList;
    }

    public List<CierresDeMes> getCierresDeMesList() {
        return cierresDeMesList;
    }

    public void setCierresDeMesList(List<CierresDeMes> cierresDeMesList) {
        this.cierresDeMesList = cierresDeMesList;
    }

    public List<CentrosDeGastos> getCentrosDeGastosList() {
        return centrosDeGastosList;
    }

    public void setCentrosDeGastosList(List<CentrosDeGastos> centrosDeGastosList) {
        this.centrosDeGastosList = centrosDeGastosList;
    }

    public List<FormulasRoles> getFormulasRolesList() {
        return formulasRolesList;
    }

    public void setFormulasRolesList(List<FormulasRoles> formulasRolesList) {
        this.formulasRolesList = formulasRolesList;
    }

    public List<AgrupadoresContables> getAgrupadoresContablesList() {
        return agrupadoresContablesList;
    }

    public void setAgrupadoresContablesList(List<AgrupadoresContables> agrupadoresContablesList) {
        this.agrupadoresContablesList = agrupadoresContablesList;
    }

    public List<Iva> getIvaList() {
        return ivaList;
    }

    public void setIvaList(List<Iva> ivaList) {
        this.ivaList = ivaList;
    }

    public List<RegulacionesActivosFijos> getRegulacionesActivosFijosList() {
        return regulacionesActivosFijosList;
    }

    public void setRegulacionesActivosFijosList(List<RegulacionesActivosFijos> regulacionesActivosFijosList) {
        this.regulacionesActivosFijosList = regulacionesActivosFijosList;
    }

    public List<RolesDePagos> getRolesDePagosList() {
        return rolesDePagosList;
    }

    public void setRolesDePagosList(List<RolesDePagos> rolesDePagosList) {
        this.rolesDePagosList = rolesDePagosList;
    }

    public List<GruposInggstReporteCnt> getGruposInggstReporteCntList() {
        return gruposInggstReporteCntList;
    }

    public void setGruposInggstReporteCntList(List<GruposInggstReporteCnt> gruposInggstReporteCntList) {
        this.gruposInggstReporteCntList = gruposInggstReporteCntList;
    }

    public List<HistoricosDeMayorizacion> getHistoricosDeMayorizacionList() {
        return historicosDeMayorizacionList;
    }

    public void setHistoricosDeMayorizacionList(List<HistoricosDeMayorizacion> historicosDeMayorizacionList) {
        this.historicosDeMayorizacionList = historicosDeMayorizacionList;
    }

    public List<ContabilizacionIngresosCm> getContabilizacionIngresosCmList() {
        return contabilizacionIngresosCmList;
    }

    public void setContabilizacionIngresosCmList(List<ContabilizacionIngresosCm> contabilizacionIngresosCmList) {
        this.contabilizacionIngresosCmList = contabilizacionIngresosCmList;
    }

    public List<ContabilizacionRegulacionBtc> getContabilizacionRegulacionBtcList() {
        return contabilizacionRegulacionBtcList;
    }

    public void setContabilizacionRegulacionBtcList(List<ContabilizacionRegulacionBtc> contabilizacionRegulacionBtcList) {
        this.contabilizacionRegulacionBtcList = contabilizacionRegulacionBtcList;
    }

    public List<ParametrosIntegracion> getParametrosIntegracionList() {
        return parametrosIntegracionList;
    }

    public void setParametrosIntegracionList(List<ParametrosIntegracion> parametrosIntegracionList) {
        this.parametrosIntegracionList = parametrosIntegracionList;
    }

    public List<Mayores> getMayoresList() {
        return mayoresList;
    }

    public void setMayoresList(List<Mayores> mayoresList) {
        this.mayoresList = mayoresList;
    }

    public List<GruposActivosFijos> getGruposActivosFijosList() {
        return gruposActivosFijosList;
    }

    public void setGruposActivosFijosList(List<GruposActivosFijos> gruposActivosFijosList) {
        this.gruposActivosFijosList = gruposActivosFijosList;
    }

    public List<PerfilesEmpleados> getPerfilesEmpleadosList() {
        return perfilesEmpleadosList;
    }

    public void setPerfilesEmpleadosList(List<PerfilesEmpleados> perfilesEmpleadosList) {
        this.perfilesEmpleadosList = perfilesEmpleadosList;
    }

    public List<AsignacionesReingresosActivo> getAsignacionesReingresosActivoList() {
        return asignacionesReingresosActivoList;
    }

    public void setAsignacionesReingresosActivoList(List<AsignacionesReingresosActivo> asignacionesReingresosActivoList) {
        this.asignacionesReingresosActivoList = asignacionesReingresosActivoList;
    }

    public List<IngresosActivosFijos> getIngresosActivosFijosList() {
        return ingresosActivosFijosList;
    }

    public void setIngresosActivosFijosList(List<IngresosActivosFijos> ingresosActivosFijosList) {
        this.ingresosActivosFijosList = ingresosActivosFijosList;
    }

    public List<CuentasBancarias> getCuentasBancariasList() {
        return cuentasBancariasList;
    }

    public void setCuentasBancariasList(List<CuentasBancarias> cuentasBancariasList) {
        this.cuentasBancariasList = cuentasBancariasList;
    }

    public List<Depreciaciones> getDepreciacionesList() {
        return depreciacionesList;
    }

    public void setDepreciacionesList(List<Depreciaciones> depreciacionesList) {
        this.depreciacionesList = depreciacionesList;
    }

    public List<ParametrosRoles> getParametrosRolesList() {
        return parametrosRolesList;
    }

    public void setParametrosRolesList(List<ParametrosRoles> parametrosRolesList) {
        this.parametrosRolesList = parametrosRolesList;
    }

    public List<ParametrosEmpresas> getParametrosEmpresasList() {
        return parametrosEmpresasList;
    }

    public void setParametrosEmpresasList(List<ParametrosEmpresas> parametrosEmpresasList) {
        this.parametrosEmpresasList = parametrosEmpresasList;
    }

    public List<BancosContabilidad> getBancosContabilidadList() {
        return bancosContabilidadList;
    }

    public void setBancosContabilidadList(List<BancosContabilidad> bancosContabilidadList) {
        this.bancosContabilidadList = bancosContabilidadList;
    }

    public List<EgresosActivosFijos> getEgresosActivosFijosList() {
        return egresosActivosFijosList;
    }

    public void setEgresosActivosFijosList(List<EgresosActivosFijos> egresosActivosFijosList) {
        this.egresosActivosFijosList = egresosActivosFijosList;
    }

    public Parroquias getParroquias() {
        return parroquias;
    }

    public void setParroquias(Parroquias parroquias) {
        this.parroquias = parroquias;
    }

    public List<ContabilizacionIngresos> getContabilizacionIngresosList() {
        return contabilizacionIngresosList;
    }

    public void setContabilizacionIngresosList(List<ContabilizacionIngresos> contabilizacionIngresosList) {
        this.contabilizacionIngresosList = contabilizacionIngresosList;
    }

    public List<HistoricoTiposDeCambio> getHistoricoTiposDeCambioList() {
        return historicoTiposDeCambioList;
    }

    public void setHistoricoTiposDeCambioList(List<HistoricoTiposDeCambio> historicoTiposDeCambioList) {
        this.historicoTiposDeCambioList = historicoTiposDeCambioList;
    }

    public List<EmpleadosRoles> getEmpleadosRolesList() {
        return empleadosRolesList;
    }

    public void setEmpleadosRolesList(List<EmpleadosRoles> empleadosRolesList) {
        this.empleadosRolesList = empleadosRolesList;
    }

    public List<ContabilizacionCierreMes> getContabilizacionCierreMesList() {
        return contabilizacionCierreMesList;
    }

    public void setContabilizacionCierreMesList(List<ContabilizacionCierreMes> contabilizacionCierreMesList) {
        this.contabilizacionCierreMesList = contabilizacionCierreMesList;
    }

    public List<TiposComprobantesEmpresas> getTiposComprobantesEmpresasList() {
        return tiposComprobantesEmpresasList;
    }

    public void setTiposComprobantesEmpresasList(List<TiposComprobantesEmpresas> tiposComprobantesEmpresasList) {
        this.tiposComprobantesEmpresasList = tiposComprobantesEmpresasList;
    }

    public List<CargosEmpleados> getCargosEmpleadosList() {
        return cargosEmpleadosList;
    }

    public void setCargosEmpleadosList(List<CargosEmpleados> cargosEmpleadosList) {
        this.cargosEmpleadosList = cargosEmpleadosList;
    }

    public List<ProveedoresActivosFijos> getProveedoresActivosFijosList() {
        return proveedoresActivosFijosList;
    }

    public void setProveedoresActivosFijosList(List<ProveedoresActivosFijos> proveedoresActivosFijosList) {
        this.proveedoresActivosFijosList = proveedoresActivosFijosList;
    }

    public List<ContabilizacionAsignaciones> getContabilizacionAsignacionesList() {
        return contabilizacionAsignacionesList;
    }

    public void setContabilizacionAsignacionesList(List<ContabilizacionAsignaciones> contabilizacionAsignacionesList) {
        this.contabilizacionAsignacionesList = contabilizacionAsignacionesList;
    }

    public List<DatosAsociacion> getDatosAsociacionList() {
        return datosAsociacionList;
    }

    public void setDatosAsociacionList(List<DatosAsociacion> datosAsociacionList) {
        this.datosAsociacionList = datosAsociacionList;
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
        return "ec.mil.he1.pom_02_domain.entities.Empresas[ codigo=" + codigo + " ]";
    }
    
}
