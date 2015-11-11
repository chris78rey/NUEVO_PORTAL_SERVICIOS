/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "COPAGOS")
@NamedQueries({
    @NamedQuery(name = "Copagos.findAll", query = "SELECT c FROM Copagos c")})
public class Copagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTO_MAXIMO")
    private BigDecimal montoMaximo;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "PAGA_TURNO")
    private Character pagaTurno;

    public Copagos() {
    }

    public Copagos(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(BigDecimal montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Character getPagaTurno() {
        return pagaTurno;
    }

    public void setPagaTurno(Character pagaTurno) {
        this.pagaTurno = pagaTurno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Copagos)) {
            return false;
        }
        Copagos other = (Copagos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Copagos[ codigo=" + codigo + " ]";
    }
    
}
