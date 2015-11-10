/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ATENCIONES_PROMOCIONES_CARGOS")
@NamedQueries({
    @NamedQuery(name = "AtencionesPromocionesCargos.findAll", query = "SELECT a FROM AtencionesPromocionesCargos a")})
public class AtencionesPromocionesCargos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AtencionesPromocionesCargosPK atencionesPromocionesCargosPK;
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumn(name = "AGRCRG_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrupadoresDeCargos agrupadoresDeCargos;
    @JoinColumn(name = "PRM_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Promociones promociones;

    public AtencionesPromocionesCargos() {
    }

    public AtencionesPromocionesCargos(AtencionesPromocionesCargosPK atencionesPromocionesCargosPK) {
        this.atencionesPromocionesCargosPK = atencionesPromocionesCargosPK;
    }

    public AtencionesPromocionesCargos(String tipoAtencion, String clasificacionPaciente, Character estadoDeDisponibilidad) {
        this.atencionesPromocionesCargosPK = new AtencionesPromocionesCargosPK(tipoAtencion, clasificacionPaciente, estadoDeDisponibilidad);
    }

    public AtencionesPromocionesCargosPK getAtencionesPromocionesCargosPK() {
        return atencionesPromocionesCargosPK;
    }

    public void setAtencionesPromocionesCargosPK(AtencionesPromocionesCargosPK atencionesPromocionesCargosPK) {
        this.atencionesPromocionesCargosPK = atencionesPromocionesCargosPK;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public AgrupadoresDeCargos getAgrupadoresDeCargos() {
        return agrupadoresDeCargos;
    }

    public void setAgrupadoresDeCargos(AgrupadoresDeCargos agrupadoresDeCargos) {
        this.agrupadoresDeCargos = agrupadoresDeCargos;
    }

    public Promociones getPromociones() {
        return promociones;
    }

    public void setPromociones(Promociones promociones) {
        this.promociones = promociones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atencionesPromocionesCargosPK != null ? atencionesPromocionesCargosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtencionesPromocionesCargos)) {
            return false;
        }
        AtencionesPromocionesCargos other = (AtencionesPromocionesCargos) object;
        if ((this.atencionesPromocionesCargosPK == null && other.atencionesPromocionesCargosPK != null) || (this.atencionesPromocionesCargosPK != null && !this.atencionesPromocionesCargosPK.equals(other.atencionesPromocionesCargosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AtencionesPromocionesCargos[ atencionesPromocionesCargosPK=" + atencionesPromocionesCargosPK + " ]";
    }
    
}
