/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "JUSTIFICACION_HEMODERIVADOS")
@NamedQueries({
    @NamedQuery(name = "JustificacionHemoderivados.findAll", query = "SELECT j FROM JustificacionHemoderivados j")})
public class JustificacionHemoderivados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "JSTHMD_ID")
    private Long jsthmdId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
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
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "SOLICITADO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "CREADO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumn(name = "SLCTRN_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private SolicitudesTransfusiones solicitudesTransfusiones;

    public JustificacionHemoderivados() {
    }

    public JustificacionHemoderivados(Long jsthmdId) {
        this.jsthmdId = jsthmdId;
    }

    public Long getJsthmdId() {
        return jsthmdId;
    }

    public void setJsthmdId(Long jsthmdId) {
        this.jsthmdId = jsthmdId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    public SolicitudesTransfusiones getSolicitudesTransfusiones() {
        return solicitudesTransfusiones;
    }

    public void setSolicitudesTransfusiones(SolicitudesTransfusiones solicitudesTransfusiones) {
        this.solicitudesTransfusiones = solicitudesTransfusiones;
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
        return "ec.mil.he1.pom_02_domain.entities.JustificacionHemoderivados[ jsthmdId=" + jsthmdId + " ]";
    }
    
}
