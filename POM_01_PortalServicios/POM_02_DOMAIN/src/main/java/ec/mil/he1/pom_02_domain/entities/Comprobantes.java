/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "COMPROBANTES")
@NamedQueries({
    @NamedQuery(name = "Comprobantes.findAll", query = "SELECT c FROM Comprobantes c")})
public class Comprobantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComprobantesPK comprobantesPK;
    @Column(name = "MAYORIZADO")
    private Character mayorizado;
    @Column(name = "ESTADO")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "MONEDA_LOCAL")
    private String monedaLocal;
    @Column(name = "TIPO_DE_CAMBIO")
    private BigDecimal tipoDeCambio;
    @Column(name = "TIPO_DE_CAMBIOE")
    private BigDecimal tipoDeCambioe;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "CONTABILIZADO_DESDE")
    private String contabilizadoDesde;
    @Column(name = "REVISADO")
    private Character revisado;
    @JoinColumns({
        @JoinColumn(name = "TPOCMPEMP_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CRRMES_MES", referencedColumnName = "MES")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CierresDeMes cierresDeMes;
    @JoinColumns({
        @JoinColumn(name = "TPOCMPEMP_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "TPOCMPEMP_TPOCMP_CODIGO", referencedColumnName = "TPOCMP_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposComprobantesEmpresas tiposComprobantesEmpresas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comprobantes", fetch = FetchType.LAZY)
    private List<RetencionesElectronicas> retencionesElectronicasList;

    public Comprobantes() {
    }

    public Comprobantes(ComprobantesPK comprobantesPK) {
        this.comprobantesPK = comprobantesPK;
    }

    public Comprobantes(Date fecha, int clave, String tpocmpempTpocmpCodigo, String tpocmpempEmpCodigo) {
        this.comprobantesPK = new ComprobantesPK(fecha, clave, tpocmpempTpocmpCodigo, tpocmpempEmpCodigo);
    }

    public ComprobantesPK getComprobantesPK() {
        return comprobantesPK;
    }

    public void setComprobantesPK(ComprobantesPK comprobantesPK) {
        this.comprobantesPK = comprobantesPK;
    }

    public Character getMayorizado() {
        return mayorizado;
    }

    public void setMayorizado(Character mayorizado) {
        this.mayorizado = mayorizado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(String monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    public BigDecimal getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(BigDecimal tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public BigDecimal getTipoDeCambioe() {
        return tipoDeCambioe;
    }

    public void setTipoDeCambioe(BigDecimal tipoDeCambioe) {
        this.tipoDeCambioe = tipoDeCambioe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContabilizadoDesde() {
        return contabilizadoDesde;
    }

    public void setContabilizadoDesde(String contabilizadoDesde) {
        this.contabilizadoDesde = contabilizadoDesde;
    }

    public Character getRevisado() {
        return revisado;
    }

    public void setRevisado(Character revisado) {
        this.revisado = revisado;
    }

    public CierresDeMes getCierresDeMes() {
        return cierresDeMes;
    }

    public void setCierresDeMes(CierresDeMes cierresDeMes) {
        this.cierresDeMes = cierresDeMes;
    }

    public TiposComprobantesEmpresas getTiposComprobantesEmpresas() {
        return tiposComprobantesEmpresas;
    }

    public void setTiposComprobantesEmpresas(TiposComprobantesEmpresas tiposComprobantesEmpresas) {
        this.tiposComprobantesEmpresas = tiposComprobantesEmpresas;
    }

    public List<RetencionesElectronicas> getRetencionesElectronicasList() {
        return retencionesElectronicasList;
    }

    public void setRetencionesElectronicasList(List<RetencionesElectronicas> retencionesElectronicasList) {
        this.retencionesElectronicasList = retencionesElectronicasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comprobantesPK != null ? comprobantesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comprobantes)) {
            return false;
        }
        Comprobantes other = (Comprobantes) object;
        if ((this.comprobantesPK == null && other.comprobantesPK != null) || (this.comprobantesPK != null && !this.comprobantesPK.equals(other.comprobantesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Comprobantes[ comprobantesPK=" + comprobantesPK + " ]";
    }
    
}
