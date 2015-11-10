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
@Table(name = "TRASLADOS_ADMINISTRATIVOS")
@NamedQueries({
    @NamedQuery(name = "TrasladosAdministrativos.findAll", query = "SELECT t FROM TrasladosAdministrativos t")})
public class TrasladosAdministrativos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRD_IDTRASLADOS")
    private Long trdIdtraslados;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "TRD_FECHADESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trdFechadesde;
    @Column(name = "TRD_FECHAHASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trdFechahasta;
    @Column(name = "TRD_DESCRIPCION")
    private String trdDescripcion;
    @Column(name = "TRD_ESTADO")
    private Character trdEstado;
    @Column(name = "TRD_USER")
    private String trdUser;
    @Column(name = "TRD_TIPOTRASLADO")
    private Character trdTipotraslado;
    @Column(name = "TRD_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trdFechacreacion;
    @JoinColumn(name = "CCT_IDCENTROCOSTO", referencedColumnName = "CCT_IDCENTROCOSTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CentroCostos centroCostos;

    public TrasladosAdministrativos() {
    }

    public TrasladosAdministrativos(Long trdIdtraslados) {
        this.trdIdtraslados = trdIdtraslados;
    }

    public Long getTrdIdtraslados() {
        return trdIdtraslados;
    }

    public void setTrdIdtraslados(Long trdIdtraslados) {
        this.trdIdtraslados = trdIdtraslados;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Date getTrdFechadesde() {
        return trdFechadesde;
    }

    public void setTrdFechadesde(Date trdFechadesde) {
        this.trdFechadesde = trdFechadesde;
    }

    public Date getTrdFechahasta() {
        return trdFechahasta;
    }

    public void setTrdFechahasta(Date trdFechahasta) {
        this.trdFechahasta = trdFechahasta;
    }

    public String getTrdDescripcion() {
        return trdDescripcion;
    }

    public void setTrdDescripcion(String trdDescripcion) {
        this.trdDescripcion = trdDescripcion;
    }

    public Character getTrdEstado() {
        return trdEstado;
    }

    public void setTrdEstado(Character trdEstado) {
        this.trdEstado = trdEstado;
    }

    public String getTrdUser() {
        return trdUser;
    }

    public void setTrdUser(String trdUser) {
        this.trdUser = trdUser;
    }

    public Character getTrdTipotraslado() {
        return trdTipotraslado;
    }

    public void setTrdTipotraslado(Character trdTipotraslado) {
        this.trdTipotraslado = trdTipotraslado;
    }

    public Date getTrdFechacreacion() {
        return trdFechacreacion;
    }

    public void setTrdFechacreacion(Date trdFechacreacion) {
        this.trdFechacreacion = trdFechacreacion;
    }

    public CentroCostos getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(CentroCostos centroCostos) {
        this.centroCostos = centroCostos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trdIdtraslados != null ? trdIdtraslados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrasladosAdministrativos)) {
            return false;
        }
        TrasladosAdministrativos other = (TrasladosAdministrativos) object;
        if ((this.trdIdtraslados == null && other.trdIdtraslados != null) || (this.trdIdtraslados != null && !this.trdIdtraslados.equals(other.trdIdtraslados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TrasladosAdministrativos[ trdIdtraslados=" + trdIdtraslados + " ]";
    }
    
}
