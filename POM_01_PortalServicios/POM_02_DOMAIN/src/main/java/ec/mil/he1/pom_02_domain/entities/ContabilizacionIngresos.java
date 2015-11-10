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
@Table(name = "CONTABILIZACION_INGRESOS")
@NamedQueries({
    @NamedQuery(name = "ContabilizacionIngresos.findAll", query = "SELECT c FROM ContabilizacionIngresos c")})
public class ContabilizacionIngresos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTING_ID")
    private Long cntingId;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ING_TPOCMP_CODIGO")
    private String ingTpocmpCodigo;
    @Column(name = "ING_CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ingCmpFecha;
    @Column(name = "ING_CMP_CLAVE")
    private Integer ingCmpClave;
    @Column(name = "AJS_TPOCMP_CODIGO")
    private String ajsTpocmpCodigo;
    @Column(name = "AJS_CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ajsCmpFecha;
    @Column(name = "AJS_CMP_CLAVE")
    private Integer ajsCmpClave;
    @Column(name = "TIPO_CONTABILIZACION")
    private String tipoContabilizacion;
    @OneToMany(mappedBy = "contabilizacionIngresos", fetch = FetchType.LAZY)
    private List<DetallesContabilizacionIng> detallesContabilizacionIngList;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empresas empresas;

    public ContabilizacionIngresos() {
    }

    public ContabilizacionIngresos(Long cntingId) {
        this.cntingId = cntingId;
    }

    public Long getCntingId() {
        return cntingId;
    }

    public void setCntingId(Long cntingId) {
        this.cntingId = cntingId;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIngTpocmpCodigo() {
        return ingTpocmpCodigo;
    }

    public void setIngTpocmpCodigo(String ingTpocmpCodigo) {
        this.ingTpocmpCodigo = ingTpocmpCodigo;
    }

    public Date getIngCmpFecha() {
        return ingCmpFecha;
    }

    public void setIngCmpFecha(Date ingCmpFecha) {
        this.ingCmpFecha = ingCmpFecha;
    }

    public Integer getIngCmpClave() {
        return ingCmpClave;
    }

    public void setIngCmpClave(Integer ingCmpClave) {
        this.ingCmpClave = ingCmpClave;
    }

    public String getAjsTpocmpCodigo() {
        return ajsTpocmpCodigo;
    }

    public void setAjsTpocmpCodigo(String ajsTpocmpCodigo) {
        this.ajsTpocmpCodigo = ajsTpocmpCodigo;
    }

    public Date getAjsCmpFecha() {
        return ajsCmpFecha;
    }

    public void setAjsCmpFecha(Date ajsCmpFecha) {
        this.ajsCmpFecha = ajsCmpFecha;
    }

    public Integer getAjsCmpClave() {
        return ajsCmpClave;
    }

    public void setAjsCmpClave(Integer ajsCmpClave) {
        this.ajsCmpClave = ajsCmpClave;
    }

    public String getTipoContabilizacion() {
        return tipoContabilizacion;
    }

    public void setTipoContabilizacion(String tipoContabilizacion) {
        this.tipoContabilizacion = tipoContabilizacion;
    }

    public List<DetallesContabilizacionIng> getDetallesContabilizacionIngList() {
        return detallesContabilizacionIngList;
    }

    public void setDetallesContabilizacionIngList(List<DetallesContabilizacionIng> detallesContabilizacionIngList) {
        this.detallesContabilizacionIngList = detallesContabilizacionIngList;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntingId != null ? cntingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContabilizacionIngresos)) {
            return false;
        }
        ContabilizacionIngresos other = (ContabilizacionIngresos) object;
        if ((this.cntingId == null && other.cntingId != null) || (this.cntingId != null && !this.cntingId.equals(other.cntingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ContabilizacionIngresos[ cntingId=" + cntingId + " ]";
    }
    
}
