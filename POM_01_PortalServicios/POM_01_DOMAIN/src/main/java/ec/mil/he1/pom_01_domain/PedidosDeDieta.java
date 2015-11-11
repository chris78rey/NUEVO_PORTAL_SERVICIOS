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
@Table(name = "PEDIDOS_DE_DIETA")
@NamedQueries({
    @NamedQuery(name = "PedidosDeDieta.findAll", query = "SELECT p FROM PedidosDeDieta p")})
public class PedidosDeDieta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "TIPO_PEDIDO")
    private String tipoPedido;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "PRS_CODIGO_REALIZADO_POR")
    private String prsCodigoRealizadoPor;
    @Column(name = "PRS_CODIGO_RECIBIDO_POR")
    private String prsCodigoRecibidoPor;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "SECUENCIA")
    private Short secuencia;

    public PedidosDeDieta() {
    }

    public PedidosDeDieta(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getPrsCodigoRealizadoPor() {
        return prsCodigoRealizadoPor;
    }

    public void setPrsCodigoRealizadoPor(String prsCodigoRealizadoPor) {
        this.prsCodigoRealizadoPor = prsCodigoRealizadoPor;
    }

    public String getPrsCodigoRecibidoPor() {
        return prsCodigoRecibidoPor;
    }

    public void setPrsCodigoRecibidoPor(String prsCodigoRecibidoPor) {
        this.prsCodigoRecibidoPor = prsCodigoRecibidoPor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Short secuencia) {
        this.secuencia = secuencia;
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
        if (!(object instanceof PedidosDeDieta)) {
            return false;
        }
        PedidosDeDieta other = (PedidosDeDieta) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PedidosDeDieta[ numero=" + numero + " ]";
    }
    
}
