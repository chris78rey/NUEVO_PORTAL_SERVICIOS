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
@Table(name = "CREACION_NOVEDADES_FCT")
@NamedQueries({
    @NamedQuery(name = "CreacionNovedadesFct.findAll", query = "SELECT c FROM CreacionNovedadesFct c")})
public class CreacionNovedadesFct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRCNVDFCT_ID")
    private Integer crcnvdfctId;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ESTADO")
    private Character estado;
    @JoinColumns({
        @JoinColumn(name = "ROLPGS_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
        @JoinColumn(name = "ROLPGS_NUMERO", referencedColumnName = "NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private RolesDePagos rolesDePagos;
    @OneToMany(mappedBy = "creacionNovedadesFct", fetch = FetchType.LAZY)
    private List<DetalleCreacionNovedades> detalleCreacionNovedadesList;

    public CreacionNovedadesFct() {
    }

    public CreacionNovedadesFct(Integer crcnvdfctId) {
        this.crcnvdfctId = crcnvdfctId;
    }

    public Integer getCrcnvdfctId() {
        return crcnvdfctId;
    }

    public void setCrcnvdfctId(Integer crcnvdfctId) {
        this.crcnvdfctId = crcnvdfctId;
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

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
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

    public RolesDePagos getRolesDePagos() {
        return rolesDePagos;
    }

    public void setRolesDePagos(RolesDePagos rolesDePagos) {
        this.rolesDePagos = rolesDePagos;
    }

    public List<DetalleCreacionNovedades> getDetalleCreacionNovedadesList() {
        return detalleCreacionNovedadesList;
    }

    public void setDetalleCreacionNovedadesList(List<DetalleCreacionNovedades> detalleCreacionNovedadesList) {
        this.detalleCreacionNovedadesList = detalleCreacionNovedadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crcnvdfctId != null ? crcnvdfctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreacionNovedadesFct)) {
            return false;
        }
        CreacionNovedadesFct other = (CreacionNovedadesFct) object;
        if ((this.crcnvdfctId == null && other.crcnvdfctId != null) || (this.crcnvdfctId != null && !this.crcnvdfctId.equals(other.crcnvdfctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CreacionNovedadesFct[ crcnvdfctId=" + crcnvdfctId + " ]";
    }
    
}
