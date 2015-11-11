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
@Table(name = "EXAMENES_MODIFICATORIOS")
@NamedQueries({
    @NamedQuery(name = "ExamenesModificatorios.findAll", query = "SELECT e FROM ExamenesModificatorios e")})
public class ExamenesModificatorios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExamenesModificatoriosPK examenesModificatoriosPK;
    @Column(name = "EXMMDF_TYPE")
    private String exmmdfType;
    @Column(name = "MOTIVO_DE_MODIFICACION")
    private String motivoDeModificacion;

    public ExamenesModificatorios() {
    }

    public ExamenesModificatorios(ExamenesModificatoriosPK examenesModificatoriosPK) {
        this.examenesModificatoriosPK = examenesModificatoriosPK;
    }

    public ExamenesModificatorios(int exmNumero, int exmNumeroParteD) {
        this.examenesModificatoriosPK = new ExamenesModificatoriosPK(exmNumero, exmNumeroParteD);
    }

    public ExamenesModificatoriosPK getExamenesModificatoriosPK() {
        return examenesModificatoriosPK;
    }

    public void setExamenesModificatoriosPK(ExamenesModificatoriosPK examenesModificatoriosPK) {
        this.examenesModificatoriosPK = examenesModificatoriosPK;
    }

    public String getExmmdfType() {
        return exmmdfType;
    }

    public void setExmmdfType(String exmmdfType) {
        this.exmmdfType = exmmdfType;
    }

    public String getMotivoDeModificacion() {
        return motivoDeModificacion;
    }

    public void setMotivoDeModificacion(String motivoDeModificacion) {
        this.motivoDeModificacion = motivoDeModificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (examenesModificatoriosPK != null ? examenesModificatoriosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenesModificatorios)) {
            return false;
        }
        ExamenesModificatorios other = (ExamenesModificatorios) object;
        if ((this.examenesModificatoriosPK == null && other.examenesModificatoriosPK != null) || (this.examenesModificatoriosPK != null && !this.examenesModificatoriosPK.equals(other.examenesModificatoriosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ExamenesModificatorios[ examenesModificatoriosPK=" + examenesModificatoriosPK + " ]";
    }
    
}
