/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
@Table(name = "DETALLES_REGULACION_CM")
@NamedQueries({
    @NamedQuery(name = "DetallesRegulacionCm.findAll", query = "SELECT d FROM DetallesRegulacionCm d")})
public class DetallesRegulacionCm implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesRegulacionCmPK detallesRegulacionCmPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "IMPUESTO")
    private BigDecimal impuesto;
    @Column(name = "USO_DE_INSTALACIONES")
    private BigDecimal usoDeInstalaciones;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumns({
        @JoinColumn(name = "ENTBNF_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "ENTBNF_MSTBNF_CODIGO", referencedColumnName = "MSTBNF_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private EntidadesBeneficiarias entidadesBeneficiarias;
    @JoinColumn(name = "RGL_CM_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RegulacionesCm regulacionesCm;
    @OneToMany(mappedBy = "detallesRegulacionCm", fetch = FetchType.LAZY)
    private List<MovimientosDeCuenta> movimientosDeCuentaList;

    public DetallesRegulacionCm() {
    }

    public DetallesRegulacionCm(DetallesRegulacionCmPK detallesRegulacionCmPK) {
        this.detallesRegulacionCmPK = detallesRegulacionCmPK;
    }

    public DetallesRegulacionCm(int numero, int rglCmNumero) {
        this.detallesRegulacionCmPK = new DetallesRegulacionCmPK(numero, rglCmNumero);
    }

    public DetallesRegulacionCmPK getDetallesRegulacionCmPK() {
        return detallesRegulacionCmPK;
    }

    public void setDetallesRegulacionCmPK(DetallesRegulacionCmPK detallesRegulacionCmPK) {
        this.detallesRegulacionCmPK = detallesRegulacionCmPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(BigDecimal impuesto) {
        this.impuesto = impuesto;
    }

    public BigDecimal getUsoDeInstalaciones() {
        return usoDeInstalaciones;
    }

    public void setUsoDeInstalaciones(BigDecimal usoDeInstalaciones) {
        this.usoDeInstalaciones = usoDeInstalaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public EntidadesBeneficiarias getEntidadesBeneficiarias() {
        return entidadesBeneficiarias;
    }

    public void setEntidadesBeneficiarias(EntidadesBeneficiarias entidadesBeneficiarias) {
        this.entidadesBeneficiarias = entidadesBeneficiarias;
    }

    public RegulacionesCm getRegulacionesCm() {
        return regulacionesCm;
    }

    public void setRegulacionesCm(RegulacionesCm regulacionesCm) {
        this.regulacionesCm = regulacionesCm;
    }

    public List<MovimientosDeCuenta> getMovimientosDeCuentaList() {
        return movimientosDeCuentaList;
    }

    public void setMovimientosDeCuentaList(List<MovimientosDeCuenta> movimientosDeCuentaList) {
        this.movimientosDeCuentaList = movimientosDeCuentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesRegulacionCmPK != null ? detallesRegulacionCmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesRegulacionCm)) {
            return false;
        }
        DetallesRegulacionCm other = (DetallesRegulacionCm) object;
        if ((this.detallesRegulacionCmPK == null && other.detallesRegulacionCmPK != null) || (this.detallesRegulacionCmPK != null && !this.detallesRegulacionCmPK.equals(other.detallesRegulacionCmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesRegulacionCm[ detallesRegulacionCmPK=" + detallesRegulacionCmPK + " ]";
    }
    
}
