/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "HONORARIOS_MEDICOS")
@NamedQueries({
    @NamedQuery(name = "HonorariosMedicos.findAll", query = "SELECT h FROM HonorariosMedicos h")})
public class HonorariosMedicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HonorariosMedicosPK honorariosMedicosPK;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Column(name = "TIPO_HONORARIO")
    private String tipoHonorario;
    @Column(name = "CRG_TIPO")
    private String crgTipo;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "CANTIDAD")
    private Short cantidad;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PUNTOS")
    private BigDecimal puntos;
    @Column(name = "PUNTOS_AUDITORIA")
    private BigDecimal puntosAuditoria;
    @Column(name = "UVR")
    private BigDecimal uvr;
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "PORCENTAJE_CALCULADO")
    private BigDecimal porcentajeCalculado;
    @Column(name = "PORCENTAJE_AUDITORIA")
    private BigDecimal porcentajeAuditoria;
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "VALOR_AUDITORIA")
    private BigDecimal valorAuditoria;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ESTADO_AUDITORIA")
    private Character estadoAuditoria;
    @Column(name = "PLNHNR_NUMERO")
    private Integer plnhnrNumero;
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;
    @Column(name = "CREADO_POR")
    private String creadoPor;
    @Column(name = "MODIFICADO_POR")
    private String modificadoPor;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "ORDEN")
    private BigInteger orden;
    @JoinColumns({
        @JoinColumn(name = "ENTBNF_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "ENTBNF_MSTBNF_CODIGO", referencedColumnName = "MSTBNF_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private EntidadesBeneficiarias entidadesBeneficiarias;
    @JoinColumns({
        @JoinColumn(name = "ENTBNF_CODIGO_GRUPAL", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "ENTBNF_MSTBNF_GRUPAL", referencedColumnName = "MSTBNF_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private EntidadesBeneficiarias entidadesBeneficiarias1;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRCHSP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProcedimientosHospitalarios procedimientosHospitalarios;

    public HonorariosMedicos() {
    }

    public HonorariosMedicos(HonorariosMedicosPK honorariosMedicosPK) {
        this.honorariosMedicosPK = honorariosMedicosPK;
    }

    public HonorariosMedicos(int numero, String documento, short id) {
        this.honorariosMedicosPK = new HonorariosMedicosPK(numero, documento, id);
    }

    public HonorariosMedicosPK getHonorariosMedicosPK() {
        return honorariosMedicosPK;
    }

    public void setHonorariosMedicosPK(HonorariosMedicosPK honorariosMedicosPK) {
        this.honorariosMedicosPK = honorariosMedicosPK;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    public String getTipoHonorario() {
        return tipoHonorario;
    }

    public void setTipoHonorario(String tipoHonorario) {
        this.tipoHonorario = tipoHonorario;
    }

    public String getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(String crgTipo) {
        this.crgTipo = crgTipo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getPuntos() {
        return puntos;
    }

    public void setPuntos(BigDecimal puntos) {
        this.puntos = puntos;
    }

    public BigDecimal getPuntosAuditoria() {
        return puntosAuditoria;
    }

    public void setPuntosAuditoria(BigDecimal puntosAuditoria) {
        this.puntosAuditoria = puntosAuditoria;
    }

    public BigDecimal getUvr() {
        return uvr;
    }

    public void setUvr(BigDecimal uvr) {
        this.uvr = uvr;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigDecimal getPorcentajeCalculado() {
        return porcentajeCalculado;
    }

    public void setPorcentajeCalculado(BigDecimal porcentajeCalculado) {
        this.porcentajeCalculado = porcentajeCalculado;
    }

    public BigDecimal getPorcentajeAuditoria() {
        return porcentajeAuditoria;
    }

    public void setPorcentajeAuditoria(BigDecimal porcentajeAuditoria) {
        this.porcentajeAuditoria = porcentajeAuditoria;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorAuditoria() {
        return valorAuditoria;
    }

    public void setValorAuditoria(BigDecimal valorAuditoria) {
        this.valorAuditoria = valorAuditoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getEstadoAuditoria() {
        return estadoAuditoria;
    }

    public void setEstadoAuditoria(Character estadoAuditoria) {
        this.estadoAuditoria = estadoAuditoria;
    }

    public Integer getPlnhnrNumero() {
        return plnhnrNumero;
    }

    public void setPlnhnrNumero(Integer plnhnrNumero) {
        this.plnhnrNumero = plnhnrNumero;
    }

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigInteger getOrden() {
        return orden;
    }

    public void setOrden(BigInteger orden) {
        this.orden = orden;
    }

    public EntidadesBeneficiarias getEntidadesBeneficiarias() {
        return entidadesBeneficiarias;
    }

    public void setEntidadesBeneficiarias(EntidadesBeneficiarias entidadesBeneficiarias) {
        this.entidadesBeneficiarias = entidadesBeneficiarias;
    }

    public EntidadesBeneficiarias getEntidadesBeneficiarias1() {
        return entidadesBeneficiarias1;
    }

    public void setEntidadesBeneficiarias1(EntidadesBeneficiarias entidadesBeneficiarias1) {
        this.entidadesBeneficiarias1 = entidadesBeneficiarias1;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public ProcedimientosHospitalarios getProcedimientosHospitalarios() {
        return procedimientosHospitalarios;
    }

    public void setProcedimientosHospitalarios(ProcedimientosHospitalarios procedimientosHospitalarios) {
        this.procedimientosHospitalarios = procedimientosHospitalarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (honorariosMedicosPK != null ? honorariosMedicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HonorariosMedicos)) {
            return false;
        }
        HonorariosMedicos other = (HonorariosMedicos) object;
        if ((this.honorariosMedicosPK == null && other.honorariosMedicosPK != null) || (this.honorariosMedicosPK != null && !this.honorariosMedicosPK.equals(other.honorariosMedicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.HonorariosMedicos[ honorariosMedicosPK=" + honorariosMedicosPK + " ]";
    }
    
}
