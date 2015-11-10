/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "UNIDADES")
@NamedQueries({
    @NamedQuery(name = "Unidades.findAll", query = "SELECT u FROM Unidades u")})
public class Unidades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ABO_D")
    private String aboD;
    @Column(name = "GRI_RH")
    private String griRh;
    @Column(name = "VOLUMEN_ACTUAL")
    private BigInteger volumenActual;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "OBSERVACION")
    private String observacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidades", fetch = FetchType.LAZY)
    private List<Fraccionamientos> fraccionamientosList;
    @JoinColumns({
        @JoinColumn(name = "DNC_DNN_NUMERO", referencedColumnName = "DNN_NUMERO"),
        @JoinColumn(name = "DNC_NUMERO_DONACION", referencedColumnName = "NUMERO_DONACION")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Donaciones donaciones;

    public Unidades() {
    }

    public Unidades(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAboD() {
        return aboD;
    }

    public void setAboD(String aboD) {
        this.aboD = aboD;
    }

    public String getGriRh() {
        return griRh;
    }

    public void setGriRh(String griRh) {
        this.griRh = griRh;
    }

    public BigInteger getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(BigInteger volumenActual) {
        this.volumenActual = volumenActual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public List<Fraccionamientos> getFraccionamientosList() {
        return fraccionamientosList;
    }

    public void setFraccionamientosList(List<Fraccionamientos> fraccionamientosList) {
        this.fraccionamientosList = fraccionamientosList;
    }

    public Donaciones getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Donaciones donaciones) {
        this.donaciones = donaciones;
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
        if (!(object instanceof Unidades)) {
            return false;
        }
        Unidades other = (Unidades) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Unidades[ numero=" + numero + " ]";
    }
    
}
