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
@Table(name = "TRANSFERENCIAS_TMA")
@NamedQueries({
    @NamedQuery(name = "TransferenciasTma.findAll", query = "SELECT t FROM TransferenciasTma t")})
public class TransferenciasTma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TFT_IDTRANFERENCIA")
    private Long tftIdtranferencia;
    @Column(name = "CAT_IDCENTRO")
    private Long catIdcentro;
    @Column(name = "TMA_IDTRATAMIENTO")
    private Long tmaIdtratamiento;
    @Column(name = "TFT_FECHATRANSFERENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tftFechatransferencia;
    @Column(name = "TFT_DESCRIPCION")
    private String tftDescripcion;
    @Column(name = "TFT_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tftFechacreacion;

    public TransferenciasTma() {
    }

    public TransferenciasTma(Long tftIdtranferencia) {
        this.tftIdtranferencia = tftIdtranferencia;
    }

    public Long getTftIdtranferencia() {
        return tftIdtranferencia;
    }

    public void setTftIdtranferencia(Long tftIdtranferencia) {
        this.tftIdtranferencia = tftIdtranferencia;
    }

    public Long getCatIdcentro() {
        return catIdcentro;
    }

    public void setCatIdcentro(Long catIdcentro) {
        this.catIdcentro = catIdcentro;
    }

    public Long getTmaIdtratamiento() {
        return tmaIdtratamiento;
    }

    public void setTmaIdtratamiento(Long tmaIdtratamiento) {
        this.tmaIdtratamiento = tmaIdtratamiento;
    }

    public Date getTftFechatransferencia() {
        return tftFechatransferencia;
    }

    public void setTftFechatransferencia(Date tftFechatransferencia) {
        this.tftFechatransferencia = tftFechatransferencia;
    }

    public String getTftDescripcion() {
        return tftDescripcion;
    }

    public void setTftDescripcion(String tftDescripcion) {
        this.tftDescripcion = tftDescripcion;
    }

    public Date getTftFechacreacion() {
        return tftFechacreacion;
    }

    public void setTftFechacreacion(Date tftFechacreacion) {
        this.tftFechacreacion = tftFechacreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tftIdtranferencia != null ? tftIdtranferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransferenciasTma)) {
            return false;
        }
        TransferenciasTma other = (TransferenciasTma) object;
        if ((this.tftIdtranferencia == null && other.tftIdtranferencia != null) || (this.tftIdtranferencia != null && !this.tftIdtranferencia.equals(other.tftIdtranferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TransferenciasTma[ tftIdtranferencia=" + tftIdtranferencia + " ]";
    }
    
}
