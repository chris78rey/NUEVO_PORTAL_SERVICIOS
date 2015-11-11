/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TARIFARIOS_ITEMS")
@NamedQueries({
    @NamedQuery(name = "TarifariosItems.findAll", query = "SELECT t FROM TarifariosItems t")})
public class TarifariosItems implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarifariosItemsPK tarifariosItemsPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CMR_CODIGO")
    private Integer cmrCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "TPI_CODIGO")
    private Short tpiCodigo;
    @Column(name = "SNN_CODIGO")
    private Short snnCodigo;
    @Column(name = "PNT_CODIGO")
    private Short pntCodigo;
    @Column(name = "FRM_CODIGO")
    private Short frmCodigo;
    @Column(name = "CNC_CODIGO")
    private Short cncCodigo;
    @Column(name = "SINONIMO")
    private String sinonimo;
    @Column(name = "PRESENTACION")
    private String presentacion;
    @Column(name = "FORMA_FARMACEUTICA")
    private String formaFarmaceutica;
    @Column(name = "CONCENTRACION")
    private String concentracion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public TarifariosItems() {
    }

    public TarifariosItems(TarifariosItemsPK tarifariosItemsPK) {
        this.tarifariosItemsPK = tarifariosItemsPK;
    }

    public TarifariosItems(String cnvConvenio, String atiAnexo, String tipo, String codigo, short secuencia) {
        this.tarifariosItemsPK = new TarifariosItemsPK(cnvConvenio, atiAnexo, tipo, codigo, secuencia);
    }

    public TarifariosItemsPK getTarifariosItemsPK() {
        return tarifariosItemsPK;
    }

    public void setTarifariosItemsPK(TarifariosItemsPK tarifariosItemsPK) {
        this.tarifariosItemsPK = tarifariosItemsPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCmrCodigo() {
        return cmrCodigo;
    }

    public void setCmrCodigo(Integer cmrCodigo) {
        this.cmrCodigo = cmrCodigo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public Short getTpiCodigo() {
        return tpiCodigo;
    }

    public void setTpiCodigo(Short tpiCodigo) {
        this.tpiCodigo = tpiCodigo;
    }

    public Short getSnnCodigo() {
        return snnCodigo;
    }

    public void setSnnCodigo(Short snnCodigo) {
        this.snnCodigo = snnCodigo;
    }

    public Short getPntCodigo() {
        return pntCodigo;
    }

    public void setPntCodigo(Short pntCodigo) {
        this.pntCodigo = pntCodigo;
    }

    public Short getFrmCodigo() {
        return frmCodigo;
    }

    public void setFrmCodigo(Short frmCodigo) {
        this.frmCodigo = frmCodigo;
    }

    public Short getCncCodigo() {
        return cncCodigo;
    }

    public void setCncCodigo(Short cncCodigo) {
        this.cncCodigo = cncCodigo;
    }

    public String getSinonimo() {
        return sinonimo;
    }

    public void setSinonimo(String sinonimo) {
        this.sinonimo = sinonimo;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarifariosItemsPK != null ? tarifariosItemsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarifariosItems)) {
            return false;
        }
        TarifariosItems other = (TarifariosItems) object;
        if ((this.tarifariosItemsPK == null && other.tarifariosItemsPK != null) || (this.tarifariosItemsPK != null && !this.tarifariosItemsPK.equals(other.tarifariosItemsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TarifariosItems[ tarifariosItemsPK=" + tarifariosItemsPK + " ]";
    }
    
}
