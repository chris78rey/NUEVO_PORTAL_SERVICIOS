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
@Table(name = "BENEFICIARIOS")
@NamedQueries({
    @NamedQuery(name = "Beneficiarios.findAll", query = "SELECT b FROM Beneficiarios b")})
public class Beneficiarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BeneficiariosPK beneficiariosPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "INICIO_SEGURO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicioSeguro;
    @Column(name = "SEGURO")
    private Character seguro;
    @Column(name = "FECHA_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "FIN_SEGURO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finSeguro;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTO")
    private BigDecimal monto;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "MONTO_VERIFICADO")
    private Character montoVerificado;
    @Column(name = "MONTO_BENEFICIO")
    private BigDecimal montoBeneficio;
    @Column(name = "MOTIVO_ANULACION")
    private String motivoAnulacion;

    public Beneficiarios() {
    }

    public Beneficiarios(BeneficiariosPK beneficiariosPK) {
        this.beneficiariosPK = beneficiariosPK;
    }

    public Beneficiarios(int ascNumero, int pcnNumeroHc) {
        this.beneficiariosPK = new BeneficiariosPK(ascNumero, pcnNumeroHc);
    }

    public BeneficiariosPK getBeneficiariosPK() {
        return beneficiariosPK;
    }

    public void setBeneficiariosPK(BeneficiariosPK beneficiariosPK) {
        this.beneficiariosPK = beneficiariosPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getInicioSeguro() {
        return inicioSeguro;
    }

    public void setInicioSeguro(Date inicioSeguro) {
        this.inicioSeguro = inicioSeguro;
    }

    public Character getSeguro() {
        return seguro;
    }

    public void setSeguro(Character seguro) {
        this.seguro = seguro;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Date getFinSeguro() {
        return finSeguro;
    }

    public void setFinSeguro(Date finSeguro) {
        this.finSeguro = finSeguro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Character getMontoVerificado() {
        return montoVerificado;
    }

    public void setMontoVerificado(Character montoVerificado) {
        this.montoVerificado = montoVerificado;
    }

    public BigDecimal getMontoBeneficio() {
        return montoBeneficio;
    }

    public void setMontoBeneficio(BigDecimal montoBeneficio) {
        this.montoBeneficio = montoBeneficio;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (beneficiariosPK != null ? beneficiariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiarios)) {
            return false;
        }
        Beneficiarios other = (Beneficiarios) object;
        if ((this.beneficiariosPK == null && other.beneficiariosPK != null) || (this.beneficiariosPK != null && !this.beneficiariosPK.equals(other.beneficiariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Beneficiarios[ beneficiariosPK=" + beneficiariosPK + " ]";
    }
    
}
