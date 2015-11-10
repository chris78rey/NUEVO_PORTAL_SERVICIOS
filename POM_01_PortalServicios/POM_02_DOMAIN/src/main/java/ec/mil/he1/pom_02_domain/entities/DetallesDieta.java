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
@Table(name = "DETALLES_DIETA")
@NamedQueries({
    @NamedQuery(name = "DetallesDieta.findAll", query = "SELECT d FROM DetallesDieta d")})
public class DetallesDieta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDietaPK detallesDietaPK;
    @Column(name = "TIPO_DIETA")
    private String tipoDieta;
    @Column(name = "HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    @Column(name = "CAMA")
    private String cama;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "NUMERO")
    private Integer numero;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PDDDTA_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PedidosDeDieta pedidosDeDieta;

    public DetallesDieta() {
    }

    public DetallesDieta(DetallesDietaPK detallesDietaPK) {
        this.detallesDietaPK = detallesDietaPK;
    }

    public DetallesDieta(int pcnNumeroHc, int pdddtaNumero) {
        this.detallesDietaPK = new DetallesDietaPK(pcnNumeroHc, pdddtaNumero);
    }

    public DetallesDietaPK getDetallesDietaPK() {
        return detallesDietaPK;
    }

    public void setDetallesDietaPK(DetallesDietaPK detallesDietaPK) {
        this.detallesDietaPK = detallesDietaPK;
    }

    public String getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public PedidosDeDieta getPedidosDeDieta() {
        return pedidosDeDieta;
    }

    public void setPedidosDeDieta(PedidosDeDieta pedidosDeDieta) {
        this.pedidosDeDieta = pedidosDeDieta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDietaPK != null ? detallesDietaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDieta)) {
            return false;
        }
        DetallesDieta other = (DetallesDieta) object;
        if ((this.detallesDietaPK == null && other.detallesDietaPK != null) || (this.detallesDietaPK != null && !this.detallesDietaPK.equals(other.detallesDietaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesDieta[ detallesDietaPK=" + detallesDietaPK + " ]";
    }
    
}
