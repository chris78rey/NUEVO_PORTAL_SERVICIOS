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
@Table(name = "LIQUIDACIONES")
@NamedQueries({
    @NamedQuery(name = "Liquidaciones.findAll", query = "SELECT l FROM Liquidaciones l")})
public class Liquidaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "EMPROL_EMP_CODIGO")
    private String emprolEmpCodigo;
    @Column(name = "EMPROL_CODIGO")
    private Integer emprolCodigo;
    @Column(name = "PRMESP_PRMROL_CODIGO")
    private String prmespPrmrolCodigo;
    @Column(name = "PRMESP_PRMROL_EMP_CODIGO")
    private String prmespPrmrolEmpCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FECHA_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public Liquidaciones() {
    }

    public Liquidaciones(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEmprolEmpCodigo() {
        return emprolEmpCodigo;
    }

    public void setEmprolEmpCodigo(String emprolEmpCodigo) {
        this.emprolEmpCodigo = emprolEmpCodigo;
    }

    public Integer getEmprolCodigo() {
        return emprolCodigo;
    }

    public void setEmprolCodigo(Integer emprolCodigo) {
        this.emprolCodigo = emprolCodigo;
    }

    public String getPrmespPrmrolCodigo() {
        return prmespPrmrolCodigo;
    }

    public void setPrmespPrmrolCodigo(String prmespPrmrolCodigo) {
        this.prmespPrmrolCodigo = prmespPrmrolCodigo;
    }

    public String getPrmespPrmrolEmpCodigo() {
        return prmespPrmrolEmpCodigo;
    }

    public void setPrmespPrmrolEmpCodigo(String prmespPrmrolEmpCodigo) {
        this.prmespPrmrolEmpCodigo = prmespPrmrolEmpCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
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
        if (!(object instanceof Liquidaciones)) {
            return false;
        }
        Liquidaciones other = (Liquidaciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Liquidaciones[ numero=" + numero + " ]";
    }
    
}
