/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "SEG_USUARIO_PERFIL")
@NamedQueries({
    @NamedQuery(name = "SegUsuarioPerfil.findAll", query = "SELECT s FROM SegUsuarioPerfil s")})
public class SegUsuarioPerfil implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "UMO_ID")
    private BigDecimal umoId;
    @Column(name = "UMO_FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date umoFechaCreacion;
    @Column(name = "UMO_ACTIVO")
    private BigInteger umoActivo;
    @JoinColumn(name = "CODIGO_PERSONAL", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PER_ID", referencedColumnName = "PER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SegPerfil segPerfil;
    @JoinColumn(name = "USU_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SegUsuario segUsuario;

    public SegUsuarioPerfil() {
    }

    public SegUsuarioPerfil(BigDecimal umoId) {
        this.umoId = umoId;
    }

    public BigDecimal getUmoId() {
        return umoId;
    }

    public void setUmoId(BigDecimal umoId) {
        this.umoId = umoId;
    }

    public Date getUmoFechaCreacion() {
        return umoFechaCreacion;
    }

    public void setUmoFechaCreacion(Date umoFechaCreacion) {
        this.umoFechaCreacion = umoFechaCreacion;
    }

    public BigInteger getUmoActivo() {
        return umoActivo;
    }

    public void setUmoActivo(BigInteger umoActivo) {
        this.umoActivo = umoActivo;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public SegPerfil getSegPerfil() {
        return segPerfil;
    }

    public void setSegPerfil(SegPerfil segPerfil) {
        this.segPerfil = segPerfil;
    }

    public SegUsuario getSegUsuario() {
        return segUsuario;
    }

    public void setSegUsuario(SegUsuario segUsuario) {
        this.segUsuario = segUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (umoId != null ? umoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegUsuarioPerfil)) {
            return false;
        }
        SegUsuarioPerfil other = (SegUsuarioPerfil) object;
        if ((this.umoId == null && other.umoId != null) || (this.umoId != null && !this.umoId.equals(other.umoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SegUsuarioPerfil[ umoId=" + umoId + " ]";
    }
    
}
