/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PAGOS_ESPECIALES")
@NamedQueries({
    @NamedQuery(name = "PagosEspeciales.findAll", query = "SELECT p FROM PagosEspeciales p")})
public class PagosEspeciales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PagosEspecialesPK pagosEspecialesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ANIO")
    private Short anio;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagosEspeciales", fetch = FetchType.LAZY)
    private List<MovimientosPagosEspeciales> movimientosPagosEspecialesList;
    @JoinColumns({
        @JoinColumn(name = "PRMESP_PRMROL_EMP_CODIGO", referencedColumnName = "PRMROL_EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PRMESP_PRMROL_CODIGO", referencedColumnName = "PRMROL_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ParametrosEspeciales parametrosEspeciales;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public PagosEspeciales() {
    }

    public PagosEspeciales(PagosEspecialesPK pagosEspecialesPK) {
        this.pagosEspecialesPK = pagosEspecialesPK;
    }

    public PagosEspeciales(String prmespPrmrolCodigo, String prmespPrmrolEmpCodigo, int numero) {
        this.pagosEspecialesPK = new PagosEspecialesPK(prmespPrmrolCodigo, prmespPrmrolEmpCodigo, numero);
    }

    public PagosEspecialesPK getPagosEspecialesPK() {
        return pagosEspecialesPK;
    }

    public void setPagosEspecialesPK(PagosEspecialesPK pagosEspecialesPK) {
        this.pagosEspecialesPK = pagosEspecialesPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public List<MovimientosPagosEspeciales> getMovimientosPagosEspecialesList() {
        return movimientosPagosEspecialesList;
    }

    public void setMovimientosPagosEspecialesList(List<MovimientosPagosEspeciales> movimientosPagosEspecialesList) {
        this.movimientosPagosEspecialesList = movimientosPagosEspecialesList;
    }

    public ParametrosEspeciales getParametrosEspeciales() {
        return parametrosEspeciales;
    }

    public void setParametrosEspeciales(ParametrosEspeciales parametrosEspeciales) {
        this.parametrosEspeciales = parametrosEspeciales;
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
        hash += (pagosEspecialesPK != null ? pagosEspecialesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagosEspeciales)) {
            return false;
        }
        PagosEspeciales other = (PagosEspeciales) object;
        if ((this.pagosEspecialesPK == null && other.pagosEspecialesPK != null) || (this.pagosEspecialesPK != null && !this.pagosEspecialesPK.equals(other.pagosEspecialesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PagosEspeciales[ pagosEspecialesPK=" + pagosEspecialesPK + " ]";
    }
    
}
