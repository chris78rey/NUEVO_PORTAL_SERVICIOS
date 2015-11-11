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
@Table(name = "SOLICITUDES_DE_INTERNACION")
@NamedQueries({
    @NamedQuery(name = "SolicitudesDeInternacion.findAll", query = "SELECT s FROM SolicitudesDeInternacion s")})
public class SolicitudesDeInternacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FECHA_PROBABLE_INTERNACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProbableInternacion;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "ESTADO_ANULACION")
    private Character estadoAnulacion;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "URGENTE")
    private Character urgente;
    @Column(name = "TPOPRM_CODIGO")
    private Short tpoprmCodigo;
    @Column(name = "NOTA_DE_INTERNACION")
    private String notaDeInternacion;
    @Column(name = "PENSIONADO")
    private Character pensionado;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;

    public SolicitudesDeInternacion() {
    }

    public SolicitudesDeInternacion(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaProbableInternacion() {
        return fechaProbableInternacion;
    }

    public void setFechaProbableInternacion(Date fechaProbableInternacion) {
        this.fechaProbableInternacion = fechaProbableInternacion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public Character getEstadoAnulacion() {
        return estadoAnulacion;
    }

    public void setEstadoAnulacion(Character estadoAnulacion) {
        this.estadoAnulacion = estadoAnulacion;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
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

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Character getUrgente() {
        return urgente;
    }

    public void setUrgente(Character urgente) {
        this.urgente = urgente;
    }

    public Short getTpoprmCodigo() {
        return tpoprmCodigo;
    }

    public void setTpoprmCodigo(Short tpoprmCodigo) {
        this.tpoprmCodigo = tpoprmCodigo;
    }

    public String getNotaDeInternacion() {
        return notaDeInternacion;
    }

    public void setNotaDeInternacion(String notaDeInternacion) {
        this.notaDeInternacion = notaDeInternacion;
    }

    public Character getPensionado() {
        return pensionado;
    }

    public void setPensionado(Character pensionado) {
        this.pensionado = pensionado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        if (!(object instanceof SolicitudesDeInternacion)) {
            return false;
        }
        SolicitudesDeInternacion other = (SolicitudesDeInternacion) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SolicitudesDeInternacion[ numero=" + numero + " ]";
    }
    
}
