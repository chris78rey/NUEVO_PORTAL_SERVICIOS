/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "DESCARGOS_DE_BOTICA")
@NamedQueries({
    @NamedQuery(name = "DescargosDeBotica.findAll", query = "SELECT d FROM DescargosDeBotica d")})
public class DescargosDeBotica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "SLCINT_PCN_NUMERO_HC")
    private Integer slcintPcnNumeroHc;
    @Column(name = "SLCINT_NUMERO")
    private Integer slcintNumero;
    @Column(name = "EGRBTC_NUMERO")
    private Integer egrbtcNumero;
    @Column(name = "EGRBTC_TIPO")
    private String egrbtcTipo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRS_CODIGO_SOLICITADA_POR")
    private String prsCodigoSolicitadaPor;
    @Column(name = "PRS_CODIGO_DESPACHADO_POR")
    private String prsCodigoDespachadoPor;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONFIRMADO")
    private Character confirmado;
    @Column(name = "DESPACHADO")
    private Character despachado;
    @Column(name = "EJECUTADO")
    private Character ejecutado;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "IMPRESO")
    private String impreso;
    @Column(name = "EGRSBB_TIPO")
    private String egrsbbTipo;
    @Column(name = "EGRSBB_NUMERO")
    private Integer egrsbbNumero;
    @Column(name = "OBSERVACION")
    private String observacion;

    public DescargosDeBotica() {
    }

    public DescargosDeBotica(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getSlcintPcnNumeroHc() {
        return slcintPcnNumeroHc;
    }

    public void setSlcintPcnNumeroHc(Integer slcintPcnNumeroHc) {
        this.slcintPcnNumeroHc = slcintPcnNumeroHc;
    }

    public Integer getSlcintNumero() {
        return slcintNumero;
    }

    public void setSlcintNumero(Integer slcintNumero) {
        this.slcintNumero = slcintNumero;
    }

    public Integer getEgrbtcNumero() {
        return egrbtcNumero;
    }

    public void setEgrbtcNumero(Integer egrbtcNumero) {
        this.egrbtcNumero = egrbtcNumero;
    }

    public String getEgrbtcTipo() {
        return egrbtcTipo;
    }

    public void setEgrbtcTipo(String egrbtcTipo) {
        this.egrbtcTipo = egrbtcTipo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getPrsCodigoSolicitadaPor() {
        return prsCodigoSolicitadaPor;
    }

    public void setPrsCodigoSolicitadaPor(String prsCodigoSolicitadaPor) {
        this.prsCodigoSolicitadaPor = prsCodigoSolicitadaPor;
    }

    public String getPrsCodigoDespachadoPor() {
        return prsCodigoDespachadoPor;
    }

    public void setPrsCodigoDespachadoPor(String prsCodigoDespachadoPor) {
        this.prsCodigoDespachadoPor = prsCodigoDespachadoPor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Character confirmado) {
        this.confirmado = confirmado;
    }

    public Character getDespachado() {
        return despachado;
    }

    public void setDespachado(Character despachado) {
        this.despachado = despachado;
    }

    public Character getEjecutado() {
        return ejecutado;
    }

    public void setEjecutado(Character ejecutado) {
        this.ejecutado = ejecutado;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getImpreso() {
        return impreso;
    }

    public void setImpreso(String impreso) {
        this.impreso = impreso;
    }

    public String getEgrsbbTipo() {
        return egrsbbTipo;
    }

    public void setEgrsbbTipo(String egrsbbTipo) {
        this.egrsbbTipo = egrsbbTipo;
    }

    public Integer getEgrsbbNumero() {
        return egrsbbNumero;
    }

    public void setEgrsbbNumero(Integer egrsbbNumero) {
        this.egrsbbNumero = egrsbbNumero;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DescargosDeBotica)) {
            return false;
        }
        DescargosDeBotica other = (DescargosDeBotica) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DescargosDeBotica[ numero=" + numero + " ]";
    }
    
}
