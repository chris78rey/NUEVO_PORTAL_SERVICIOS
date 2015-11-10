/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EMPLEADOS_ROLES")
@NamedQueries({
    @NamedQuery(name = "EmpleadosRoles.findAll", query = "SELECT e FROM EmpleadosRoles e")})
public class EmpleadosRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpleadosRolesPK empleadosRolesPK;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "FECHA_DE_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeNacimiento;
    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "FECHA_DE_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeIngreso;
    @Column(name = "ESTADO_LABORAL")
    private String estadoLaboral;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Lob
    @Column(name = "FOTOGRAFIA")
    private byte[] fotografia;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "FECHA_DE_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeSalida;
    @Column(name = "CARNET_IESS")
    private String carnetIess;
    @Column(name = "CUENTA_BANCARIA")
    private String cuentaBancaria;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "PER_ID")
    private Integer perId;
    @Column(name = "TIPO_EMPLEADO")
    private String tipoEmpleado;
    @Column(name = "CUENTA_PAGO")
    private String cuentaPago;
    @Column(name = "CODIGO_CONTROL")
    private String codigoControl;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EXTRAS")
    private BigDecimal extras;
    @Column(name = "TERCERIZADORA")
    private String tercerizadora;
    @Column(name = "FECHA_ING_PUBLICA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngPublica;
    @Column(name = "CLASIFICACION")
    private String clasificacion;
    @Column(name = "TIPO_ID")
    private String tipoId;
    @Column(name = "DIRECCION_NUMERO")
    private String direccionNumero;
    @Column(name = "SISTEMA_SALARIO_NETO")
    private String sistemaSalarioNeto;
    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<MovimientosPagosEspeciales> movimientosPagosEspecialesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<PeriodosFondoReserva> periodosFondoReservaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<HistorialesEmpleados> historialesEmpleadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<MovimientosRoles> movimientosRolesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<ParametrosRolesEmpleado> parametrosRolesEmpleadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<CargasFamiliares> cargasFamiliaresList;
    @OneToMany(mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<ControlesDePersonal> controlesDePersonalList;
    @JoinColumns({
        @JoinColumn(name = "CRGEMP_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "CRGEMP_EMP_CODIGO", referencedColumnName = "EMP_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CargosEmpleados cargosEmpleados;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumns({
        @JoinColumn(name = "PRQ_CNT_PRV_CODIGO", referencedColumnName = "CNT_PRV_CODIGO"),
        @JoinColumn(name = "PRQ_CNT_CODIGO", referencedColumnName = "CNT_CODIGO"),
        @JoinColumn(name = "PRQ_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Parroquias parroquias;
    @JoinColumns({
        @JoinColumn(name = "PRFEMP_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
        @JoinColumn(name = "PRFEMP_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PerfilesEmpleados perfilesEmpleados;
    @OneToMany(mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<Liquidaciones> liquidacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<EmpleadosCentrosDeCostos> empleadosCentrosDeCostosList;
    @OneToMany(mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<IngresosSalidasEmpleados> ingresosSalidasEmpleadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadosRoles", fetch = FetchType.LAZY)
    private List<NovedadesRoles> novedadesRolesList;

    public EmpleadosRoles() {
    }

    public EmpleadosRoles(EmpleadosRolesPK empleadosRolesPK) {
        this.empleadosRolesPK = empleadosRolesPK;
    }

    public EmpleadosRoles(String empCodigo, int codigo) {
        this.empleadosRolesPK = new EmpleadosRolesPK(empCodigo, codigo);
    }

    public EmpleadosRolesPK getEmpleadosRolesPK() {
        return empleadosRolesPK;
    }

    public void setEmpleadosRolesPK(EmpleadosRolesPK empleadosRolesPK) {
        this.empleadosRolesPK = empleadosRolesPK;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getEstadoLaboral() {
        return estadoLaboral;
    }

    public void setEstadoLaboral(String estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public byte[] getFotografia() {
        return fotografia;
    }

    public void setFotografia(byte[] fotografia) {
        this.fotografia = fotografia;
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

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public String getCarnetIess() {
        return carnetIess;
    }

    public void setCarnetIess(String carnetIess) {
        this.carnetIess = carnetIess;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getCuentaPago() {
        return cuentaPago;
    }

    public void setCuentaPago(String cuentaPago) {
        this.cuentaPago = cuentaPago;
    }

    public String getCodigoControl() {
        return codigoControl;
    }

    public void setCodigoControl(String codigoControl) {
        this.codigoControl = codigoControl;
    }

    public BigDecimal getExtras() {
        return extras;
    }

    public void setExtras(BigDecimal extras) {
        this.extras = extras;
    }

    public String getTercerizadora() {
        return tercerizadora;
    }

    public void setTercerizadora(String tercerizadora) {
        this.tercerizadora = tercerizadora;
    }

    public Date getFechaIngPublica() {
        return fechaIngPublica;
    }

    public void setFechaIngPublica(Date fechaIngPublica) {
        this.fechaIngPublica = fechaIngPublica;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getDireccionNumero() {
        return direccionNumero;
    }

    public void setDireccionNumero(String direccionNumero) {
        this.direccionNumero = direccionNumero;
    }

    public String getSistemaSalarioNeto() {
        return sistemaSalarioNeto;
    }

    public void setSistemaSalarioNeto(String sistemaSalarioNeto) {
        this.sistemaSalarioNeto = sistemaSalarioNeto;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public List<MovimientosPagosEspeciales> getMovimientosPagosEspecialesList() {
        return movimientosPagosEspecialesList;
    }

    public void setMovimientosPagosEspecialesList(List<MovimientosPagosEspeciales> movimientosPagosEspecialesList) {
        this.movimientosPagosEspecialesList = movimientosPagosEspecialesList;
    }

    public List<PeriodosFondoReserva> getPeriodosFondoReservaList() {
        return periodosFondoReservaList;
    }

    public void setPeriodosFondoReservaList(List<PeriodosFondoReserva> periodosFondoReservaList) {
        this.periodosFondoReservaList = periodosFondoReservaList;
    }

    public List<HistorialesEmpleados> getHistorialesEmpleadosList() {
        return historialesEmpleadosList;
    }

    public void setHistorialesEmpleadosList(List<HistorialesEmpleados> historialesEmpleadosList) {
        this.historialesEmpleadosList = historialesEmpleadosList;
    }

    public List<MovimientosRoles> getMovimientosRolesList() {
        return movimientosRolesList;
    }

    public void setMovimientosRolesList(List<MovimientosRoles> movimientosRolesList) {
        this.movimientosRolesList = movimientosRolesList;
    }

    public List<ParametrosRolesEmpleado> getParametrosRolesEmpleadoList() {
        return parametrosRolesEmpleadoList;
    }

    public void setParametrosRolesEmpleadoList(List<ParametrosRolesEmpleado> parametrosRolesEmpleadoList) {
        this.parametrosRolesEmpleadoList = parametrosRolesEmpleadoList;
    }

    public List<CargasFamiliares> getCargasFamiliaresList() {
        return cargasFamiliaresList;
    }

    public void setCargasFamiliaresList(List<CargasFamiliares> cargasFamiliaresList) {
        this.cargasFamiliaresList = cargasFamiliaresList;
    }

    public List<ControlesDePersonal> getControlesDePersonalList() {
        return controlesDePersonalList;
    }

    public void setControlesDePersonalList(List<ControlesDePersonal> controlesDePersonalList) {
        this.controlesDePersonalList = controlesDePersonalList;
    }

    public CargosEmpleados getCargosEmpleados() {
        return cargosEmpleados;
    }

    public void setCargosEmpleados(CargosEmpleados cargosEmpleados) {
        this.cargosEmpleados = cargosEmpleados;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public Parroquias getParroquias() {
        return parroquias;
    }

    public void setParroquias(Parroquias parroquias) {
        this.parroquias = parroquias;
    }

    public PerfilesEmpleados getPerfilesEmpleados() {
        return perfilesEmpleados;
    }

    public void setPerfilesEmpleados(PerfilesEmpleados perfilesEmpleados) {
        this.perfilesEmpleados = perfilesEmpleados;
    }

    public List<Liquidaciones> getLiquidacionesList() {
        return liquidacionesList;
    }

    public void setLiquidacionesList(List<Liquidaciones> liquidacionesList) {
        this.liquidacionesList = liquidacionesList;
    }

    public List<EmpleadosCentrosDeCostos> getEmpleadosCentrosDeCostosList() {
        return empleadosCentrosDeCostosList;
    }

    public void setEmpleadosCentrosDeCostosList(List<EmpleadosCentrosDeCostos> empleadosCentrosDeCostosList) {
        this.empleadosCentrosDeCostosList = empleadosCentrosDeCostosList;
    }

    public List<IngresosSalidasEmpleados> getIngresosSalidasEmpleadosList() {
        return ingresosSalidasEmpleadosList;
    }

    public void setIngresosSalidasEmpleadosList(List<IngresosSalidasEmpleados> ingresosSalidasEmpleadosList) {
        this.ingresosSalidasEmpleadosList = ingresosSalidasEmpleadosList;
    }

    public List<NovedadesRoles> getNovedadesRolesList() {
        return novedadesRolesList;
    }

    public void setNovedadesRolesList(List<NovedadesRoles> novedadesRolesList) {
        this.novedadesRolesList = novedadesRolesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empleadosRolesPK != null ? empleadosRolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadosRoles)) {
            return false;
        }
        EmpleadosRoles other = (EmpleadosRoles) object;
        if ((this.empleadosRolesPK == null && other.empleadosRolesPK != null) || (this.empleadosRolesPK != null && !this.empleadosRolesPK.equals(other.empleadosRolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EmpleadosRoles[ empleadosRolesPK=" + empleadosRolesPK + " ]";
    }
    
}
