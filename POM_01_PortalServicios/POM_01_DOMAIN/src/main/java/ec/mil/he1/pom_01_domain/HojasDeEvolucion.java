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
@Table(name = "HOJAS_DE_EVOLUCION")
@NamedQueries({
    @NamedQuery(name = "HojasDeEvolucion.findAll", query = "SELECT h FROM HojasDeEvolucion h")})
public class HojasDeEvolucion implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private BigDecimal numero;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "SERVICIO_CEX")
    private String servicioCex;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "RESULTADO_EXAMEN_FISICO")
    private String resultadoExamenFisico;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "TIPO_EVOLUCION")
    private String tipoEvolucion;
    @Column(name = "INTCNS_NUMERO")
    private Integer intcnsNumero;
    @Column(name = "POOL")
    private Integer pool;
    @Column(name = "DGNPCN_ID")
    private Long dgnpcnId;
    @Column(name = "MINUTOS")
    private Short minutos;
    @Column(name = "COMPLEJIDAD")
    private String complejidad;
    @Column(name = "PRMATN_NUMERO")
    private Long prmatnNumero;
    @Column(name = "REVISADO")
    private Character revisado;
    @Column(name = "PRS_CODIGO_REVISADO")
    private String prsCodigoRevisado;

    public HojasDeEvolucion() {
    }

    public HojasDeEvolucion(BigDecimal numero) {
        this.numero = numero;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public void setNumero(BigDecimal numero) {
        this.numero = numero;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getServicioCex() {
        return servicioCex;
    }

    public void setServicioCex(String servicioCex) {
        this.servicioCex = servicioCex;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResultadoExamenFisico() {
        return resultadoExamenFisico;
    }

    public void setResultadoExamenFisico(String resultadoExamenFisico) {
        this.resultadoExamenFisico = resultadoExamenFisico;
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

    public String getTipoEvolucion() {
        return tipoEvolucion;
    }

    public void setTipoEvolucion(String tipoEvolucion) {
        this.tipoEvolucion = tipoEvolucion;
    }

    public Integer getIntcnsNumero() {
        return intcnsNumero;
    }

    public void setIntcnsNumero(Integer intcnsNumero) {
        this.intcnsNumero = intcnsNumero;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Long getDgnpcnId() {
        return dgnpcnId;
    }

    public void setDgnpcnId(Long dgnpcnId) {
        this.dgnpcnId = dgnpcnId;
    }

    public Short getMinutos() {
        return minutos;
    }

    public void setMinutos(Short minutos) {
        this.minutos = minutos;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    public Long getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Long prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public Character getRevisado() {
        return revisado;
    }

    public void setRevisado(Character revisado) {
        this.revisado = revisado;
    }

    public String getPrsCodigoRevisado() {
        return prsCodigoRevisado;
    }

    public void setPrsCodigoRevisado(String prsCodigoRevisado) {
        this.prsCodigoRevisado = prsCodigoRevisado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HojasDeEvolucion)) {
            return false;
        }
        HojasDeEvolucion other = (HojasDeEvolucion) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.HojasDeEvolucion[ numero=" + numero + " ]";
    }
    
}
