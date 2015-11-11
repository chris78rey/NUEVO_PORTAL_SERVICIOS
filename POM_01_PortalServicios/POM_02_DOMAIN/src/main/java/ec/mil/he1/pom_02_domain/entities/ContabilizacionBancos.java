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
@Table(name = "CONTABILIZACION_BANCOS")
@NamedQueries({
    @NamedQuery(name = "ContabilizacionBancos.findAll", query = "SELECT c FROM ContabilizacionBancos c")})
public class ContabilizacionBancos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTMVMBNC_ID")
    private Integer cntmvmbncId;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ESTADO")
    private Character estado;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @OneToMany(mappedBy = "contabilizacionBancos", fetch = FetchType.LAZY)
    private List<Libros> librosList;
//    @JoinColumns({
//        @JoinColumn(name = "CNTBNC_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
//        @JoinColumn(name = "CNTBNC_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "CNTBNC_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private CuentasBancarias cuentasBancarias;
//    @JoinColumns({
//        @JoinColumn(name = "CNTBNC_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
//        @JoinColumn(name = "TPOCMP_CODIGO", referencedColumnName = "TPOCMP_CODIGO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private TiposComprobantesEmpresas tiposComprobantesEmpresas;

    public ContabilizacionBancos() {
    }

    public ContabilizacionBancos(Integer cntmvmbncId) {
        this.cntmvmbncId = cntmvmbncId;
    }

    public Integer getCntmvmbncId() {
        return cntmvmbncId;
    }

    public void setCntmvmbncId(Integer cntmvmbncId) {
        this.cntmvmbncId = cntmvmbncId;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public List<Libros> getLibrosList() {
        return librosList;
    }

    public void setLibrosList(List<Libros> librosList) {
        this.librosList = librosList;
    }

//    public CuentasBancarias getCuentasBancarias() {
//        return cuentasBancarias;
//    }
//
//    public void setCuentasBancarias(CuentasBancarias cuentasBancarias) {
//        this.cuentasBancarias = cuentasBancarias;
//    }

//    public TiposComprobantesEmpresas getTiposComprobantesEmpresas() {
//        return tiposComprobantesEmpresas;
//    }
//
//    public void setTiposComprobantesEmpresas(TiposComprobantesEmpresas tiposComprobantesEmpresas) {
//        this.tiposComprobantesEmpresas = tiposComprobantesEmpresas;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntmvmbncId != null ? cntmvmbncId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContabilizacionBancos)) {
            return false;
        }
        ContabilizacionBancos other = (ContabilizacionBancos) object;
        if ((this.cntmvmbncId == null && other.cntmvmbncId != null) || (this.cntmvmbncId != null && !this.cntmvmbncId.equals(other.cntmvmbncId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ContabilizacionBancos[ cntmvmbncId=" + cntmvmbncId + " ]";
    }
    
}
