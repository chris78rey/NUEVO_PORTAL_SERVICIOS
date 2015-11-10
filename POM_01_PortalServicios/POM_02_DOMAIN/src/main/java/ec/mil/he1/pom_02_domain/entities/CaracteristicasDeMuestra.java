/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CARACTERISTICAS_DE_MUESTRA")
@NamedQueries({
    @NamedQuery(name = "CaracteristicasDeMuestra.findAll", query = "SELECT c FROM CaracteristicasDeMuestra c")})
public class CaracteristicasDeMuestra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private Integer exmNumero;
    @Column(name = "CALIFICADOR")
    private String calificador;
    @Column(name = "MOTIVO_DE_RECHAZO")
    private String motivoDeRechazo;
    @Column(name = "SITIO_DE_BIOPSIA")
    private String sitioDeBiopsia;
    @Column(name = "TIPO_DE_FIJACION")
    private String tipoDeFijacion;
    @Column(name = "TIPO_DE_MATERIAL")
    private String tipoDeMaterial;
    @JoinColumn(name = "EXM_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Examenes examenes;

    public CaracteristicasDeMuestra() {
    }

    public CaracteristicasDeMuestra(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Integer getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public String getCalificador() {
        return calificador;
    }

    public void setCalificador(String calificador) {
        this.calificador = calificador;
    }

    public String getMotivoDeRechazo() {
        return motivoDeRechazo;
    }

    public void setMotivoDeRechazo(String motivoDeRechazo) {
        this.motivoDeRechazo = motivoDeRechazo;
    }

    public String getSitioDeBiopsia() {
        return sitioDeBiopsia;
    }

    public void setSitioDeBiopsia(String sitioDeBiopsia) {
        this.sitioDeBiopsia = sitioDeBiopsia;
    }

    public String getTipoDeFijacion() {
        return tipoDeFijacion;
    }

    public void setTipoDeFijacion(String tipoDeFijacion) {
        this.tipoDeFijacion = tipoDeFijacion;
    }

    public String getTipoDeMaterial() {
        return tipoDeMaterial;
    }

    public void setTipoDeMaterial(String tipoDeMaterial) {
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public Examenes getExamenes() {
        return examenes;
    }

    public void setExamenes(Examenes examenes) {
        this.examenes = examenes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exmNumero != null ? exmNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaracteristicasDeMuestra)) {
            return false;
        }
        CaracteristicasDeMuestra other = (CaracteristicasDeMuestra) object;
        if ((this.exmNumero == null && other.exmNumero != null) || (this.exmNumero != null && !this.exmNumero.equals(other.exmNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CaracteristicasDeMuestra[ exmNumero=" + exmNumero + " ]";
    }
    
}
