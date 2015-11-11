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
@Table(name = "FICHAS_COBALTOTERAPIA")
@NamedQueries({
    @NamedQuery(name = "FichasCobaltoterapia.findAll", query = "SELECT f FROM FichasCobaltoterapia f")})
public class FichasCobaltoterapia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "DGN_DGN_ID")
    private Long dgnDgnId;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRS_CODIGO_PLANEADA_POR")
    private String prsCodigoPlaneadaPor;
    @Column(name = "HISTOLOGIA")
    private String histologia;
    @Column(name = "TIPO_TRATAMIENTO")
    private String tipoTratamiento;
    @Column(name = "TRATAMIENTO_PREVIO")
    private String tratamientoPrevio;
    @Column(name = "REGION_PRINCIPAL")
    private String regionPrincipal;
    @Column(name = "REGION_SECUNDARIA")
    private String regionSecundaria;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "TECNICA")
    private String tecnica;
    @Column(name = "DOSIS_DIARA")
    private Short dosisDiara;
    @Column(name = "DOSIS_SEMANAL")
    private Short dosisSemanal;
    @Column(name = "DOSIS_TOTAL")
    private Integer dosisTotal;
    @Column(name = "NUMERO_DIAS")
    private Short numeroDias;
    @Column(name = "NOTAS_TRATAMIENTO")
    private String notasTratamiento;
    @Column(name = "FICHA_COBALTO")
    private Integer fichaCobalto;
    @Column(name = "TIPO_RT")
    private String tipoRt;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public FichasCobaltoterapia() {
    }

    public FichasCobaltoterapia(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Long getDgnDgnId() {
        return dgnDgnId;
    }

    public void setDgnDgnId(Long dgnDgnId) {
        this.dgnDgnId = dgnDgnId;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getPrsCodigoPlaneadaPor() {
        return prsCodigoPlaneadaPor;
    }

    public void setPrsCodigoPlaneadaPor(String prsCodigoPlaneadaPor) {
        this.prsCodigoPlaneadaPor = prsCodigoPlaneadaPor;
    }

    public String getHistologia() {
        return histologia;
    }

    public void setHistologia(String histologia) {
        this.histologia = histologia;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getTratamientoPrevio() {
        return tratamientoPrevio;
    }

    public void setTratamientoPrevio(String tratamientoPrevio) {
        this.tratamientoPrevio = tratamientoPrevio;
    }

    public String getRegionPrincipal() {
        return regionPrincipal;
    }

    public void setRegionPrincipal(String regionPrincipal) {
        this.regionPrincipal = regionPrincipal;
    }

    public String getRegionSecundaria() {
        return regionSecundaria;
    }

    public void setRegionSecundaria(String regionSecundaria) {
        this.regionSecundaria = regionSecundaria;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public Short getDosisDiara() {
        return dosisDiara;
    }

    public void setDosisDiara(Short dosisDiara) {
        this.dosisDiara = dosisDiara;
    }

    public Short getDosisSemanal() {
        return dosisSemanal;
    }

    public void setDosisSemanal(Short dosisSemanal) {
        this.dosisSemanal = dosisSemanal;
    }

    public Integer getDosisTotal() {
        return dosisTotal;
    }

    public void setDosisTotal(Integer dosisTotal) {
        this.dosisTotal = dosisTotal;
    }

    public Short getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(Short numeroDias) {
        this.numeroDias = numeroDias;
    }

    public String getNotasTratamiento() {
        return notasTratamiento;
    }

    public void setNotasTratamiento(String notasTratamiento) {
        this.notasTratamiento = notasTratamiento;
    }

    public Integer getFichaCobalto() {
        return fichaCobalto;
    }

    public void setFichaCobalto(Integer fichaCobalto) {
        this.fichaCobalto = fichaCobalto;
    }

    public String getTipoRt() {
        return tipoRt;
    }

    public void setTipoRt(String tipoRt) {
        this.tipoRt = tipoRt;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof FichasCobaltoterapia)) {
            return false;
        }
        FichasCobaltoterapia other = (FichasCobaltoterapia) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FichasCobaltoterapia[ numero=" + numero + " ]";
    }
    
}
