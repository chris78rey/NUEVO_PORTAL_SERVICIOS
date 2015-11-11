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
@Table(name = "DETALLES_PLANILLA_PREFACT")
@NamedQueries({
    @NamedQuery(name = "DetallesPlanillaPrefact.findAll", query = "SELECT d FROM DetallesPlanillaPrefact d")})
public class DetallesPlanillaPrefact implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesPlanillaPrefactPK detallesPlanillaPrefactPK;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "PLA_PROMOCION")
    private String plaPromocion;
    @Column(name = "CNTS_SEGURO")
    private Character cntsSeguro;

    public DetallesPlanillaPrefact() {
    }

    public DetallesPlanillaPrefact(DetallesPlanillaPrefactPK detallesPlanillaPrefactPK) {
        this.detallesPlanillaPrefactPK = detallesPlanillaPrefactPK;
    }

    public DetallesPlanillaPrefact(String cntsDocumento, int cntsDetalle, long cntsNumero, int plaNumeroPlanilla) {
        this.detallesPlanillaPrefactPK = new DetallesPlanillaPrefactPK(cntsDocumento, cntsDetalle, cntsNumero, plaNumeroPlanilla);
    }

    public DetallesPlanillaPrefactPK getDetallesPlanillaPrefactPK() {
        return detallesPlanillaPrefactPK;
    }

    public void setDetallesPlanillaPrefactPK(DetallesPlanillaPrefactPK detallesPlanillaPrefactPK) {
        this.detallesPlanillaPrefactPK = detallesPlanillaPrefactPK;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getPlaPromocion() {
        return plaPromocion;
    }

    public void setPlaPromocion(String plaPromocion) {
        this.plaPromocion = plaPromocion;
    }

    public Character getCntsSeguro() {
        return cntsSeguro;
    }

    public void setCntsSeguro(Character cntsSeguro) {
        this.cntsSeguro = cntsSeguro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesPlanillaPrefactPK != null ? detallesPlanillaPrefactPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPlanillaPrefact)) {
            return false;
        }
        DetallesPlanillaPrefact other = (DetallesPlanillaPrefact) object;
        if ((this.detallesPlanillaPrefactPK == null && other.detallesPlanillaPrefactPK != null) || (this.detallesPlanillaPrefactPK != null && !this.detallesPlanillaPrefactPK.equals(other.detallesPlanillaPrefactPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesPlanillaPrefact[ detallesPlanillaPrefactPK=" + detallesPlanillaPrefactPK + " ]";
    }
    
}
