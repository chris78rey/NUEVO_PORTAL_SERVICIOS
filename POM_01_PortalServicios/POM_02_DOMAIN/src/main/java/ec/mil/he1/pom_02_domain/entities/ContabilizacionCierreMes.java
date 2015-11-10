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
@Table(name = "CONTABILIZACION_CIERRE_MES")
@NamedQueries({
    @NamedQuery(name = "ContabilizacionCierreMes.findAll", query = "SELECT c FROM ContabilizacionCierreMes c")})
public class ContabilizacionCierreMes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTCRRMES_ID")
    private Long cntcrrmesId;
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
    @Column(name = "TPOCMP_CODIGO")
    private String tpocmpCodigo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumns({
        @JoinColumn(name = "ANIO", referencedColumnName = "ANIO"),
        @JoinColumn(name = "MES", referencedColumnName = "MES"),
        @JoinColumn(name = "LOCAL", referencedColumnName = "LOCAL")})
    @ManyToOne(fetch = FetchType.LAZY)
    private RegistrosDeCierre registrosDeCierre;
    @OneToMany(mappedBy = "contabilizacionCierreMes", fetch = FetchType.LAZY)
    private List<DetallesContabilizacionCrr> detallesContabilizacionCrrList;

    public ContabilizacionCierreMes() {
    }

    public ContabilizacionCierreMes(Long cntcrrmesId) {
        this.cntcrrmesId = cntcrrmesId;
    }

    public Long getCntcrrmesId() {
        return cntcrrmesId;
    }

    public void setCntcrrmesId(Long cntcrrmesId) {
        this.cntcrrmesId = cntcrrmesId;
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

    public String getTpocmpCodigo() {
        return tpocmpCodigo;
    }

    public void setTpocmpCodigo(String tpocmpCodigo) {
        this.tpocmpCodigo = tpocmpCodigo;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public RegistrosDeCierre getRegistrosDeCierre() {
        return registrosDeCierre;
    }

    public void setRegistrosDeCierre(RegistrosDeCierre registrosDeCierre) {
        this.registrosDeCierre = registrosDeCierre;
    }

    public List<DetallesContabilizacionCrr> getDetallesContabilizacionCrrList() {
        return detallesContabilizacionCrrList;
    }

    public void setDetallesContabilizacionCrrList(List<DetallesContabilizacionCrr> detallesContabilizacionCrrList) {
        this.detallesContabilizacionCrrList = detallesContabilizacionCrrList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntcrrmesId != null ? cntcrrmesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContabilizacionCierreMes)) {
            return false;
        }
        ContabilizacionCierreMes other = (ContabilizacionCierreMes) object;
        if ((this.cntcrrmesId == null && other.cntcrrmesId != null) || (this.cntcrrmesId != null && !this.cntcrrmesId.equals(other.cntcrrmesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ContabilizacionCierreMes[ cntcrrmesId=" + cntcrrmesId + " ]";
    }
    
}
