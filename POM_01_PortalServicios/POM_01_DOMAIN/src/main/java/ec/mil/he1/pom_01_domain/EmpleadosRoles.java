/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @Column(name = "PRFEMP_CODIGO")
    private String prfempCodigo;
    @Column(name = "PRFEMP_EMP_CODIGO")
    private String prfempEmpCodigo;
    @Column(name = "CRGEMP_EMP_CODIGO")
    private String crgempEmpCodigo;
    @Column(name = "CRGEMP_CODIGO")
    private String crgempCodigo;
    @Column(name = "PRQ_CNT_CODIGO")
    private String prqCntCodigo;
    @Column(name = "PRQ_CNT_PRV_CODIGO")
    private String prqCntPrvCodigo;
    @Column(name = "PRQ_CODIGO")
    private String prqCodigo;
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
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
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

    public String getPrfempCodigo() {
        return prfempCodigo;
    }

    public void setPrfempCodigo(String prfempCodigo) {
        this.prfempCodigo = prfempCodigo;
    }

    public String getPrfempEmpCodigo() {
        return prfempEmpCodigo;
    }

    public void setPrfempEmpCodigo(String prfempEmpCodigo) {
        this.prfempEmpCodigo = prfempEmpCodigo;
    }

    public String getCrgempEmpCodigo() {
        return crgempEmpCodigo;
    }

    public void setCrgempEmpCodigo(String crgempEmpCodigo) {
        this.crgempEmpCodigo = crgempEmpCodigo;
    }

    public String getCrgempCodigo() {
        return crgempCodigo;
    }

    public void setCrgempCodigo(String crgempCodigo) {
        this.crgempCodigo = crgempCodigo;
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

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
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
        return "ec.mil.he1.pom_01_domain.EmpleadosRoles[ empleadosRolesPK=" + empleadosRolesPK + " ]";
    }
    
}
