/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "HISTORICO_TIPOS_DE_CAMBIO")
@NamedQueries({
    @NamedQuery(name = "HistoricoTiposDeCambio.findAll", query = "SELECT h FROM HistoricoTiposDeCambio h")})
public class HistoricoTiposDeCambio implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistoricoTiposDeCambioPK historicoTiposDeCambioPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "MONEDA_LOCAL")
    private String monedaLocal;
    @Column(name = "MONEDA_EXTRANJERA")
    private String monedaExtranjera;
    @Column(name = "USUARIO")
    private String usuario;

    public HistoricoTiposDeCambio() {
    }

    public HistoricoTiposDeCambio(HistoricoTiposDeCambioPK historicoTiposDeCambioPK) {
        this.historicoTiposDeCambioPK = historicoTiposDeCambioPK;
    }

    public HistoricoTiposDeCambio(String empCodigo, Date fecha) {
        this.historicoTiposDeCambioPK = new HistoricoTiposDeCambioPK(empCodigo, fecha);
    }

    public HistoricoTiposDeCambioPK getHistoricoTiposDeCambioPK() {
        return historicoTiposDeCambioPK;
    }

    public void setHistoricoTiposDeCambioPK(HistoricoTiposDeCambioPK historicoTiposDeCambioPK) {
        this.historicoTiposDeCambioPK = historicoTiposDeCambioPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(String monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    public String getMonedaExtranjera() {
        return monedaExtranjera;
    }

    public void setMonedaExtranjera(String monedaExtranjera) {
        this.monedaExtranjera = monedaExtranjera;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historicoTiposDeCambioPK != null ? historicoTiposDeCambioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoTiposDeCambio)) {
            return false;
        }
        HistoricoTiposDeCambio other = (HistoricoTiposDeCambio) object;
        if ((this.historicoTiposDeCambioPK == null && other.historicoTiposDeCambioPK != null) || (this.historicoTiposDeCambioPK != null && !this.historicoTiposDeCambioPK.equals(other.historicoTiposDeCambioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.HistoricoTiposDeCambio[ historicoTiposDeCambioPK=" + historicoTiposDeCambioPK + " ]";
    }
    
}
