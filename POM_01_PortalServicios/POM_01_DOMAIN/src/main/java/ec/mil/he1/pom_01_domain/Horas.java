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
@Table(name = "HORAS")
@NamedQueries({
    @NamedQuery(name = "Horas.findAll", query = "SELECT h FROM Horas h")})
public class Horas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HOR_IDHORA")
    private Long horIdhora;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "CNV_IDNOVEDAD")
    private String cnvIdnovedad;
    @Column(name = "RPG_IDROLPAGOS")
    private Long rpgIdrolpagos;
    @Column(name = "HOR_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HOR_NUMEROHORAS")
    private BigDecimal horNumerohoras;
    @Column(name = "HOR_VALOR")
    private BigDecimal horValor;
    @Column(name = "HOR_USER")
    private String horUser;
    @Column(name = "HOR_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horFechacreacion;
    @Column(name = "HOR_DESCRIPCION")
    private String horDescripcion;
    @Column(name = "HORA_NUMEROMINUTOS")
    private BigDecimal horaNumerominutos;

    public Horas() {
    }

    public Horas(Long horIdhora) {
        this.horIdhora = horIdhora;
    }

    public Long getHorIdhora() {
        return horIdhora;
    }

    public void setHorIdhora(Long horIdhora) {
        this.horIdhora = horIdhora;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public String getCnvIdnovedad() {
        return cnvIdnovedad;
    }

    public void setCnvIdnovedad(String cnvIdnovedad) {
        this.cnvIdnovedad = cnvIdnovedad;
    }

    public Long getRpgIdrolpagos() {
        return rpgIdrolpagos;
    }

    public void setRpgIdrolpagos(Long rpgIdrolpagos) {
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    public Date getHorFecha() {
        return horFecha;
    }

    public void setHorFecha(Date horFecha) {
        this.horFecha = horFecha;
    }

    public BigDecimal getHorNumerohoras() {
        return horNumerohoras;
    }

    public void setHorNumerohoras(BigDecimal horNumerohoras) {
        this.horNumerohoras = horNumerohoras;
    }

    public BigDecimal getHorValor() {
        return horValor;
    }

    public void setHorValor(BigDecimal horValor) {
        this.horValor = horValor;
    }

    public String getHorUser() {
        return horUser;
    }

    public void setHorUser(String horUser) {
        this.horUser = horUser;
    }

    public Date getHorFechacreacion() {
        return horFechacreacion;
    }

    public void setHorFechacreacion(Date horFechacreacion) {
        this.horFechacreacion = horFechacreacion;
    }

    public String getHorDescripcion() {
        return horDescripcion;
    }

    public void setHorDescripcion(String horDescripcion) {
        this.horDescripcion = horDescripcion;
    }

    public BigDecimal getHoraNumerominutos() {
        return horaNumerominutos;
    }

    public void setHoraNumerominutos(BigDecimal horaNumerominutos) {
        this.horaNumerominutos = horaNumerominutos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horIdhora != null ? horIdhora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horas)) {
            return false;
        }
        Horas other = (Horas) object;
        if ((this.horIdhora == null && other.horIdhora != null) || (this.horIdhora != null && !this.horIdhora.equals(other.horIdhora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Horas[ horIdhora=" + horIdhora + " ]";
    }
    
}
