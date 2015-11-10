/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TIPOS_COMPROBANTES_EMPRESAS")
@NamedQueries({
    @NamedQuery(name = "TiposComprobantesEmpresas.findAll", query = "SELECT t FROM TiposComprobantesEmpresas t")})
public class TiposComprobantesEmpresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TiposComprobantesEmpresasPK tiposComprobantesEmpresasPK;
    @Column(name = "NOMBRE_SECUENCIA")
    private String nombreSecuencia;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "NOMBRE_REPORTE")
    private String nombreReporte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposComprobantesEmpresas", fetch = FetchType.LAZY)
    private List<Libros> librosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposComprobantesEmpresas", fetch = FetchType.LAZY)
    private List<Comprobantes> comprobantesList;
    @OneToMany(mappedBy = "tiposComprobantesEmpresas", fetch = FetchType.LAZY)
    private List<ContabilizacionBancos> contabilizacionBancosList;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumn(name = "TPOCMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposDeComprobantes tiposDeComprobantes;

    public TiposComprobantesEmpresas() {
    }

    public TiposComprobantesEmpresas(TiposComprobantesEmpresasPK tiposComprobantesEmpresasPK) {
        this.tiposComprobantesEmpresasPK = tiposComprobantesEmpresasPK;
    }

    public TiposComprobantesEmpresas(String empCodigo, String tpocmpCodigo) {
        this.tiposComprobantesEmpresasPK = new TiposComprobantesEmpresasPK(empCodigo, tpocmpCodigo);
    }

    public TiposComprobantesEmpresasPK getTiposComprobantesEmpresasPK() {
        return tiposComprobantesEmpresasPK;
    }

    public void setTiposComprobantesEmpresasPK(TiposComprobantesEmpresasPK tiposComprobantesEmpresasPK) {
        this.tiposComprobantesEmpresasPK = tiposComprobantesEmpresasPK;
    }

    public String getNombreSecuencia() {
        return nombreSecuencia;
    }

    public void setNombreSecuencia(String nombreSecuencia) {
        this.nombreSecuencia = nombreSecuencia;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public List<Libros> getLibrosList() {
        return librosList;
    }

    public void setLibrosList(List<Libros> librosList) {
        this.librosList = librosList;
    }

    public List<Comprobantes> getComprobantesList() {
        return comprobantesList;
    }

    public void setComprobantesList(List<Comprobantes> comprobantesList) {
        this.comprobantesList = comprobantesList;
    }

    public List<ContabilizacionBancos> getContabilizacionBancosList() {
        return contabilizacionBancosList;
    }

    public void setContabilizacionBancosList(List<ContabilizacionBancos> contabilizacionBancosList) {
        this.contabilizacionBancosList = contabilizacionBancosList;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public TiposDeComprobantes getTiposDeComprobantes() {
        return tiposDeComprobantes;
    }

    public void setTiposDeComprobantes(TiposDeComprobantes tiposDeComprobantes) {
        this.tiposDeComprobantes = tiposDeComprobantes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiposComprobantesEmpresasPK != null ? tiposComprobantesEmpresasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposComprobantesEmpresas)) {
            return false;
        }
        TiposComprobantesEmpresas other = (TiposComprobantesEmpresas) object;
        if ((this.tiposComprobantesEmpresasPK == null && other.tiposComprobantesEmpresasPK != null) || (this.tiposComprobantesEmpresasPK != null && !this.tiposComprobantesEmpresasPK.equals(other.tiposComprobantesEmpresasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TiposComprobantesEmpresas[ tiposComprobantesEmpresasPK=" + tiposComprobantesEmpresasPK + " ]";
    }
    
}
