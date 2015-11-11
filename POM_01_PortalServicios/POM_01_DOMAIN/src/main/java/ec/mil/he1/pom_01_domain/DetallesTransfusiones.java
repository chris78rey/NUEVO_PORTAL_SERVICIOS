/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "DETALLES_TRANSFUSIONES")
@NamedQueries({
    @NamedQuery(name = "DetallesTransfusiones.findAll", query = "SELECT d FROM DetallesTransfusiones d")})
public class DetallesTransfusiones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesTransfusionesPK detallesTransfusionesPK;
    @Column(name = "NUMERO_DE_FRACCIONES")
    private Short numeroDeFracciones;
    @Column(name = "VOLUMEN_SOLICITADO")
    private Short volumenSolicitado;

    public DetallesTransfusiones() {
    }

    public DetallesTransfusiones(DetallesTransfusionesPK detallesTransfusionesPK) {
        this.detallesTransfusionesPK = detallesTransfusionesPK;
    }

    public DetallesTransfusiones(int slctrnNumero, String frnCodigo) {
        this.detallesTransfusionesPK = new DetallesTransfusionesPK(slctrnNumero, frnCodigo);
    }

    public DetallesTransfusionesPK getDetallesTransfusionesPK() {
        return detallesTransfusionesPK;
    }

    public void setDetallesTransfusionesPK(DetallesTransfusionesPK detallesTransfusionesPK) {
        this.detallesTransfusionesPK = detallesTransfusionesPK;
    }

    public Short getNumeroDeFracciones() {
        return numeroDeFracciones;
    }

    public void setNumeroDeFracciones(Short numeroDeFracciones) {
        this.numeroDeFracciones = numeroDeFracciones;
    }

    public Short getVolumenSolicitado() {
        return volumenSolicitado;
    }

    public void setVolumenSolicitado(Short volumenSolicitado) {
        this.volumenSolicitado = volumenSolicitado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesTransfusionesPK != null ? detallesTransfusionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesTransfusiones)) {
            return false;
        }
        DetallesTransfusiones other = (DetallesTransfusiones) object;
        if ((this.detallesTransfusionesPK == null && other.detallesTransfusionesPK != null) || (this.detallesTransfusionesPK != null && !this.detallesTransfusionesPK.equals(other.detallesTransfusionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesTransfusiones[ detallesTransfusionesPK=" + detallesTransfusionesPK + " ]";
    }
    
}
