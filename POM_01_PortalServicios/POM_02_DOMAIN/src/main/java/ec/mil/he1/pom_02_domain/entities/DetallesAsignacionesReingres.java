/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_ASIGNACIONES_REINGRES")
@NamedQueries({
    @NamedQuery(name = "DetallesAsignacionesReingres.findAll", query = "SELECT d FROM DetallesAsignacionesReingres d")})
public class DetallesAsignacionesReingres implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesAsignacionesReingresPK detallesAsignacionesReingresPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumns({
        @JoinColumn(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO", referencedColumnName = "SBGACTFJO_GRPACTFJO_EMP_CODIGO"),
        @JoinColumn(name = "ACTFSBGACTFJO_GRPACTFJO_CODIGO", referencedColumnName = "ACTFSBGACTFJO_GRPACTFJO_CODIGO"),
        @JoinColumn(name = "ACTFACTFJOGNR_SBGACTFJO_CODIGO", referencedColumnName = "ACTFJOGNR_SBGACTFJO_CODIGO"),
        @JoinColumn(name = "ACTFJOESP_ACTFJOGNR_CODIGO", referencedColumnName = "ACTFJOGNR_CODIGO"),
        @JoinColumn(name = "ACTFJOESP_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ActivosFijosEspecificos activosFijosEspecificos;
    @JoinColumns({
        @JoinColumn(name = "ASGRINACT_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ASGRINACT_TIPO_MOVIMIENTO", referencedColumnName = "TIPO_MOVIMIENTO", insertable = false, updatable = false),
        @JoinColumn(name = "ASGRINACT_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AsignacionesReingresosActivo asignacionesReingresosActivo;

    public DetallesAsignacionesReingres() {
    }

    public DetallesAsignacionesReingres(DetallesAsignacionesReingresPK detallesAsignacionesReingresPK) {
        this.detallesAsignacionesReingresPK = detallesAsignacionesReingresPK;
    }

    public DetallesAsignacionesReingres(String asgrinactEmpCodigo, String asgrinactTipoMovimiento, int asgrinactNumero, int numero) {
        this.detallesAsignacionesReingresPK = new DetallesAsignacionesReingresPK(asgrinactEmpCodigo, asgrinactTipoMovimiento, asgrinactNumero, numero);
    }

    public DetallesAsignacionesReingresPK getDetallesAsignacionesReingresPK() {
        return detallesAsignacionesReingresPK;
    }

    public void setDetallesAsignacionesReingresPK(DetallesAsignacionesReingresPK detallesAsignacionesReingresPK) {
        this.detallesAsignacionesReingresPK = detallesAsignacionesReingresPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ActivosFijosEspecificos getActivosFijosEspecificos() {
        return activosFijosEspecificos;
    }

    public void setActivosFijosEspecificos(ActivosFijosEspecificos activosFijosEspecificos) {
        this.activosFijosEspecificos = activosFijosEspecificos;
    }

    public AsignacionesReingresosActivo getAsignacionesReingresosActivo() {
        return asignacionesReingresosActivo;
    }

    public void setAsignacionesReingresosActivo(AsignacionesReingresosActivo asignacionesReingresosActivo) {
        this.asignacionesReingresosActivo = asignacionesReingresosActivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesAsignacionesReingresPK != null ? detallesAsignacionesReingresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesAsignacionesReingres)) {
            return false;
        }
        DetallesAsignacionesReingres other = (DetallesAsignacionesReingres) object;
        if ((this.detallesAsignacionesReingresPK == null && other.detallesAsignacionesReingresPK != null) || (this.detallesAsignacionesReingresPK != null && !this.detallesAsignacionesReingresPK.equals(other.detallesAsignacionesReingresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesAsignacionesReingres[ detallesAsignacionesReingresPK=" + detallesAsignacionesReingresPK + " ]";
    }
    
}
