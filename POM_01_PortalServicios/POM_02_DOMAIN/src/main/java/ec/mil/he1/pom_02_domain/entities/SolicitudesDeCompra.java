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
@Table(name = "SOLICITUDES_DE_COMPRA")
@NamedQueries({
    @NamedQuery(name = "SolicitudesDeCompra.findAll", query = "SELECT s FROM SolicitudesDeCompra s")})
public class SolicitudesDeCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "DESTINO")
    private String destino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudesDeCompra", fetch = FetchType.LAZY)
    private List<DetallesDeSolicitud> detallesDeSolicitudList;
    @OneToMany(mappedBy = "solicitudesDeCompra", fetch = FetchType.LAZY)
    private List<OrdenCotizaciones> ordenCotizacionesList;
    @OneToMany(mappedBy = "solicitudesDeCompra1", fetch = FetchType.LAZY)
    private List<OrdenCotizaciones> ordenCotizacionesList1;
    @OneToMany(mappedBy = "solicitudesDeCompra", fetch = FetchType.LAZY)
    private List<OrdenesDeCompra> ordenesDeCompraList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public SolicitudesDeCompra() {
    }

    public SolicitudesDeCompra(Integer codigo) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<DetallesDeSolicitud> getDetallesDeSolicitudList() {
        return detallesDeSolicitudList;
    }

    public void setDetallesDeSolicitudList(List<DetallesDeSolicitud> detallesDeSolicitudList) {
        this.detallesDeSolicitudList = detallesDeSolicitudList;
    }

    public List<OrdenCotizaciones> getOrdenCotizacionesList() {
        return ordenCotizacionesList;
    }

    public void setOrdenCotizacionesList(List<OrdenCotizaciones> ordenCotizacionesList) {
        this.ordenCotizacionesList = ordenCotizacionesList;
    }

    public List<OrdenCotizaciones> getOrdenCotizacionesList1() {
        return ordenCotizacionesList1;
    }

    public void setOrdenCotizacionesList1(List<OrdenCotizaciones> ordenCotizacionesList1) {
        this.ordenCotizacionesList1 = ordenCotizacionesList1;
    }

    public List<OrdenesDeCompra> getOrdenesDeCompraList() {
        return ordenesDeCompraList;
    }

    public void setOrdenesDeCompraList(List<OrdenesDeCompra> ordenesDeCompraList) {
        this.ordenesDeCompraList = ordenesDeCompraList;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
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
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudesDeCompra)) {
            return false;
        }
        SolicitudesDeCompra other = (SolicitudesDeCompra) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SolicitudesDeCompra[ codigo=" + codigo + " ]";
    }
    
}
