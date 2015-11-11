/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "COMPROBANTES_ANULADOS")
@NamedQueries({
    @NamedQuery(name = "ComprobantesAnulados.findAll", query = "SELECT c FROM ComprobantesAnulados c")})
public class ComprobantesAnulados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComprobantesAnuladosPK comprobantesAnuladosPK;
    @Column(name = "CODIGO_TIPO_COMPROBANTE")
    private String codigoTipoComprobante;
    @Column(name = "SERIE_COMPROBANTE")
    private String serieComprobante;
    @Column(name = "SECUENCIA_DESDE")
    private String secuenciaDesde;
    @Column(name = "SECUENCIA_HASTA")
    private String secuenciaHasta;
    @Column(name = "AUTORIZACION_SRI")
    private String autorizacionSri;
    @Column(name = "FECHA_ANULACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnulacion;
    @Column(name = "SISTEMA_GENERA")
    private String sistemaGenera;

    public ComprobantesAnulados() {
    }

    public ComprobantesAnulados(ComprobantesAnuladosPK comprobantesAnuladosPK) {
        this.comprobantesAnuladosPK = comprobantesAnuladosPK;
    }

    public ComprobantesAnulados(String ivaEmpCodigo, String ivaPeriodo, BigInteger numero) {
        this.comprobantesAnuladosPK = new ComprobantesAnuladosPK(ivaEmpCodigo, ivaPeriodo, numero);
    }

    public ComprobantesAnuladosPK getComprobantesAnuladosPK() {
        return comprobantesAnuladosPK;
    }

    public void setComprobantesAnuladosPK(ComprobantesAnuladosPK comprobantesAnuladosPK) {
        this.comprobantesAnuladosPK = comprobantesAnuladosPK;
    }

    public String getCodigoTipoComprobante() {
        return codigoTipoComprobante;
    }

    public void setCodigoTipoComprobante(String codigoTipoComprobante) {
        this.codigoTipoComprobante = codigoTipoComprobante;
    }

    public String getSerieComprobante() {
        return serieComprobante;
    }

    public void setSerieComprobante(String serieComprobante) {
        this.serieComprobante = serieComprobante;
    }

    public String getSecuenciaDesde() {
        return secuenciaDesde;
    }

    public void setSecuenciaDesde(String secuenciaDesde) {
        this.secuenciaDesde = secuenciaDesde;
    }

    public String getSecuenciaHasta() {
        return secuenciaHasta;
    }

    public void setSecuenciaHasta(String secuenciaHasta) {
        this.secuenciaHasta = secuenciaHasta;
    }

    public String getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(String autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
    }

    public Date getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public String getSistemaGenera() {
        return sistemaGenera;
    }

    public void setSistemaGenera(String sistemaGenera) {
        this.sistemaGenera = sistemaGenera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comprobantesAnuladosPK != null ? comprobantesAnuladosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprobantesAnulados)) {
            return false;
        }
        ComprobantesAnulados other = (ComprobantesAnulados) object;
        if ((this.comprobantesAnuladosPK == null && other.comprobantesAnuladosPK != null) || (this.comprobantesAnuladosPK != null && !this.comprobantesAnuladosPK.equals(other.comprobantesAnuladosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComprobantesAnulados[ comprobantesAnuladosPK=" + comprobantesAnuladosPK + " ]";
    }
    
}
