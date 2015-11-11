/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "AUTORIZACIONES_PACIENTES")
@NamedQueries({
    @NamedQuery(name = "AutorizacionesPacientes.findAll", query = "SELECT a FROM AutorizacionesPacientes a")})
public class AutorizacionesPacientes implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "RESPONSABLE")
    private String responsable;
    @Column(name = "RESPONSABLE_ID")
    private String responsableId;
    @Column(name = "PRMATN_NUMERO")
    private Integer prmatnNumero;
    @Column(name = "TESTIGO1")
    private String testigo1;
    @Column(name = "TESTIGO1_ID")
    private String testigo1Id;
    @Column(name = "TESTIGO2")
    private String testigo2;
    @Column(name = "TESTIGO2_ID")
    private String testigo2Id;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "TRATAMIENTO")
    private String tratamiento;
    @Column(name = "RELACION_RESPONSABLE")
    private String relacionResponsable;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "AUTORIZACION_MEDICA")
    private Character autorizacionMedica;
    @Column(name = "EXTRACCION_VIDA")
    private Character extraccionVida;
    @Column(name = "NOMBRES_RECEPTORES")
    private String nombresReceptores;
    @Column(name = "ORGANOS_DONADOS")
    private String organosDonados;
    @Column(name = "PRMATN_PCN_NUMERO_HC")
    private Integer prmatnPcnNumeroHc;
    @Column(name = "RELACION_TESTIGO1")
    private String relacionTestigo1;
    @Column(name = "TELEFONO_RESPONSABLE")
    private String telefonoResponsable;
    @Column(name = "TELEFONO_TESTIGO1")
    private String telefonoTestigo1;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Column(name = "PRS_MEDICO")
    private String prsMedico;

    public AutorizacionesPacientes() {
    }

    public AutorizacionesPacientes(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getResponsableId() {
        return responsableId;
    }

    public void setResponsableId(String responsableId) {
        this.responsableId = responsableId;
    }

    public Integer getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Integer prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public String getTestigo1() {
        return testigo1;
    }

    public void setTestigo1(String testigo1) {
        this.testigo1 = testigo1;
    }

    public String getTestigo1Id() {
        return testigo1Id;
    }

    public void setTestigo1Id(String testigo1Id) {
        this.testigo1Id = testigo1Id;
    }

    public String getTestigo2() {
        return testigo2;
    }

    public void setTestigo2(String testigo2) {
        this.testigo2 = testigo2;
    }

    public String getTestigo2Id() {
        return testigo2Id;
    }

    public void setTestigo2Id(String testigo2Id) {
        this.testigo2Id = testigo2Id;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getRelacionResponsable() {
        return relacionResponsable;
    }

    public void setRelacionResponsable(String relacionResponsable) {
        this.relacionResponsable = relacionResponsable;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getAutorizacionMedica() {
        return autorizacionMedica;
    }

    public void setAutorizacionMedica(Character autorizacionMedica) {
        this.autorizacionMedica = autorizacionMedica;
    }

    public Character getExtraccionVida() {
        return extraccionVida;
    }

    public void setExtraccionVida(Character extraccionVida) {
        this.extraccionVida = extraccionVida;
    }

    public String getNombresReceptores() {
        return nombresReceptores;
    }

    public void setNombresReceptores(String nombresReceptores) {
        this.nombresReceptores = nombresReceptores;
    }

    public String getOrganosDonados() {
        return organosDonados;
    }

    public void setOrganosDonados(String organosDonados) {
        this.organosDonados = organosDonados;
    }

    public Integer getPrmatnPcnNumeroHc() {
        return prmatnPcnNumeroHc;
    }

    public void setPrmatnPcnNumeroHc(Integer prmatnPcnNumeroHc) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
    }

    public String getRelacionTestigo1() {
        return relacionTestigo1;
    }

    public void setRelacionTestigo1(String relacionTestigo1) {
        this.relacionTestigo1 = relacionTestigo1;
    }

    public String getTelefonoResponsable() {
        return telefonoResponsable;
    }

    public void setTelefonoResponsable(String telefonoResponsable) {
        this.telefonoResponsable = telefonoResponsable;
    }

    public String getTelefonoTestigo1() {
        return telefonoTestigo1;
    }

    public void setTelefonoTestigo1(String telefonoTestigo1) {
        this.telefonoTestigo1 = telefonoTestigo1;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    public String getPrsMedico() {
        return prsMedico;
    }

    public void setPrsMedico(String prsMedico) {
        this.prsMedico = prsMedico;
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
        if (!(object instanceof AutorizacionesPacientes)) {
            return false;
        }
        AutorizacionesPacientes other = (AutorizacionesPacientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AutorizacionesPacientes[ id=" + id + " ]";
    }
    
}
