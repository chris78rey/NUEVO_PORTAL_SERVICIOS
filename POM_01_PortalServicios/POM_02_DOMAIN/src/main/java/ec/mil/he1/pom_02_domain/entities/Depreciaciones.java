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
@Table(name = "DEPRECIACIONES")
@NamedQueries({
    @NamedQuery(name = "Depreciaciones.findAll", query = "SELECT d FROM Depreciaciones d")})
public class Depreciaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepreciacionesPK depreciacionesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OSERVACIONES")
    private String oservaciones;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "depreciaciones", fetch = FetchType.LAZY)
    private List<DetallesDepreciaciones> detallesDepreciacionesList;

    public Depreciaciones() {
    }

    public Depreciaciones(DepreciacionesPK depreciacionesPK) {
        this.depreciacionesPK = depreciacionesPK;
    }

    public Depreciaciones(String empCodigo, short anio, short mes) {
        this.depreciacionesPK = new DepreciacionesPK(empCodigo, anio, mes);
    }

    public DepreciacionesPK getDepreciacionesPK() {
        return depreciacionesPK;
    }

    public void setDepreciacionesPK(DepreciacionesPK depreciacionesPK) {
        this.depreciacionesPK = depreciacionesPK;
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

    public String getOservaciones() {
        return oservaciones;
    }

    public void setOservaciones(String oservaciones) {
        this.oservaciones = oservaciones;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
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

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<DetallesDepreciaciones> getDetallesDepreciacionesList() {
        return detallesDepreciacionesList;
    }

    public void setDetallesDepreciacionesList(List<DetallesDepreciaciones> detallesDepreciacionesList) {
        this.detallesDepreciacionesList = detallesDepreciacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depreciacionesPK != null ? depreciacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depreciaciones)) {
            return false;
        }
        Depreciaciones other = (Depreciaciones) object;
        if ((this.depreciacionesPK == null && other.depreciacionesPK != null) || (this.depreciacionesPK != null && !this.depreciacionesPK.equals(other.depreciacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Depreciaciones[ depreciacionesPK=" + depreciacionesPK + " ]";
    }
    
}
