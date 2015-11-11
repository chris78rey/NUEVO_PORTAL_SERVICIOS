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
@Table(name = "PROCEDIMIENTOS_MENORES")
@NamedQueries({
    @NamedQuery(name = "ProcedimientosMenores.findAll", query = "SELECT p FROM ProcedimientosMenores p")})
public class ProcedimientosMenores implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcedimientosMenoresPK procedimientosMenoresPK;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "PRMATN_NUMERO")
    private Integer prmatnNumero;
    @Column(name = "PRMATN_PCN_NUMERO_HC")
    private Integer prmatnPcnNumeroHc;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "AUDITADO")
    private String auditado;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PRS_CODIGO_ASISTIDO")
    private String prsCodigoAsistido;
    @Column(name = "POOL")
    private Integer pool;

    public ProcedimientosMenores() {
    }

    public ProcedimientosMenores(ProcedimientosMenoresPK procedimientosMenoresPK) {
        this.procedimientosMenoresPK = procedimientosMenoresPK;
    }

    public ProcedimientosMenores(int pcnNumeroHc, int numero) {
        this.procedimientosMenoresPK = new ProcedimientosMenoresPK(pcnNumeroHc, numero);
    }

    public ProcedimientosMenoresPK getProcedimientosMenoresPK() {
        return procedimientosMenoresPK;
    }

    public void setProcedimientosMenoresPK(ProcedimientosMenoresPK procedimientosMenoresPK) {
        this.procedimientosMenoresPK = procedimientosMenoresPK;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public Integer getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Integer prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public Integer getPrmatnPcnNumeroHc() {
        return prmatnPcnNumeroHc;
    }

    public void setPrmatnPcnNumeroHc(Integer prmatnPcnNumeroHc) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAuditado() {
        return auditado;
    }

    public void setAuditado(String auditado) {
        this.auditado = auditado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrsCodigoAsistido() {
        return prsCodigoAsistido;
    }

    public void setPrsCodigoAsistido(String prsCodigoAsistido) {
        this.prsCodigoAsistido = prsCodigoAsistido;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procedimientosMenoresPK != null ? procedimientosMenoresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosMenores)) {
            return false;
        }
        ProcedimientosMenores other = (ProcedimientosMenores) object;
        if ((this.procedimientosMenoresPK == null && other.procedimientosMenoresPK != null) || (this.procedimientosMenoresPK != null && !this.procedimientosMenoresPK.equals(other.procedimientosMenoresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProcedimientosMenores[ procedimientosMenoresPK=" + procedimientosMenoresPK + " ]";
    }
    
}
