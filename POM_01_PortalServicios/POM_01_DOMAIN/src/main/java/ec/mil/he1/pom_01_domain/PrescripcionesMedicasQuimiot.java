/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "PRESCRIPCIONES_MEDICAS_QUIMIOT")
@NamedQueries({
    @NamedQuery(name = "PrescripcionesMedicasQuimiot.findAll", query = "SELECT p FROM PrescripcionesMedicasQuimiot p")})
public class PrescripcionesMedicasQuimiot implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrescripcionesMedicasQuimiotPK prescripcionesMedicasQuimiotPK;
    @Column(name = "PRS_CODIGO_MEDICADO_POR")
    private String prsCodigoMedicadoPor;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "ESPECIAL")
    private String especial;

    public PrescripcionesMedicasQuimiot() {
    }

    public PrescripcionesMedicasQuimiot(PrescripcionesMedicasQuimiotPK prescripcionesMedicasQuimiotPK) {
        this.prescripcionesMedicasQuimiotPK = prescripcionesMedicasQuimiotPK;
    }

    public PrescripcionesMedicasQuimiot(Date fecha, int qmtNumero) {
        this.prescripcionesMedicasQuimiotPK = new PrescripcionesMedicasQuimiotPK(fecha, qmtNumero);
    }

    public PrescripcionesMedicasQuimiotPK getPrescripcionesMedicasQuimiotPK() {
        return prescripcionesMedicasQuimiotPK;
    }

    public void setPrescripcionesMedicasQuimiotPK(PrescripcionesMedicasQuimiotPK prescripcionesMedicasQuimiotPK) {
        this.prescripcionesMedicasQuimiotPK = prescripcionesMedicasQuimiotPK;
    }

    public String getPrsCodigoMedicadoPor() {
        return prsCodigoMedicadoPor;
    }

    public void setPrsCodigoMedicadoPor(String prsCodigoMedicadoPor) {
        this.prsCodigoMedicadoPor = prsCodigoMedicadoPor;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prescripcionesMedicasQuimiotPK != null ? prescripcionesMedicasQuimiotPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrescripcionesMedicasQuimiot)) {
            return false;
        }
        PrescripcionesMedicasQuimiot other = (PrescripcionesMedicasQuimiot) object;
        if ((this.prescripcionesMedicasQuimiotPK == null && other.prescripcionesMedicasQuimiotPK != null) || (this.prescripcionesMedicasQuimiotPK != null && !this.prescripcionesMedicasQuimiotPK.equals(other.prescripcionesMedicasQuimiotPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PrescripcionesMedicasQuimiot[ prescripcionesMedicasQuimiotPK=" + prescripcionesMedicasQuimiotPK + " ]";
    }
    
}
