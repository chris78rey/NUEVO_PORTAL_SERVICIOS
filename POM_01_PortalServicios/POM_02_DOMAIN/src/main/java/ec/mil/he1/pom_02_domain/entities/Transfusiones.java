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
@Table(name = "TRANSFUSIONES")
@NamedQueries({
    @NamedQuery(name = "Transfusiones.findAll", query = "SELECT t FROM Transfusiones t")})
public class Transfusiones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DX_OBSERVACIONES")
    private String dxObservaciones;
    @Column(name = "PRUEBA_CRUZADA")
    private String pruebaCruzada;
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "SLCTRN_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private SolicitudesTransfusiones solicitudesTransfusiones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transfusiones", fetch = FetchType.LAZY)
    private List<DetallesTransfusionFinales> detallesTransfusionFinalesList;

    public Transfusiones() {
    }

    public Transfusiones(Integer numero) {
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

    public String getDxObservaciones() {
        return dxObservaciones;
    }

    public void setDxObservaciones(String dxObservaciones) {
        this.dxObservaciones = dxObservaciones;
    }

    public String getPruebaCruzada() {
        return pruebaCruzada;
    }

    public void setPruebaCruzada(String pruebaCruzada) {
        this.pruebaCruzada = pruebaCruzada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public SolicitudesTransfusiones getSolicitudesTransfusiones() {
        return solicitudesTransfusiones;
    }

    public void setSolicitudesTransfusiones(SolicitudesTransfusiones solicitudesTransfusiones) {
        this.solicitudesTransfusiones = solicitudesTransfusiones;
    }

    public List<DetallesTransfusionFinales> getDetallesTransfusionFinalesList() {
        return detallesTransfusionFinalesList;
    }

    public void setDetallesTransfusionFinalesList(List<DetallesTransfusionFinales> detallesTransfusionFinalesList) {
        this.detallesTransfusionFinalesList = detallesTransfusionFinalesList;
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
        if (!(object instanceof Transfusiones)) {
            return false;
        }
        Transfusiones other = (Transfusiones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Transfusiones[ numero=" + numero + " ]";
    }
    
}
