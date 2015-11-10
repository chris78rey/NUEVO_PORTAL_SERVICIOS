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
@Table(name = "ORDENES_DE_COMPRA")
@NamedQueries({
    @NamedQuery(name = "OrdenesDeCompra.findAll", query = "SELECT o FROM OrdenesDeCompra o")})
public class OrdenesDeCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(mappedBy = "ordenesDeCompra", fetch = FetchType.LAZY)
    private List<IngresosDeBotica> ingresosDeBoticaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenesDeCompra", fetch = FetchType.LAZY)
    private List<DetallesDeOrden> detallesDeOrdenList;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRD_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedores proveedores;
    @JoinColumn(name = "SLCCMP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private SolicitudesDeCompra solicitudesDeCompra;
    @OneToMany(mappedBy = "ordenesDeCompra", fetch = FetchType.LAZY)
    private List<IngresosDeBodega> ingresosDeBodegaList;

    public OrdenesDeCompra() {
    }

    public OrdenesDeCompra(Integer numero) {
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

    public List<IngresosDeBotica> getIngresosDeBoticaList() {
        return ingresosDeBoticaList;
    }

    public void setIngresosDeBoticaList(List<IngresosDeBotica> ingresosDeBoticaList) {
        this.ingresosDeBoticaList = ingresosDeBoticaList;
    }

    public List<DetallesDeOrden> getDetallesDeOrdenList() {
        return detallesDeOrdenList;
    }

    public void setDetallesDeOrdenList(List<DetallesDeOrden> detallesDeOrdenList) {
        this.detallesDeOrdenList = detallesDeOrdenList;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public SolicitudesDeCompra getSolicitudesDeCompra() {
        return solicitudesDeCompra;
    }

    public void setSolicitudesDeCompra(SolicitudesDeCompra solicitudesDeCompra) {
        this.solicitudesDeCompra = solicitudesDeCompra;
    }

    public List<IngresosDeBodega> getIngresosDeBodegaList() {
        return ingresosDeBodegaList;
    }

    public void setIngresosDeBodegaList(List<IngresosDeBodega> ingresosDeBodegaList) {
        this.ingresosDeBodegaList = ingresosDeBodegaList;
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
        if (!(object instanceof OrdenesDeCompra)) {
            return false;
        }
        OrdenesDeCompra other = (OrdenesDeCompra) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.OrdenesDeCompra[ numero=" + numero + " ]";
    }
    
}
