/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "COPAGOS_PACIENTES")
@NamedQueries({
    @NamedQuery(name = "CopagosPacientes.findAll", query = "SELECT c FROM CopagosPacientes c")})
public class CopagosPacientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CPGPCN_ID")
    private Long cpgpcnId;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "CPG_CODIGO")
    private String cpgCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "OBSERVACION")
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTO_MAXIMO_APLICADO")
    private BigDecimal montoMaximoAplicado;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "PLANO_ID")
    private String planoId;
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;

    public CopagosPacientes() {
    }

    public CopagosPacientes(Long cpgpcnId) {
        this.cpgpcnId = cpgpcnId;
    }

    public Long getCpgpcnId() {
        return cpgpcnId;
    }

    public void setCpgpcnId(Long cpgpcnId) {
        this.cpgpcnId = cpgpcnId;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getCpgCodigo() {
        return cpgCodigo;
    }

    public void setCpgCodigo(String cpgCodigo) {
        this.cpgCodigo = cpgCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getMontoMaximoAplicado() {
        return montoMaximoAplicado;
    }

    public void setMontoMaximoAplicado(BigDecimal montoMaximoAplicado) {
        this.montoMaximoAplicado = montoMaximoAplicado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getPlanoId() {
        return planoId;
    }

    public void setPlanoId(String planoId) {
        this.planoId = planoId;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpgpcnId != null ? cpgpcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CopagosPacientes)) {
            return false;
        }
        CopagosPacientes other = (CopagosPacientes) object;
        if ((this.cpgpcnId == null && other.cpgpcnId != null) || (this.cpgpcnId != null && !this.cpgpcnId.equals(other.cpgpcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CopagosPacientes[ cpgpcnId=" + cpgpcnId + " ]";
    }
    
}
