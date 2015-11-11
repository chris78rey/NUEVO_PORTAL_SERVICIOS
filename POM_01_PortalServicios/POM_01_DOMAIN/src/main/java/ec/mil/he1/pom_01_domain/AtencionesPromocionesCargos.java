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
@Table(name = "ATENCIONES_PROMOCIONES_CARGOS")
@NamedQueries({
    @NamedQuery(name = "AtencionesPromocionesCargos.findAll", query = "SELECT a FROM AtencionesPromocionesCargos a")})
public class AtencionesPromocionesCargos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AtencionesPromocionesCargosPK atencionesPromocionesCargosPK;
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;
    @Column(name = "AGRCRG_CODIGO")
    private String agrcrgCodigo;
    @Column(name = "OBSERVACION")
    private String observacion;

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

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    public String getAgrcrgCodigo() {
        return agrcrgCodigo;
    }

    public void setAgrcrgCodigo(String agrcrgCodigo) {
        this.agrcrgCodigo = agrcrgCodigo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
        return "ec.mil.he1.pom_01_domain.AtencionesPromocionesCargos[ atencionesPromocionesCargosPK=" + atencionesPromocionesCargosPK + " ]";
    }
    
}
