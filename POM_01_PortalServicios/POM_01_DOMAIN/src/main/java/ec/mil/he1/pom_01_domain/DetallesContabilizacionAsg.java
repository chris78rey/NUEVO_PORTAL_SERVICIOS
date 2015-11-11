/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DETALLES_CONTABILIZACION_ASG")
@NamedQueries({
    @NamedQuery(name = "DetallesContabilizacionAsg.findAll", query = "SELECT d FROM DetallesContabilizacionAsg d")})
public class DetallesContabilizacionAsg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNTASG_EMP_CODIGO")
    private String cntasgEmpCodigo;
    @Column(name = "CNTASG_CNTASG_ID")
    private Long cntasgCntasgId;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLCNTASG_ID")
    private Long dtlcntasgId;
    @Column(name = "ASGACT_NUMERO")
    private Integer asgactNumero;
    @Column(name = "CODIGO_SUMINISTRO")
    private String codigoSuministro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "AREA")
    private String area;
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Column(name = "CONTABILIZA")
    private Character contabiliza;

    public DetallesContabilizacionAsg() {
    }

    public DetallesContabilizacionAsg(Long dtlcntasgId) {
        this.dtlcntasgId = dtlcntasgId;
    }

    public String getCntasgEmpCodigo() {
        return cntasgEmpCodigo;
    }

    public void setCntasgEmpCodigo(String cntasgEmpCodigo) {
        this.cntasgEmpCodigo = cntasgEmpCodigo;
    }

    public Long getCntasgCntasgId() {
        return cntasgCntasgId;
    }

    public void setCntasgCntasgId(Long cntasgCntasgId) {
        this.cntasgCntasgId = cntasgCntasgId;
    }

    public Long getDtlcntasgId() {
        return dtlcntasgId;
    }

    public void setDtlcntasgId(Long dtlcntasgId) {
        this.dtlcntasgId = dtlcntasgId;
    }

    public Integer getAsgactNumero() {
        return asgactNumero;
    }

    public void setAsgactNumero(Integer asgactNumero) {
        this.asgactNumero = asgactNumero;
    }

    public String getCodigoSuministro() {
        return codigoSuministro;
    }

    public void setCodigoSuministro(String codigoSuministro) {
        this.codigoSuministro = codigoSuministro;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Character getContabiliza() {
        return contabiliza;
    }

    public void setContabiliza(Character contabiliza) {
        this.contabiliza = contabiliza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlcntasgId != null ? dtlcntasgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesContabilizacionAsg)) {
            return false;
        }
        DetallesContabilizacionAsg other = (DetallesContabilizacionAsg) object;
        if ((this.dtlcntasgId == null && other.dtlcntasgId != null) || (this.dtlcntasgId != null && !this.dtlcntasgId.equals(other.dtlcntasgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesContabilizacionAsg[ dtlcntasgId=" + dtlcntasgId + " ]";
    }
    
}
