/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "JUSTIFICACION_HEMODERIVADOS")
@NamedQueries({
    @NamedQuery(name = "JustificacionHemoderivados.findAll", query = "SELECT j FROM JustificacionHemoderivados j")})
public class JustificacionHemoderivados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "SLCTRN_NUMERO")
    private Integer slctrnNumero;
    @Id
    @Basic(optional = false)
    @Column(name = "JSTHMD_ID")
    private Long jsthmdId;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CREADO_POR")
    private String creadoPor;
    @Column(name = "SOLICITADO_POR")
    private String solicitadoPor;
    @Column(name = "CONDICION")
    private String condicion;
    @Column(name = "PA")
    private String pa;
    @Column(name = "FC")
    private String fc;
    @Column(name = "FR")
    private String fr;
    @Column(name = "TEMPERATURA")
    private String temperatura;
    @Column(name = "HB")
    private String hb;
    @Column(name = "HCTO")
    private String hcto;
    @Column(name = "TP")
    private String tp;
    @Column(name = "TTP")
    private String ttp;
    @Column(name = "INR")
    private String inr;
    @Column(name = "PLAQUETAS")
    private String plaquetas;
    @Column(name = "OTROS")
    private String otros;
    @Column(name = "TIPO_PROCEDIMIENTO")
    private String tipoProcedimiento;
    @Column(name = "DOSIS")
    private String dosis;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public JustificacionHemoderivados() {
    }

    public JustificacionHemoderivados(Long jsthmdId) {
        this.jsthmdId = jsthmdId;
    }

    public Integer getSlctrnNumero() {
        return slctrnNumero;
    }

    public void setSlctrnNumero(Integer slctrnNumero) {
        this.slctrnNumero = slctrnNumero;
    }

    public Long getJsthmdId() {
        return jsthmdId;
    }

    public void setJsthmdId(Long jsthmdId) {
        this.jsthmdId = jsthmdId;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getSolicitadoPor() {
        return solicitadoPor;
    }

    public void setSolicitadoPor(String solicitadoPor) {
        this.solicitadoPor = solicitadoPor;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public String getHcto() {
        return hcto;
    }

    public void setHcto(String hcto) {
        this.hcto = hcto;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getTtp() {
        return ttp;
    }

    public void setTtp(String ttp) {
        this.ttp = ttp;
    }

    public String getInr() {
        return inr;
    }

    public void setInr(String inr) {
        this.inr = inr;
    }

    public String getPlaquetas() {
        return plaquetas;
    }

    public void setPlaquetas(String plaquetas) {
        this.plaquetas = plaquetas;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getTipoProcedimiento() {
        return tipoProcedimiento;
    }

    public void setTipoProcedimiento(String tipoProcedimiento) {
        this.tipoProcedimiento = tipoProcedimiento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jsthmdId != null ? jsthmdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JustificacionHemoderivados)) {
            return false;
        }
        JustificacionHemoderivados other = (JustificacionHemoderivados) object;
        if ((this.jsthmdId == null && other.jsthmdId != null) || (this.jsthmdId != null && !this.jsthmdId.equals(other.jsthmdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.JustificacionHemoderivados[ jsthmdId=" + jsthmdId + " ]";
    }
    
}
