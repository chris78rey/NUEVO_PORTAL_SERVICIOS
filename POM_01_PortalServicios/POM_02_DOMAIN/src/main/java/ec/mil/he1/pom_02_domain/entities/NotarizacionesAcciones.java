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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "NOTARIZACIONES_ACCIONES")
@NamedQueries({
    @NamedQuery(name = "NotarizacionesAcciones.findAll", query = "SELECT n FROM NotarizacionesAcciones n")})
public class NotarizacionesAcciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "ACCION_DESDE")
    private BigInteger accionDesde;
    @Column(name = "ACCION_HASTA")
    private BigInteger accionHasta;
    @Column(name = "ULTIMA_ACCION_OTORGADA")
    private BigInteger ultimaAccionOtorgada;
    @OneToMany(mappedBy = "notarizacionesAcciones", fetch = FetchType.LAZY)
    private List<TitulosAcciones> titulosAccionesList;

    public NotarizacionesAcciones() {
    }

    public NotarizacionesAcciones(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public BigInteger getAccionDesde() {
        return accionDesde;
    }

    public void setAccionDesde(BigInteger accionDesde) {
        this.accionDesde = accionDesde;
    }

    public BigInteger getAccionHasta() {
        return accionHasta;
    }

    public void setAccionHasta(BigInteger accionHasta) {
        this.accionHasta = accionHasta;
    }

    public BigInteger getUltimaAccionOtorgada() {
        return ultimaAccionOtorgada;
    }

    public void setUltimaAccionOtorgada(BigInteger ultimaAccionOtorgada) {
        this.ultimaAccionOtorgada = ultimaAccionOtorgada;
    }

    public List<TitulosAcciones> getTitulosAccionesList() {
        return titulosAccionesList;
    }

    public void setTitulosAccionesList(List<TitulosAcciones> titulosAccionesList) {
        this.titulosAccionesList = titulosAccionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotarizacionesAcciones)) {
            return false;
        }
        NotarizacionesAcciones other = (NotarizacionesAcciones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.NotarizacionesAcciones[ codigo=" + codigo + " ]";
    }
    
}
