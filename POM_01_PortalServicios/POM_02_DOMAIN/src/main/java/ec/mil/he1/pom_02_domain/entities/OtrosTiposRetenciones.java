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
@Table(name = "OTROS_TIPOS_RETENCIONES")
@NamedQueries({
    @NamedQuery(name = "OtrosTiposRetenciones.findAll", query = "SELECT o FROM OtrosTiposRetenciones o")})
public class OtrosTiposRetenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OtrosTiposRetencionesPK otrosTiposRetencionesPK;
    @Column(name = "IDENTIFICACION_RET")
    private String identificacionRet;
    @Column(name = "TPORTN_CODIGO")
    private String tportnCodigo;
    @Column(name = "TIPO_IDENTIFICACION")
    private Short tipoIdentificacion;
    @Column(name = "PROVEEDOR")
    private String proveedor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BASE_IMPONIBLE")
    private BigDecimal baseImponible;
    @Column(name = "VALOR_RETENIDO")
    private BigDecimal valorRetenido;
    @Column(name = "FECHA_RETENCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRetencion;
    @Column(name = "NUMERO_RETENCIONES")
    private Short numeroRetenciones;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SISTEMA_GENERA")
    private String sistemaGenera;
    @Column(name = "CMPNCNDSRI_IVA_EMP_CODIGO")
    private String cmpncndsriIvaEmpCodigo;
    @Column(name = "CMPNCNDSRI_IVA_PERIODO")
    private String cmpncndsriIvaPeriodo;
    @Column(name = "CMPNCNDSRI_NUMERO")
    private Integer cmpncndsriNumero;
    @Column(name = "RTNFNTSRI_MES")
    private Short rtnfntsriMes;

    public OtrosTiposRetenciones() {
    }

    public OtrosTiposRetenciones(OtrosTiposRetencionesPK otrosTiposRetencionesPK) {
        this.otrosTiposRetencionesPK = otrosTiposRetencionesPK;
    }

    public OtrosTiposRetenciones(String rtnfntsriEmpCodigo, short rtnfntsriAnio, String rtnfntsriTipo, int numero) {
        this.otrosTiposRetencionesPK = new OtrosTiposRetencionesPK(rtnfntsriEmpCodigo, rtnfntsriAnio, rtnfntsriTipo, numero);
    }

    public OtrosTiposRetencionesPK getOtrosTiposRetencionesPK() {
        return otrosTiposRetencionesPK;
    }

    public void setOtrosTiposRetencionesPK(OtrosTiposRetencionesPK otrosTiposRetencionesPK) {
        this.otrosTiposRetencionesPK = otrosTiposRetencionesPK;
    }

    public String getIdentificacionRet() {
        return identificacionRet;
    }

    public void setIdentificacionRet(String identificacionRet) {
        this.identificacionRet = identificacionRet;
    }

    public String getTportnCodigo() {
        return tportnCodigo;
    }

    public void setTportnCodigo(String tportnCodigo) {
        this.tportnCodigo = tportnCodigo;
    }

    public Short getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(Short tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(BigDecimal baseImponible) {
        this.baseImponible = baseImponible;
    }

    public BigDecimal getValorRetenido() {
        return valorRetenido;
    }

    public void setValorRetenido(BigDecimal valorRetenido) {
        this.valorRetenido = valorRetenido;
    }

    public Date getFechaRetencion() {
        return fechaRetencion;
    }

    public void setFechaRetencion(Date fechaRetencion) {
        this.fechaRetencion = fechaRetencion;
    }

    public Short getNumeroRetenciones() {
        return numeroRetenciones;
    }

    public void setNumeroRetenciones(Short numeroRetenciones) {
        this.numeroRetenciones = numeroRetenciones;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSistemaGenera() {
        return sistemaGenera;
    }

    public void setSistemaGenera(String sistemaGenera) {
        this.sistemaGenera = sistemaGenera;
    }

    public String getCmpncndsriIvaEmpCodigo() {
        return cmpncndsriIvaEmpCodigo;
    }

    public void setCmpncndsriIvaEmpCodigo(String cmpncndsriIvaEmpCodigo) {
        this.cmpncndsriIvaEmpCodigo = cmpncndsriIvaEmpCodigo;
    }

    public String getCmpncndsriIvaPeriodo() {
        return cmpncndsriIvaPeriodo;
    }

    public void setCmpncndsriIvaPeriodo(String cmpncndsriIvaPeriodo) {
        this.cmpncndsriIvaPeriodo = cmpncndsriIvaPeriodo;
    }

    public Integer getCmpncndsriNumero() {
        return cmpncndsriNumero;
    }

    public void setCmpncndsriNumero(Integer cmpncndsriNumero) {
        this.cmpncndsriNumero = cmpncndsriNumero;
    }

    public Short getRtnfntsriMes() {
        return rtnfntsriMes;
    }

    public void setRtnfntsriMes(Short rtnfntsriMes) {
        this.rtnfntsriMes = rtnfntsriMes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (otrosTiposRetencionesPK != null ? otrosTiposRetencionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OtrosTiposRetenciones)) {
            return false;
        }
        OtrosTiposRetenciones other = (OtrosTiposRetenciones) object;
        if ((this.otrosTiposRetencionesPK == null && other.otrosTiposRetencionesPK != null) || (this.otrosTiposRetencionesPK != null && !this.otrosTiposRetencionesPK.equals(other.otrosTiposRetencionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.OtrosTiposRetenciones[ otrosTiposRetencionesPK=" + otrosTiposRetencionesPK + " ]";
    }
    
}
