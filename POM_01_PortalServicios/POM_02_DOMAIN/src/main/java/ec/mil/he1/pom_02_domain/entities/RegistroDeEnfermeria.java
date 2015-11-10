/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "REGISTRO_DE_ENFERMERIA")
@NamedQueries({
    @NamedQuery(name = "RegistroDeEnfermeria.findAll", query = "SELECT r FROM RegistroDeEnfermeria r")})
public class RegistroDeEnfermeria implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegistroDeEnfermeriaPK registroDeEnfermeriaPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DMN_NUMERO_REGISTROS")
    private Short dmnNumeroRegistros;
    @Column(name = "DMN_TIPO")
    private String dmnTipo;
    @Column(name = "DMN_VALOR")
    private String dmnValor;
    @Column(name = "ORDEN")
    private Short orden;
    @Column(name = "VALOR")
    private String valor;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumns({
        @JoinColumn(name = "PRMATN_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public RegistroDeEnfermeria() {
    }

    public RegistroDeEnfermeria(RegistroDeEnfermeriaPK registroDeEnfermeriaPK) {
        this.registroDeEnfermeriaPK = registroDeEnfermeriaPK;
    }

    public RegistroDeEnfermeria(int prmatnNumero, int prmatnPcnNumeroHc, short numero) {
        this.registroDeEnfermeriaPK = new RegistroDeEnfermeriaPK(prmatnNumero, prmatnPcnNumeroHc, numero);
    }

    public RegistroDeEnfermeriaPK getRegistroDeEnfermeriaPK() {
        return registroDeEnfermeriaPK;
    }

    public void setRegistroDeEnfermeriaPK(RegistroDeEnfermeriaPK registroDeEnfermeriaPK) {
        this.registroDeEnfermeriaPK = registroDeEnfermeriaPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getDmnNumeroRegistros() {
        return dmnNumeroRegistros;
    }

    public void setDmnNumeroRegistros(Short dmnNumeroRegistros) {
        this.dmnNumeroRegistros = dmnNumeroRegistros;
    }

    public String getDmnTipo() {
        return dmnTipo;
    }

    public void setDmnTipo(String dmnTipo) {
        this.dmnTipo = dmnTipo;
    }

    public String getDmnValor() {
        return dmnValor;
    }

    public void setDmnValor(String dmnValor) {
        this.dmnValor = dmnValor;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public PermanenciasYAtenciones getPermanenciasYAtenciones() {
        return permanenciasYAtenciones;
    }

    public void setPermanenciasYAtenciones(PermanenciasYAtenciones permanenciasYAtenciones) {
        this.permanenciasYAtenciones = permanenciasYAtenciones;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registroDeEnfermeriaPK != null ? registroDeEnfermeriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroDeEnfermeria)) {
            return false;
        }
        RegistroDeEnfermeria other = (RegistroDeEnfermeria) object;
        if ((this.registroDeEnfermeriaPK == null && other.registroDeEnfermeriaPK != null) || (this.registroDeEnfermeriaPK != null && !this.registroDeEnfermeriaPK.equals(other.registroDeEnfermeriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RegistroDeEnfermeria[ registroDeEnfermeriaPK=" + registroDeEnfermeriaPK + " ]";
    }
    
}
