/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @Column(name = "ESPECIAL")
    private String especial;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO_MEDICADO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumn(name = "QMT_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Quimioterapias quimioterapias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prescripcionesMedicasQuimiot", fetch = FetchType.LAZY)
    private List<DosisQuimioterapia> dosisQuimioterapiaList;

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

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    public Quimioterapias getQuimioterapias() {
        return quimioterapias;
    }

    public void setQuimioterapias(Quimioterapias quimioterapias) {
        this.quimioterapias = quimioterapias;
    }

    public List<DosisQuimioterapia> getDosisQuimioterapiaList() {
        return dosisQuimioterapiaList;
    }

    public void setDosisQuimioterapiaList(List<DosisQuimioterapia> dosisQuimioterapiaList) {
        this.dosisQuimioterapiaList = dosisQuimioterapiaList;
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
        return "ec.mil.he1.pom_02_domain.entities.PrescripcionesMedicasQuimiot[ prescripcionesMedicasQuimiotPK=" + prescripcionesMedicasQuimiotPK + " ]";
    }
    
}
