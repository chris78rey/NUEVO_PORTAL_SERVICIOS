/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "MANO_DE_OBRA_DPR")
@NamedQueries({
    @NamedQuery(name = "ManoDeObraDpr.findAll", query = "SELECT m FROM ManoDeObraDpr m")})
public class ManoDeObraDpr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ManoDeObraDprPK manoDeObraDprPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HORAS_TRABAJO")
    private BigDecimal horasTrabajo;
    @Column(name = "JORNADA")
    private String jornada;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "ESTADO")
    private Character estado;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Departamentos departamentos;

    public ManoDeObraDpr() {
    }

    public ManoDeObraDpr(ManoDeObraDprPK manoDeObraDprPK) {
        this.manoDeObraDprPK = manoDeObraDprPK;
    }

    public ManoDeObraDpr(int prdCodigo, String clasificacion, String dprAraCodigo, String dprCodigo) {
        this.manoDeObraDprPK = new ManoDeObraDprPK(prdCodigo, clasificacion, dprAraCodigo, dprCodigo);
    }

    public ManoDeObraDprPK getManoDeObraDprPK() {
        return manoDeObraDprPK;
    }

    public void setManoDeObraDprPK(ManoDeObraDprPK manoDeObraDprPK) {
        this.manoDeObraDprPK = manoDeObraDprPK;
    }

    public BigDecimal getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(BigDecimal horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manoDeObraDprPK != null ? manoDeObraDprPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ManoDeObraDpr)) {
            return false;
        }
        ManoDeObraDpr other = (ManoDeObraDpr) object;
        if ((this.manoDeObraDprPK == null && other.manoDeObraDprPK != null) || (this.manoDeObraDprPK != null && !this.manoDeObraDprPK.equals(other.manoDeObraDprPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ManoDeObraDpr[ manoDeObraDprPK=" + manoDeObraDprPK + " ]";
    }
    
}
