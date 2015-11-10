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
@Table(name = "CREACION_EGRESOS_FCT")
@NamedQueries({
    @NamedQuery(name = "CreacionEgresosFct.findAll", query = "SELECT c FROM CreacionEgresosFct c")})
public class CreacionEgresosFct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRCEGRFCT_ID")
    private Integer crcegrfctId;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "DSCAGR_NUMERO")
    private Integer dscagrNumero;
    @Column(name = "ESTADO")
    private Character estado;
    @OneToMany(mappedBy = "creacionEgresosFct", fetch = FetchType.LAZY)
    private List<DetallesCreacionEgresos> detallesCreacionEgresosList;
    @JoinColumn(name = "EGRCJAMDC_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private EgresosCajaMedica egresosCajaMedica;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumn(name = "MDOPGO_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModoDePago modoDePago;

    public CreacionEgresosFct() {
    }

    public CreacionEgresosFct(Integer crcegrfctId) {
        this.crcegrfctId = crcegrfctId;
    }

    public Integer getCrcegrfctId() {
        return crcegrfctId;
    }

    public void setCrcegrfctId(Integer crcegrfctId) {
        this.crcegrfctId = crcegrfctId;
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

    public Integer getDscagrNumero() {
        return dscagrNumero;
    }

    public void setDscagrNumero(Integer dscagrNumero) {
        this.dscagrNumero = dscagrNumero;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public List<DetallesCreacionEgresos> getDetallesCreacionEgresosList() {
        return detallesCreacionEgresosList;
    }

    public void setDetallesCreacionEgresosList(List<DetallesCreacionEgresos> detallesCreacionEgresosList) {
        this.detallesCreacionEgresosList = detallesCreacionEgresosList;
    }

    public EgresosCajaMedica getEgresosCajaMedica() {
        return egresosCajaMedica;
    }

    public void setEgresosCajaMedica(EgresosCajaMedica egresosCajaMedica) {
        this.egresosCajaMedica = egresosCajaMedica;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public ModoDePago getModoDePago() {
        return modoDePago;
    }

    public void setModoDePago(ModoDePago modoDePago) {
        this.modoDePago = modoDePago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crcegrfctId != null ? crcegrfctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreacionEgresosFct)) {
            return false;
        }
        CreacionEgresosFct other = (CreacionEgresosFct) object;
        if ((this.crcegrfctId == null && other.crcegrfctId != null) || (this.crcegrfctId != null && !this.crcegrfctId.equals(other.crcegrfctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CreacionEgresosFct[ crcegrfctId=" + crcegrfctId + " ]";
    }
    
}
