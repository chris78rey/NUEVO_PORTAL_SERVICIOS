/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "DESCUENTOS_AGRUPADOS")
@NamedQueries({
    @NamedQuery(name = "DescuentosAgrupados.findAll", query = "SELECT d FROM DescuentosAgrupados d")})
public class DescuentosAgrupados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumn(name = "EGRCJAMDC_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private EgresosCajaMedica egresosCajaMedica;
    @OneToMany(mappedBy = "descuentosAgrupados", fetch = FetchType.LAZY)
    private List<MovimientosDeCuenta> movimientosDeCuentaList;

    public DescuentosAgrupados() {
    }

    public DescuentosAgrupados(Integer numero) {
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public EgresosCajaMedica getEgresosCajaMedica() {
        return egresosCajaMedica;
    }

    public void setEgresosCajaMedica(EgresosCajaMedica egresosCajaMedica) {
        this.egresosCajaMedica = egresosCajaMedica;
    }

    public List<MovimientosDeCuenta> getMovimientosDeCuentaList() {
        return movimientosDeCuentaList;
    }

    public void setMovimientosDeCuentaList(List<MovimientosDeCuenta> movimientosDeCuentaList) {
        this.movimientosDeCuentaList = movimientosDeCuentaList;
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
        if (!(object instanceof DescuentosAgrupados)) {
            return false;
        }
        DescuentosAgrupados other = (DescuentosAgrupados) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DescuentosAgrupados[ numero=" + numero + " ]";
    }
    
}
